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
    : subject predicate object DOT NEWLINE?
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

variables
	: variable
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
 