/* The following code was generated by JFlex 1.6.1 */

package analizador;
import static analizador.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/MaríaLaura/Documents/Scanner/analizador/src/analizador/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\75\1\3\1\5\1\6\1\4\22\0\1\16\1\56\1\1"+
    "\2\0\1\56\1\60\1\17\1\65\1\66\1\61\1\51\1\50\1\52"+
    "\1\14\1\62\1\11\7\13\2\10\1\50\1\64\1\55\1\53\1\54"+
    "\1\50\1\0\4\12\1\74\1\12\21\15\1\73\2\15\1\67\1\2"+
    "\1\70\1\56\1\15\1\0\1\20\1\24\1\30\1\35\1\26\1\36"+
    "\1\42\1\32\1\34\1\15\1\27\1\37\1\40\1\33\1\23\1\46"+
    "\1\15\1\25\1\31\1\22\1\21\1\47\1\44\1\41\1\45\1\43"+
    "\1\71\1\57\1\72\1\50\1\0\5\63\1\7\172\63\u1f28\0\1\5"+
    "\1\5\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\2\2\2\3\1\1\1\0\2\4\1\5\1\6"+
    "\1\2\17\5\11\6\1\2\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\2\1\4\4\2\1\0\1\4"+
    "\1\0\1\2\1\4\2\2\2\4\2\2\1\0\1\2"+
    "\17\5\2\16\6\5\1\17\1\0\1\2\1\0\1\4"+
    "\1\2\1\0\1\4\1\2\30\5\2\4\27\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\76\0\174\0\76\0\272\0\370\0\u0136\0\u0174"+
    "\0\u01b2\0\u01f0\0\u022e\0\u026c\0\u02aa\0\u02e8\0\u0326\0\u0364"+
    "\0\u03a2\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8\0\u0516\0\u0554"+
    "\0\u0592\0\u05d0\0\u060e\0\76\0\u064c\0\u068a\0\u06c8\0\u0706"+
    "\0\u0744\0\u0782\0\u07c0\0\u07fe\0\u0136\0\76\0\76\0\76"+
    "\0\76\0\76\0\76\0\76\0\u083c\0\76\0\u087a\0\u08b8"+
    "\0\u08f6\0\u0934\0\u022e\0\u0972\0\u09b0\0\u09ee\0\u0a2c\0\u0a6a"+
    "\0\u0aa8\0\u0ae6\0\u0b24\0\u0b62\0\u0ba0\0\u0bde\0\u0c1c\0\u0c5a"+
    "\0\u0c98\0\u0cd6\0\u0d14\0\u0d52\0\u0d90\0\u0dce\0\u0e0c\0\u0e4a"+
    "\0\u0e88\0\u0ec6\0\u0f04\0\u0f42\0\u0f80\0\u0fbe\0\u01f0\0\u0ffc"+
    "\0\u103a\0\u1078\0\u10b6\0\u10f4\0\u1132\0\u1170\0\u11ae\0\u11ec"+
    "\0\u122a\0\u1268\0\u0a6a\0\u12a6\0\u0c1c\0\u0c1c\0\u12e4\0\u1322"+
    "\0\u1360\0\u139e\0\u13dc\0\u141a\0\u1458\0\u1496\0\u14d4\0\u1512"+
    "\0\u1550\0\u158e\0\u15cc\0\u160a\0\u1648\0\u1686\0\u16c4\0\u1702"+
    "\0\u1740\0\u177e\0\u17bc\0\u17fa\0\u1838\0\u1876\0\u18b4\0\u18f2"+
    "\0\u0934\0\u1930\0\u196e\0\u19ac\0\u19ea\0\u1a28\0\u1a66\0\u1aa4"+
    "\0\u1ae2\0\u1b20\0\u1b5e\0\u1b9c\0\u1bda\0\u1c18\0\u1c56\0\u1c94"+
    "\0\u1cd2\0\u1d10\0\u1d4e\0\u1d8c\0\u1dca\0\u1e08\0\u1e46\0\u1e84";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\0\1\6\1\7"+
    "\1\10\1\11\1\12\1\10\1\13\1\12\1\6\1\14"+
    "\1\15\1\16\1\17\1\12\1\20\1\21\1\22\1\12"+
    "\1\23\1\24\2\12\1\25\1\26\1\27\1\30\2\12"+
    "\1\31\1\12\1\32\2\12\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\37\1\42\1\43\1\37\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\2\12\1\6\76\0\1\55\1\56\1\55\1\2\1\57"+
    "\5\55\1\60\2\55\1\60\1\3\1\55\30\60\23\55"+
    "\2\60\1\55\3\0\1\4\100\0\1\6\7\0\1\6"+
    "\56\0\1\6\7\0\1\7\2\0\1\61\2\0\1\61"+
    "\2\0\30\61\13\0\1\7\7\0\2\61\11\0\2\10"+
    "\1\62\1\10\1\63\1\62\2\0\6\62\1\64\21\62"+
    "\2\0\1\65\20\0\1\62\1\64\11\0\1\66\1\67"+
    "\1\62\1\67\1\63\1\62\2\0\6\62\1\64\12\62"+
    "\1\70\6\62\2\0\1\65\20\0\1\70\1\64\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\30\12"+
    "\13\0\1\71\7\0\2\12\11\0\1\72\1\73\1\0"+
    "\1\72\62\0\2\74\1\75\2\0\3\76\7\74\1\77"+
    "\56\74\1\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\1\12\1\100\26\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\13\12\1\101\14\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\25\12"+
    "\1\102\2\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\5\12\1\103"+
    "\22\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\6\12\1\104\21\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\13\12\1\105\3\12\1\106"+
    "\1\12\1\107\6\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\1\106"+
    "\2\12\1\110\6\12\1\111\15\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\2\12\1\112\7\12\1\113\1\12\1\114\7\12"+
    "\1\115\3\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\13\12\1\116"+
    "\2\12\1\117\11\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\3\12"+
    "\1\120\2\12\1\121\21\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\3\12\1\122\13\12\1\123\10\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\3\12\1\124\24\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\3\12\1\100\24\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\12\12"+
    "\1\125\15\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\3\12\1\126"+
    "\24\12\13\0\1\71\7\0\2\12\52\0\1\34\1\0"+
    "\1\34\74\0\3\34\74\0\1\34\75\0\1\34\1\37"+
    "\74\0\1\34\1\0\1\37\73\0\1\34\3\0\1\34"+
    "\71\0\1\34\4\0\1\34\70\0\1\34\5\0\1\127"+
    "\1\130\13\0\1\55\1\56\1\55\2\0\71\55\3\0"+
    "\1\2\72\0\1\55\1\56\1\55\1\2\1\57\3\55"+
    "\4\60\1\55\1\60\1\3\1\55\30\60\23\55\2\60"+
    "\1\55\7\0\1\7\2\61\1\131\1\61\1\0\1\131"+
    "\2\0\30\131\13\0\1\7\7\0\2\131\11\0\4\62"+
    "\1\0\1\62\2\0\30\62\23\0\2\62\11\0\2\64"+
    "\1\62\1\64\1\0\1\62\2\0\30\62\23\0\2\62"+
    "\27\0\1\132\45\0\1\132\11\0\2\66\1\0\1\66"+
    "\1\63\71\0\1\66\1\67\1\62\1\67\1\63\1\62"+
    "\2\0\30\62\23\0\2\62\11\0\4\133\1\0\1\62"+
    "\2\0\1\133\3\62\1\133\1\62\1\133\1\62\1\133"+
    "\4\62\2\133\11\62\23\0\1\62\1\133\10\0\1\71"+
    "\2\0\1\131\2\0\1\131\2\0\30\131\13\0\1\71"+
    "\7\0\2\131\11\0\2\72\1\62\1\72\1\0\1\62"+
    "\2\0\6\62\1\134\21\62\2\0\1\65\20\0\1\62"+
    "\1\134\13\0\1\62\2\0\1\62\2\0\6\62\1\134"+
    "\21\62\2\0\1\65\20\0\1\62\1\134\1\0\3\135"+
    "\5\0\7\135\1\136\57\135\2\74\5\0\7\135\1\137"+
    "\2\135\1\74\1\135\2\74\5\135\1\74\2\135\1\74"+
    "\37\135\17\0\1\56\56\0\3\135\5\0\7\135\1\77"+
    "\56\135\1\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\2\12\1\140\25\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\11\12\1\141\2\12\1\142\13\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\26\12\1\143\1\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\6\12\1\144\21\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\2\12"+
    "\1\145\17\12\1\146\5\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\1\12\1\147\26\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\11\12"+
    "\1\150\16\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\2\12\1\151"+
    "\25\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\13\12\1\152\14\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\1\122\27\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\1\153\4\12\1\154\22\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\3\12\1\155\24\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\22\12\1\156\1\157\4\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\14\12\1\160\13\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\2\12\1\117\25\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\1\12"+
    "\1\161\26\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\16\12\1\162"+
    "\11\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\5\12\1\117\22\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\3\12\1\163\24\12\13\0"+
    "\1\71\7\0\2\12\2\0\1\2\5\0\1\71\4\12"+
    "\1\0\1\12\2\0\13\12\1\164\14\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\14\12\1\165\13\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\14\12\1\166\2\12\1\167\10\12\13\0\1\71"+
    "\7\0\2\12\1\0\76\127\1\130\1\0\1\130\1\4"+
    "\1\5\71\130\7\0\1\71\4\131\1\0\1\131\2\0"+
    "\30\131\13\0\1\71\7\0\2\131\11\0\1\170\1\56"+
    "\1\0\1\170\72\0\1\64\1\171\1\62\1\64\1\0"+
    "\1\62\2\0\30\62\23\0\2\62\1\0\3\135\5\0"+
    "\6\135\1\77\1\136\56\135\1\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\3\12\1\117\24\12\13\0"+
    "\1\71\7\0\2\12\2\0\1\2\5\0\1\71\4\12"+
    "\1\0\1\12\2\0\14\12\1\172\13\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\3\12\1\173\24\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\6\12\1\174\21\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\1\175\27\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\1\12\1\176"+
    "\26\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\14\12\1\177\13\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\20\12\1\117\7\12\13\0"+
    "\1\71\7\0\2\12\2\0\1\2\5\0\1\71\4\12"+
    "\1\0\1\12\2\0\6\12\1\117\21\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\6\12\1\176\21\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\2\12\1\200\6\12\1\116\16\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\2\12\1\201\25\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\1\12\1\202\26\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\5\12\1\116\22\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\13\12"+
    "\1\203\14\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\6\12\1\204"+
    "\21\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\2\12\1\205\25\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\4\12\1\165\23\12\13\0"+
    "\1\71\7\0\2\12\2\0\1\2\5\0\1\71\4\12"+
    "\1\0\1\12\2\0\1\206\27\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\1\116\27\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\22\12"+
    "\1\117\5\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\17\12\1\150"+
    "\10\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\15\12\1\117\12\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\1\207\27\12\13\0\1\71"+
    "\7\0\2\12\11\0\2\170\1\0\1\170\63\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\22\12\1\156"+
    "\5\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\13\12\1\117\14\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\15\12\1\210\12\12\13\0"+
    "\1\71\7\0\2\12\2\0\1\2\5\0\1\71\4\12"+
    "\1\0\1\12\2\0\7\12\1\117\20\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\5\12\1\173\22\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\11\12\1\211\16\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\14\12\1\212\13\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\14\12"+
    "\1\213\13\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\10\12\1\116"+
    "\17\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\6\12\1\166\21\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\3\12\1\214\24\12\13\0"+
    "\1\71\7\0\2\12\2\0\1\2\5\0\1\71\4\12"+
    "\1\0\1\12\2\0\10\12\1\215\17\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\1\12\1\216\26\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\2\12\1\125\25\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\6\12\1\214\21\12\13\0\1\71\7\0\2\12\2\0"+
    "\1\2\5\0\1\71\4\12\1\0\1\12\2\0\2\12"+
    "\1\217\25\12\13\0\1\71\7\0\2\12\2\0\1\2"+
    "\5\0\1\71\4\12\1\0\1\12\2\0\13\12\1\220"+
    "\14\12\13\0\1\71\7\0\2\12\2\0\1\2\5\0"+
    "\1\71\4\12\1\0\1\12\2\0\10\12\1\117\17\12"+
    "\13\0\1\71\7\0\2\12\2\0\1\2\5\0\1\71"+
    "\4\12\1\0\1\12\2\0\16\12\1\117\11\12\13\0"+
    "\1\71\7\0\2\12\2\0\1\2\5\0\1\71\4\12"+
    "\1\0\1\12\2\0\12\12\1\117\15\12\13\0\1\71"+
    "\7\0\2\12\2\0\1\2\5\0\1\71\4\12\1\0"+
    "\1\12\2\0\17\12\1\116\10\12\13\0\1\71\7\0"+
    "\2\12\2\0\1\2\5\0\1\71\4\12\1\0\1\12"+
    "\2\0\6\12\1\122\21\12\13\0\1\71\7\0\2\12"+
    "\2\0\1\2\5\0\1\71\4\12\1\0\1\12\2\0"+
    "\1\12\1\150\26\12\13\0\1\71\7\0\2\12\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7874];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\1\1\1\11\2\1\1\0\24\1\1\11"+
    "\11\1\7\11\1\1\1\11\4\1\1\0\1\1\1\0"+
    "\10\1\1\0\31\1\1\0\1\1\1\0\2\1\1\0"+
    "\63\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[144];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 196) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /*Ignore*/
            }
          case 16: break;
          case 2: 
            { lexeme=yytext(); return ERROR;
            }
          case 17: break;
          case 3: 
            { lexeme=yytext(); return SaltoDeLinea;
            }
          case 18: break;
          case 4: 
            { lexeme=yytext(); return Literal;
            }
          case 19: break;
          case 5: 
            { lexeme=yytext(); return Identificador;
            }
          case 20: break;
          case 6: 
            { lexeme=yytext(); return Operador;
            }
          case 21: break;
          case 7: 
            { lexeme=yytext(); return PuntoComa;
            }
          case 22: break;
          case 8: 
            { lexeme=yytext(); return ParentesisI;
            }
          case 23: break;
          case 9: 
            { lexeme=yytext(); return ParentesisD;
            }
          case 24: break;
          case 10: 
            { lexeme=yytext(); return ParentesisCI;
            }
          case 25: break;
          case 11: 
            { lexeme=yytext(); return ParentesisCD;
            }
          case 26: break;
          case 12: 
            { lexeme=yytext(); return LlaveI;
            }
          case 27: break;
          case 13: 
            { lexeme=yytext(); return LlaveD;
            }
          case 28: break;
          case 14: 
            { lexeme=yytext(); return PalabraReservada;
            }
          case 29: break;
          case 15: 
            { lexeme=yytext(); return Comentario;
            }
          case 30: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
