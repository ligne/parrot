// $ANTLR 3.0b5 src/antlr3/GenPastPir.g 2007-01-06 19:05:11

  import java.util.regex.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GenPastPirTreeParser extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "SEA", "CODE_START", "CODE_END", "WS", "STRING", "ECHO", "';'", "PRINT", "FUNCTION", "LETTER", "ASSIGN_OP", "VAR", "NUMBER", "PLUS", "MINUS", "MUL_OP", "REL_OP", "NEWLINE", "If", "STMTS"
    };
    public static final int CODE_START=6;
    public static final int LETTER=14;
    public static final int MINUS=19;
    public static final int If=23;
    public static final int WS=8;
    public static final int NUMBER=17;
    public static final int STRING=9;
    public static final int MUL_OP=20;
    public static final int SEA=5;
    public static final int CODE_END=7;
    public static final int STMTS=24;
    public static final int PROGRAM=4;
    public static final int NEWLINE=22;
    public static final int VAR=16;
    public static final int ASSIGN_OP=15;
    public static final int ECHO=10;
    public static final int PRINT=12;
    public static final int FUNCTION=13;
    public static final int EOF=-1;
    public static final int REL_OP=21;
    public static final int PLUS=18;

        public GenPastPirTreeParser(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "src/antlr3/GenPastPir.g"; }


      // used for generating unique register names
      public static int reg_num = 100;



    // $ANTLR start gen_pir_past
    // src/antlr3/GenPastPir.g:28:1: gen_pir_past : ^( PROGRAM ( node["past_stmts"] )* ) ;
    public void gen_pir_past() throws RecognitionException {   
        try {
            // src/antlr3/GenPastPir.g:29:5: ( ^( PROGRAM ( node[\"past_stmts\"] )* ) )
            // src/antlr3/GenPastPir.g:29:5: ^( PROGRAM ( node[\"past_stmts\"] )* )
            {

                  System.out.println( 
                      "#!/usr/bin/env parrot                                             \n"
                    + "                                                                  \n"
                    + "# Do not edit this file.                                          \n"
                    + "# This file has been generated by GenPastPir.xsl                  \n"
                    + "                                                                  \n"
                    + ".sub 'php_init' :load :init                                       \n"
                    + "                                                                  \n"
                    + "  load_bytecode 'languages/plumhead/src/common/plumheadlib.pbc'   \n"
                    + "  load_bytecode 'PAST-pm.pbc'                                     \n"
                    + "  load_bytecode 'MIME/Base64.pbc'                                 \n"
                    + "  load_bytecode 'dumper.pbc'                                      \n"
                    + "  load_bytecode 'CGI/QueryHash.pbc'                               \n"
                    + "                                                                  \n"
                    + ".end                                                              \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + ".sub plumhead :main                                               \n"
                    + "                                                                  \n"
                    + "    # look for subs in other namespaces                           \n"
                    + "    .local pmc parse_get_sub, parse_post_sub   \n"
                    + "    parse_get_sub  = get_global [ 'CGI'; 'QueryHash' ], 'parse_get'         \n"
                    + "    parse_post_sub = get_global [ 'CGI'; 'QueryHash' ], 'parse_post'        \n"
                    + "                                                                  \n"
                    + "    # the superglobals                                            \n"
                    + "    .local pmc superglobal_GET                                    \n"
                    + "    ( superglobal_GET ) = parse_get_sub()                         \n"
                    + "    set_global '_GET', superglobal_GET                            \n"
                    + "                                                                  \n"
                    + "    .local pmc superglobal_POST                                   \n"
                    + "    ( superglobal_POST ) = parse_post_sub()                       \n"
                    + "    set_global '_POST', superglobal_POST                          \n"
                    + "                                                                  \n"
                    + "    # The root node of PAST.                                      \n"
                    + "    .local pmc past_node_id2244466                                \n"
                    + "    past_node_id2244466  = new 'PAST::Block'                      \n"
                    + "    past_node_id2244466.init('name' => 'plumhead_main')           \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + "  # start of generic node                                         \n"
                    + "  .local pmc past_stmts                                           \n"
                    + "  past_stmts = new 'PAST::Stmts'                                  \n"
                    + "                                                                  \n"
                  );
                
            match(input,PROGRAM,FOLLOW_PROGRAM_in_gen_pir_past75); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // src/antlr3/GenPastPir.g:79:16: ( node[\"past_stmts\"] )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);
                    if ( ((LA1_0>=STRING && LA1_0<=ECHO)||(LA1_0>=PRINT && LA1_0<=FUNCTION)||(LA1_0>=ASSIGN_OP && LA1_0<=STMTS)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // src/antlr3/GenPastPir.g:79:16: node[\"past_stmts\"]
                	    {
                	    pushFollow(FOLLOW_node_in_gen_pir_past77);
                	    node("past_stmts");
                	    _fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

                  System.out.println( 
                      "                                                                  \n"
                    + "                                                                  \n"
                    + "  past_node_id2244466.'push'( past_stmts )               \n"
                    + "  null past_stmts                                        \n"
                    + "  # end of generic node                                           \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                    + "    # '_dumper'(past_node_id2244466, 'past')                      \n"
                    + "    # '_dumper'(superglobal_POST , 'superglobal_POST')            \n"
                    + "    # '_dumper'(superglobal_GET , 'superglobal_GET')              \n"
                    + "                                                                  \n"
                    + "    # .local pmc post                                             \n"
                    + "    # post = past_node_id2244466.'compile'( 'target' => 'post' )  \n"
                    + "    # '_dumper'(post, 'post')                                     \n"
                    + "                                                                  \n"
                    + "    # .local pmc pir                                              \n"
                    + "    # pir = past_node_id2244466.'compile'( 'target' => 'pir' )    \n"
                    + "    # print pir                                                   \n"
                    + "                                                                  \n"
                    + "    .local pmc eval_past                                          \n"
                    + "    eval_past = past_node_id2244466.'compile'( )                  \n"
                    + "    eval_past()                                                   \n"
                    + "    # '_dumper'(eval, 'eval')                                     \n"
                    + "                                                                  \n"
                    + ".end                                                              \n"
                    + "                                                                  \n"
                    + "                                                                  \n"
                  );
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
       }
        return ;
    }
    // $ANTLR end gen_pir_past


    // $ANTLR start node
    // src/antlr3/GenPastPir.g:114:1: node[String reg_mother] : ( ^( ECHO STRING ) | ^( PRINT node["reg_expression_exp"] ) | ^( FUNCTION LETTER ) | ^( ASSIGN_OP ^( VAR LETTER ) node["reg_assign_lhs"] ) | NUMBER | ^(infix= (PLUS|MINUS|MUL_OP|REL_OP) node[reg] node[reg] ) | ^( VAR LETTER ) | NEWLINE | STRING | ^( If node["reg_if_op"] node["reg_if_op"] ) | ^( STMTS ( node[reg_stmts] )* ) );
    public void node(String reg_mother) throws RecognitionException {   
        CommonTree infix=null;
        CommonTree STRING1=null;
        CommonTree LETTER2=null;
        CommonTree NUMBER3=null;
        CommonTree LETTER4=null;
        CommonTree STRING5=null;

        try {
            // src/antlr3/GenPastPir.g:115:5: ( ^( ECHO STRING ) | ^( PRINT node[\"reg_expression_exp\"] ) | ^( FUNCTION LETTER ) | ^( ASSIGN_OP ^( VAR LETTER ) node[\"reg_assign_lhs\"] ) | NUMBER | ^(infix= (PLUS|MINUS|MUL_OP|REL_OP) node[reg] node[reg] ) | ^( VAR LETTER ) | NEWLINE | STRING | ^( If node[\"reg_if_op\"] node[\"reg_if_op\"] ) | ^( STMTS ( node[reg_stmts] )* ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case ECHO:
                alt3=1;
                break;
            case PRINT:
                alt3=2;
                break;
            case FUNCTION:
                alt3=3;
                break;
            case ASSIGN_OP:
                alt3=4;
                break;
            case NUMBER:
                alt3=5;
                break;
            case PLUS:
            case MINUS:
            case MUL_OP:
            case REL_OP:
                alt3=6;
                break;
            case VAR:
                alt3=7;
                break;
            case NEWLINE:
                alt3=8;
                break;
            case STRING:
                alt3=9;
                break;
            case If:
                alt3=10;
                break;
            case STMTS:
                alt3=11;
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("114:1: node[String reg_mother] : ( ^( ECHO STRING ) | ^( PRINT node[\"reg_expression_exp\"] ) | ^( FUNCTION LETTER ) | ^( ASSIGN_OP ^( VAR LETTER ) node[\"reg_assign_lhs\"] ) | NUMBER | ^(infix= (PLUS|MINUS|MUL_OP|REL_OP) node[reg] node[reg] ) | ^( VAR LETTER ) | NEWLINE | STRING | ^( If node[\"reg_if_op\"] node[\"reg_if_op\"] ) | ^( STMTS ( node[reg_stmts] )* ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // src/antlr3/GenPastPir.g:115:5: ^( ECHO STRING )
                    {
                    match(input,ECHO,FOLLOW_ECHO_in_node103); 

                    match(input, Token.DOWN, null); 
                    STRING1=(CommonTree)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_node105); 

                    match(input, Token.UP, null); 

                          String without_anno = STRING1.getText();
                          without_anno = without_anno.replace( "start_sea", "\"" );
                          without_anno = without_anno.replace( "end_sea", "\"" );
                          without_anno = without_anno.replace( "\n", "\\n" );
                          System.out.println( 
                              "  # start of generic node                                         \n"
                            + "  .local pmc past_node_id2244476                                  \n"
                            + "  past_node_id2244476 = new 'PAST::Op'                            \n"
                            + "                                                                  \n"
                            + "      past_node_id2244476.'attr'( 'name', 'echo', 1 )             \n"
                            + "                                                                  \n"
                            + "                                                                  \n"
                            + "                                                                  \n"
                            + "  # start of past:Val                                             \n"
                            + "  .local pmc past_node_id2244480                                  \n"
                            + "  past_node_id2244480 = new 'PAST::Val'                           \n"
                            + "                                                                  \n"
                            + "      past_node_id2244480.'attr'( 'name', " + without_anno + ", 1 )       \n"
                            + "  past_node_id2244480.'attr'( 'ctype', 's~', 1 )                  \n"
                            + "                                                                  \n"
                            + "                                                                  \n"
                            + "  past_node_id2244480.'attr'( 'vtype', '.String', 1 )             \n"
                            + "                                                                  \n"
                            + "  past_node_id2244476.'push'( past_node_id2244480 )               \n"
                            + "  # end of past:Val                                               \n"
                            + "                                                                  \n"
                            + "                                                                  \n"
                            + "                                                                  \n"
                            + "  " + reg_mother + ".'push'( past_node_id2244476 )                        \n"
                            + "  null past_node_id2244476                                        \n"
                            + "  # end of generic node                                           \n"
                            + "                                                                  \n"
                            + "                                                                  \n"
                          );
                        

                    }
                    break;
                case 2 :
                    // src/antlr3/GenPastPir.g:152:5: ^( PRINT node[\"reg_expression_exp\"] )
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_node121); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node123);
                    node("reg_expression_exp");
                    _fsp--;


                    match(input, Token.UP, null); 
                     
                          System.out.print( 
                              "                                                                   \n"
                            + "      reg_print_op.'add_child'( reg_expression_exp )               \n"
                            + "      reg_expression_topexp.'add_child'( reg_print_op      )       \n"
                            + "    reg_expression_stmt.'add_child'( reg_expression_topexp )       \n"
                            + "  " + reg_mother + ".'add_child'( reg_expression_stmt )      \n"
                            + "  # leaving 'PRINT node'                                           \n"
                          );
                        

                    }
                    break;
                case 3 :
                    // src/antlr3/GenPastPir.g:163:5: ^( FUNCTION LETTER )
                    {
                    match(input,FUNCTION,FOLLOW_FUNCTION_in_node140); 

                    match(input, Token.DOWN, null); 
                    match(input,LETTER,FOLLOW_LETTER_in_node142); 

                    match(input, Token.UP, null); 

                          // do nothing for now
                        

                    }
                    break;
                case 4 :
                    // src/antlr3/GenPastPir.g:167:5: ^( ASSIGN_OP ^( VAR LETTER ) node[\"reg_assign_lhs\"] )
                    {

                          System.out.print( 
                              "                                                                   \n"
                            + "  # entering 'assign'                                              \n"
                            + "    reg_assign_lhs = new 'PAST::Exp'                               \n"
                          );
                        
                    match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_node164); 

                    match(input, Token.DOWN, null); 
                    match(input,VAR,FOLLOW_VAR_in_node167); 

                    match(input, Token.DOWN, null); 
                    LETTER2=(CommonTree)input.LT(1);
                    match(input,LETTER,FOLLOW_LETTER_in_node169); 

                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_node_in_node172);
                    node("reg_assign_lhs");
                    _fsp--;


                    match(input, Token.UP, null); 

                          // TODO: strip String
                          System.out.print(     
                              "                                                                   \n"
                            + "    # entering 'ASSIGN_OP ^(VAR LETTER) node'                      \n"
                            + "      .sym pmc past_op                                             \n"
                            + "      past_op = new 'PAST::Op'                                     \n"
                            + "      past_op.'op'( 'infix:=' )                                    \n"
                            + "        .sym pmc past_var                                          \n"
                            + "        past_var = new 'PAST::Var'                                 \n"
                            + "        past_var.'varname'( '" + LETTER2.getText() + "' )               \n"
                            + "        past_var.'vartype'( 'scalar' )                             \n"
                            + "        past_var.'scope'( 'global' )                               \n"
                            + "      past_op.'add_child'( past_var )                              \n"
                            + "      past_op.'add_child'( reg_assign_lhs )                        \n"
                            + "    " + reg_mother + ".'add_child'( past_op )                \n"
                            + "    # leaving  'ASSIGN_OP named_expression NUMBER'                 \n"
                          );
                        

                    }
                    break;
                case 5 :
                    // src/antlr3/GenPastPir.g:194:5: NUMBER
                    {
                    NUMBER3=(CommonTree)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_node187); 

                          System.out.print(     
                              "                                                                  \n"
                            + "# entering 'NUMBER'                                               \n"
                            + "reg_temp = new 'PAST::Val'                                        \n"
                            + "reg_temp.value( " + NUMBER3.getText() + " )                            \n"
                            + "reg_temp.valtype( 'num' )                                         \n"
                            + reg_mother + ".'add_child'( reg_temp )                       \n"
                            + "null reg_temp                                                     \n"
                            + "# leaving 'NUMBER'                                                \n"
                          );
                        

                    }
                    break;
                case 6 :
                    // src/antlr3/GenPastPir.g:207:5: ^(infix= (PLUS|MINUS|MUL_OP|REL_OP) node[reg] node[reg] )
                    {

                          reg_num++;
                          String reg = "reg_" + reg_num;
                          System.out.print( 
                              "                                                                   \n"
                            + "    # entering '( PLUS | MINUS | MUL_OP | REL_OP ) node node'               \n"
                            + "      .sym pmc " + reg + "                                         \n"
                            + "      " + reg + " = new 'PAST::Op'                                 \n"
                          );
                        
                    infix=(CommonTree)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=REL_OP) ) {
                        input.consume();
                        errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_node211);    throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node227);
                    node(reg);
                    _fsp--;

                    pushFollow(FOLLOW_node_in_node230);
                    node(reg);
                    _fsp--;


                    match(input, Token.UP, null); 

                          System.out.print( 
                              "      " + reg + ".'op'( 'infix:" + infix.getText() + "' )              \n"
                            + "    reg_temp = new 'PAST::Exp'                                     \n"
                            + "    reg_temp.'add_child'( " + reg + " )                            \n"
                            + "      null " + reg + "                                             \n"
                            + "  " + reg_mother + ".'add_child'( reg_temp )                 \n"
                            + "    null reg_temp                                                  \n"
                            + "    # leaving '( PLUS | MINUS | MUL | DIV ) node node'             \n"
                          );
                        

                    }
                    break;
                case 7 :
                    // src/antlr3/GenPastPir.g:229:5: ^( VAR LETTER )
                    {
                    match(input,VAR,FOLLOW_VAR_in_node247); 

                    match(input, Token.DOWN, null); 
                    LETTER4=(CommonTree)input.LT(1);
                    match(input,LETTER,FOLLOW_LETTER_in_node249); 

                    match(input, Token.UP, null); 

                          System.out.print( 
                              "                                                                   \n"
                            + " # entering '( VAR LETTER )                                        \n"
                            + "    reg_temp = new 'PAST::Var'                                     \n"
                            + "    reg_temp.'varname'( '" + LETTER4.getText() + "' )                   \n"
                            + "    reg_temp.'vartype'( 'scalar' )                                 \n"
                            + "    reg_temp.'scope'( 'global' )                                   \n"
                            + "  " + reg_mother + ".'add_child'( reg_temp )                 \n"
                            + "    null reg_temp                                                  \n"
                            + "  # leaving '(VAR LETTER)'                                         \n"
                          );
                        

                    }
                    break;
                case 8 :
                    // src/antlr3/GenPastPir.g:243:5: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_node263); 
                     
                          System.out.print(     
                              "                                                                   \n"
                            + "# entering 'NEWLINE'                                               \n"
                            + "            reg_temp = new 'PAST::Val'                             \n"
                            + "            reg_temp.value( '\\n' )                                \n"
                            + "            reg_temp.valtype( 'strqq' )                            \n"
                            + "          " + reg_mother + ".'add_child'( reg_temp )         \n"
                            + "          null reg_temp                                            \n"
                            + "# leaving 'NEWLINE'                                                \n"
                          );
                        

                    }
                    break;
                case 9 :
                    // src/antlr3/GenPastPir.g:256:5: STRING
                    {
                    STRING5=(CommonTree)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_node275); 

                          // In bc backslash has on special meaning, so s!/!//!
                          // Write newlines as '\n', in to not break PIR. s!\n!\\n!
                          String escaped = STRING5.getText().replaceAll( "\\\\", "\\\\\\\\\\\\\\\\" ).replaceAll( "\\n", "\\\\\\\\n" );
                          System.out.print(     
                              "                                                                   \n"
                            + "# entering 'STRING'                                                \n"
                            + "            reg_temp = new 'PAST::Val'                             \n"
                            + "            reg_temp.value( " + escaped + " )                      \n"
                            + "            reg_temp.valtype( 'strqq' )                            \n"
                            + "          " + reg_mother + ".'add_child'( reg_temp )         \n"
                            + "          null reg_temp                                            \n"
                            + "# leaving 'STRING'                                                 \n"
                          );
                        

                    }
                    break;
                case 10 :
                    // src/antlr3/GenPastPir.g:272:5: ^( If node[\"reg_if_op\"] node[\"reg_if_op\"] )
                    {

                          reg_num++;
                          String reg_exp   = "reg_expression_" + reg_num;
                          System.out.print( 
                              "  # entering 'If node node                                         \n"
                            + "      reg_if_op = new 'PAST::Op'                                   \n"
                            + "      reg_if_op.'op'( 'if' )                                       \n"
                            + "        .sym pmc " + reg_exp + "                                   \n"
                            + "        " + reg_exp + " = new 'PAST::Exp'                          \n"
                            + "                                                                   \n"
                          );
                        
                    match(input,If,FOLLOW_If_in_node295); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_node_in_node297);
                    node("reg_if_op");
                    _fsp--;

                    pushFollow(FOLLOW_node_in_node300);
                    node("reg_if_op");
                    _fsp--;


                    match(input, Token.UP, null); 

                           // Create a node for If
                          System.out.print( 
                              "  # entering 'STMTS node*'                                         \n"
                            + "  " + reg_mother + ".'add_child'( reg_if_op )                \n"
                            + "  # leaving 'If node node                                          \n"
                          );
                        

                    }
                    break;
                case 11 :
                    // src/antlr3/GenPastPir.g:293:5: ^( STMTS ( node[reg_stmts] )* )
                    {

                          reg_num++;
                          String reg_stmts = "reg_stmts_" + reg_num;
                          System.out.print( 
                              "        .sym pmc " + reg_stmts + "                                 \n"
                            + "        " + reg_stmts + " = new 'PAST::Stmts'                      \n"
                          );
                        
                    match(input,STMTS,FOLLOW_STMTS_in_node323); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // src/antlr3/GenPastPir.g:301:14: ( node[reg_stmts] )*
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);
                            if ( ((LA2_0>=STRING && LA2_0<=ECHO)||(LA2_0>=PRINT && LA2_0<=FUNCTION)||(LA2_0>=ASSIGN_OP && LA2_0<=STMTS)) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // src/antlr3/GenPastPir.g:301:14: node[reg_stmts]
                        	    {
                        	    pushFollow(FOLLOW_node_in_node325);
                        	    node(reg_stmts);
                        	    _fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop2;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }

                           // Create a node for If
                          System.out.print( 
                              "  " + reg_mother + ".'add_child'( " + reg_stmts + " )        \n"
                            + "  # leaving 'STMTS node*'                                          \n"
                          );
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
       }
        return ;
    }
    // $ANTLR end node


 

    public static final BitSet FOLLOW_PROGRAM_in_gen_pir_past75 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_gen_pir_past77 = new BitSet(new long[]{0x0000000001FFB608L});
    public static final BitSet FOLLOW_ECHO_in_node103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_node105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRINT_in_node121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_node140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_node142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_OP_in_node164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_VAR_in_node167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_node169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_node_in_node172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_node187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_node211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node227 = new BitSet(new long[]{0x0000000001FFB600L});
    public static final BitSet FOLLOW_node_in_node230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_node247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_node249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEWLINE_in_node263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_node275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_node295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node297 = new BitSet(new long[]{0x0000000001FFB600L});
    public static final BitSet FOLLOW_node_in_node300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMTS_in_node323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_node_in_node325 = new BitSet(new long[]{0x0000000001FFB608L});

}