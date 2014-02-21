package ua.dbproject.parsers;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Joy {

	public static class PropertyFileLoader extends SPARQL_BaseListener {
		Map<String, String> props = new OrderedHashMap<String, String>();

		@Override
		public void exitProg(SPARQL_Parser.ProgContext ctx) {
			String id = ctx.expr().getText(); // prop : 12313 '\n' ;
			props.put(id, ctx.NEWLINE().getText());
		}
	}

	public static void main(String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(
				"# started http://yago-knowledge.org 2013-07-10T03:11:48Z\n2131\n");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		RuleContext tree = parser.prog();

		// ParseTree tree = parser.prog(); //ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		PropertyFileLoader loader = new PropertyFileLoader();
		walker.walk(loader, tree); // walk parse tree
		System.out.println(loader.props); // print results

		Future<JDialog> futureDialog = tree.inspect(Arrays.asList(parser
				.getRuleNames()));
		futureDialog.get();
		// Utils.waitForClose(futureDialog.get());
	}
}
