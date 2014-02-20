lexer grammar SPARQLexer;

/* 
*------------------------------------
*          		OPERANDS
* ------------------------------------ 
*/

LT         		: '<'   ;
GT         		: '>'   ;
DOT        		: '.'   ;
REF		   		: '&'   ;
SEMI       		: ';'   ;
PLUS       		: '+'   ;		
COLON      		: ':'   ;		
COMMA      		: ','   ;						
MINUS      	 	: '-'   ;
LPAREN     		: '('   ;
RPAREN     		: ')'   ;
QUESTION		: '?'	;		
LCBRACKET		: '{'   ; 
RCBRACKET		: '}'   ;	
		
/*
* ---------------------------------
*        		  KEY WORDS
* ---------------------------------
*/

SELECT		:	'select';
WHERE		:	'where'	;

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

fragment UNDER_SCORES
  		: '_'
  		;

fragment LETTER 
  		:   UPPERLETTER | LOWERLETTER | UNDER_SCORES
  		;

NEWLINE : [\r\n]+ ;

IDENT  
  		: LETTER (LETTER | DIGITS)*   
  		;  
  		
LITERAL_LIBRARY
		: LETTER (LETTER | DOT)*
		;  
					
LITERAL_INT
  		:   (DIGITS)+
  		;
 
LITERAL_FLOAT 
  		:   (DIGITS)+ '.' (DIGITS)+
  		; 

LITERAL_STRING  
  		: '"' (~('\\'|'\n'|'\r'|'"'))* '"'
  		;

WS  
  		:   (' '|'\t'|'\u000C'|'\r'|'\n') -> skip
  		; 

LINECOMMENT 
  		: '//' ~('\n'|'\r')* '\r'? '\n' -> skip
        ;