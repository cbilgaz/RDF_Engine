package ua.dbproject.parsers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import ua.dbproject.parsers.SPARQL_Parser.ExprContext;
import ua.dbproject.parsers.SPARQL_Parser.ProgContext;

public class SPARQList extends SPARQL_BaseListener {

	@Override
	public void enterProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		super.enterProg(ctx);
	}

	@Override
	public void exitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		super.exitProg(ctx);
	}

	@Override
	public void enterExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		super.enterExpr(ctx);
	}

	@Override
	public void exitExpr(ExprContext ctx) {
		// TODO Auto-generated method stub
		super.exitExpr(ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		super.visitTerminal(node);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		super.visitErrorNode(node);
	}

}
