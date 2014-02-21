// Generated from TTL_.g4 by ANTLR 4.1
package ua.dbproject.parsers;

/** The TTL_Parser takes care of parsing TTL files that hold the RDF input data. */

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TTL_Parser}.
 */
public interface TTL_Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TTL_Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull TTL_Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull TTL_Parser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull TTL_Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull TTL_Parser.ExprContext ctx);
}