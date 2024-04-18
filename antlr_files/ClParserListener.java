// Generated from ClParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClParser}.
 */
public interface ClParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ClParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ClParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ClParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ClParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ClParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ClParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ClParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ClParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ClParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ClParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(ClParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(ClParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(ClParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(ClParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(ClParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(ClParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ClParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ClParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ClParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ClParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ClParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ClParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ClParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ClParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ClParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ClParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#classInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterClassInstantiation(ClParser.ClassInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#classInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitClassInstantiation(ClParser.ClassInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ClParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ClParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ClParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ClParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ClParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ClParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#integer_expr}.
	 * @param ctx the parse tree
	 */
	void enterInteger_expr(ClParser.Integer_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#integer_expr}.
	 * @param ctx the parse tree
	 */
	void exitInteger_expr(ClParser.Integer_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#floating_expr}.
	 * @param ctx the parse tree
	 */
	void enterFloating_expr(ClParser.Floating_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#floating_expr}.
	 * @param ctx the parse tree
	 */
	void exitFloating_expr(ClParser.Floating_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#string_expr}.
	 * @param ctx the parse tree
	 */
	void enterString_expr(ClParser.String_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#string_expr}.
	 * @param ctx the parse tree
	 */
	void exitString_expr(ClParser.String_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ClParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ClParser.TypeContext ctx);
}