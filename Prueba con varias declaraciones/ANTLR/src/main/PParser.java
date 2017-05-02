// $ANTLR 3.5-rc-2 C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g 2014-03-02 01:50:01

package main;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g"; }


	public static class parse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parse"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:26:1: parse : ( declaration )+ ( statement )* EOF !;
	public final PParser.parse_return parse() throws RecognitionException {
		PParser.parse_return retval = new PParser.parse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope declaration1 =null;
		ParserRuleReturnScope statement2 =null;

		Object EOF3_tree=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:27:3: ( ( declaration )+ ( statement )* EOF !)
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:27:6: ( declaration )+ ( statement )* EOF !
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:27:6: ( declaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INT_TYPE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:27:6: declaration
					{
					pushFollow(FOLLOW_declaration_in_parse68);
					declaration1=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration1.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:27:19: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= ID && LA2_0 <= IF)||LA2_0==WRITE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:27:19: statement
					{
					pushFollow(FOLLOW_statement_in_parse71);
					statement2=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement2.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_parse74); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parse"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:30:1: declaration : ( INT_TYPE ID ';' -> ^( DECL INT_TYPE ID ) | INT_TYPE ID '=' INT ( ',' ID '=' INT )* ';' -> ( ^( INIT INT_TYPE ID INT ) )+ );
	public final PParser.declaration_return declaration() throws RecognitionException {
		PParser.declaration_return retval = new PParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT_TYPE4=null;
		Token ID5=null;
		Token char_literal6=null;
		Token INT_TYPE7=null;
		Token ID8=null;
		Token char_literal9=null;
		Token INT10=null;
		Token char_literal11=null;
		Token ID12=null;
		Token char_literal13=null;
		Token INT14=null;
		Token char_literal15=null;

		Object INT_TYPE4_tree=null;
		Object ID5_tree=null;
		Object char_literal6_tree=null;
		Object INT_TYPE7_tree=null;
		Object ID8_tree=null;
		Object char_literal9_tree=null;
		Object INT10_tree=null;
		Object char_literal11_tree=null;
		Object ID12_tree=null;
		Object char_literal13_tree=null;
		Object INT14_tree=null;
		Object char_literal15_tree=null;
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_INT_TYPE=new RewriteRuleTokenStream(adaptor,"token INT_TYPE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:31:2: ( INT_TYPE ID ';' -> ^( DECL INT_TYPE ID ) | INT_TYPE ID '=' INT ( ',' ID '=' INT )* ';' -> ( ^( INIT INT_TYPE ID INT ) )+ )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT_TYPE) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==ID) ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2==24) ) {
						alt4=1;
					}
					else if ( (LA4_2==26) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:31:4: INT_TYPE ID ';'
					{
					INT_TYPE4=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_declaration89);  
					stream_INT_TYPE.add(INT_TYPE4);

					ID5=(Token)match(input,ID,FOLLOW_ID_in_declaration91);  
					stream_ID.add(ID5);

					char_literal6=(Token)match(input,24,FOLLOW_24_in_declaration93);  
					stream_24.add(char_literal6);

					// AST REWRITE
					// elements: INT_TYPE, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 31:20: -> ^( DECL INT_TYPE ID )
					{
						// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:31:23: ^( DECL INT_TYPE ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_1);
						adaptor.addChild(root_1, stream_INT_TYPE.nextNode());
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:32:4: INT_TYPE ID '=' INT ( ',' ID '=' INT )* ';'
					{
					INT_TYPE7=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_declaration108);  
					stream_INT_TYPE.add(INT_TYPE7);

					ID8=(Token)match(input,ID,FOLLOW_ID_in_declaration110);  
					stream_ID.add(ID8);

					char_literal9=(Token)match(input,26,FOLLOW_26_in_declaration112);  
					stream_26.add(char_literal9);

					INT10=(Token)match(input,INT,FOLLOW_INT_in_declaration114);  
					stream_INT.add(INT10);

					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:32:24: ( ',' ID '=' INT )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==23) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:32:25: ',' ID '=' INT
							{
							char_literal11=(Token)match(input,23,FOLLOW_23_in_declaration117);  
							stream_23.add(char_literal11);

							ID12=(Token)match(input,ID,FOLLOW_ID_in_declaration119);  
							stream_ID.add(ID12);

							char_literal13=(Token)match(input,26,FOLLOW_26_in_declaration121);  
							stream_26.add(char_literal13);

							INT14=(Token)match(input,INT,FOLLOW_INT_in_declaration123);  
							stream_INT.add(INT14);

							}
							break;

						default :
							break loop3;
						}
					}

					char_literal15=(Token)match(input,24,FOLLOW_24_in_declaration127);  
					stream_24.add(char_literal15);

					// AST REWRITE
					// elements: INT, ID, INT_TYPE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 32:46: -> ( ^( INIT INT_TYPE ID INT ) )+
					{
						if ( !(stream_INT.hasNext()||stream_ID.hasNext()||stream_INT_TYPE.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_INT.hasNext()||stream_ID.hasNext()||stream_INT_TYPE.hasNext() ) {
							// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:32:49: ^( INIT INT_TYPE ID INT )
							{
							Object root_1 = (Object)adaptor.nil();
							root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);
							adaptor.addChild(root_1, stream_INT_TYPE.nextNode());
							adaptor.addChild(root_1, stream_ID.nextNode());
							adaptor.addChild(root_1, stream_INT.nextNode());
							adaptor.addChild(root_0, root_1);
							}

						}
						stream_INT.reset();
						stream_ID.reset();
						stream_INT_TYPE.reset();

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class forDeclaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forDeclaration"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:35:1: forDeclaration : INT_TYPE ID '=' INT ( ',' ID '=' INT )* -> ( ^( INIT INT_TYPE ID INT ) )+ ;
	public final PParser.forDeclaration_return forDeclaration() throws RecognitionException {
		PParser.forDeclaration_return retval = new PParser.forDeclaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT_TYPE16=null;
		Token ID17=null;
		Token char_literal18=null;
		Token INT19=null;
		Token char_literal20=null;
		Token ID21=null;
		Token char_literal22=null;
		Token INT23=null;

		Object INT_TYPE16_tree=null;
		Object ID17_tree=null;
		Object char_literal18_tree=null;
		Object INT19_tree=null;
		Object char_literal20_tree=null;
		Object ID21_tree=null;
		Object char_literal22_tree=null;
		Object INT23_tree=null;
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_INT_TYPE=new RewriteRuleTokenStream(adaptor,"token INT_TYPE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:36:2: ( INT_TYPE ID '=' INT ( ',' ID '=' INT )* -> ( ^( INIT INT_TYPE ID INT ) )+ )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:36:4: INT_TYPE ID '=' INT ( ',' ID '=' INT )*
			{
			INT_TYPE16=(Token)match(input,INT_TYPE,FOLLOW_INT_TYPE_in_forDeclaration151);  
			stream_INT_TYPE.add(INT_TYPE16);

			ID17=(Token)match(input,ID,FOLLOW_ID_in_forDeclaration153);  
			stream_ID.add(ID17);

			char_literal18=(Token)match(input,26,FOLLOW_26_in_forDeclaration155);  
			stream_26.add(char_literal18);

			INT19=(Token)match(input,INT,FOLLOW_INT_in_forDeclaration157);  
			stream_INT.add(INT19);

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:36:24: ( ',' ID '=' INT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==23) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:36:25: ',' ID '=' INT
					{
					char_literal20=(Token)match(input,23,FOLLOW_23_in_forDeclaration160);  
					stream_23.add(char_literal20);

					ID21=(Token)match(input,ID,FOLLOW_ID_in_forDeclaration162);  
					stream_ID.add(ID21);

					char_literal22=(Token)match(input,26,FOLLOW_26_in_forDeclaration164);  
					stream_26.add(char_literal22);

					INT23=(Token)match(input,INT,FOLLOW_INT_in_forDeclaration166);  
					stream_INT.add(INT23);

					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: ID, INT, INT_TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 36:43: -> ( ^( INIT INT_TYPE ID INT ) )+
			{
				if ( !(stream_ID.hasNext()||stream_INT.hasNext()||stream_INT_TYPE.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ID.hasNext()||stream_INT.hasNext()||stream_INT_TYPE.hasNext() ) {
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:36:46: ^( INIT INT_TYPE ID INT )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);
					adaptor.addChild(root_1, stream_INT_TYPE.nextNode());
					adaptor.addChild(root_1, stream_ID.nextNode());
					adaptor.addChild(root_1, stream_INT.nextNode());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_ID.reset();
				stream_INT.reset();
				stream_INT_TYPE.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forDeclaration"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:39:1: statement : ( ifStatement | assignment | writeStatement );
	public final PParser.statement_return statement() throws RecognitionException {
		PParser.statement_return retval = new PParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope ifStatement24 =null;
		ParserRuleReturnScope assignment25 =null;
		ParserRuleReturnScope writeStatement26 =null;


		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:40:3: ( ifStatement | assignment | writeStatement )
			int alt6=3;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt6=1;
				}
				break;
			case ID:
				{
				alt6=2;
				}
				break;
			case WRITE:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:40:6: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement197);
					ifStatement24=ifStatement();
					state._fsp--;

					adaptor.addChild(root_0, ifStatement24.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:41:6: assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_statement204);
					assignment25=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment25.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:42:6: writeStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_writeStatement_in_statement211);
					writeStatement26=writeStatement();
					state._fsp--;

					adaptor.addChild(root_0, writeStatement26.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:47:1: ifStatement : IF a= expression THEN b= statement ( ELSE c= statement )? -> ^( IF $a $b ( $c)? ) ;
	public final PParser.ifStatement_return ifStatement() throws RecognitionException {
		PParser.ifStatement_return retval = new PParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF27=null;
		Token THEN28=null;
		Token ELSE29=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		Object IF27_tree=null;
		Object THEN28_tree=null;
		Object ELSE29_tree=null;
		RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:48:3: ( IF a= expression THEN b= statement ( ELSE c= statement )? -> ^( IF $a $b ( $c)? ) )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:48:6: IF a= expression THEN b= statement ( ELSE c= statement )?
			{
			IF27=(Token)match(input,IF,FOLLOW_IF_in_ifStatement231);  
			stream_IF.add(IF27);

			pushFollow(FOLLOW_expression_in_ifStatement235);
			a=expression();
			state._fsp--;

			stream_expression.add(a.getTree());
			THEN28=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement237);  
			stream_THEN.add(THEN28);

			pushFollow(FOLLOW_statement_in_ifStatement241);
			b=statement();
			state._fsp--;

			stream_statement.add(b.getTree());
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:48:39: ( ELSE c= statement )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ELSE) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:48:40: ELSE c= statement
					{
					ELSE29=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement244);  
					stream_ELSE.add(ELSE29);

					pushFollow(FOLLOW_statement_in_ifStatement248);
					c=statement();
					state._fsp--;

					stream_statement.add(c.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: b, a, IF, c
			// token labels: 
			// rule labels: retval, b, c, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 48:59: -> ^( IF $a $b ( $c)? )
			{
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:48:62: ^( IF $a $b ( $c)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				adaptor.addChild(root_1, stream_b.nextTree());
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:48:74: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextTree());
				}
				stream_c.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:51:1: assignment : ID '=' expression ';' -> ^( ASSIGNMENT ID expression ) ;
	public final PParser.assignment_return assignment() throws RecognitionException {
		PParser.assignment_return retval = new PParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID30=null;
		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope expression32 =null;

		Object ID30_tree=null;
		Object char_literal31_tree=null;
		Object char_literal33_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:52:3: ( ID '=' expression ';' -> ^( ASSIGNMENT ID expression ) )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:52:6: ID '=' expression ';'
			{
			ID30=(Token)match(input,ID,FOLLOW_ID_in_assignment282);  
			stream_ID.add(ID30);

			char_literal31=(Token)match(input,26,FOLLOW_26_in_assignment284);  
			stream_26.add(char_literal31);

			pushFollow(FOLLOW_expression_in_assignment286);
			expression32=expression();
			state._fsp--;

			stream_expression.add(expression32.getTree());
			char_literal33=(Token)match(input,24,FOLLOW_24_in_assignment288);  
			stream_24.add(char_literal33);

			// AST REWRITE
			// elements: ID, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 52:28: -> ^( ASSIGNMENT ID expression )
			{
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:52:31: ^( ASSIGNMENT ID expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class writeStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "writeStatement"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:55:1: writeStatement : WRITE e= expression ( ',' e= expression )* ';' -> ( ^( WRITE expression ) )+ ;
	public final PParser.writeStatement_return writeStatement() throws RecognitionException {
		PParser.writeStatement_return retval = new PParser.writeStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WRITE34=null;
		Token char_literal35=null;
		Token char_literal36=null;
		ParserRuleReturnScope e =null;

		Object WRITE34_tree=null;
		Object char_literal35_tree=null;
		Object char_literal36_tree=null;
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:56:2: ( WRITE e= expression ( ',' e= expression )* ';' -> ( ^( WRITE expression ) )+ )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:56:4: WRITE e= expression ( ',' e= expression )* ';'
			{
			WRITE34=(Token)match(input,WRITE,FOLLOW_WRITE_in_writeStatement312);  
			stream_WRITE.add(WRITE34);

			pushFollow(FOLLOW_expression_in_writeStatement316);
			e=expression();
			state._fsp--;

			stream_expression.add(e.getTree());
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:56:23: ( ',' e= expression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==23) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:56:24: ',' e= expression
					{
					char_literal35=(Token)match(input,23,FOLLOW_23_in_writeStatement319);  
					stream_23.add(char_literal35);

					pushFollow(FOLLOW_expression_in_writeStatement323);
					e=expression();
					state._fsp--;

					stream_expression.add(e.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			char_literal36=(Token)match(input,24,FOLLOW_24_in_writeStatement327);  
			stream_24.add(char_literal36);

			// AST REWRITE
			// elements: expression, WRITE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 56:47: -> ( ^( WRITE expression ) )+
			{
				if ( !(stream_expression.hasNext()||stream_WRITE.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext()||stream_WRITE.hasNext() ) {
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:56:50: ^( WRITE expression )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_WRITE.nextNode(), root_1);
					adaptor.addChild(root_1, stream_expression.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_expression.reset();
				stream_WRITE.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "writeStatement"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:59:1: expression : equalityExpression ( '||' ^ equalityExpression )* ;
	public final PParser.expression_return expression() throws RecognitionException {
		PParser.expression_return retval = new PParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal38=null;
		ParserRuleReturnScope equalityExpression37 =null;
		ParserRuleReturnScope equalityExpression39 =null;

		Object string_literal38_tree=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:60:3: ( equalityExpression ( '||' ^ equalityExpression )* )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:60:6: equalityExpression ( '||' ^ equalityExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_equalityExpression_in_expression350);
			equalityExpression37=equalityExpression();
			state._fsp--;

			adaptor.addChild(root_0, equalityExpression37.getTree());

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:60:25: ( '||' ^ equalityExpression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==28) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:60:27: '||' ^ equalityExpression
					{
					string_literal38=(Token)match(input,28,FOLLOW_28_in_expression354); 
					string_literal38_tree = (Object)adaptor.create(string_literal38);
					root_0 = (Object)adaptor.becomeRoot(string_literal38_tree, root_0);

					pushFollow(FOLLOW_equalityExpression_in_expression357);
					equalityExpression39=equalityExpression();
					state._fsp--;

					adaptor.addChild(root_0, equalityExpression39.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class equalityExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equalityExpression"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:63:1: equalityExpression : relationalExpression ( '==' ^ relationalExpression )* ;
	public final PParser.equalityExpression_return equalityExpression() throws RecognitionException {
		PParser.equalityExpression_return retval = new PParser.equalityExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;
		ParserRuleReturnScope relationalExpression40 =null;
		ParserRuleReturnScope relationalExpression42 =null;

		Object string_literal41_tree=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:64:3: ( relationalExpression ( '==' ^ relationalExpression )* )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:64:6: relationalExpression ( '==' ^ relationalExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relationalExpression_in_equalityExpression373);
			relationalExpression40=relationalExpression();
			state._fsp--;

			adaptor.addChild(root_0, relationalExpression40.getTree());

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:64:27: ( '==' ^ relationalExpression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==27) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:64:28: '==' ^ relationalExpression
					{
					string_literal41=(Token)match(input,27,FOLLOW_27_in_equalityExpression376); 
					string_literal41_tree = (Object)adaptor.create(string_literal41);
					root_0 = (Object)adaptor.becomeRoot(string_literal41_tree, root_0);

					pushFollow(FOLLOW_relationalExpression_in_equalityExpression379);
					relationalExpression42=relationalExpression();
					state._fsp--;

					adaptor.addChild(root_0, relationalExpression42.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityExpression"


	public static class relationalExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relationalExpression"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:67:1: relationalExpression : aritmeticExpression ( '<' ^ aritmeticExpression )* ;
	public final PParser.relationalExpression_return relationalExpression() throws RecognitionException {
		PParser.relationalExpression_return retval = new PParser.relationalExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal44=null;
		ParserRuleReturnScope aritmeticExpression43 =null;
		ParserRuleReturnScope aritmeticExpression45 =null;

		Object char_literal44_tree=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:68:3: ( aritmeticExpression ( '<' ^ aritmeticExpression )* )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:68:6: aritmeticExpression ( '<' ^ aritmeticExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_aritmeticExpression_in_relationalExpression395);
			aritmeticExpression43=aritmeticExpression();
			state._fsp--;

			adaptor.addChild(root_0, aritmeticExpression43.getTree());

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:68:26: ( '<' ^ aritmeticExpression )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==25) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:68:28: '<' ^ aritmeticExpression
					{
					char_literal44=(Token)match(input,25,FOLLOW_25_in_relationalExpression399); 
					char_literal44_tree = (Object)adaptor.create(char_literal44);
					root_0 = (Object)adaptor.becomeRoot(char_literal44_tree, root_0);

					pushFollow(FOLLOW_aritmeticExpression_in_relationalExpression402);
					aritmeticExpression45=aritmeticExpression();
					state._fsp--;

					adaptor.addChild(root_0, aritmeticExpression45.getTree());

					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalExpression"


	public static class aritmeticExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "aritmeticExpression"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:71:1: aritmeticExpression : multExpression ( '+' ^ multExpression )* ;
	public final PParser.aritmeticExpression_return aritmeticExpression() throws RecognitionException {
		PParser.aritmeticExpression_return retval = new PParser.aritmeticExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		ParserRuleReturnScope multExpression46 =null;
		ParserRuleReturnScope multExpression48 =null;

		Object char_literal47_tree=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:72:2: ( multExpression ( '+' ^ multExpression )* )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:72:4: multExpression ( '+' ^ multExpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multExpression_in_aritmeticExpression416);
			multExpression46=multExpression();
			state._fsp--;

			adaptor.addChild(root_0, multExpression46.getTree());

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:72:19: ( '+' ^ multExpression )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==22) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:72:21: '+' ^ multExpression
					{
					char_literal47=(Token)match(input,22,FOLLOW_22_in_aritmeticExpression420); 
					char_literal47_tree = (Object)adaptor.create(char_literal47);
					root_0 = (Object)adaptor.becomeRoot(char_literal47_tree, root_0);

					pushFollow(FOLLOW_multExpression_in_aritmeticExpression423);
					multExpression48=multExpression();
					state._fsp--;

					adaptor.addChild(root_0, multExpression48.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aritmeticExpression"


	public static class multExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multExpression"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:75:1: multExpression : atom ( '*' ^ atom )* ;
	public final PParser.multExpression_return multExpression() throws RecognitionException {
		PParser.multExpression_return retval = new PParser.multExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal50=null;
		ParserRuleReturnScope atom49 =null;
		ParserRuleReturnScope atom51 =null;

		Object char_literal50_tree=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:76:2: ( atom ( '*' ^ atom )* )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:76:4: atom ( '*' ^ atom )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_atom_in_multExpression436);
			atom49=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom49.getTree());

			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:76:9: ( '*' ^ atom )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==21) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:76:11: '*' ^ atom
					{
					char_literal50=(Token)match(input,21,FOLLOW_21_in_multExpression440); 
					char_literal50_tree = (Object)adaptor.create(char_literal50);
					root_0 = (Object)adaptor.becomeRoot(char_literal50_tree, root_0);

					pushFollow(FOLLOW_atom_in_multExpression443);
					atom51=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom51.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpression"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:79:1: atom : ( BOOLEAN | INT | ID | '(' ! expression ')' !);
	public final PParser.atom_return atom() throws RecognitionException {
		PParser.atom_return retval = new PParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BOOLEAN52=null;
		Token INT53=null;
		Token ID54=null;
		Token char_literal55=null;
		Token char_literal57=null;
		ParserRuleReturnScope expression56 =null;

		Object BOOLEAN52_tree=null;
		Object INT53_tree=null;
		Object ID54_tree=null;
		Object char_literal55_tree=null;
		Object char_literal57_tree=null;

		try {
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:80:3: ( BOOLEAN | INT | ID | '(' ! expression ')' !)
			int alt14=4;
			switch ( input.LA(1) ) {
			case BOOLEAN:
				{
				alt14=1;
				}
				break;
			case INT:
				{
				alt14=2;
				}
				break;
			case ID:
				{
				alt14=3;
				}
				break;
			case 19:
				{
				alt14=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:80:6: BOOLEAN
					{
					root_0 = (Object)adaptor.nil();


					BOOLEAN52=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom458); 
					BOOLEAN52_tree = (Object)adaptor.create(BOOLEAN52);
					adaptor.addChild(root_0, BOOLEAN52_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:81:6: INT
					{
					root_0 = (Object)adaptor.nil();


					INT53=(Token)match(input,INT,FOLLOW_INT_in_atom465); 
					INT53_tree = (Object)adaptor.create(INT53);
					adaptor.addChild(root_0, INT53_tree);

					}
					break;
				case 3 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:82:6: ID
					{
					root_0 = (Object)adaptor.nil();


					ID54=(Token)match(input,ID,FOLLOW_ID_in_atom472); 
					ID54_tree = (Object)adaptor.create(ID54);
					adaptor.addChild(root_0, ID54_tree);

					}
					break;
				case 4 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:83:6: '(' ! expression ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal55=(Token)match(input,19,FOLLOW_19_in_atom479); 
					pushFollow(FOLLOW_expression_in_atom482);
					expression56=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression56.getTree());

					char_literal57=(Token)match(input,20,FOLLOW_20_in_atom484); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_declaration_in_parse68 = new BitSet(new long[]{0x0000000000024C00L});
	public static final BitSet FOLLOW_statement_in_parse71 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_EOF_in_parse74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_declaration89 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_declaration91 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_declaration93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_declaration108 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_declaration110 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_declaration112 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INT_in_declaration114 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_23_in_declaration117 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_declaration119 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_declaration121 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INT_in_declaration123 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_24_in_declaration127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_forDeclaration151 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_forDeclaration153 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_forDeclaration155 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INT_in_forDeclaration157 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_forDeclaration160 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_forDeclaration162 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_forDeclaration164 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_INT_in_forDeclaration166 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_ifStatement_in_statement197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_writeStatement_in_statement211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement231 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_expression_in_ifStatement235 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_THEN_in_ifStatement237 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_statement_in_ifStatement241 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ELSE_in_ifStatement244 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_statement_in_ifStatement248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment282 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_assignment284 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_expression_in_assignment286 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_assignment288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITE_in_writeStatement312 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_expression_in_writeStatement316 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_23_in_writeStatement319 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_expression_in_writeStatement323 = new BitSet(new long[]{0x0000000001800000L});
	public static final BitSet FOLLOW_24_in_writeStatement327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_expression350 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_expression354 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_equalityExpression_in_expression357 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression373 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_equalityExpression376 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression379 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_aritmeticExpression_in_relationalExpression395 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_relationalExpression399 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_aritmeticExpression_in_relationalExpression402 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_multExpression_in_aritmeticExpression416 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_aritmeticExpression420 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_multExpression_in_aritmeticExpression423 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_atom_in_multExpression436 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpression440 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_atom_in_multExpression443 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_atom465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom479 = new BitSet(new long[]{0x0000000000082420L});
	public static final BitSet FOLLOW_expression_in_atom482 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom484 = new BitSet(new long[]{0x0000000000000002L});
}
