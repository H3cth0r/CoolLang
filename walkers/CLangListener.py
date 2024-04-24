# Generated from CLang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .CLangParser import CLangParser
else:
    from CLangParser import CLangParser

# This class defines a complete listener for a parse tree produced by CLangParser.
class CLangListener(ParseTreeListener):

    # Enter a parse tree produced by CLangParser#program.
    def enterProgram(self, ctx:CLangParser.ProgramContext):
        pass

    # Exit a parse tree produced by CLangParser#program.
    def exitProgram(self, ctx:CLangParser.ProgramContext):
        pass


    # Enter a parse tree produced by CLangParser#statement.
    def enterStatement(self, ctx:CLangParser.StatementContext):
        pass

    # Exit a parse tree produced by CLangParser#statement.
    def exitStatement(self, ctx:CLangParser.StatementContext):
        pass


    # Enter a parse tree produced by CLangParser#print.
    def enterPrint(self, ctx:CLangParser.PrintContext):
        pass

    # Exit a parse tree produced by CLangParser#print.
    def exitPrint(self, ctx:CLangParser.PrintContext):
        pass


    # Enter a parse tree produced by CLangParser#declaration.
    def enterDeclaration(self, ctx:CLangParser.DeclarationContext):
        pass

    # Exit a parse tree produced by CLangParser#declaration.
    def exitDeclaration(self, ctx:CLangParser.DeclarationContext):
        pass


    # Enter a parse tree produced by CLangParser#definition.
    def enterDefinition(self, ctx:CLangParser.DefinitionContext):
        pass

    # Exit a parse tree produced by CLangParser#definition.
    def exitDefinition(self, ctx:CLangParser.DefinitionContext):
        pass


    # Enter a parse tree produced by CLangParser#var_value.
    def enterVar_value(self, ctx:CLangParser.Var_valueContext):
        pass

    # Exit a parse tree produced by CLangParser#var_value.
    def exitVar_value(self, ctx:CLangParser.Var_valueContext):
        pass


    # Enter a parse tree produced by CLangParser#arit_operation.
    def enterArit_operation(self, ctx:CLangParser.Arit_operationContext):
        pass

    # Exit a parse tree produced by CLangParser#arit_operation.
    def exitArit_operation(self, ctx:CLangParser.Arit_operationContext):
        pass


    # Enter a parse tree produced by CLangParser#method_call.
    def enterMethod_call(self, ctx:CLangParser.Method_callContext):
        pass

    # Exit a parse tree produced by CLangParser#method_call.
    def exitMethod_call(self, ctx:CLangParser.Method_callContext):
        pass


    # Enter a parse tree produced by CLangParser#bool_operation.
    def enterBool_operation(self, ctx:CLangParser.Bool_operationContext):
        pass

    # Exit a parse tree produced by CLangParser#bool_operation.
    def exitBool_operation(self, ctx:CLangParser.Bool_operationContext):
        pass


    # Enter a parse tree produced by CLangParser#bool_compare.
    def enterBool_compare(self, ctx:CLangParser.Bool_compareContext):
        pass

    # Exit a parse tree produced by CLangParser#bool_compare.
    def exitBool_compare(self, ctx:CLangParser.Bool_compareContext):
        pass


    # Enter a parse tree produced by CLangParser#var_expr.
    def enterVar_expr(self, ctx:CLangParser.Var_exprContext):
        pass

    # Exit a parse tree produced by CLangParser#var_expr.
    def exitVar_expr(self, ctx:CLangParser.Var_exprContext):
        pass


    # Enter a parse tree produced by CLangParser#body_statements.
    def enterBody_statements(self, ctx:CLangParser.Body_statementsContext):
        pass

    # Exit a parse tree produced by CLangParser#body_statements.
    def exitBody_statements(self, ctx:CLangParser.Body_statementsContext):
        pass


    # Enter a parse tree produced by CLangParser#method.
    def enterMethod(self, ctx:CLangParser.MethodContext):
        pass

    # Exit a parse tree produced by CLangParser#method.
    def exitMethod(self, ctx:CLangParser.MethodContext):
        pass


    # Enter a parse tree produced by CLangParser#method_def.
    def enterMethod_def(self, ctx:CLangParser.Method_defContext):
        pass

    # Exit a parse tree produced by CLangParser#method_def.
    def exitMethod_def(self, ctx:CLangParser.Method_defContext):
        pass


    # Enter a parse tree produced by CLangParser#method_body.
    def enterMethod_body(self, ctx:CLangParser.Method_bodyContext):
        pass

    # Exit a parse tree produced by CLangParser#method_body.
    def exitMethod_body(self, ctx:CLangParser.Method_bodyContext):
        pass


    # Enter a parse tree produced by CLangParser#method_type.
    def enterMethod_type(self, ctx:CLangParser.Method_typeContext):
        pass

    # Exit a parse tree produced by CLangParser#method_type.
    def exitMethod_type(self, ctx:CLangParser.Method_typeContext):
        pass


    # Enter a parse tree produced by CLangParser#method_return.
    def enterMethod_return(self, ctx:CLangParser.Method_returnContext):
        pass

    # Exit a parse tree produced by CLangParser#method_return.
    def exitMethod_return(self, ctx:CLangParser.Method_returnContext):
        pass


    # Enter a parse tree produced by CLangParser#if.
    def enterIf(self, ctx:CLangParser.IfContext):
        pass

    # Exit a parse tree produced by CLangParser#if.
    def exitIf(self, ctx:CLangParser.IfContext):
        pass


    # Enter a parse tree produced by CLangParser#if_def.
    def enterIf_def(self, ctx:CLangParser.If_defContext):
        pass

    # Exit a parse tree produced by CLangParser#if_def.
    def exitIf_def(self, ctx:CLangParser.If_defContext):
        pass


    # Enter a parse tree produced by CLangParser#else_if_def.
    def enterElse_if_def(self, ctx:CLangParser.Else_if_defContext):
        pass

    # Exit a parse tree produced by CLangParser#else_if_def.
    def exitElse_if_def(self, ctx:CLangParser.Else_if_defContext):
        pass


    # Enter a parse tree produced by CLangParser#else_def.
    def enterElse_def(self, ctx:CLangParser.Else_defContext):
        pass

    # Exit a parse tree produced by CLangParser#else_def.
    def exitElse_def(self, ctx:CLangParser.Else_defContext):
        pass


    # Enter a parse tree produced by CLangParser#for.
    def enterFor(self, ctx:CLangParser.ForContext):
        pass

    # Exit a parse tree produced by CLangParser#for.
    def exitFor(self, ctx:CLangParser.ForContext):
        pass


    # Enter a parse tree produced by CLangParser#for_def.
    def enterFor_def(self, ctx:CLangParser.For_defContext):
        pass

    # Exit a parse tree produced by CLangParser#for_def.
    def exitFor_def(self, ctx:CLangParser.For_defContext):
        pass


    # Enter a parse tree produced by CLangParser#for_body.
    def enterFor_body(self, ctx:CLangParser.For_bodyContext):
        pass

    # Exit a parse tree produced by CLangParser#for_body.
    def exitFor_body(self, ctx:CLangParser.For_bodyContext):
        pass


    # Enter a parse tree produced by CLangParser#while.
    def enterWhile(self, ctx:CLangParser.WhileContext):
        pass

    # Exit a parse tree produced by CLangParser#while.
    def exitWhile(self, ctx:CLangParser.WhileContext):
        pass


    # Enter a parse tree produced by CLangParser#while_def.
    def enterWhile_def(self, ctx:CLangParser.While_defContext):
        pass

    # Exit a parse tree produced by CLangParser#while_def.
    def exitWhile_def(self, ctx:CLangParser.While_defContext):
        pass


    # Enter a parse tree produced by CLangParser#while_body.
    def enterWhile_body(self, ctx:CLangParser.While_bodyContext):
        pass

    # Exit a parse tree produced by CLangParser#while_body.
    def exitWhile_body(self, ctx:CLangParser.While_bodyContext):
        pass


    # Enter a parse tree produced by CLangParser#type.
    def enterType(self, ctx:CLangParser.TypeContext):
        pass

    # Exit a parse tree produced by CLangParser#type.
    def exitType(self, ctx:CLangParser.TypeContext):
        pass


    # Enter a parse tree produced by CLangParser#main.
    def enterMain(self, ctx:CLangParser.MainContext):
        pass

    # Exit a parse tree produced by CLangParser#main.
    def exitMain(self, ctx:CLangParser.MainContext):
        pass


    # Enter a parse tree produced by CLangParser#tk_id.
    def enterTk_id(self, ctx:CLangParser.Tk_idContext):
        pass

    # Exit a parse tree produced by CLangParser#tk_id.
    def exitTk_id(self, ctx:CLangParser.Tk_idContext):
        pass


    # Enter a parse tree produced by CLangParser#tk_int.
    def enterTk_int(self, ctx:CLangParser.Tk_intContext):
        pass

    # Exit a parse tree produced by CLangParser#tk_int.
    def exitTk_int(self, ctx:CLangParser.Tk_intContext):
        pass


    # Enter a parse tree produced by CLangParser#tk_float.
    def enterTk_float(self, ctx:CLangParser.Tk_floatContext):
        pass

    # Exit a parse tree produced by CLangParser#tk_float.
    def exitTk_float(self, ctx:CLangParser.Tk_floatContext):
        pass


    # Enter a parse tree produced by CLangParser#tk_string.
    def enterTk_string(self, ctx:CLangParser.Tk_stringContext):
        pass

    # Exit a parse tree produced by CLangParser#tk_string.
    def exitTk_string(self, ctx:CLangParser.Tk_stringContext):
        pass


    # Enter a parse tree produced by CLangParser#tk_add.
    def enterTk_add(self, ctx:CLangParser.Tk_addContext):
        pass

    # Exit a parse tree produced by CLangParser#tk_add.
    def exitTk_add(self, ctx:CLangParser.Tk_addContext):
        pass


    # Enter a parse tree produced by CLangParser#tk_substract.
    def enterTk_substract(self, ctx:CLangParser.Tk_substractContext):
        pass

    # Exit a parse tree produced by CLangParser#tk_substract.
    def exitTk_substract(self, ctx:CLangParser.Tk_substractContext):
        pass


    # Enter a parse tree produced by CLangParser#tk_multiply.
    def enterTk_multiply(self, ctx:CLangParser.Tk_multiplyContext):
        pass

    # Exit a parse tree produced by CLangParser#tk_multiply.
    def exitTk_multiply(self, ctx:CLangParser.Tk_multiplyContext):
        pass



del CLangParser