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
AND				: '&&'  ;
OR			    : '||'  ;
ASTERISK		: '*'	;
DOLAR			: '$'	;
		
/*
* ---------------------------------
*        		  KEY WORDS
* ---------------------------------
*/
SELECT 		: 	[Ss][Ee][Ll][Ee][Cc][Tt];
WHERE		:	[Ww][Hh][Ee][Rr][Ee];
BASE	    : 	[Bb][Aa][Ss][Ee];
DISTINCT    : 	[Dd][Ii][Ss][Tt][Ii][Nn][Cc][Tt];
FROM		: 	[Fr][Rr][Oo][Mm];
PREFIX		:   [Pp][Rr][Ee][Ff][Ii][Xx];
ORDER	    : 	[Oo][Rr][Dd][Ee][Rr];
ASC		    : 	[Aa][Ss][Cc];
DESC	    : 	[Dd][Ee][Ss][Cc];
LIMIT	    : 	[Ll][Ii][Mm][Ii][Tt];
UNION		: 	[Uu][Nn][Ii][Oo][Nn];
COUNT		: 	[Cc][Oo][Uu][Nn][Tt];
SUM			:	[Ss][Uu][Mm];
MIN			:	[Mm][Ii][Nn];
MAX			:	[Mm][Aa][Xx];
AVG			:	[Aa][Vv][Gg];
TRUE	    : 	[Tt][Rr][Uu][Ee];
FALSE	    : 	[Ff][Aa][Ll][Ss][Ee];
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
		: '-' | '_' 
		;
		
fragment TAG : '<'.*?'>';


// Provide : <http://dbpedia.org/ontology/>
HTML_STRING 
		: '<'(TAG|~[<>])*'>';
		
MARK_STRING
		: (MARKS | IDENT)
		;

NEWLINE : '\r'? '\n' ;

IDENT  
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