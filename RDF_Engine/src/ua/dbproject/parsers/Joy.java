package ua.dbproject.parsers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

import javax.swing.JDialog;

import org.antlr.v4.misc.OrderedHashMap;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
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
			props.put(id, ctx.NEWLINE().getText());
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

		ANTLRInputStream input = new ANTLRInputStream(

		// "SELECT $station, ?name\n "
		// + "WHERE   {"
		// +
		// "?station onto:owner dbpedia:National_Railway_Company_of_Belgium .\n"
		// + "?station onto:name ?name .\n }");

				// "PREFIX schema: <http://schema.org/>. \n"
				// + "PREFIX dc: <http://purl.org/dc/terms/>.\n"
				// +
				// "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
				// + "SELECT DISTINCT ?s ?title WHERE {\n"
				// + "?s schema:district \"1\".\n"
				// + "?s rdf:type schema:Place.\n"
				// + "?s dc:title ?title.\n" + "}");

				// "PREFIX schema: <http://schema.org/>.\n"
				// + "PREFIX dc: <http://purl.org/dc/terms/>.\n"
				// +
				// "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
				// + "PREFIX foaf: <http://xmlns.com/foaf/0.1/> .\n"
				// + "SELECT ?s ?title ?district WHERE {\n"
				// + "?s dc:title ?title.\n"
				// + "?s schema:district ?district.\n"
				// +
				// "?s foaf:source \"http://austria.drupaldata.com/taxonomy_term/21\".\n"
				// + "}");

				// "PREFIX schema: <http://schema.org/>.\n"
				// + "PREFIX dc: <http://purl.org/dc/terms/>.\n"
				// +
				// "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
				// + "PREFIX foaf: <http://xmlns.com/foaf/0.1/> .\n"
				// + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
				// + "SELECT ?s ?title ?source ?source_label WHERE {\n"
				// + "?s dc:title ?title.\n"
				// + "?s foaf:source ?source.\n"
				// + "?source rdfs:label ?source_label.\n"
				// +
				// "?source foaf:city \"http://austria.drupaldata.com/taxonomy_term/1\".\n"
				// + "}\n");

				// "PREFIX schema: <http://schema.org/>.\n"
				// + "PREFIX dc: <http://purl.org/dc/terms/>.\n"
				// +
				// "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
				// + "SELECT ?s ?t WHERE {\n"
				// + "?s schema:district \"18\".\n"
				// + "?s rdf:type schema:Hospital.\n"
				// + "?s dc:title ?t.\n" + "}\n");

				// "PREFIX schema: <http://schema.org/>.\n"
				// + "PREFIX dc: <http://purl.org/dc/terms/>.\n"
				// +
				// "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
				// + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
				// + "PREFIX foaf: <http://xmlns.com/foaf/0.1/> .\n"
				// + "SELECT ?s ?title ?l WHERE {\n"
				// + "?s rdf:type schema:Hospital.\n"
				// + "?s dc:title ?title.\n" + "?s foaf:source ?source.\n"
				// + "?source rdfs:label ?l.\n" + "}\n");

				"PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n" + "SELECT *\n"
						+ "WHERE {\n" + "?person foaf:name ?name .\n"
						+ "?person foaf:mbox ?email .\n" + "}\n");

		// "prefix xsd: <http://www.w3.org/2001/XMLSchema#>\n"
		// + "prefix bibo: <http://purl.org/ontology/bibo/>\n"
		// + "prefix foaf: <http://xmlns.com/foaf/0.1/>\n"
		// + "SELECT DISTINCT ?coauthorname WHERE {\n"
		// + "?person foaf:name \"Kuhn, Werner\"^^xsd:string.\n"
		// + "?pub bibo:producer ?person,?coauthor.\n"
		// + "?coauthor foaf:name ?coauthorname.\n" + "}\n");

		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		RuleContext tree = parser.query();

		// ParseTree tree = parser.prog(); //ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		if (errorListenner.isEmpty()) {
			ParseTreeWalker walker = new ParseTreeWalker();

			// create listener then feed to walker
			PropertyFileLoader loader = new PropertyFileLoader();
			walker.walk(loader, tree); // walk parse tree
			System.out.println(loader.props); // print results

			Future<JDialog> futureDialog = tree.inspect(Arrays.asList(parser
					.getRuleNames()));
			futureDialog.get();
			// Utils.waitForClose(futureDialog.get());
		} else {
			Iterator<ErrorHandler> errorList = errorListenner.getErrorList()
					.iterator();
			while (errorList.hasNext()) {
				System.err.println(errorList.next());
			}

		}
	}
}
