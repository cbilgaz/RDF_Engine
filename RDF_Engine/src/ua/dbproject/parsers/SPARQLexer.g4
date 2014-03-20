lexer grammar SPARQLexer;
/* 
*------------------------------------
*          		OPERANDS
* ------------------------------------ 
*/
  
LT         		: '<'   ;
GT         		: '>'   ;
DOT        		: '.'   ;
SIGN			: '#'   ; 
COLON      		: ':'   ;	
COMMA      		: ','   ;
QUESTION		: '?'	;
LCBRACKET		: '{'   ; 
RCBRACKET		: '}'   ;
ASTERISK		: '*'	; 
DOLAR			: '$'	;
		
/*
* ---------------------------------
*        		  KEY WORDS
* ---------------------------------
*/
SELECT 		: 	[Ss][Ee][Ll][Ee][Cc][Tt]; 
WHERE		:	[Ww][Hh][Ee][Rr][Ee];
DISTINCT    : 	[Dd][Ii][Ss][Tt][Ii][Nn][Cc][Tt];
PREFIX		:   [Pp][Rr][Ee][Ff][Ii][Xx];
/*
* --------------------------------
*           LITERALS
*---------------------------------
*/
fragment DIGITS  
  		:   '0'..'9'
  		;
 
fragment LOWERLETTER 
  		:   'a'..'z' 
  		;

fragment UPPERLETTER
  		: 'A'..'Z'
  		; 

fragment LETTER 
  		:   UPPERLETTER | LOWERLETTER
  		;
  		
fragment MARKS
 		: '-' | '_' | UPPERLETTER | LOWERLETTER | ':'
  		;
		
fragment TAG : '<'.*?'>';


// Provide : <http://dbpedia.org/ontology/>
HTML_STRING 
		: '<'(TAG|~[<>])*'>';
		
MARK_STRING
		: MARKS+
		;

NEWLINE : '\r'? '\n' ;
					
LITERAL_INT
  		: DIGITS+
  		;

LITERAL_STRING  
  		: '"' (~('\\'|'\n'|'\r'|'"'))* '"'
  		;

WS  
  		:   (' '|'\t'|'\u000C'|'\r'|'\n') -> skip
  		; 

// match anything starting with // or #
COMMENT 
  		: ( '//' | SIGN ) .*? '\n' -> skip
        ;