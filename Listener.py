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
        self.new_program += ctx.getChild(1).getText()
    def exitClassDeclaration(self, ctx):
        self.new_program += "\n"

    def enterMethodDeclarationClass(self, ctx):
        _type = ctx.getChild(0).getText()
        if _type == "integer":_type="int"
        self.new_program += f"{_type} {ctx.getChild(1).getText()}"

    def enterFieldDeclaration(self, ctx):
        print(f"enter field declaration: {ctx.getChild(0)}")
        output_text = "\t"
        idxs = range(0, 30)
        for idx in idxs:
            try:
                set_text = ctx.getChild(idx).getText()
                if set_text == "integer":set_text="int"
                output_text += f"{set_text} "
                print(f"enter field declaration: {set_text}")
            except:
                pass 
        self.new_program += output_text 
        print("="*40)
    def exitFieldDeclaration(self, ctx):
        self.new_program += f"\n\n"

    def exitMethodDeclaration(self, ctx):
        self.new_program += f"\n\n"

    def exitMethodDeclarationClass(self, ctx):
        self.new_program += f"\n\n"

    def enterLpar(self, ctx):
        # self.new_program += f"{ctx.getText()}"
        pass

    def enterRpar(self, ctx):
        # self.new_program += f"{ctx.getText()}"
        pass

    def enterLbrace(self, ctx):
        # self.new_program += f"{ctx.getText()}\n"
        pass

    def enterRbrace(self, ctx):
        # self.new_program += f"\n{ctx.getText()}"
        pass

    def enterSemi(self, ctx):
        # self.new_program += f"{ctx.getText()}"
        pass

