grammar SPARQL_;
@header {
  //** The SPARQL_Parser takes care of parsing SPARQL queries. */
}
options {
  language = Java;
  tokenVocab=SPARQLexer;
}

// SPARQL QUERY ...
query 
	: defprefix* selectQuery  EOF
	;
	
//SUPPORT : PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>\n	
defprefix 
	: PREFIX prefixnames HTML_STRING NEWLINE
	; 

prefixnames 
	: prefixname* COLON
	;
	
prefixname
	: MARK 
	| IDENT
	;  
	
selectQuery
	: SELECT DISTINCT? ( variables | ASTERISK ) datasetClause*
	;

variables
	: variable (COMMA variable)*
	;
	
variable
	: questionvar | dolarvar
	;

questionvar
    : QUESTION IDENT 
    ;

dolarvar
    : DOLAR IDENT
    ;

datasetClause 
	: FROM defaultGraphClause
	;
	
defaultGraphClause: sourceSelector ;

sourceSelector: ;

