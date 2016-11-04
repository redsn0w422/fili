// $ANTLR 3.5.1 /Users/ymostofi/Documents/filter.g 2016-11-04 07:29:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class filterParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "BAR", "DASH", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "SEP", "STRING"
	};
	public static final int EOF=-1;
	public static final int ALPHA=4;
	public static final int BAR=5;
	public static final int DASH=6;
	public static final int LEFT_BRACKET=7;
	public static final int RIGHT_BRACKET=8;
	public static final int SEP=9;
	public static final int STRING=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public filterParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public filterParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return filterParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/ymostofi/Documents/filter.g"; }


	    public static void main(String[] args) throws Exception {
	        filterLexer lex = new filterLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	 
	        filterParser parser = new filterParser(tokens);
	 
	        try {
	            parser.expr();
	        } catch (RecognitionException e)  {
	            e.printStackTrace();
	        }
	    }



	// $ANTLR start "filters"
	// /Users/ymostofi/Documents/filter.g:34:1: filters : filter ( SEP filter )* ;
	public final void filters() throws RecognitionException {
		try {
			// /Users/ymostofi/Documents/filter.g:34:9: ( filter ( SEP filter )* )
			// /Users/ymostofi/Documents/filter.g:34:11: filter ( SEP filter )*
			{
			pushFollow(FOLLOW_filter_in_filters86);
			filter();
			state._fsp--;

			// /Users/ymostofi/Documents/filter.g:34:18: ( SEP filter )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SEP) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/ymostofi/Documents/filter.g:34:19: SEP filter
					{
					match(input,SEP,FOLLOW_SEP_in_filters89); 
					pushFollow(FOLLOW_filter_in_filters91);
					filter();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
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
	}
	// $ANTLR end "filters"



	// $ANTLR start "filter"
	// /Users/ymostofi/Documents/filter.g:36:1: filter : dimname BAR dimfield DASH filterop LEFT_BRACKET item ( SEP item )* RIGHT_BRACKET ;
	public final void filter() throws RecognitionException {
		try {
			// /Users/ymostofi/Documents/filter.g:36:8: ( dimname BAR dimfield DASH filterop LEFT_BRACKET item ( SEP item )* RIGHT_BRACKET )
			// /Users/ymostofi/Documents/filter.g:36:10: dimname BAR dimfield DASH filterop LEFT_BRACKET item ( SEP item )* RIGHT_BRACKET
			{
			pushFollow(FOLLOW_dimname_in_filter102);
			dimname();
			state._fsp--;

			match(input,BAR,FOLLOW_BAR_in_filter104); 
			pushFollow(FOLLOW_dimfield_in_filter106);
			dimfield();
			state._fsp--;

			match(input,DASH,FOLLOW_DASH_in_filter108); 
			pushFollow(FOLLOW_filterop_in_filter110);
			filterop();
			state._fsp--;

			match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_filter112); 
			pushFollow(FOLLOW_item_in_filter114);
			item();
			state._fsp--;

			// /Users/ymostofi/Documents/filter.g:36:63: ( SEP item )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==SEP) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/ymostofi/Documents/filter.g:36:64: SEP item
					{
					match(input,SEP,FOLLOW_SEP_in_filter117); 
					pushFollow(FOLLOW_item_in_filter119);
					item();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_filter123); 
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
	// $ANTLR end "filter"



	// $ANTLR start "dimname"
	// /Users/ymostofi/Documents/filter.g:38:1: dimname : STRING ;
	public final void dimname() throws RecognitionException {
		try {
			// /Users/ymostofi/Documents/filter.g:38:9: ( STRING )
			// /Users/ymostofi/Documents/filter.g:38:11: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_dimname132); 
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
	// $ANTLR end "dimname"



	// $ANTLR start "dimfield"
	// /Users/ymostofi/Documents/filter.g:40:1: dimfield : STRING ;
	public final void dimfield() throws RecognitionException {
		try {
			// /Users/ymostofi/Documents/filter.g:40:9: ( STRING )
			// /Users/ymostofi/Documents/filter.g:40:12: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_dimfield141); 
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
	// $ANTLR end "dimfield"



	// $ANTLR start "filterop"
	// /Users/ymostofi/Documents/filter.g:42:1: filterop : STRING ;
	public final void filterop() throws RecognitionException {
		try {
			// /Users/ymostofi/Documents/filter.g:42:9: ( STRING )
			// /Users/ymostofi/Documents/filter.g:42:11: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_filterop149); 
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
	// $ANTLR end "filterop"



	// $ANTLR start "item"
	// /Users/ymostofi/Documents/filter.g:44:1: item : STRING ;
	public final void item() throws RecognitionException {
		try {
			// /Users/ymostofi/Documents/filter.g:44:7: ( STRING )
			// /Users/ymostofi/Documents/filter.g:44:9: STRING
			{
			match(input,STRING,FOLLOW_STRING_in_item159); 
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
	// $ANTLR end "item"

	// Delegated rules



	public static final BitSet FOLLOW_filter_in_filters86 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_SEP_in_filters89 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_filter_in_filters91 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_dimname_in_filter102 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BAR_in_filter104 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_dimfield_in_filter106 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_DASH_in_filter108 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_filterop_in_filter110 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_filter112 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_item_in_filter114 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_SEP_in_filter117 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_item_in_filter119 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_filter123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_dimname132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_dimfield141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_filterop149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_item159 = new BitSet(new long[]{0x0000000000000002L});
}
