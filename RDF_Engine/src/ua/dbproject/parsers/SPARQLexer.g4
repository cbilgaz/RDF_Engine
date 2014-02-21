lexer grammar SPARQLexer;

/* 
*------------------------------------
*          		OPERANDS
* ------------------------------------ 
*/

LT         		: '<'   ;
GT         		: '>'   ;
DOT        		: '.'   ;
REF		   	    : '&'   ;
SIGN			: '#'   ;	
SEMI       		: ';'   ;
COLON      		: ':'   ;		
COMMA      		: ','   ;
QUESTION		: '?'	;		
LPAREN     		: '('   ;
RPAREN     		: ')'   ;
LCBRACKET		: '{'   ; 
RCBRACKET		: '}'   ;	
		
/*
* ---------------------------------
*        		  KEY WORDS
* ---------------------------------
*/
//supporting SELECT, select, SeLecT, likewise for WHERE, where, WheRe
SELECT 		: 	('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');
WHERE		:	('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');

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
		: '-' | '_' | '.' | '!' | '~' | '*' | '\'' | '(' | ')'
		;

fragment Q_RESERVED
		: ';' | '/' | '?' | ':' | '@' | '+' | '$' | ','
		;
  		
RESERVED
		: Q_RESERVED+
		;
		
MARK
		: MARKS+
		;

NEWLINE : [\r\n]+ ;

IDENT  
  		: LETTER (LETTER | DIGITS)*   
  		;  
  		
LITERAL_LIBRARY
		: LETTER+
		;  
					
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