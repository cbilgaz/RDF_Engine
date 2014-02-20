grammar SPARQL_;
import SPARQLexer; 

@header {
  //** The SPARQL_Parser takes care of parsing SPARQL queries. */
}
options {
  language = Java;
}

// SPARQL QUERY ...

// trivial grammar ...
prog:	expr NEWLINE ;
expr:	LITERAL_INT ;
