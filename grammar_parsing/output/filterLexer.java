// $ANTLR 3.5.1 /Users/ymostofi/Documents/filter.g 2016-11-04 07:29:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class filterLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ALPHA=4;
	public static final int BAR=5;
	public static final int DASH=6;
	public static final int LEFT_BRACKET=7;
	public static final int RIGHT_BRACKET=8;
	public static final int SEP=9;
	public static final int STRING=10;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public filterLexer() {} 
	public filterLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public filterLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/ymostofi/Documents/filter.g"; }

	// $ANTLR start "BAR"
	public final void mBAR() throws RecognitionException {
		try {
			int _type = BAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ymostofi/Documents/filter.g:7:5: ( '|' )
			// /Users/ymostofi/Documents/filter.g:7:7: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BAR"

	// $ANTLR start "DASH"
	public final void mDASH() throws RecognitionException {
		try {
			int _type = DASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ymostofi/Documents/filter.g:8:6: ( '-' )
			// /Users/ymostofi/Documents/filter.g:8:8: '-'
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
	// $ANTLR end "DASH"

	// $ANTLR start "LEFT_BRACKET"
	public final void mLEFT_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ymostofi/Documents/filter.g:9:14: ( '[' )
			// /Users/ymostofi/Documents/filter.g:9:16: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACKET"

	// $ANTLR start "RIGHT_BRACKET"
	public final void mRIGHT_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ymostofi/Documents/filter.g:10:15: ( ']' )
			// /Users/ymostofi/Documents/filter.g:10:17: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACKET"

	// $ANTLR start "SEP"
	public final void mSEP() throws RecognitionException {
		try {
			int _type = SEP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ymostofi/Documents/filter.g:11:5: ( ',' )
			// /Users/ymostofi/Documents/filter.g:11:7: ','
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
	// $ANTLR end "SEP"

	// $ANTLR start "ALPHA"
	public final void mALPHA() throws RecognitionException {
		try {
			int _type = ALPHA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ymostofi/Documents/filter.g:46:6: ( 'a' .. 'z' | 'A' .. 'Z' | '1' .. '9' )
			// /Users/ymostofi/Documents/filter.g:
			{
			if ( (input.LA(1) >= '1' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHA"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ymostofi/Documents/filter.g:48:8: ( ( ALPHA )* )
			// /Users/ymostofi/Documents/filter.g:48:11: ( ALPHA )*
			{
			// /Users/ymostofi/Documents/filter.g:48:11: ( ALPHA )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '1' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/ymostofi/Documents/filter.g:
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/ymostofi/Documents/filter.g:1:8: ( BAR | DASH | LEFT_BRACKET | RIGHT_BRACKET | SEP | ALPHA | STRING )
		int alt2=7;
		switch ( input.LA(1) ) {
		case '|':
			{
			alt2=1;
			}
			break;
		case '-':
			{
			alt2=2;
			}
			break;
		case '[':
			{
			alt2=3;
			}
			break;
		case ']':
			{
			alt2=4;
			}
			break;
		case ',':
			{
			alt2=5;
			}
			break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
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
			int LA2_6 = input.LA(2);
			if ( ((LA2_6 >= '1' && LA2_6 <= '9')||(LA2_6 >= 'A' && LA2_6 <= 'Z')||(LA2_6 >= 'a' && LA2_6 <= 'z')) ) {
				alt2=7;
			}

			else {
				alt2=6;
			}

			}
			break;
		default:
			alt2=7;
		}
		switch (alt2) {
			case 1 :
				// /Users/ymostofi/Documents/filter.g:1:10: BAR
				{
				mBAR(); 

				}
				break;
			case 2 :
				// /Users/ymostofi/Documents/filter.g:1:14: DASH
				{
				mDASH(); 

				}
				break;
			case 3 :
				// /Users/ymostofi/Documents/filter.g:1:19: LEFT_BRACKET
				{
				mLEFT_BRACKET(); 

				}
				break;
			case 4 :
				// /Users/ymostofi/Documents/filter.g:1:32: RIGHT_BRACKET
				{
				mRIGHT_BRACKET(); 

				}
				break;
			case 5 :
				// /Users/ymostofi/Documents/filter.g:1:46: SEP
				{
				mSEP(); 

				}
				break;
			case 6 :
				// /Users/ymostofi/Documents/filter.g:1:50: ALPHA
				{
				mALPHA(); 

				}
				break;
			case 7 :
				// /Users/ymostofi/Documents/filter.g:1:56: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}



}
