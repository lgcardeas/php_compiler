// $ANTLR 3.5-rc-2 C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g 2014-03-02 01:50:02

package main;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PLexer() {} 
	public PLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:6:7: ( '(' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:6:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:7:7: ( ')' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:7:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:8:7: ( '*' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:8:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:9:7: ( '+' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:9:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:10:7: ( ',' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:10:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:11:7: ( ';' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:11:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:12:7: ( '<' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:12:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:13:7: ( '=' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:13:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:14:7: ( '==' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:14:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:15:7: ( '||' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:15:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:87:5: ( 'for' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:87:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:88:9: ( 'if' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:88:11: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:89:9: ( 'then' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:89:11: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:90:9: ( 'else' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:90:11: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:91:7: ( 'write' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:91:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:92:9: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:92:11: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:92:20: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:93:9: ( 'int' )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:93:11: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:94:9: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:94:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:94:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:95:6: ( ( '0' .. '9' )+ )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:95:8: ( '0' .. '9' )+
			{
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:95:8: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:97:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:97:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | FOR | IF | THEN | ELSE | WRITE | BOOLEAN | INT_TYPE | ID | INT | WS )
		int alt4=20;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case ',':
			{
			alt4=5;
			}
			break;
		case ';':
			{
			alt4=6;
			}
			break;
		case '<':
			{
			alt4=7;
			}
			break;
		case '=':
			{
			int LA4_8 = input.LA(2);
			if ( (LA4_8=='=') ) {
				alt4=9;
			}

			else {
				alt4=8;
			}

			}
			break;
		case '|':
			{
			alt4=10;
			}
			break;
		case 'f':
			{
			switch ( input.LA(2) ) {
			case 'o':
				{
				int LA4_20 = input.LA(3);
				if ( (LA4_20=='r') ) {
					int LA4_28 = input.LA(4);
					if ( ((LA4_28 >= 'A' && LA4_28 <= 'Z')||(LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
						alt4=18;
					}

					else {
						alt4=11;
					}

				}

				else {
					alt4=18;
				}

				}
				break;
			case 'a':
				{
				int LA4_21 = input.LA(3);
				if ( (LA4_21=='l') ) {
					int LA4_29 = input.LA(4);
					if ( (LA4_29=='s') ) {
						int LA4_37 = input.LA(5);
						if ( (LA4_37=='e') ) {
							int LA4_43 = input.LA(6);
							if ( ((LA4_43 >= 'A' && LA4_43 <= 'Z')||(LA4_43 >= 'a' && LA4_43 <= 'z')) ) {
								alt4=18;
							}

							else {
								alt4=16;
							}

						}

						else {
							alt4=18;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

				}
				break;
			default:
				alt4=18;
			}
			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA4_22 = input.LA(3);
				if ( ((LA4_22 >= 'A' && LA4_22 <= 'Z')||(LA4_22 >= 'a' && LA4_22 <= 'z')) ) {
					alt4=18;
				}

				else {
					alt4=12;
				}

				}
				break;
			case 'n':
				{
				int LA4_23 = input.LA(3);
				if ( (LA4_23=='t') ) {
					int LA4_31 = input.LA(4);
					if ( ((LA4_31 >= 'A' && LA4_31 <= 'Z')||(LA4_31 >= 'a' && LA4_31 <= 'z')) ) {
						alt4=18;
					}

					else {
						alt4=17;
					}

				}

				else {
					alt4=18;
				}

				}
				break;
			default:
				alt4=18;
			}
			}
			break;
		case 't':
			{
			switch ( input.LA(2) ) {
			case 'h':
				{
				int LA4_24 = input.LA(3);
				if ( (LA4_24=='e') ) {
					int LA4_32 = input.LA(4);
					if ( (LA4_32=='n') ) {
						int LA4_39 = input.LA(5);
						if ( ((LA4_39 >= 'A' && LA4_39 <= 'Z')||(LA4_39 >= 'a' && LA4_39 <= 'z')) ) {
							alt4=18;
						}

						else {
							alt4=13;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

				}
				break;
			case 'r':
				{
				int LA4_25 = input.LA(3);
				if ( (LA4_25=='u') ) {
					int LA4_33 = input.LA(4);
					if ( (LA4_33=='e') ) {
						int LA4_40 = input.LA(5);
						if ( ((LA4_40 >= 'A' && LA4_40 <= 'Z')||(LA4_40 >= 'a' && LA4_40 <= 'z')) ) {
							alt4=18;
						}

						else {
							alt4=16;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

				}
				break;
			default:
				alt4=18;
			}
			}
			break;
		case 'e':
			{
			int LA4_13 = input.LA(2);
			if ( (LA4_13=='l') ) {
				int LA4_26 = input.LA(3);
				if ( (LA4_26=='s') ) {
					int LA4_34 = input.LA(4);
					if ( (LA4_34=='e') ) {
						int LA4_41 = input.LA(5);
						if ( ((LA4_41 >= 'A' && LA4_41 <= 'Z')||(LA4_41 >= 'a' && LA4_41 <= 'z')) ) {
							alt4=18;
						}

						else {
							alt4=14;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

			}

			else {
				alt4=18;
			}

			}
			break;
		case 'w':
			{
			int LA4_14 = input.LA(2);
			if ( (LA4_14=='r') ) {
				int LA4_27 = input.LA(3);
				if ( (LA4_27=='i') ) {
					int LA4_35 = input.LA(4);
					if ( (LA4_35=='t') ) {
						int LA4_42 = input.LA(5);
						if ( (LA4_42=='e') ) {
							int LA4_47 = input.LA(6);
							if ( ((LA4_47 >= 'A' && LA4_47 <= 'Z')||(LA4_47 >= 'a' && LA4_47 <= 'z')) ) {
								alt4=18;
							}

							else {
								alt4=15;
							}

						}

						else {
							alt4=18;
						}

					}

					else {
						alt4=18;
					}

				}

				else {
					alt4=18;
				}

			}

			else {
				alt4=18;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=18;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=19;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:46: T__25
				{
				mT__25(); 

				}
				break;
			case 8 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:52: T__26
				{
				mT__26(); 

				}
				break;
			case 9 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:58: T__27
				{
				mT__27(); 

				}
				break;
			case 10 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:64: T__28
				{
				mT__28(); 

				}
				break;
			case 11 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:70: FOR
				{
				mFOR(); 

				}
				break;
			case 12 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:74: IF
				{
				mIF(); 

				}
				break;
			case 13 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:77: THEN
				{
				mTHEN(); 

				}
				break;
			case 14 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:82: ELSE
				{
				mELSE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:87: WRITE
				{
				mWRITE(); 

				}
				break;
			case 16 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:93: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 17 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:101: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 18 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:110: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:113: INT
				{
				mINT(); 

				}
				break;
			case 20 :
				// C:\\Users\\Los_Kballeros\\Documents\\NetBeansProjects\\ANTLR\\src\\grammars\\P.g:1:117: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
