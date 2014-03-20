grammar TTL_;

@header {
/** The TTL_Parser takes care of parsing TTL files that hold the RDF input data. */
}
options {
  language = Java;
  tokenVocab=SPARQLexer;
}

// TTL FILE ...
ntriplesDoc
	:	triple	(NEWLINE triple)* EOF
	;
	
triple
    : subject predicate object DOT
    ;
    
predicate
	: variable | HTML_STRING | MARK_STRING | LITERAL_STRING
	;

subject
	: variable | HTML_STRING | MARK_STRING | LITERAL_STRING
	;

object
	: variable | HTML_STRING | MARK_STRING | LITERAL_STRING
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