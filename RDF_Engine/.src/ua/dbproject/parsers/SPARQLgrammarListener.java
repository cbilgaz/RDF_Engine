// Generated from SPARQLgrammar.g4 by ANTLR 4.1
package ua.dbproject.parsers;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SPARQLgrammarParser}.
 */
public interface SPARQLgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SPARQLgrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull SPARQLgrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLgrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull SPARQLgrammarParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQLgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SPARQLgrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SPARQLgrammarParser.ExprContext ctx);
}