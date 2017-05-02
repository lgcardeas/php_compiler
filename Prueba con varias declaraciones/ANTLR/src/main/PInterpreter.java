// $ANTLR 3.5-rc-2 C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g 2014-03-02 01:50:07

	package main;
	
	import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PInterpreter extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "BOOLEAN", "DECL", 
		"ELSE", "EXPR", "FOR", "ID", "IF", "INIT", "INT", "INT_TYPE", "THEN", 
		"VARDEF", "WRITE", "WS", "'('", "')'", "'*'", "'+'", "','", "';'", "'<'", 
		"'='", "'=='", "'||'"
	};
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int ASSIGNMENT=4;
	public static final int BOOLEAN=5;
	public static final int DECL=6;
	public static final int ELSE=7;
	public static final int EXPR=8;
	public static final int FOR=9;
	public static final int ID=10;
	public static final int IF=11;
	public static final int INIT=12;
	public static final int INT=13;
	public static final int INT_TYPE=14;
	public static final int THEN=15;
	public static final int VARDEF=16;
	public static final int WRITE=17;
	public static final int WS=18;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public PInterpreter(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PInterpreter(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PInterpreter.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g"; }


		private HashMap<String, Value> memory = new HashMap<String, Value>();



	// $ANTLR start "interprete"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:18:1: interprete returns [Node n] : ( declaration )+ ( statement )+ ;
	public final Node interprete() throws RecognitionException {
		Node n = null;


		Node statement1 =null;


			StatementsListNode sl = new StatementsListNode();
			n = sl;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:23:2: ( ( declaration )+ ( statement )+ )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:23:4: ( declaration )+ ( statement )+
			{
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:23:4: ( declaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECL||LA1_0==INIT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:23:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_interprete52);
					declaration();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:23:17: ( statement )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ASSIGNMENT||LA2_0==IF||LA2_0==WRITE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:23:18: statement
					{
					pushFollow(FOLLOW_statement_in_interprete56);
					statement1=statement();
					state._fsp--;

					sl.addStatement(statement1);
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "interprete"



	// $ANTLR start "declaration"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:26:1: declaration : ( ^( DECL INT_TYPE ID ) | ^( INIT INT_TYPE a= ID valueA= INT ( ',' ^( INIT b= ID valueB= INT ) )* ) );
	public final void declaration() throws RecognitionException {
		CommonTree a=null;
		CommonTree valueA=null;
		CommonTree b=null;
		CommonTree valueB=null;
		CommonTree ID2=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:27:2: ( ^( DECL INT_TYPE ID ) | ^( INIT INT_TYPE a= ID valueA= INT ( ',' ^( INIT b= ID valueB= INT ) )* ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DECL) ) {
				alt4=1;
			}
			else if ( (LA4_0==INIT) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:27:4: ^( DECL INT_TYPE ID )
					{
					match(input,DECL,FOLLOW_DECL_in_declaration72); 
					match(input, Token.DOWN, null); 
					match(input,INT_TYPE,FOLLOW_INT_TYPE_in_declaration74); 
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration76); 
					match(input, Token.UP, null); 

					memory.put((ID2!=null?ID2.getText():null),null); 
					}
					break;
				case 2 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:28:4: ^( INIT INT_TYPE a= ID valueA= INT ( ',' ^( INIT b= ID valueB= INT ) )* )
					{
					match(input,INIT,FOLLOW_INIT_in_declaration85); 
					match(input, Token.DOWN, null); 
					match(input,INT_TYPE,FOLLOW_INT_TYPE_in_declaration87); 
					a=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration91); 
					valueA=(CommonTree)match(input,INT,FOLLOW_INT_in_declaration95); 
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:28:36: ( ',' ^( INIT b= ID valueB= INT ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==23) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:28:37: ',' ^( INIT b= ID valueB= INT )
							{
							match(input,23,FOLLOW_23_in_declaration98); 
							match(input,INIT,FOLLOW_INIT_in_declaration101); 
							match(input, Token.DOWN, null); 
							b=(CommonTree)match(input,ID,FOLLOW_ID_in_declaration105); 
							valueB=(CommonTree)match(input,INT,FOLLOW_INT_in_declaration109); 
							match(input, Token.UP, null); 

							memory.put((b!=null?b.getText():null), new Value(new Integer(Integer.parseInt((valueB!=null?valueB.getText():null)))));
							}
							break;

						default :
							break loop3;
						}
					}

					match(input, Token.UP, null); 

					memory.put((a!=null?a.getText():null), new Value(new Integer(Integer.parseInt((valueA!=null?valueA.getText():null)))));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "statement"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:31:1: statement returns [Node n] : ( ifStatement | assigment | writeStatement );
	public final Node statement() throws RecognitionException {
		Node n = null;


		Node ifStatement3 =null;
		Node writeStatement4 =null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:32:2: ( ifStatement | assigment | writeStatement )
			int alt5=3;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt5=1;
				}
				break;
			case ASSIGNMENT:
				{
				alt5=2;
				}
				break;
			case WRITE:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:32:4: ifStatement
					{
					pushFollow(FOLLOW_ifStatement_in_statement133);
					ifStatement3=ifStatement();
					state._fsp--;

					n = ifStatement3;
					}
					break;
				case 2 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:33:4: assigment
					{
					pushFollow(FOLLOW_assigment_in_statement140);
					assigment();
					state._fsp--;

					n = null;
					}
					break;
				case 3 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:34:4: writeStatement
					{
					pushFollow(FOLLOW_writeStatement_in_statement147);
					writeStatement4=writeStatement();
					state._fsp--;

					n = writeStatement4;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "statement"



	// $ANTLR start "ifStatement"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:37:1: ifStatement returns [Node n] : ^( IF a= expression b= statement (c= statement )? ) ;
	public final Node ifStatement() throws RecognitionException {
		Node n = null;


		Node a =null;
		Node b =null;
		Node c =null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:38:2: ( ^( IF a= expression b= statement (c= statement )? ) )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:38:4: ^( IF a= expression b= statement (c= statement )? )
			{
			match(input,IF,FOLLOW_IF_in_ifStatement166); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_ifStatement170);
			a=expression();
			state._fsp--;

			pushFollow(FOLLOW_statement_in_ifStatement174);
			b=statement();
			state._fsp--;

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:38:35: (c= statement )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ASSIGNMENT||LA6_0==IF||LA6_0==WRITE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:38:35: c= statement
					{
					pushFollow(FOLLOW_statement_in_ifStatement178);
					c=statement();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			n = new IfNode(a, b, c);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "ifStatement"



	// $ANTLR start "assigment"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:42:1: assigment : ^( ASSIGNMENT ID expression ) ;
	public final void assigment() throws RecognitionException {
		CommonTree ID5=null;
		Node expression6 =null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:43:2: ( ^( ASSIGNMENT ID expression ) )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:43:4: ^( ASSIGNMENT ID expression )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assigment196); 
			match(input, Token.DOWN, null); 
			ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_assigment198); 
			pushFollow(FOLLOW_expression_in_assigment200);
			expression6=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			memory.put((ID5!=null?ID5.getText():null), expression6.eval());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assigment"



	// $ANTLR start "writeStatement"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:46:1: writeStatement returns [Node n] : ^( WRITE expression ) ;
	public final Node writeStatement() throws RecognitionException {
		Node n = null;


		Node expression7 =null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:47:2: ( ^( WRITE expression ) )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:47:4: ^( WRITE expression )
			{
			match(input,WRITE,FOLLOW_WRITE_in_writeStatement221); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_writeStatement223);
			expression7=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			n = new WriteNode(expression7);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "writeStatement"



	// $ANTLR start "expression"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:50:1: expression returns [Node n] : ( ^( '||' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '*' a= expression b= expression ) | BOOLEAN | INT | ID );
	public final Node expression() throws RecognitionException {
		Node n = null;


		CommonTree BOOLEAN8=null;
		CommonTree INT9=null;
		CommonTree ID10=null;
		Node a =null;
		Node b =null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:51:2: ( ^( '||' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '*' a= expression b= expression ) | BOOLEAN | INT | ID )
			int alt7=8;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt7=1;
				}
				break;
			case 27:
				{
				alt7=2;
				}
				break;
			case 25:
				{
				alt7=3;
				}
				break;
			case 22:
				{
				alt7=4;
				}
				break;
			case 21:
				{
				alt7=5;
				}
				break;
			case BOOLEAN:
				{
				alt7=6;
				}
				break;
			case INT:
				{
				alt7=7;
				}
				break;
			case ID:
				{
				alt7=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:51:4: ^( '||' a= expression b= expression )
					{
					match(input,28,FOLLOW_28_in_expression243); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression247);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression251);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					n = new OrNode(a,b);
					}
					break;
				case 2 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:52:4: ^( '==' a= expression b= expression )
					{
					match(input,27,FOLLOW_27_in_expression260); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression264);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression268);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					n = new EqNode(a,b);
					}
					break;
				case 3 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:53:4: ^( '<' a= expression b= expression )
					{
					match(input,25,FOLLOW_25_in_expression277); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression281);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression285);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					n = new LTNode(a,b);
					}
					break;
				case 4 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:54:4: ^( '+' a= expression b= expression )
					{
					match(input,22,FOLLOW_22_in_expression294); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression298);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression302);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					n = new AddNode(a,b);
					}
					break;
				case 5 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:55:4: ^( '*' a= expression b= expression )
					{
					match(input,21,FOLLOW_21_in_expression311); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_expression315);
					a=expression();
					state._fsp--;

					pushFollow(FOLLOW_expression_in_expression319);
					b=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					n = new MultNode(a,b);
					}
					break;
				case 6 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:56:4: BOOLEAN
					{
					BOOLEAN8=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression327); 
					n = new AtomNode(Boolean.valueOf((BOOLEAN8!=null?BOOLEAN8.getText():null)));
					}
					break;
				case 7 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:57:4: INT
					{
					INT9=(CommonTree)match(input,INT,FOLLOW_INT_in_expression334); 
					n = new AtomNode(Integer.valueOf((INT9!=null?INT9.getText():null)));
					}
					break;
				case 8 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\PInterpreter.g:58:4: ID
					{
					ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_expression341); 
					n = new IDNode(memory, (ID10!=null?ID10.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return n;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_declaration_in_interprete52 = new BitSet(new long[]{0x0000000000021850L});
	public static final BitSet FOLLOW_statement_in_interprete56 = new BitSet(new long[]{0x0000000000020812L});
	public static final BitSet FOLLOW_DECL_in_declaration72 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_TYPE_in_declaration74 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_declaration76 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INIT_in_declaration85 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_TYPE_in_declaration87 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_declaration91 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INT_in_declaration95 = new BitSet(new long[]{0x0000000000800008L});
	public static final BitSet FOLLOW_23_in_declaration98 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INIT_in_declaration101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_declaration105 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INT_in_declaration109 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ifStatement_in_statement133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assigment_in_statement140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_writeStatement_in_statement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifStatement170 = new BitSet(new long[]{0x0000000000020810L});
	public static final BitSet FOLLOW_statement_in_ifStatement174 = new BitSet(new long[]{0x0000000000020818L});
	public static final BitSet FOLLOW_statement_in_ifStatement178 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assigment196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assigment198 = new BitSet(new long[]{0x000000001A602420L});
	public static final BitSet FOLLOW_expression_in_assigment200 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WRITE_in_writeStatement221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_writeStatement223 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_28_in_expression243 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression247 = new BitSet(new long[]{0x000000001A602420L});
	public static final BitSet FOLLOW_expression_in_expression251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_27_in_expression260 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression264 = new BitSet(new long[]{0x000000001A602420L});
	public static final BitSet FOLLOW_expression_in_expression268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_25_in_expression277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression281 = new BitSet(new long[]{0x000000001A602420L});
	public static final BitSet FOLLOW_expression_in_expression285 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_expression294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression298 = new BitSet(new long[]{0x000000001A602420L});
	public static final BitSet FOLLOW_expression_in_expression302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_21_in_expression311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression315 = new BitSet(new long[]{0x000000001A602420L});
	public static final BitSet FOLLOW_expression_in_expression319 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOOLEAN_in_expression327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expression334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expression341 = new BitSet(new long[]{0x0000000000000002L});
}
