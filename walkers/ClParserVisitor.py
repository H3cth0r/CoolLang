# Generated from ClParser.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ClParser import ClParser
else:
    from ClParser import ClParser

# This class defines a complete generic visitor for a parse tree produced by ClParser.

class ClParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ClParser#program.
    def visitProgram(self, ctx:ClParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#classDeclaration.
    def visitClassDeclaration(self, ctx:ClParser.ClassDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#fieldDeclaration.
    def visitFieldDeclaration(self, ctx:ClParser.FieldDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#methodDeclaration.
    def visitMethodDeclaration(self, ctx:ClParser.MethodDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#methodDeclarationClass.
    def visitMethodDeclarationClass(self, ctx:ClParser.MethodDeclarationClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#initializerDeclaration.
    def visitInitializerDeclaration(self, ctx:ClParser.InitializerDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#argumentList.
    def visitArgumentList(self, ctx:ClParser.ArgumentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#instantiationArgumentList.
    def visitInstantiationArgumentList(self, ctx:ClParser.InstantiationArgumentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#argumentInstantiation.
    def visitArgumentInstantiation(self, ctx:ClParser.ArgumentInstantiationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#argument.
    def visitArgument(self, ctx:ClParser.ArgumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#main.
    def visitMain(self, ctx:ClParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#classStatement.
    def visitClassStatement(self, ctx:ClParser.ClassStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#returnExpression.
    def visitReturnExpression(self, ctx:ClParser.ReturnExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#selfStatement.
    def visitSelfStatement(self, ctx:ClParser.SelfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#statement.
    def visitStatement(self, ctx:ClParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#printStatement.
    def visitPrintStatement(self, ctx:ClParser.PrintStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#objectAttribute.
    def visitObjectAttribute(self, ctx:ClParser.ObjectAttributeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#assignment.
    def visitAssignment(self, ctx:ClParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#ifStatement.
    def visitIfStatement(self, ctx:ClParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#whileStatement.
    def visitWhileStatement(self, ctx:ClParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#forStatement.
    def visitForStatement(self, ctx:ClParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#classInstantiation.
    def visitClassInstantiation(self, ctx:ClParser.ClassInstantiationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#methodCall.
    def visitMethodCall(self, ctx:ClParser.MethodCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#classReturnStatement.
    def visitClassReturnStatement(self, ctx:ClParser.ClassReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#returnStatement.
    def visitReturnStatement(self, ctx:ClParser.ReturnStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#classExpression.
    def visitClassExpression(self, ctx:ClParser.ClassExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#selfClassCall.
    def visitSelfClassCall(self, ctx:ClParser.SelfClassCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#expression.
    def visitExpression(self, ctx:ClParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#callExpression.
    def visitCallExpression(self, ctx:ClParser.CallExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#classCallSelf.
    def visitClassCallSelf(self, ctx:ClParser.ClassCallSelfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#integer_expr.
    def visitInteger_expr(self, ctx:ClParser.Integer_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#floating_expr.
    def visitFloating_expr(self, ctx:ClParser.Floating_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#string_expr.
    def visitString_expr(self, ctx:ClParser.String_exprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#type.
    def visitType(self, ctx:ClParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClParser#nameDeclaration.
    def visitNameDeclaration(self, ctx:ClParser.NameDeclarationContext):
        return self.visitChildren(ctx)



del ClParser