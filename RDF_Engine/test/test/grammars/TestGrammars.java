package test.grammars;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutionException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import ua.dbproject.parsers.ErrorListener;
import ua.dbproject.parsers.SPARQL_BaseListener;
import ua.dbproject.parsers.SPARQL_Parser;
import ua.dbproject.parsers.TTL_Parser;
import ua.dbproject.parsers.SPARQLexer;

public class TestGrammars {

	@Test
	public void testPREFIX() throws InterruptedException, ExecutionException {
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
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

	}

	@Test
	public void testSPARQL1() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
		ANTLRInputStream input = new ANTLRInputStream(
				"PREFIX schema: <http://schema.org/>. \n"
						+ "PREFIX dc: <http://purl.org/dc/terms/>.\n"
						+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
						+ "SELECT DISTINCT ?s ?title WHERE {\n"
						+ "?s schema:district \"1\".\n"
						+ "?s rdf:type schema:Place.\n"
						+ "?s dc:title ?title.\n" + "}");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.query(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());

	}

	@Test
	public void testSPARQL2() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
		ANTLRInputStream input = new ANTLRInputStream(
				"PREFIX schema: <http://schema.org/>.\n"
						+ "PREFIX dc: <http://purl.org/dc/terms/>.\n"
						+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
						+ "PREFIX foaf: <http://xmlns.com/foaf/0.1/> .\n"
						+ "SELECT ?s ?title ?district WHERE {\n"
						+ "?s dc:title ?title.\n"
						+ "?s schema:district ?district.\n"
						+ "?s foaf:source \"http://austria.drupaldata.com/taxonomy_term/21\".\n"
						+ "}");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.query(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());

	}

	@Test
	public void testSPARQL3() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
		ANTLRInputStream input = new ANTLRInputStream(
				"PREFIX schema: <http://schema.org/>.\n"
						+ "PREFIX dc: <http://purl.org/dc/terms/>.\n"
						+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
						+ "SELECT ?s ?t WHERE {\n"
						+ "?s schema:district \"18\".\n"
						+ "?s rdf:type schema:Hospital.\n"
						+ "?s dc:title ?t.\n" + "}\n");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.query(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());

	}

	@Test
	public void testSPARQL4() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
		ANTLRInputStream input = new ANTLRInputStream(
				"PREFIX schema: <http://schema.org/>.\n"
						+ "PREFIX dc: <http://purl.org/dc/terms/>.\n"
						+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
						+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
						+ "PREFIX foaf: <http://xmlns.com/foaf/0.1/> .\n"
						+ "SELECT ?s ?title ?l WHERE {\n"
						+ "?s rdf:type schema:Hospital.\n"
						+ "?s dc:title ?title.\n" + "?s foaf:source ?source.\n"
						+ "?source rdfs:label ?l.\n" + "}\n");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.query(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());

	}

	@Test
	public void testSPARQL5() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
		ANTLRInputStream input = new ANTLRInputStream(
				"PREFIX schema: <http://schema.org/>.\n"
						+ "PREFIX dc: <http://purl.org/dc/terms/>.\n"
						+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n"
						+ "PREFIX foaf: <http://xmlns.com/foaf/0.1/> .\n"
						+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n"
						+ "SELECT ?s ?title ?source ?source_label WHERE {\n"
						+ "?s dc:title ?title.\n"
						+ "?s foaf:source ?source.\n"
						+ "?source rdfs:label ?source_label.\n"
						+ "?source foaf:city \"http://austria.drupaldata.com/taxonomy_term/1\".\n"
						+ "}\n");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.query(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());

	}

	@Test
	public void testSPARQL6() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
		ANTLRInputStream input = new ANTLRInputStream(
				"SELECT $station, ?name\n "
						+ "WHERE   {"
						+ "?station onto:owner dbpedia:National_Railway_Company_of_Belgium .\n"
						+ "?station onto:name ?name .\n }");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		// RuleContext tree = parser.defprefix();

		ParseTree tree = parser.query(); // ParseTree -> RuleContext
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());

	}

	@Test
	public void testTTL() throws InterruptedException, ExecutionException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_BaseListener loader = new SPARQL_BaseListener();
		ANTLRInputStream input = new ANTLRInputStream(
				"<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#this> <http://www.w3.org/ns/auth/cert#key> <http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#cert216> .\n"
						+ "<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#this> <http://www.w3.org/ns/auth/cert#key> <http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#cert226> .\n"
						+ "<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#this> <http://purl.org/net/pingback/to> <http://id.myopenlink.net/semping/rest> .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#this> <http://purl.org/net/pingback/service> <http://id.myopenlink.net/semping> .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen> <http://xmlns.com/foaf/0.1/maker> <http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#this> .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen> <http://xmlns.com/foaf/0.1/primaryTopic> <http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#this> .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://xmlns.com/foaf/0.1/PersonalProfileDocument> .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen> <http://purl.org/dc/elements/1.1/title> \"Kingsley Uyi Idehen's FOAF file\" .\n"
						+ "	<http://id.myopenlink.net/about/id/entity/http/twitter.com/kidehen> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://rdfs.org/sioc/ns#User> .\n"
						+ "	<http://id.myopenlink.net/about/id/entity/http/twitter.com/kidehen> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://xmlns.com/foaf/0.1/OnlineAccount> .\n"
						+ "	<http://id.myopenlink.net/about/id/entity/http/twitter.com/kidehen> <http://xmlns.com/foaf/0.1/accountName> \"Twitter\" .\n"
						+ "	<http://id.myopenlink.net/about/id/entity/http/twitter.com/kidehen> <http://xmlns.com/foaf/0.1/accountServiceHomepage> <http://twitter.com/kidehen> .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#org> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://xmlns.com/foaf/0.1/Organization> .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#org> <http://purl.org/dc/elements/1.1/title> \"OpenLink Software\" .\n"
						+ "	<http://id.myopenlink.net/dataspace/person/KingsleyUyiIdehen#org> <http://xmlns.com/foaf/0.1/homepage> <http://www.openlinksw.com> .\n"
						+ "	<http://id.myopenlink.net/about/id/entity/http/www.last.fm/user/kidehen> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://rdfs.org/sioc/ns#User> .\n"
						+ "	<http://id.myopenlink.net/about/id/entity/http/www.last.fm/user/kidehen> <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> <http://xmlns.com/foaf/0.1/OnlineAccount> .\n"
						+ "	<http://id.myopenlink.net/about/id/entity/http/www.last.fm/user/kidehen> <http://xmlns.com/foaf/0.1/accountServiceHomepage> <http://www.last.fm/user/kidehen> .");
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		TTL_Parser parser = new TTL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		RuleContext tree = parser.ntriplesDoc();
		// RuleContext tree = parser.defprefix();
		// create a standard ANTLR parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		// create listener then feed to walker
		walker.walk(loader, tree); // walk parse tree

		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());

	}

}
