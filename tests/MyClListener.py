import sys
sys.path.append('../walkers')
from ClParserListener import ClParserListener

class MyClListener(ClParserListener):
    def __init__(self, program_name):
        self.program_name   = program_name
        self.new_program    = """"""

        self.public_atts    = """public:"""
        self.private_atts   = """private:"""

        self.declarations   = {}

    def enterProgram(self, ctx):
        self.new_program += f"// start {self.program_name} program\n"
        self.new_program += f"#include <iostream>\n"
        self.new_program += f"#include <string>\n\n"
    def exitProgram(self, ctx):
        self.new_program = self.new_program.replace("->", "this->")
        self.new_program += f"\n// end of program"
        with open(f"{self.program_name}_output.cpp", "w") as output_file:
            output_file.write(self.new_program)


    def enterClassDeclaration(self, ctx):
        self.new_program += "class "
    def exitClassDeclaration(self, ctx):
        self.new_program += "\n"

    def enterMethodDeclarationClass(self, ctx):
        self.new_program += ""

    def enterEqual(self, ctx):
        self.new_program += f"{ctx.getText()}"

    def enterType(self, ctx):
        _type = ctx.getText()
        if _type == "integer":
            self.new_program += f"int "
        elif _type == "float":
            self.new_program += f"float "
        elif _type == "bool":
            self.new_program += f"bool "
        else:
            self.new_program += f"string "

    def enterExpression(self, ctx):
        self.new_program += f"{ctx.getText()}"

    def enterNameDeclaration(self, ctx):
        # print(ctx.getText())
        self.new_program += f"{ctx.getText()}"

    def exitFieldDeclaration(self, ctx):
        self.new_program += f"\n\n"

    def exitMethodDeclaration(self, ctx):
        self.new_program += f"\n\n"

    def exitMethodDeclarationClass(self, ctx):
        self.new_program += f"\n\n"

    def enterLpar(self, ctx):
        self.new_program += f"{ctx.getText()}"

    def enterRpar(self, ctx):
        self.new_program += f"{ctx.getText()}"

    def enterLbrace(self, ctx):
        self.new_program += f"{ctx.getText()}\n"

    def enterRbrace(self, ctx):
        self.new_program += f"\n{ctx.getText()}"

    def enterSemi(self, ctx):
        self.new_program += f"{ctx.getText()}"

