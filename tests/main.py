from antlr4 import FileStream, CommonTokenStream

import sys
sys.path.append('../walkers')
from ClLexer import ClLexer
from ClParser import ClParser

if __name__ == "__main__":
    with open("./test_1.cl", "r") as CL_f:
        input_stream = FileStream(CL_f.read())

    lexer = ClLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = ClParser(token_stream)

    tree = parser.program()

    print(tree)
