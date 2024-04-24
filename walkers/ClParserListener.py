# Generated from ClParser.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ClParser import ClParser
else:
    from ClParser import ClParser

# This class defines a complete listener for a parse tree produced by ClParser.
class ClParserListener(ParseTreeListener):

    # Enter a parse tree produced by ClParser#program.
    def enterProgram(self, ctx:ClParser.ProgramContext):
        pass

    # Exit a parse tree produced by ClParser#program.
    def exitProgram(self, ctx:ClParser.ProgramContext):
        pass


    # Enter a parse tree produced by ClParser#classDeclaration.
    def enterClassDeclaration(self, ctx:ClParser.ClassDeclarationContext):
        pass

    # Exit a parse tree produced by ClParser#classDeclaration.
    def exitClassDeclaration(self, ctx:ClParser.ClassDeclarationContext):
        pass


    # Enter a parse tree produced by ClParser#fieldDeclaration.
    def enterFieldDeclaration(self, ctx:ClParser.FieldDeclarationContext):
        pass

    # Exit a parse tree produced by ClParser#fieldDeclaration.
    def exitFieldDeclaration(self, ctx:ClParser.FieldDeclarationContext):
        pass


    # Enter a parse tree produced by ClParser#methodDeclaration.
    def enterMethodDeclaration(self, ctx:ClParser.MethodDeclarationContext):
        pass

    # Exit a parse tree produced by ClParser#methodDeclaration.
    def exitMethodDeclaration(self, ctx:ClParser.MethodDeclarationContext):
        pass


    # Enter a parse tree produced by ClParser#methodDeclarationClass.
    def enterMethodDeclarationClass(self, ctx:ClParser.MethodDeclarationClassContext):
        pass

    # Exit a parse tree produced by ClParser#methodDeclarationClass.
    def exitMethodDeclarationClass(self, ctx:ClParser.MethodDeclarationClassContext):
        pass


    # Enter a parse tree produced by ClParser#initializerDeclaration.
    def enterInitializerDeclaration(self, ctx:ClParser.InitializerDeclarationContext):
        pass

    # Exit a parse tree produced by ClParser#initializerDeclaration.
    def exitInitializerDeclaration(self, ctx:ClParser.InitializerDeclarationContext):
        pass


    # Enter a parse tree produced by ClParser#methodDeclarationClose.
    def enterMethodDeclarationClose(self, ctx:ClParser.MethodDeclarationCloseContext):
        pass

    # Exit a parse tree produced by ClParser#methodDeclarationClose.
    def exitMethodDeclarationClose(self, ctx:ClParser.MethodDeclarationCloseContext):
        pass


    # Enter a parse tree produced by ClParser#argumentList.
    def enterArgumentList(self, ctx:ClParser.ArgumentListContext):
        pass

    # Exit a parse tree produced by ClParser#argumentList.
    def exitArgumentList(self, ctx:ClParser.ArgumentListContext):
        pass


    # Enter a parse tree produced by ClParser#instantiationArgumentList.
    def enterInstantiationArgumentList(self, ctx:ClParser.InstantiationArgumentListContext):
        pass

    # Exit a parse tree produced by ClParser#instantiationArgumentList.
    def exitInstantiationArgumentList(self, ctx:ClParser.InstantiationArgumentListContext):
        pass


    # Enter a parse tree produced by ClParser#argumentInstantiation.
    def enterArgumentInstantiation(self, ctx:ClParser.ArgumentInstantiationContext):
        pass

    # Exit a parse tree produced by ClParser#argumentInstantiation.
    def exitArgumentInstantiation(self, ctx:ClParser.ArgumentInstantiationContext):
        pass


    # Enter a parse tree produced by ClParser#argument.
    def enterArgument(self, ctx:ClParser.ArgumentContext):
        pass

    # Exit a parse tree produced by ClParser#argument.
    def exitArgument(self, ctx:ClParser.ArgumentContext):
        pass


    # Enter a parse tree produced by ClParser#main.
    def enterMain(self, ctx:ClParser.MainContext):
        pass

    # Exit a parse tree produced by ClParser#main.
    def exitMain(self, ctx:ClParser.MainContext):
        pass


    # Enter a parse tree produced by ClParser#classStatement.
    def enterClassStatement(self, ctx:ClParser.ClassStatementContext):
        pass

    # Exit a parse tree produced by ClParser#classStatement.
    def exitClassStatement(self, ctx:ClParser.ClassStatementContext):
        pass


    # Enter a parse tree produced by ClParser#returnExpression.
    def enterReturnExpression(self, ctx:ClParser.ReturnExpressionContext):
        pass

    # Exit a parse tree produced by ClParser#returnExpression.
    def exitReturnExpression(self, ctx:ClParser.ReturnExpressionContext):
        pass


    # Enter a parse tree produced by ClParser#selfStatement.
    def enterSelfStatement(self, ctx:ClParser.SelfStatementContext):
        pass

    # Exit a parse tree produced by ClParser#selfStatement.
    def exitSelfStatement(self, ctx:ClParser.SelfStatementContext):
        pass


    # Enter a parse tree produced by ClParser#statement.
    def enterStatement(self, ctx:ClParser.StatementContext):
        pass

    # Exit a parse tree produced by ClParser#statement.
    def exitStatement(self, ctx:ClParser.StatementContext):
        pass


    # Enter a parse tree produced by ClParser#declaration.
    def enterDeclaration(self, ctx:ClParser.DeclarationContext):
        pass

    # Exit a parse tree produced by ClParser#declaration.
    def exitDeclaration(self, ctx:ClParser.DeclarationContext):
        pass


    # Enter a parse tree produced by ClParser#printStatement.
    def enterPrintStatement(self, ctx:ClParser.PrintStatementContext):
        pass

    # Exit a parse tree produced by ClParser#printStatement.
    def exitPrintStatement(self, ctx:ClParser.PrintStatementContext):
        pass


    # Enter a parse tree produced by ClParser#objectAttribute.
    def enterObjectAttribute(self, ctx:ClParser.ObjectAttributeContext):
        pass

    # Exit a parse tree produced by ClParser#objectAttribute.
    def exitObjectAttribute(self, ctx:ClParser.ObjectAttributeContext):
        pass


    # Enter a parse tree produced by ClParser#assignment.
    def enterAssignment(self, ctx:ClParser.AssignmentContext):
        pass

    # Exit a parse tree produced by ClParser#assignment.
    def exitAssignment(self, ctx:ClParser.AssignmentContext):
        pass


    # Enter a parse tree produced by ClParser#ifStatement.
    def enterIfStatement(self, ctx:ClParser.IfStatementContext):
        pass

    # Exit a parse tree produced by ClParser#ifStatement.
    def exitIfStatement(self, ctx:ClParser.IfStatementContext):
        pass


    # Enter a parse tree produced by ClParser#ifOption.
    def enterIfOption(self, ctx:ClParser.IfOptionContext):
        pass

    # Exit a parse tree produced by ClParser#ifOption.
    def exitIfOption(self, ctx:ClParser.IfOptionContext):
        pass


    # Enter a parse tree produced by ClParser#elifOption.
    def enterElifOption(self, ctx:ClParser.ElifOptionContext):
        pass

    # Exit a parse tree produced by ClParser#elifOption.
    def exitElifOption(self, ctx:ClParser.ElifOptionContext):
        pass


    # Enter a parse tree produced by ClParser#elseOption.
    def enterElseOption(self, ctx:ClParser.ElseOptionContext):
        pass

    # Exit a parse tree produced by ClParser#elseOption.
    def exitElseOption(self, ctx:ClParser.ElseOptionContext):
        pass


    # Enter a parse tree produced by ClParser#ifEvaluation.
    def enterIfEvaluation(self, ctx:ClParser.IfEvaluationContext):
        pass

    # Exit a parse tree produced by ClParser#ifEvaluation.
    def exitIfEvaluation(self, ctx:ClParser.IfEvaluationContext):
        pass


    # Enter a parse tree produced by ClParser#whileStatement.
    def enterWhileStatement(self, ctx:ClParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by ClParser#whileStatement.
    def exitWhileStatement(self, ctx:ClParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by ClParser#whileExpression.
    def enterWhileExpression(self, ctx:ClParser.WhileExpressionContext):
        pass

    # Exit a parse tree produced by ClParser#whileExpression.
    def exitWhileExpression(self, ctx:ClParser.WhileExpressionContext):
        pass


    # Enter a parse tree produced by ClParser#forStatement.
    def enterForStatement(self, ctx:ClParser.ForStatementContext):
        pass

    # Exit a parse tree produced by ClParser#forStatement.
    def exitForStatement(self, ctx:ClParser.ForStatementContext):
        pass


    # Enter a parse tree produced by ClParser#forExpression.
    def enterForExpression(self, ctx:ClParser.ForExpressionContext):
        pass

    # Exit a parse tree produced by ClParser#forExpression.
    def exitForExpression(self, ctx:ClParser.ForExpressionContext):
        pass


    # Enter a parse tree produced by ClParser#loopStatements.
    def enterLoopStatements(self, ctx:ClParser.LoopStatementsContext):
        pass

    # Exit a parse tree produced by ClParser#loopStatements.
    def exitLoopStatements(self, ctx:ClParser.LoopStatementsContext):
        pass


    # Enter a parse tree produced by ClParser#classInstantiation.
    def enterClassInstantiation(self, ctx:ClParser.ClassInstantiationContext):
        pass

    # Exit a parse tree produced by ClParser#classInstantiation.
    def exitClassInstantiation(self, ctx:ClParser.ClassInstantiationContext):
        pass


    # Enter a parse tree produced by ClParser#methodCall.
    def enterMethodCall(self, ctx:ClParser.MethodCallContext):
        pass

    # Exit a parse tree produced by ClParser#methodCall.
    def exitMethodCall(self, ctx:ClParser.MethodCallContext):
        pass


    # Enter a parse tree produced by ClParser#classReturnStatement.
    def enterClassReturnStatement(self, ctx:ClParser.ClassReturnStatementContext):
        pass

    # Exit a parse tree produced by ClParser#classReturnStatement.
    def exitClassReturnStatement(self, ctx:ClParser.ClassReturnStatementContext):
        pass


    # Enter a parse tree produced by ClParser#returnStatement.
    def enterReturnStatement(self, ctx:ClParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by ClParser#returnStatement.
    def exitReturnStatement(self, ctx:ClParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by ClParser#classExpression.
    def enterClassExpression(self, ctx:ClParser.ClassExpressionContext):
        pass

    # Exit a parse tree produced by ClParser#classExpression.
    def exitClassExpression(self, ctx:ClParser.ClassExpressionContext):
        pass


    # Enter a parse tree produced by ClParser#selfClassCall.
    def enterSelfClassCall(self, ctx:ClParser.SelfClassCallContext):
        pass

    # Exit a parse tree produced by ClParser#selfClassCall.
    def exitSelfClassCall(self, ctx:ClParser.SelfClassCallContext):
        pass


    # Enter a parse tree produced by ClParser#expression.
    def enterExpression(self, ctx:ClParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ClParser#expression.
    def exitExpression(self, ctx:ClParser.ExpressionContext):
        pass


    # Enter a parse tree produced by ClParser#callExpression.
    def enterCallExpression(self, ctx:ClParser.CallExpressionContext):
        pass

    # Exit a parse tree produced by ClParser#callExpression.
    def exitCallExpression(self, ctx:ClParser.CallExpressionContext):
        pass


    # Enter a parse tree produced by ClParser#classCallSelf.
    def enterClassCallSelf(self, ctx:ClParser.ClassCallSelfContext):
        pass

    # Exit a parse tree produced by ClParser#classCallSelf.
    def exitClassCallSelf(self, ctx:ClParser.ClassCallSelfContext):
        pass


    # Enter a parse tree produced by ClParser#integer_expr.
    def enterInteger_expr(self, ctx:ClParser.Integer_exprContext):
        pass

    # Exit a parse tree produced by ClParser#integer_expr.
    def exitInteger_expr(self, ctx:ClParser.Integer_exprContext):
        pass


    # Enter a parse tree produced by ClParser#floating_expr.
    def enterFloating_expr(self, ctx:ClParser.Floating_exprContext):
        pass

    # Exit a parse tree produced by ClParser#floating_expr.
    def exitFloating_expr(self, ctx:ClParser.Floating_exprContext):
        pass


    # Enter a parse tree produced by ClParser#string_expr.
    def enterString_expr(self, ctx:ClParser.String_exprContext):
        pass

    # Exit a parse tree produced by ClParser#string_expr.
    def exitString_expr(self, ctx:ClParser.String_exprContext):
        pass


    # Enter a parse tree produced by ClParser#type.
    def enterType(self, ctx:ClParser.TypeContext):
        pass

    # Exit a parse tree produced by ClParser#type.
    def exitType(self, ctx:ClParser.TypeContext):
        pass


    # Enter a parse tree produced by ClParser#lpar.
    def enterLpar(self, ctx:ClParser.LparContext):
        pass

    # Exit a parse tree produced by ClParser#lpar.
    def exitLpar(self, ctx:ClParser.LparContext):
        pass


    # Enter a parse tree produced by ClParser#rpar.
    def enterRpar(self, ctx:ClParser.RparContext):
        pass

    # Exit a parse tree produced by ClParser#rpar.
    def exitRpar(self, ctx:ClParser.RparContext):
        pass


    # Enter a parse tree produced by ClParser#lbrace.
    def enterLbrace(self, ctx:ClParser.LbraceContext):
        pass

    # Exit a parse tree produced by ClParser#lbrace.
    def exitLbrace(self, ctx:ClParser.LbraceContext):
        pass


    # Enter a parse tree produced by ClParser#rbrace.
    def enterRbrace(self, ctx:ClParser.RbraceContext):
        pass

    # Exit a parse tree produced by ClParser#rbrace.
    def exitRbrace(self, ctx:ClParser.RbraceContext):
        pass


    # Enter a parse tree produced by ClParser#semi.
    def enterSemi(self, ctx:ClParser.SemiContext):
        pass

    # Exit a parse tree produced by ClParser#semi.
    def exitSemi(self, ctx:ClParser.SemiContext):
        pass


    # Enter a parse tree produced by ClParser#equal.
    def enterEqual(self, ctx:ClParser.EqualContext):
        pass

    # Exit a parse tree produced by ClParser#equal.
    def exitEqual(self, ctx:ClParser.EqualContext):
        pass


    # Enter a parse tree produced by ClParser#nameDeclaration.
    def enterNameDeclaration(self, ctx:ClParser.NameDeclarationContext):
        pass

    # Exit a parse tree produced by ClParser#nameDeclaration.
    def exitNameDeclaration(self, ctx:ClParser.NameDeclarationContext):
        pass



del ClParser