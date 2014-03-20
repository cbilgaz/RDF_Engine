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
	 * Enter a parse tree produced by {@link TTL_Parser#dolarvar}.
	 * @param ctx the parse tree
	 */
	void enterDolarvar(@NotNull TTL_Parser.DolarvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#dolarvar}.
	 * @param ctx the parse tree
	 */
	void exitDolarvar(@NotNull TTL_Parser.DolarvarContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#questionvar}.
	 * @param ctx the parse tree
	 */
	void enterQuestionvar(@NotNull TTL_Parser.QuestionvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#questionvar}.
	 * @param ctx the parse tree
	 */
	void exitQuestionvar(@NotNull TTL_Parser.QuestionvarContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(@NotNull TTL_Parser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(@NotNull TTL_Parser.SubjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#ntriplesDoc}.
	 * @param ctx the parse tree
	 */
	void enterNtriplesDoc(@NotNull TTL_Parser.NtriplesDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#ntriplesDoc}.
	 * @param ctx the parse tree
	 */
	void exitNtriplesDoc(@NotNull TTL_Parser.NtriplesDocContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull TTL_Parser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull TTL_Parser.PredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#triple}.
	 * @param ctx the parse tree
	 */
	void enterTriple(@NotNull TTL_Parser.TripleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#triple}.
	 * @param ctx the parse tree
	 */
	void exitTriple(@NotNull TTL_Parser.TripleContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull TTL_Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull TTL_Parser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link TTL_Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull TTL_Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TTL_Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull TTL_Parser.VariableContext ctx);
}