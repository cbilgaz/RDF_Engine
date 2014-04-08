package test.grammars;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import ua.dbproject.parsers.ErrorListener;
import ua.dbproject.parsers.SPARQL_BaseListener;
import ua.dbproject.parsers.SPARQL_Parser;
import ua.dbproject.parsers.SPARQLexer;
import ua.dbproject.parsers.TTL_Parser;

public class TestGrammars {

	private SPARQL_Parser SPARQLwalking(ErrorListener errorListenner,
			InputStream testfile) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(testfile);
		SPARQLexer lexer = new SPARQLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SPARQL_Parser parser = new SPARQL_Parser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(errorListenner);
		return parser;
	}

	@Test
	public void testPREFIX() throws InterruptedException, ExecutionException,
			FileNotFoundException, IOException {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_Parser parser = SPARQLwalking(errorListenner, getClass()
				.getResourceAsStream("/prefix.txt"));
		parser.defprefix();
		assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
	}

	@Test
	public void testSPARQL1() {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_Parser parser = null;
		try {
			parser = SPARQLwalking(errorListenner, getClass()
					.getResourceAsStream("/sparql_1.txt"));
			parser.query(); // ParseTree -> RuleContext
			assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		} catch (IOException e) {
			fail("IO Exception");
		}

	}

	@Test
	public void testSPARQL2() {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_Parser parser = null;
		try {
			parser = SPARQLwalking(errorListenner, getClass()
					.getResourceAsStream("/sparql_2.txt"));
			parser.query();
			assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		} catch (IOException e) {
			fail("IO Exception");
		}
	}

	@Test
	public void testSPARQL3() {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_Parser parser = null;
		try {
			parser = SPARQLwalking(errorListenner, getClass()
					.getResourceAsStream("/sparql_3.txt"));
			parser.query();
			assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		} catch (IOException e) {
			fail("IO Exception");
		}
	}

	@Test
	public void testSPARQL4() {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_Parser parser = null;
		try {
			parser = SPARQLwalking(errorListenner, getClass()
					.getResourceAsStream("/sparql_4.txt"));
			parser.query();
			assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		} catch (IOException e) {
			fail("IO Exception");
		}
	}

	@Test
	public void testSPARQL5() {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_Parser parser = null;
		try {
			parser = SPARQLwalking(errorListenner, getClass()
					.getResourceAsStream("/sparql_5.txt"));
			parser.query();
			assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		} catch (IOException e) {
			fail("IO Exception");
		}
	}

	@Test
	public void testSPARQL6() {
		ErrorListener errorListenner = new ErrorListener();
		SPARQL_Parser parser = null;
		try {
			parser = SPARQLwalking(errorListenner, getClass()
					.getResourceAsStream("/sparql_6.txt"));
			parser.query();
			assertTrue("Error(s) occur(s)", errorListenner.isEmpty());
		} catch (IOException e) {
			fail("IO Exception");
		}
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
