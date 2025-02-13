// $ANTLR null C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g 2019-02-05 12:32:14


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int WS=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:6:6: ( '(' )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:6:8: '('
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:7:6: ( ')' )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:7:8: ')'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:8:7: ( '*' )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:8:9: '*'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:9:7: ( '+' )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:9:9: '+'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:10:7: ( '-' )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:10:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:11:7: ( '=' )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:11:9: '='
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
	// $ANTLR end "T__13"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:46:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:46:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:46:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:47:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:47:9: ( '0' .. '9' )+
			{
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:47:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:
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
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:48:8: ( ( '\\r' )? '\\n' )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:48:9: ( '\\r' )? '\\n'
			{
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:48:9: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:48:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:49:5: ( ( ' ' | '\\t' )+ )
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:49:9: ( ' ' | '\\t' )+
			{
			// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:49:9: ( ' ' | '\\t' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
		// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | ID | INT | NEWLINE | WS )
		int alt5=10;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt5=1;
			}
			break;
		case ')':
			{
			alt5=2;
			}
			break;
		case '*':
			{
			alt5=3;
			}
			break;
		case '+':
			{
			alt5=4;
			}
			break;
		case '-':
			{
			alt5=5;
			}
			break;
		case '=':
			{
			alt5=6;
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
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
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
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=7;
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
			alt5=8;
			}
			break;
		case '\n':
		case '\r':
			{
			alt5=9;
			}
			break;
		case '\t':
		case ' ':
			{
			alt5=10;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:44: ID
				{
				mID(); 

				}
				break;
			case 8 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:47: INT
				{
				mINT(); 

				}
				break;
			case 9 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:51: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 10 :
				// C:\\Users\\Sotheanith Sok\\Desktop\\Grammar\\Expr.g:1:59: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
