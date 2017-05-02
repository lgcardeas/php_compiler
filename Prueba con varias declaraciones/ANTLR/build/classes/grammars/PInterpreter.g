tree grammar PInterpreter;

options{
	tokenVocab = P;
	ASTLabelType = CommonTree;
}

@header{
	package main;
	
	import java.util.HashMap;
}

@members{
	private HashMap<String, Value> memory = new HashMap<String, Value>();
}

interprete returns [Node n]
@init{
	StatementsListNode sl = new StatementsListNode();
	$n = sl;
}
	:	declaration+ (statement {sl.addStatement($statement.n);})+
	;

declaration
	:	^(DECL INT_TYPE ID) {memory.put($ID.text,null); }
	|	^(INIT INT_TYPE a=ID valueA=INT (',' ^(INIT b=ID valueB=INT) {memory.put($b.text, new Value(new Integer(Integer.parseInt($valueB.text))));})*) {memory.put($a.text, new Value(new Integer(Integer.parseInt($valueA.text))));}
	;
	
statement returns [Node n]
	:	ifStatement {$n = $ifStatement.n;}
	|	assigment {$n = null;}
	|	writeStatement	{$n = $writeStatement.n;}
	;
	
ifStatement returns [Node n]
	:	^(IF a=expression b=statement c=statement?) {$n = new IfNode($a.n, $b.n, $c.n);}
	;

	
assigment
	:	^(ASSIGNMENT ID expression)  {memory.put($ID.text, $expression.n.eval());}
	;
	
writeStatement returns [Node n]
	:	^(WRITE expression) {$n = new WriteNode($expression.n);}
	;
	
expression returns [Node n]
	:	^('||' a=expression b=expression) {$n = new OrNode($a.n,$b.n);}
	|	^('==' a=expression b=expression) {$n = new EqNode($a.n,$b.n);}
	|	^('<' a=expression b=expression) {$n = new LTNode($a.n,$b.n);}
	|	^('+' a=expression b=expression) {$n = new AddNode($a.n,$b.n);}
	|	^('*' a=expression b=expression) {$n = new MultNode($a.n,$b.n);}
	|	BOOLEAN {$n = new AtomNode(Boolean.valueOf($BOOLEAN.text));}
	|	INT {$n = new AtomNode(Integer.valueOf($INT.text));}
	|	ID {$n = new IDNode(memory, $ID.text);}
	;