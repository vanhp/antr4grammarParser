// Generated from Expr.g4 by ANTLR 4.4

	package antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Progaram}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgaram(@NotNull ExprParser.ProgaramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Progaram}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgaram(@NotNull ExprParser.ProgaramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull ExprParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(@NotNull ExprParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(@NotNull ExprParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull ExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull ExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(@NotNull ExprParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(@NotNull ExprParser.AdditionContext ctx);
}