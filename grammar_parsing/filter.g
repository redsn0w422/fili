grammar filter;

options {
    language = Java;
}
 
tokens {
    BAR = '|' ;
    DASH = '-' ;
    LEFT_BRACKET = '[' ;
    RIGHT_BRACKET = ']' ;
    SEP = ',' ;
    QUOTE  = '\"';
    
}
 
@members {
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
}
 
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
 
filters : filter (SEP filter)* ;

filter  : dimname BAR dimfield DASH filterop ;

dimname : STRING ;

dimfield: STRING ;

filterop: LEFT_BRACKET item (SEP item)* RIGHT_BRACKET ;

item    :  QUOTE ~(QUOTE)* QUOTE;

ALPHA   : 'a'..'z' | 'A'..'Z' | '1'..'9' | ' ';

STRING  :   (ALPHA)* ;




 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/ 
