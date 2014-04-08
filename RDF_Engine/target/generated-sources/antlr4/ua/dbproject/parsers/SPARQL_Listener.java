// Generated from ua\dbproject\parsers\SPARQL_.g4 by ANTLR 4.2
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
	 * Enter a parse tree produced by {@link SPARQL_Parser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(@NotNull SPARQL_Parser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(@NotNull SPARQL_Parser.VariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull SPARQL_Parser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull SPARQL_Parser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(@NotNull SPARQL_Parser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(@NotNull SPARQL_Parser.SubjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull SPARQL_Parser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull SPARQL_Parser.QueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupGraphPattern(@NotNull SPARQL_Parser.GroupGraphPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#groupGraphPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupGraphPattern(@NotNull SPARQL_Parser.GroupGraphPatternContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(@NotNull SPARQL_Parser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(@NotNull SPARQL_Parser.PredicateContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#dolarvar}.
	 * @param ctx the parse tree
	 */
	void enterDolarvar(@NotNull SPARQL_Parser.DolarvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#dolarvar}.
	 * @param ctx the parse tree
	 */
	void exitDolarvar(@NotNull SPARQL_Parser.DolarvarContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#triplesBlock}.
	 * @param ctx the parse tree
	 */
	void enterTriplesBlock(@NotNull SPARQL_Parser.TriplesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#triplesBlock}.
	 * @param ctx the parse tree
	 */
	void exitTriplesBlock(@NotNull SPARQL_Parser.TriplesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#defprefix}.
	 * @param ctx the parse tree
	 */
	void enterDefprefix(@NotNull SPARQL_Parser.DefprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#defprefix}.
	 * @param ctx the parse tree
	 */
	void exitDefprefix(@NotNull SPARQL_Parser.DefprefixContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#prefixname}.
	 * @param ctx the parse tree
	 */
	void enterPrefixname(@NotNull SPARQL_Parser.PrefixnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#prefixname}.
	 * @param ctx the parse tree
	 */
	void exitPrefixname(@NotNull SPARQL_Parser.PrefixnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull SPARQL_Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull SPARQL_Parser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#groupGraphPatternSub}.
	 * @param ctx the parse tree
	 */
	void enterGroupGraphPatternSub(@NotNull SPARQL_Parser.GroupGraphPatternSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#groupGraphPatternSub}.
	 * @param ctx the parse tree
	 */
	void exitGroupGraphPatternSub(@NotNull SPARQL_Parser.GroupGraphPatternSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#questionvar}.
	 * @param ctx the parse tree
	 */
	void enterQuestionvar(@NotNull SPARQL_Parser.QuestionvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#questionvar}.
	 * @param ctx the parse tree
	 */
	void exitQuestionvar(@NotNull SPARQL_Parser.QuestionvarContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void enterSelectQuery(@NotNull SPARQL_Parser.SelectQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#selectQuery}.
	 * @param ctx the parse tree
	 */
	void exitSelectQuery(@NotNull SPARQL_Parser.SelectQueryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull SPARQL_Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull SPARQL_Parser.ObjectContext ctx);
}