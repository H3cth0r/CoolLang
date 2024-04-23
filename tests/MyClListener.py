import sys
sys.path.append('../walkers')
from ClParserListener import ClParserListener

class MyClListener(ClParserListener):
    def __init__(self, program_name):
        self.program_name   = program_name
        self.new_program    = """"""

        self.declarations   = {}

        self.in_class_definition = False

    def enterProgram(self, ctx):
        self.new_program += f"// start {self.program_name} program\n"
        self.new_program += f"#include <iostream>\n"
        self.new_program += f"#include <string>\n"
        self.new_program += f"using namespace std;\n\n"
    def exitProgram(self, ctx):
        self.new_program = self.new_program.replace("->", "this->")
        self.new_program = self.new_program.replace("<-", "return ")
        self.new_program += f"\n// end of program"
        with open(f"{self.program_name}_output.cpp", "w") as output_file:
            output_file.write(self.new_program)


    def enterClassDeclaration(self, ctx):
        in_class_definition = True
        self.new_program += "class "
        self.new_program += ctx.getChild(1).getText()
        self.new_program += "{\n"
    def exitClassDeclaration(self, ctx):
        in_class_definition = False 
        self.new_program += "\n}\n"

    def enterMain(self, ctx):
        self.new_program += "int main{\n"
    def exitMain(self, ctx):
        self.new_program += "return 0;\n}\n"

    # TODO Check Check this
    def enterExpression(self, ctx):
        print(ctx.getChild(ctx.getChildCount()-1).getChildCount())
        print(ctx.getChild(ctx.getChildCount()-1).getText())
        print("="*40)
        self.new_program += ctx.getText();
    # Class Statement Handling
    def enterClassReturnStatement(self, ctx):
        self.new_program += ctx.getChild(0).getChild(0).getText()
    def exitClassReturnStatement(self, ctx):
        self.new_program += ";\n"
 
    # Print handling
    def enterPrintStatement(self, ctx):
        self.new_program += "print("
    def exitPrintStatement(self, ctx):
        self.new_program += ");"

    # field Declaration
    def enterFieldDeclaration(self, ctx):
        _type = ctx.getChild(0).getText()
        if _type == "integer": _type = "int"
        name = ctx.getChild(1).getText()
        self.new_program += _type + " " + name
    def exitFieldDeclaration(self, ctx):
        self.new_program += ";\n"

    # Class Initializer handling
    def enterInitializerDeclaration(self, ctx):
        class_name = ctx.getChild(0).getText()
        self.new_program += class_name + "("
    def exitInitializerDeclaration(self, ctx):
        self.new_program += "\n}\n"

    # Method class declaration handling
    def enterMethodDeclarationClass(self, ctx):
        return_type = ctx.getChild(0).getText()
        if return_type == "integer":return_type = "int"
        method_name = ctx.getChild(1).getText()
        self.new_program += return_type + " " + method_name + "("
    def enterArgumentList(self, ctx):
        childs_len = ctx.getChildCount()
        args = ""
        for i in range(childs_len):
            child = ctx.getChild(i)
            if "argument" in type(child).__name__.lower():
                _type = child.getChild(0).getText()
                if _type == "integer": _type = "int"
                name=child.getChild(1).getText()
                args += _type + " " + name
            else:
                args += ", "
        self.new_program += args 
    def enterMethodDeclarationClose(self, ctx):
        self.new_program += "){\n"
    def exitMethodDeclarationClass(self, ctx):
        self.new_program += "\n}-\n"

    # Method Declaration handling
    def enterMethodDeclaration(self, ctx):
        return_type = ctx.getChild(0).getText()
        if return_type == "integer":return_type = "int"
        method_name = ctx.getChild(1).getText()
        self.new_program += return_type + " " + method_name + "("
    def exitMethodDeclaration(self, ctx):
        self.new_program += "\n}--\n"
    
    # While Statements handling
    def enterWhileStatement(self, ctx):
        self.new_program += "while("
    def enterWhileExpression(self, ctx):
        self.new_program += ctx.getText()
    def exitWhileExpression(self, ctx):
        self.new_program += "){\n"
    def exitWhileStatement(self, ctx):
        self.new_program += "\n}\n"

    # If Statement handling
    def enterIfOption(self, ctx):
        self.new_program += "if("
    def enterIfEvaluation(self, ctx):
        self.new_program += ctx.getText()
    def exitIfEvaluation(self, ctx):
        self.new_program += "){\n"
    def enterElifOption(self, ctx):
        self.new_program += "\n} else if(\n"
    def enterElseOption(self, ctx):
        self.new_program += "\n} else{\n"
    def exitIfStatement(self, ctx):
        self.new_program += "\n}\n"
    
    # For Statement Handling
    def enterForStatement(self, ctx):
        self.new_program += "for("
    def enterForExpression(self, ctx):
        _type = ctx.getChild(0).getChild(0).getText()
        if _type == "integer": _type = "int"
        assignment = ctx.getChild(0).getChild(1).getText()
        assignment_two = ctx.getChild(4).getText()
        self.new_program += _type + " " + assignment + "; " + ctx.getChild(2).getText() + "; " + assignment_two
    def exitForExpression(self, ctx):
        self.new_program += "){\n"
    def exitForStatement(self, ctx):
        self.new_program += "\n}\n"
