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
	
defprefix //SUPPORT : PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>\n
	: PREFIX prefixnames COLON HTML_STRING NEWLINE
	; 

prefixnames 
	: prefixname*
	;
prefixname
	: MARK 
	| IDENT
	;  
	
selectQuery
	: SELECT DISTINCT? ( variable (COMMA variable)* | ASTERISK ) datasetClause*
	;
	
variable
	: questinvar | dolarvar
	;

questinvar
    : '?' IDENT
    ;

dolarvar
    : '$' IDENT
    ;

datasetClause 
	: FROM defaultGraphClause
	;
	
defaultGraphClause: sourceSelector ;

sourceSelector: ;

