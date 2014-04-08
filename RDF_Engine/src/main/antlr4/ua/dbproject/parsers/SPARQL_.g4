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
	: defprefix* selectQuery NEWLINE? EOF 
	;
	
//SUPPORT : PREFIX dbpedia-owl: <http://dbpedia.org/ontology/> .? \n	
defprefix 
	: PREFIX prefixname HTML_STRING DOT? NEWLINE
	; 

prefixname
	: MARK_STRING
	;
	
selectQuery
	: SELECT DISTINCT? ( variables | ASTERISK ) NEWLINE? whereClause 
	;

//$station, ?name
variables
	: variable (COMMA? variable)*
	;
	
variable
	: questionvar | dolarvar
	;

questionvar
    : QUESTION MARK_STRING
    ;

dolarvar
    : DOLAR MARK_STRING
    ;

whereClause
    : WHERE? groupGraphPattern
    ;

groupGraphPattern
	: LCBRACKET NEWLINE? groupGraphPatternSub NEWLINE? RCBRACKET 
	;

groupGraphPatternSub
	: triplesBlock ( triplesBlock )*
    ;
    
triplesBlock
    : subject predicate object DOT
    ;
    
predicate
	: variables | HTML_STRING | MARK_STRING | LITERAL_STRING
	;

subject
	: variables | HTML_STRING | MARK_STRING | LITERAL_STRING
	;

object
	: variables | HTML_STRING | MARK_STRING | LITERAL_STRING
	;