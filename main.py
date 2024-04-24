from antlr4 import InputStream, CommonTokenStream, ParseTreeWalker
from MyClListener import MyClListener

import sys
sys.path.append('./walkers')
from CLangLexer import CLangLexer
from CLangParser import CLangParser

if __name__ == "__main__":
    args = sys.argv[1:]
    print("Arguments:", args)
    path = "./tests/test_1.cl"
    if len(args) > 0:
        path = args[0] 
    with open(path, "r") as CL_f:
        input_stream = InputStream(CL_f.read())
    lexer = CLangLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = CLangParser(token_stream)

    tree = parser.program()

    listener = MyClListener("cllang_prog")
    walker = ParseTreeWalker()

    walker.walk(listener, tree)
