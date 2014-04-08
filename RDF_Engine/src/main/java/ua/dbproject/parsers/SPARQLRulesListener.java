package ua.dbproject.parsers;

import ua.dbproject.parsers.SPARQL_Parser.DolarvarContext;
import ua.dbproject.parsers.SPARQL_Parser.ObjectContext;
import ua.dbproject.parsers.SPARQL_Parser.PredicateContext;
import ua.dbproject.parsers.SPARQL_Parser.QueryContext;
import ua.dbproject.parsers.SPARQL_Parser.QuestionvarContext;
import ua.dbproject.parsers.SPARQL_Parser.SelectQueryContext;
import ua.dbproject.parsers.SPARQL_Parser.SubjectContext;
import ua.dbproject.parsers.SPARQL_Parser.TriplesBlockContext;
import ua.dbproject.parsers.SPARQL_Parser.VariablesContext;

/**
 * @author HAKAN
 * 
 */
public class SPARQLRulesListener extends SPARQL_BaseListener {

	Query querySparql = null;

	@Override
	public void exitSubject(SubjectContext ctx) {
		// TODO Auto-generated method stub
		super.exitSubject(ctx);
	}

	@Override
	public void enterQuery(QueryContext ctx) {
		// create a new instance of sparqlQuery class
		// and begin to fill inside of it
		querySparql = new Query();
	}

	@Override
	public void enterVariables(VariablesContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariables(ctx);
	}

	@Override
	public void exitVariables(VariablesContext ctx) {
		// TODO Auto-generated method stub
		super.exitVariables(ctx);
	}

	@Override
	public void exitQuery(QueryContext ctx) {
		// TODO Auto-generated method stub
		super.exitQuery(ctx);
	}

	@Override
	public void exitTriplesBlock(TriplesBlockContext ctx) {
		// TODO Auto-generated method stub
		super.exitTriplesBlock(ctx);
	}

	@Override
	public void exitPredicate(PredicateContext ctx) {
		// TODO Auto-generated method stub
		super.exitPredicate(ctx);
	}

	@Override
	public void exitSelectQuery(SelectQueryContext ctx) {

		if (ctx.DISTINCT() != null) {
			querySparql.setDistinct(true);
		} else {
			querySparql.setDistinct(false);
		}

	}

	@Override
	public void exitObject(ObjectContext ctx) {
		// TODO Auto-generated method stub
		super.exitObject(ctx);
	}

	@Override
	public void exitQuestionvar(QuestionvarContext ctx) {
		// TODO Auto-generated method stub
		super.exitQuestionvar(ctx);
	}

	@Override
	public void exitDolarvar(DolarvarContext ctx) {
		// TODO Auto-generated method stub
		super.exitDolarvar(ctx);
	}

}
