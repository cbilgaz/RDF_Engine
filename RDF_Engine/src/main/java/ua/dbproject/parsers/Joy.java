package ua.dbproject.parsers;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ua.dbproject.parsers.SPARQL_Parser.DefprefixContext;

/**
 * The Class Joy.
 */
public class Joy {

	/**
	 * The Class PropertyFileLoader.
	 */
	public static class PropertyFileLoader extends SPARQL_BaseListener {

		/** The props. */
		Map<String, String> props = new OrderedHashMap<String, String>();

		@Override
		public void exitDefprefix(DefprefixContext ctx) {
			String id = ctx.getText(); // prop : 12313 '\n' ;
			props.put(id.intern(), ctx.NEWLINE().getText());
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	public static void main(String[] args) throws Exception {
		ErrorListener errorListenner = new ErrorListener();
		ANTLRInputStream input = new ANTLRInputStream((new FileInputStream(
				"testfolder/sparql_2.txt")));

		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		RuleContext tree = parser.query();

		// ParseTree tree = parser.prog(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		if (errorListenner.isEmpty()) {
			ParseTreeWalker walker = new ParseTreeWalker();
			// create listener then feed to walker
			PropertyFileLoader loader = new PropertyFileLoader();
			walker.walk(loader, tree); // walk parse tree
			System.out.println(loader.props); // print results
		} else {
			Iterator<ErrorHandler> errorList = errorListenner.getErrorList()
					.iterator();
			while (errorList.hasNext()) {
				System.err.println(errorList.next());
			}
		}
		Future<JDialog> futureDialog = tree.inspect(Arrays.asList(parser
				.getRuleNames()));
		futureDialog.get();
		// Utils.waitForClose(futureDialog.get());
	}
}
