// Generated from SPARQL_.g4 by ANTLR 4.1
package ua.dbproject.parsers;

  //** The SPARQL_Parser takes care of parsing SPARQL queries. */

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SPARQL_Parser}.
 */
public interface SPARQL_Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull SPARQL_Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull SPARQL_Parser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull SPARQL_Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull SPARQL_Parser.ExprContext ctx);
}