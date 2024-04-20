from antlr4 import InputStream, CommonTokenStream, ParseTreeWalker
from MyClListener import MyClListener

import sys
sys.path.append('../walkers')
from ClLexer import ClLexer
from ClParser import ClParser

if __name__ == "__main__":
    with open("./test_1.cl", "r") as CL_f:
        input_stream = InputStream(CL_f.read())

    lexer = ClLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = ClParser(token_stream)

    tree = parser.program()
    # print(tree)

    listener = MyClListener("cllang_prog")
    walker = ParseTreeWalker()

    walker.walk(listener, tree)

