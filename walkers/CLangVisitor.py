# Generated from CLang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .CLangParser import CLangParser
else:
    from CLangParser import CLangParser

# This class defines a complete generic visitor for a parse tree produced by CLangParser.

class CLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by CLangParser#program.
    def visitProgram(self, ctx:CLangParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#statement.
    def visitStatement(self, ctx:CLangParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#print.
    def visitPrint(self, ctx:CLangParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#declaration.
    def visitDeclaration(self, ctx:CLangParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#definition.
    def visitDefinition(self, ctx:CLangParser.DefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#var_value.
    def visitVar_value(self, ctx:CLangParser.Var_valueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#arit_operation.
    def visitArit_operation(self, ctx:CLangParser.Arit_operationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#method_call.
    def visitMethod_call(self, ctx:CLangParser.Method_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#bool_operation.
    def visitBool_operation(self, ctx:CLangParser.Bool_operationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#bool_compare.
    def visitBool_compare(self, ctx:CLangParser.Bool_compareContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#var_expr.
    def visitVar_expr(self, ctx:CLangParser.Var_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#body_statements.
    def visitBody_statements(self, ctx:CLangParser.Body_statementsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#method.
    def visitMethod(self, ctx:CLangParser.MethodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#method_def.
    def visitMethod_def(self, ctx:CLangParser.Method_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#method_body.
    def visitMethod_body(self, ctx:CLangParser.Method_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#method_type.
    def visitMethod_type(self, ctx:CLangParser.Method_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#method_return.
    def visitMethod_return(self, ctx:CLangParser.Method_returnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#if.
    def visitIf(self, ctx:CLangParser.IfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#if_def.
    def visitIf_def(self, ctx:CLangParser.If_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#else_if_def.
    def visitElse_if_def(self, ctx:CLangParser.Else_if_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#else_def.
    def visitElse_def(self, ctx:CLangParser.Else_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#for.
    def visitFor(self, ctx:CLangParser.ForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#for_def.
    def visitFor_def(self, ctx:CLangParser.For_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#for_body.
    def visitFor_body(self, ctx:CLangParser.For_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#while.
    def visitWhile(self, ctx:CLangParser.WhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#while_def.
    def visitWhile_def(self, ctx:CLangParser.While_defContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#while_body.
    def visitWhile_body(self, ctx:CLangParser.While_bodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#type.
    def visitType(self, ctx:CLangParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#main.
    def visitMain(self, ctx:CLangParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#tk_id.
    def visitTk_id(self, ctx:CLangParser.Tk_idContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#tk_int.
    def visitTk_int(self, ctx:CLangParser.Tk_intContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#tk_float.
    def visitTk_float(self, ctx:CLangParser.Tk_floatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#tk_string.
    def visitTk_string(self, ctx:CLangParser.Tk_stringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#tk_add.
    def visitTk_add(self, ctx:CLangParser.Tk_addContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#tk_substract.
    def visitTk_substract(self, ctx:CLangParser.Tk_substractContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by CLangParser#tk_multiply.
    def visitTk_multiply(self, ctx:CLangParser.Tk_multiplyContext):
        return self.visitChildren(ctx)



del CLangParser