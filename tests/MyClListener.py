import pandas as pd
import sys
sys.path.append('../walkers')
from CLangListener import CLangListener
pd.set_option('display.max_columns', None)


def validate_expressions(statements_df, expressions_df, parameters_df):
  """
  This function validates expressions in a program represented by three DataFrames.

  Args:
      statements_df (pandas.DataFrame): A DataFrame containing statement information
          - declaration_type: Type of declaration (method, parameter, definition)
          - return_type: Return type (for methods)
          - id: Identifier name
          - level: Nesting level
          - declared: Flag indicating if the variable is declared at this level
      expressions_df (pandas.DataFrame): A DataFrame containing expression information
          - expression: The expression string
          - statement_ref: Reference to the statement using the expression
          - type: Type of the expression (id, int, method_call)
      parameters_df (pandas.DataFrame): A DataFrame containing method parameter information
          - id: Parameter name
          - type: Parameter type
          - ref_id: Reference to the method this parameter belongs to

  Returns:
      list: A list of error messages if validation fails, otherwise an empty list.
  """

  errors = []

  # Function to check if a variable is declared at a specific level
  def is_declared(var_name, level):
    return statements_df[(statements_df['id'] == var_name) & (statements_df['level'] <= level) & (statements_df['declared'] == True)].empty

  # Validate each expression
  for index, row in expressions_df.iterrows():
    expression = row['expression']
    statement_ref = row['statement_ref']
    expr_type = row['type']

    # Check for undeclared variables (except method calls handled later)
    if expr_type == 'id' and is_declared(expression, statements_df.loc[statement_ref, 'level']):
      errors.append(f"Error: Variable '{expression}' is not declared at statement {statement_ref + 1}")

    # Check method call arguments (ensure parameters exist and match types)
    if expr_type == 'method_call':
      method_name, args_str = expression.split('(')
      args = args_str.rstrip(')').split(',')

      # Find the method definition
      method_def = statements_df[statements_df['id'] == method_name]
      if method_def.empty:
        errors.append(f"Error: Method '{method_name}' is not defined at statement {statement_ref + 1}")
      else:
        method_level = method_def.iloc[0]['level']

        # Check parameter count
        if len(args) != len(parameters_df[parameters_df['ref_id'] == method_name]):
          errors.append(f"Error: Method '{method_name}' at statement {statement_ref + 1} expects {len(parameters_df[parameters_df['ref_id'] == method_name])} arguments, but received {len(args)}")

        # Check parameter types (assuming simple type matching for now)
        for i, arg in enumerate(args):
          param_def = parameters_df[(parameters_df['ref_id'] == method_name) & (parameters_df['id'] == i)]
          if not param_def.empty and param_def.iloc[0]['type'] != expressions_df[expressions_df['expression'] == arg].iloc[0]['type']:
            errors.append(f"Error: Argument {i + 1} type mismatch for method '{method_name}' at statement {statement_ref + 1}. Expected {param_def.iloc[0]['type']}, got {expressions_df[expressions_df['expression'] == arg].iloc[0]['type']}")

  # Add more validation checks as needed (e.g., type compatibility for arithmetic operations)

  return errors


class MyClListener(CLangListener):
    def __init__(self, program_name):
        self.program_name   = program_name
        self.new_program    = """"""

        columns = ["declaration_type", "return_type", "id", "level", "declared", "defined", "wrapped_into"]
        self.declarations = pd.DataFrame(columns=columns)
        columns = ["id", "type", "ref_id"]
        self.method_parameters = pd.DataFrame(columns=columns)
        columns = ["statement_type", "statement_subtype", "wrapped_into"]
        self.body_statements = pd.DataFrame(columns=columns)

        columns = ["expression", "statement_ref", "type"]
        self.expressions = pd.DataFrame(columns=columns)

        self.wrapped_into = ""
        self.level = 0
        self.in_method_definition = False 
        self.in_statement = True
        self.in_body_statement = False 
        self.in_main = False


    def enterProgram(self, ctx):
        self.new_program += f"// start {self.program_name} program\n"
        self.new_program += f"#include <iostream>\n"
        self.new_program += f"#include <string>\n"
        self.new_program += f"using namespace std;\n\n"
    def exitProgram(self, ctx):
        print("STATEMENTS")
        print(self.declarations)
        print("="*40)
        print(self.method_parameters)
        # print("="*40)
        # print(self.body_statements)
        print("="*40)
        print("EXPRESSIONS")
        print(self.expressions.head(63))

        # self.declarations["levele"] = self.declarations["level"].astype('int')
        errors = validate_expressions(self.declarations, self.expressions, self.method_parameters)
        if errors:
          print("Validation Errors:")
          for error in errors:
            print(error)
        else:
          print("Code is valid!")

        self.new_program = self.new_program.replace("->", "this->")
        self.new_program = self.new_program.replace("<-", "return ")
        self.new_program += f"\n// end of program"
        with open(f"{self.program_name}_output.cpp", "w") as output_file:
            output_file.write(self.new_program)
    
    def enterMethod_def(self, ctx):
        self.in_method_definition = True

        self.wrapped_into = ctx.getChild(1).getText()
        new_sample = {
                "declaration_type" : "method",
                "return_type" : ctx.getChild(0).getText(),
                "id" : ctx.getChild(1).getText(),
                "level": self.level,
                "declared": True,
                "defined":True,
                "wrapped_into": self.wrapped_into
        }
        self.declarations = self.declarations._append(new_sample, ignore_index=True)
    def exitMethod_def(self, ctx):
        self.in_method_definition = False
    def exitMethod(self, ctx):
        self.level = 0

    def enterMain(self, ctx):
        self.in_main = True
        self.wrapped_into = "main"

    def enterStatement(self, ctx):
        statement_type = type(ctx.getChild(0)).__name__.lower()

        declared = False 
        defined = False
        id_var = ctx.getChild(0).getChild(0).getText()
        declaration_type = "definition"
        return_type = ""
        if "definition" in statement_type or "declaration" in statement_type:
            if "definition" in statement_type:
                defined = True
                first_child_type = type(ctx.getChild(0).getChild(0)).__name__.lower()
                if "declaration" in first_child_type:
                    declared = True
                    declaration_type += "&declaration"
                    return_type = ctx.getChild(0).getChild(0).getChild(0).getText()
                    id_var = ctx.getChild(0).getChild(0).getChild(1).getText()
            else:
                declaration_type = "declaration"
                id_var = ctx.getChild(0).getChild(1).getText()
                return_type = ctx.getChild(0).getChild(0).getText()
                declared = True
                defined = False

            new_sample = {
                    "declaration_type" : declaration_type,
                    "return_type" : return_type,
                    "id" : id_var,
                    "level": self.level,
                    "declared": declared,
                    "defined": defined,
                    "wrapped_into": self.wrapped_into
            }
            self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterFor_def(self, ctx):
        iterator_def = ctx.getChild(2)
        defined = True
        declared = False
        first_child_type = type(ctx.getChild(2).getChild(0)).__name__.lower()
        declaration_type = "for&definition"
        return_type = ""
        if "declaration" in first_child_type:
            declared = True
            declaration_type += "&declaration"
            return_type = ctx.getChild(2).getChild(0).getChild(0).getText()
            id_var = ctx.getChild(2).getChild(0).getChild(1).getText()
        new_sample = {
                "declaration_type" : declaration_type,
                "return_type" : return_type,
                "id" : id_var,
                "level": self.level,
                "declared": declared,
                "defined": defined,
                "wrapped_into": self.wrapped_into
        }
        self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterDeclaration(self, ctx):
        if self.in_method_definition:
            self.method_parameters = self.method_parameters._append({
                "id" : ctx.getChild(1).getText(),
                "type": ctx.getChild(0).getText(),
                "ref_id": self.declarations.iloc[-1, 2],
            }, ignore_index=True)

            new_sample = {
                    "declaration_type" : "parameter",
                    "return_type" : ctx.getChild(0).getText(), 
                    "id" : ctx.getChild(1).getText(),
                    "level": self.level,
                    "declared": True,
                    "defined": True,
                    "wrapped_into": self.wrapped_into
            }
            self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterBody_statements(self, ctx):
        statement_type = type(ctx).__name__.lower()
        statement_subtype = type(ctx.getChild(0)).__name__.lower()
        if "statementcontext" in statement_subtype:
            if self.level == 0: self.level += 1
            statement_type = statement_subtype
            statement_subtype = type(ctx.getChild(0).getChild(0)).__name__.lower()
        else:
            self.level += 1
        self.body_statements = self.body_statements._append({
            "statement_type": statement_type.split("context", 1)[0],
            "statement_subtype": statement_subtype.split("context", 1)[0],
            "wrapped_into": self.wrapped_into,
        }, ignore_index=True)
    def exitBody_statements(self, ctx):
        statement_subtype = type(ctx.getChild(0)).__name__.lower()
        if "statementcontext" not in statement_subtype:
            self.level -= 1

    def enterPrint(self, ctx):
        new_sample = {
                "declaration_type" : "print",
                "return_type" : "void",
                "id" : "",
                "level": self.level,
                "declared": False,
                "defined": False,
                "wrapped_into": self.wrapped_into
        }
        self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterIf_def(self, ctx):
        new_sample = {
                "declaration_type" : "if",
                "return_type" : "void",
                "id" : "",
                "level": self.level,
                "declared": False,
                "defined": False,
                "wrapped_into": self.wrapped_into
        }
        self.declarations = self.declarations._append(new_sample, ignore_index=True)
    def enterElse_if_def(self, ctx):
        new_sample = {
                "declaration_type" : "elif",
                "return_type" : "void",
                "id" : "",
                "level": self.level,
                "declared": False,
                "defined": False,
                "wrapped_into": self.wrapped_into
        }
        self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterWhile_def(self, ctx):
        new_sample = {
                "declaration_type" : "while",
                "return_type" : "void",
                "id" : "",
                "level": self.level,
                "declared": False,
                "defined": False,
                "wrapped_into": self.wrapped_into
        }
        self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterMethod_call(self, ctx):
        parent = type(ctx.parentCtx).__name__.lower()
        if "statement" in parent:
            new_sample = {
                    "declaration_type" : "method_call",
                    "return_type" : "",
                    "id" : ctx.getChild(0).getText(),
                    "level": self.level,
                    "declared": False,
                    "defined": False,
                    "wrapped_into": self.wrapped_into
            }
            self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterMethod_return(self, ctx):
        new_sample = {
                "declaration_type" : "return",
                "return_type" : "void",
                "id" : "",
                "level": self.level,
                "declared": False,
                "defined": False,
                "wrapped_into": self.wrapped_into
        }
        self.declarations = self.declarations._append(new_sample, ignore_index=True)

    def enterTk_int(self, ctx):
        expression = ctx.getText()
        statement_ref = self.declarations.index[-1]
        new_sample = {
                "expression" : expression,
                "statement_ref" : statement_ref,
                "type" : "int",
        }
        self.expressions = self.expressions._append(new_sample, ignore_index=True)
    def enterTk_id(self, ctx):
        expression = ctx.getText()
        statement_ref = self.declarations.index[-1]
        new_sample = {
                "expression" : expression,
                "statement_ref" : statement_ref,
                "type" : "id",
        }
        self.expressions = self.expressions._append(new_sample, ignore_index=True)
    def enterTk_float(self, ctx):
        expression = ctx.getText()
        statement_ref = self.declarations.index[-1]
        new_sample = {
                "expression" : expression,
                "statement_ref" : statement_ref,
                "type" : "float",
        }
        self.expressions = self.expressions._append(new_sample, ignore_index=True)
    def enterTk_string(self, ctx):
        expression = ctx.getText()
        statement_ref = self.declarations.index[-1]
        new_sample = {
                "expression" : expression,
                "statement_ref" : statement_ref,
                "type" : "string",
        }
        self.expressions = self.expressions._append(new_sample, ignore_index=True)
    def enterMethod_call(self, ctx):
        expression = ctx.getText()
        statement_ref = self.declarations.index[-1]
        new_sample = {
                "expression" : expression,
                "statement_ref" : statement_ref,
                "type" : "method_call",
        }
        self.expressions = self.expressions._append(new_sample, ignore_index=True)
