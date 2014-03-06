package test.grammars;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.dbproject.parsers.ErrorListener;
import ua.dbproject.parsers.SPARQL_BaseListener;
import ua.dbproject.parsers.SPARQL_Parser;
import ua.dbproject.parsers.SPARQL_Parser.VariableContext;
import ua.dbproject.parsers.SPARQL_Parser.VariablesContext;
import ua.dbproject.parsers.SPARQLexer;
import ua.dbproject.parsers.SPARQL_Parser.DefprefixContext;

public class TestGrammars {

	/**
	 * The Class PropertyFileLoader.
	 */
	public static class PropertyFileLoader extends SPARQL_BaseListener {

		/** The props. */
		Map<String, String> props = new OrderedHashMap<String, String>();

		@Override
		public void exitDefprefix(DefprefixContext ctx) {
			String id = ctx.prefixname().getText();
			props.put(id, ctx.HTML_STRING().getText());
		}

		@Override
		public void exitVariables(VariablesContext ctx) {
			int count = 0;
			List<VariableContext> vars = ctx.variable();
			Iterator<VariableContext> ite = vars.iterator();
			while (ite.hasNext()) {
				VariableContext var = ite.next();
				if (var.dolarvar() != null) {
					props.put(String.valueOf(count), "$"
							+ var.dolarvar().MARK_STRING());
				} else {
					props.put(String.valueOf(count), "?"
							+ var.questionvar().MARK_STRING());
				}
				count++;
			}
		}

	}

	PropertyFileLoader loader = null;

	@Before
	public void before() {
		loader = new PropertyFileLoader();
	}

	@Test
	public void testPREFIX() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();

		ANTLRInputStream input = new ANTLRInputStream(
				"PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>\n");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.defprefix(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker

		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		assertTrue("the key does not exist in the props!",
				loader.props.containsKey("dbpedia-owl:"));
		assertTrue("the value does not exist in the props!",
				loader.props.containsValue("<http://dbpedia.org/ontology/>"));

	}

	@Test
	public void testVARIABLE() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();

		ANTLRInputStream input = new ANTLRInputStream("?title,?name");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.variables(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		assertTrue("?title does not exist in the props!",
				loader.props.containsValue("?title"));
		assertTrue("?name does not exist in the props!",
				loader.props.containsValue("?name"));

	}

}
