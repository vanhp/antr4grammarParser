// Generated from Expr.g4 by ANTLR 4.8

	package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Progaram}
	 * labeled alternative in {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgaram(ExprParser.ProgaramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link ExprParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ExprParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExprParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExprParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(ExprParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(ExprParser.AdditionContext ctx);
}