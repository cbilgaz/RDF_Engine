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
	 * Enter a parse tree produced by {@link SPARQL_Parser#defaultGraphClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultGraphClause(@NotNull SPARQL_Parser.DefaultGraphClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#defaultGraphClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultGraphClause(@NotNull SPARQL_Parser.DefaultGraphClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SPARQL_Parser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void enterDatasetClause(@NotNull SPARQL_Parser.DatasetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#datasetClause}.
	 * @param ctx the parse tree
	 */
	void exitDatasetClause(@NotNull SPARQL_Parser.DatasetClauseContext ctx);

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
	 * Enter a parse tree produced by {@link SPARQL_Parser#sourceSelector}.
	 * @param ctx the parse tree
	 */
	void enterSourceSelector(@NotNull SPARQL_Parser.SourceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#sourceSelector}.
	 * @param ctx the parse tree
	 */
	void exitSourceSelector(@NotNull SPARQL_Parser.SourceSelectorContext ctx);

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
	 * Enter a parse tree produced by {@link SPARQL_Parser#questinvar}.
	 * @param ctx the parse tree
	 */
	void enterQuestinvar(@NotNull SPARQL_Parser.QuestinvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#questinvar}.
	 * @param ctx the parse tree
	 */
	void exitQuestinvar(@NotNull SPARQL_Parser.QuestinvarContext ctx);

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
	 * Enter a parse tree produced by {@link SPARQL_Parser#prefixnames}.
	 * @param ctx the parse tree
	 */
	void enterPrefixnames(@NotNull SPARQL_Parser.PrefixnamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQL_Parser#prefixnames}.
	 * @param ctx the parse tree
	 */
	void exitPrefixnames(@NotNull SPARQL_Parser.PrefixnamesContext ctx);

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
}