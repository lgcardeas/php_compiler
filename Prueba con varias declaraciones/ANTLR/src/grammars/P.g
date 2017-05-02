grammar P;

options {
output=AST;
}

tokens{
	ASSIGNMENT;
	DECL;
	INIT;
	
	FOR;
	VARDEF;
	EXPR;
}


@lexer::header{
package main;
}

@header{
package main;
}

parse
  :  declaration+ statement* EOF!
  ;
  
declaration
	:	INT_TYPE ID ';' -> ^(DECL INT_TYPE ID)
	|	INT_TYPE ID '=' INT (',' ID '=' INT)* ';' -> ^(INIT INT_TYPE ID INT)+
	;

forDeclaration
	:	INT_TYPE ID '=' INT (',' ID '=' INT)*  -> ^(INIT INT_TYPE ID INT)+
	;
  
statement
  :  ifStatement
  |  assignment
  |  writeStatement
  ;
  

  
ifStatement
  :  IF a=expression THEN b=statement (ELSE c=statement)? -> ^(IF $a $b $c?)
  ;
  
assignment
  :  ID '=' expression ';' -> ^(ASSIGNMENT ID expression)
  ;
  
writeStatement
	:	WRITE e=expression (',' e=expression)* ';' -> ^(WRITE expression)+
	;

expression 
  :  equalityExpression ( '||'^ equalityExpression)*
  ;

equalityExpression
  :  relationalExpression ('=='^ relationalExpression)*
  ;

relationalExpression
  :  aritmeticExpression ( '<'^ aritmeticExpression)*
  ;

aritmeticExpression
	:	multExpression ( '+'^ multExpression)*
	;

multExpression
	:	atom ( '*'^ atom)*
	;

atom
  :  BOOLEAN
  |  INT
  |  ID
  |  '('! expression ')'!
  ;
  
  
FOR	: 'for';
IF      : 'if';
THEN    : 'then';
ELSE    : 'else';
WRITE	: 'write';
BOOLEAN : 'true' | 'false';
INT_TYPE: 'int';
ID      : ('a'..'z' | 'A'..'Z')+;
INT  : '0'..'9'+ ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;