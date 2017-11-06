/* The following code was generated by JFlex 1.6.1 */

package iiproyecto;

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/iiproyecto/Lexer.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int CHARLITERAL = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     3,  3,  3,  3,  3,  3,  3,  3,  3,  1, 52, 53, 53, 52,  3,  3, 
     3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 10, 10, 10, 10, 
     1, 35, 54, 10,  2, 42, 37, 55, 46, 47, 40, 38, 43, 39, 10, 41, 
     5,  7,  7,  7,  7,  7,  7,  7,  6,  6, 45, 44, 34, 32, 33, 10, 
    10, 14, 11, 17, 27, 13,  8, 29, 20, 25,  2, 16, 28,  2, 22, 21, 
     2,  2, 12, 19, 23, 26, 31, 30,  9,  2,  2, 48, 56, 49, 10,  2, 
    10, 14, 11, 17, 27, 13,  8, 29, 20, 25,  2, 16, 28,  2, 22, 21, 
     2,  2, 12, 19, 23, 26, 31, 30,  9,  2,  2, 50, 36, 51, 10,  3, 
     3,  3,  3,  3,  3,  4,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 
     3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 
     1, 10,  2,  2,  2,  2, 10, 10, 10, 10,  2, 10, 10,  3, 10, 10, 
    10, 10, 10, 10, 10,  2, 10, 10, 10, 10,  2, 10, 10, 10, 10, 10, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 
     2,  2,  2,  2,  2,  2,  2, 10,  2,  2,  2,  2,  2,  2,  2,  2, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 
     2,  2,  2,  2,  2,  2,  2, 10,  2,  2,  2,  2,  2,  2,  2,  2
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\2\4\5\2\1\0\1\2"+
    "\1\0\5\2\1\5\1\6\1\7\1\10\2\3\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\3\0\1\33\1\0\7\2\2\0\2\2\1\34"+
    "\1\0\1\34\2\2\1\35\4\2\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\0\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\10\0\1\61\1\62\3\2\1\0\1\2\1\0"+
    "\3\2\2\0\2\2\2\63\2\2\1\0\1\2\1\0"+
    "\1\2\1\0\1\2\1\0\1\64\1\65\1\66\1\67"+
    "\1\70\1\71\1\72\1\73\1\2\1\74\1\2\2\75"+
    "\2\76\1\77\1\0\2\2\2\0\3\2\1\100\1\0"+
    "\1\2\1\0\1\2\2\101\1\102\2\103\1\2\2\104"+
    "\1\0\1\2\1\105\1\0\1\105\2\2\2\106\2\107"+
    "\1\110\1\0\1\2\2\111\1\2\1\0\1\2\1\112"+
    "\2\113";

  private static int [] zzUnpackAction() {
    int [] result = new int[184];
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
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e\0\u0357"+
    "\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6\0\u051f"+
    "\0\u0558\0\u0591\0\u05ca\0\u0603\0\u063c\0\u0675\0\u06ae\0\u011d"+
    "\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d"+
    "\0\u011d\0\u011d\0\u011d\0\u06e7\0\u011d\0\u0720\0\u0759\0\u0792"+
    "\0\u07cb\0\u0804\0\u083d\0\u0876\0\u08af\0\u08e8\0\u0921\0\u095a"+
    "\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u0a77\0\u011d\0\u0ab0\0\344"+
    "\0\u0ae9\0\u0b22\0\344\0\u0b5b\0\u0b94\0\u0bcd\0\u0c06\0\u011d"+
    "\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d"+
    "\0\u011d\0\u011d\0\u011d\0\u0c3f\0\u0c78\0\u011d\0\u011d\0\u011d"+
    "\0\u011d\0\u011d\0\u011d\0\u0cb1\0\u0cea\0\u0d23\0\u0d5c\0\u0d95"+
    "\0\u0dce\0\u0e07\0\u0e40\0\u0804\0\344\0\u0e79\0\u0eb2\0\u0eeb"+
    "\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008\0\u1041\0\u107a\0\u10b3"+
    "\0\u10ec\0\u1125\0\u011d\0\344\0\u115e\0\u1197\0\u11d0\0\u1209"+
    "\0\u1242\0\u127b\0\u12b4\0\u12ed\0\u1326\0\u011d\0\u011d\0\u011d"+
    "\0\u011d\0\u011d\0\u011d\0\u011d\0\u011d\0\u135f\0\344\0\u1398"+
    "\0\u011d\0\344\0\u011d\0\344\0\344\0\u13d1\0\u140a\0\u1443"+
    "\0\u147c\0\u14b5\0\u14ee\0\u1527\0\u1560\0\344\0\u1599\0\u15d2"+
    "\0\u160b\0\u1644\0\u011d\0\344\0\u0c3f\0\u011d\0\344\0\u167d"+
    "\0\u011d\0\344\0\u16b6\0\u16ef\0\u011d\0\u1728\0\344\0\u1761"+
    "\0\u179a\0\u011d\0\344\0\u011d\0\344\0\344\0\u17d3\0\u180c"+
    "\0\u011d\0\344\0\u1845\0\u187e\0\u18b7\0\344\0\u011d\0\344";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[184];
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
    "\1\0\1\4\1\5\1\6\1\4\1\7\2\10\1\11"+
    "\1\5\1\6\1\12\1\13\1\14\1\5\1\0\1\5"+
    "\1\15\1\16\1\17\4\5\1\20\1\21\1\5\1\22"+
    "\1\23\1\5\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\2\4\1\52\1\53\1\6\64\54\1\0\1\54\1\55"+
    "\1\54\1\56\64\57\1\0\2\57\1\0\1\60\1\0"+
    "\1\4\2\0\1\4\57\0\2\4\5\0\10\5\1\0"+
    "\4\5\1\0\2\5\1\0\5\5\1\0\7\5\127\0"+
    "\1\61\1\0\1\61\1\0\1\62\64\0\3\10\63\0"+
    "\10\5\1\0\4\5\1\0\2\5\1\0\2\5\1\63"+
    "\2\5\1\0\7\5\33\0\10\5\1\0\1\5\1\64"+
    "\2\5\1\0\2\5\1\0\5\5\1\0\7\5\33\0"+
    "\10\5\1\0\2\5\1\65\1\5\1\0\2\5\1\0"+
    "\5\5\1\0\7\5\33\0\10\5\1\0\4\5\1\0"+
    "\2\5\1\0\5\5\1\0\3\5\1\66\3\5\33\0"+
    "\10\5\1\0\3\5\1\67\1\0\2\5\1\0\1\5"+
    "\1\70\1\71\2\5\1\0\7\5\55\0\1\72\11\0"+
    "\1\73\34\0\10\5\1\0\4\5\1\0\2\5\1\0"+
    "\1\5\1\74\3\5\1\0\5\5\1\75\1\5\41\0"+
    "\1\76\15\0\1\77\44\0\6\5\1\100\1\5\1\0"+
    "\4\5\1\0\2\5\1\0\3\5\1\101\1\5\1\0"+
    "\7\5\33\0\10\5\1\0\2\5\1\102\1\5\1\0"+
    "\2\5\1\0\2\5\1\103\2\5\1\0\7\5\33\0"+
    "\10\5\1\0\4\5\1\0\2\5\1\0\2\5\1\104"+
    "\2\5\1\0\7\5\33\0\10\5\1\0\1\5\1\105"+
    "\2\5\1\0\2\5\1\0\1\5\1\106\3\5\1\0"+
    "\7\5\33\0\10\5\1\0\4\5\1\0\2\5\1\0"+
    "\2\5\1\107\2\5\1\0\7\5\71\0\1\110\70\0"+
    "\1\111\70\0\1\112\70\0\1\113\74\0\1\114\71\0"+
    "\1\115\63\0\1\116\5\0\1\117\62\0\1\120\6\0"+
    "\1\121\61\0\1\122\70\0\1\123\7\0\1\124\1\125"+
    "\17\0\64\54\1\0\1\54\1\0\1\54\15\0\1\126"+
    "\11\0\1\127\1\130\36\0\1\131\1\0\1\132\67\0"+
    "\1\133\11\0\1\134\2\0\1\135\1\136\11\0\1\137"+
    "\1\140\36\0\1\141\1\142\1\143\5\0\1\61\1\0"+
    "\1\61\66\0\4\144\2\0\1\144\1\0\2\144\2\0"+
    "\1\144\11\0\1\144\37\0\10\5\1\0\1\5\1\145"+
    "\2\5\1\0\2\5\1\0\5\5\1\0\7\5\33\0"+
    "\10\5\1\0\2\5\1\146\1\5\1\0\2\5\1\0"+
    "\5\5\1\0\7\5\33\0\10\5\1\0\3\5\1\147"+
    "\1\0\2\5\1\0\4\5\1\150\1\0\7\5\33\0"+
    "\10\5\1\0\4\5\1\0\2\5\1\151\1\152\4\5"+
    "\1\0\7\5\33\0\10\5\1\0\4\5\1\0\2\5"+
    "\1\153\1\154\4\5\1\0\7\5\33\0\10\5\1\0"+
    "\3\5\1\155\1\0\2\5\1\0\5\5\1\0\7\5"+
    "\33\0\10\5\1\0\4\5\1\0\2\5\1\0\3\5"+
    "\1\156\1\5\1\0\7\5\56\0\1\157\73\0\2\160"+
    "\41\0\10\5\1\0\4\5\1\0\2\5\1\0\2\5"+
    "\1\161\2\5\1\0\7\5\33\0\10\5\1\0\4\5"+
    "\1\0\2\5\1\0\5\5\1\160\1\162\6\5\60\0"+
    "\1\163\43\0\10\5\1\0\4\5\1\0\2\5\1\0"+
    "\4\5\1\164\1\0\7\5\33\0\6\5\1\165\1\5"+
    "\1\0\4\5\1\0\2\5\1\0\5\5\1\0\7\5"+
    "\33\0\10\5\1\0\4\5\1\0\2\5\1\0\3\5"+
    "\1\166\1\5\1\0\7\5\33\0\10\5\1\0\4\5"+
    "\1\0\2\5\1\0\5\5\1\167\1\170\6\5\33\0"+
    "\10\5\1\0\4\5\1\0\2\5\1\0\5\5\1\171"+
    "\1\172\6\5\33\0\10\5\1\0\4\5\1\0\2\5"+
    "\1\0\5\5\1\173\1\174\6\5\31\0\50\124\1\175"+
    "\20\124\4\125\1\0\57\125\2\0\3\125\67\0\1\176"+
    "\70\0\1\177\70\0\1\200\70\0\1\201\70\0\1\202"+
    "\70\0\1\203\70\0\1\204\70\0\1\205\3\0\10\5"+
    "\1\0\3\5\1\206\1\0\2\5\1\0\5\5\1\0"+
    "\7\5\33\0\10\5\1\0\4\5\1\0\2\5\1\0"+
    "\5\5\1\0\2\5\1\207\4\5\33\0\10\5\1\0"+
    "\4\5\1\0\2\5\1\0\5\5\1\0\1\5\1\210"+
    "\5\5\46\0\1\211\55\0\10\5\1\0\2\5\1\212"+
    "\1\5\1\0\2\5\1\0\5\5\1\0\7\5\46\0"+
    "\1\213\55\0\10\5\1\0\2\5\1\214\1\5\1\0"+
    "\2\5\1\0\5\5\1\0\7\5\33\0\10\5\1\0"+
    "\1\5\1\215\2\5\1\0\2\5\1\0\5\5\1\0"+
    "\7\5\33\0\10\5\1\0\4\5\1\0\2\5\1\216"+
    "\1\217\3\5\1\220\1\0\7\5\45\0\1\221\103\0"+
    "\1\222\43\0\10\5\1\0\1\5\1\223\2\5\1\0"+
    "\2\5\1\0\5\5\1\0\7\5\33\0\10\5\1\0"+
    "\4\5\1\0\2\5\1\0\4\5\1\224\1\0\7\5"+
    "\33\0\10\5\1\0\3\5\1\225\1\0\2\5\1\0"+
    "\5\5\1\0\7\5\33\0\10\5\1\0\4\5\1\0"+
    "\2\5\1\0\5\5\1\0\4\5\1\226\2\5\60\0"+
    "\1\227\43\0\10\5\1\0\4\5\1\0\2\5\1\0"+
    "\4\5\1\230\1\0\7\5\65\0\1\231\36\0\10\5"+
    "\1\0\4\5\1\0\2\5\1\0\5\5\1\0\3\5"+
    "\1\232\3\5\64\0\1\233\37\0\10\5\1\0\4\5"+
    "\1\0\2\5\1\0\5\5\1\0\2\5\1\234\4\5"+
    "\31\0\50\124\1\175\1\235\17\124\2\0\10\5\1\0"+
    "\4\5\1\236\1\237\1\5\1\0\5\5\1\0\7\5"+
    "\33\0\10\5\1\0\1\5\1\240\2\5\1\0\2\5"+
    "\1\0\5\5\1\0\7\5\60\0\1\241\43\0\10\5"+
    "\1\0\4\5\1\0\2\5\1\0\4\5\1\242\1\0"+
    "\7\5\33\0\10\5\1\0\4\5\1\0\2\5\1\0"+
    "\5\5\1\243\1\244\6\5\60\0\1\245\62\0\1\246"+
    "\51\0\10\5\1\0\4\5\1\0\2\5\1\0\4\5"+
    "\1\247\1\0\7\5\33\0\10\5\1\0\4\5\1\0"+
    "\1\5\1\250\1\0\5\5\1\0\7\5\33\0\10\5"+
    "\1\0\4\5\1\0\2\5\1\0\5\5\1\0\1\5"+
    "\1\251\5\5\46\0\1\252\55\0\10\5\1\0\2\5"+
    "\1\253\1\5\1\0\2\5\1\0\5\5\1\0\7\5"+
    "\46\0\1\254\55\0\10\5\1\0\2\5\1\255\1\5"+
    "\1\0\2\5\1\0\5\5\1\0\7\5\33\0\10\5"+
    "\1\0\4\5\1\0\2\5\1\0\3\5\1\256\1\5"+
    "\1\0\7\5\57\0\1\257\44\0\10\5\1\0\4\5"+
    "\1\0\2\5\1\0\3\5\1\260\1\5\1\0\7\5"+
    "\55\0\1\261\46\0\10\5\1\0\4\5\1\0\2\5"+
    "\1\0\1\5\1\262\3\5\1\0\7\5\33\0\10\5"+
    "\1\0\4\5\1\0\2\5\1\0\5\5\1\0\3\5"+
    "\1\263\3\5\63\0\1\264\40\0\10\5\1\0\4\5"+
    "\1\0\2\5\1\0\5\5\1\0\1\5\1\265\5\5"+
    "\33\0\10\5\1\0\4\5\1\0\2\5\1\0\4\5"+
    "\1\266\1\0\7\5\46\0\1\267\55\0\10\5\1\0"+
    "\2\5\1\270\1\5\1\0\2\5\1\0\5\5\1\0"+
    "\7\5\31\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6384];
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
    "\3\0\2\1\1\11\7\1\1\0\1\1\1\0\17\1"+
    "\14\11\1\1\1\11\3\0\1\1\1\0\7\1\2\0"+
    "\2\1\1\11\1\0\10\1\14\11\1\0\1\1\6\11"+
    "\10\0\5\1\1\0\1\1\1\0\3\1\2\0\2\1"+
    "\1\11\3\1\1\0\1\1\1\0\1\1\1\0\1\1"+
    "\1\0\10\11\3\1\1\11\1\1\1\11\2\1\1\0"+
    "\2\1\2\0\4\1\1\0\1\1\1\0\1\1\1\11"+
    "\2\1\1\11\2\1\1\11\1\1\1\0\1\1\1\11"+
    "\1\0\3\1\1\11\1\1\1\11\2\1\1\0\1\1"+
    "\1\11\2\1\1\0\2\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[184];
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
	StringBuffer string = new StringBuffer();

	private Symbol simbolo(String texto, int tipo, Object valor) {
		System.out.println("Lexer: " + texto);
		return new Symbol(tipo, yycolumn, yyline, valor);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzDoEOF();
          {   return new Symbol(Simbolos.EOF, yycolumn, yyline, yytext());
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { /* No haga nada */
            }
          case 76: break;
          case 2: 
            { return simbolo("Identif: " + yytext(), Simbolos.smbidentificador, yytext());
            }
          case 77: break;
          case 3: 
            { System.out.println("Error lexico en la linea " + yyline + ", columna " + yycolumn + " : Caracter ilegal <"+ yytext()+">");
            }
          case 78: break;
          case 4: 
            { return simbolo("Dec: " + yytext(), Simbolos.smbdec, yytext());
            }
          case 79: break;
          case 5: 
            { return simbolo("=", Simbolos.smbigual, yytext());
            }
          case 80: break;
          case 6: 
            { return simbolo(">", Simbolos.smbmayor, yytext());
            }
          case 81: break;
          case 7: 
            { return simbolo("<", Simbolos.smbmenor, yytext());
            }
          case 82: break;
          case 8: 
            { return simbolo("!", Simbolos.smbadmiracion, yytext());
            }
          case 83: break;
          case 9: 
            { return simbolo("+", Simbolos.smbmas, yytext());
            }
          case 84: break;
          case 10: 
            { return simbolo("-", Simbolos.smbmenos, yytext());
            }
          case 85: break;
          case 11: 
            { return simbolo("*", Simbolos.smbmultiplicacion, yytext());
            }
          case 86: break;
          case 12: 
            { return simbolo("/", Simbolos.smbdivision, yytext());
            }
          case 87: break;
          case 13: 
            { return simbolo("%", Simbolos.smbdivisionentera, yytext());
            }
          case 88: break;
          case 14: 
            { return simbolo(",", Simbolos.smbcoma, yytext());
            }
          case 89: break;
          case 15: 
            { return simbolo(";", Simbolos.smbpuntocoma, yytext());
            }
          case 90: break;
          case 16: 
            { return simbolo(":", Simbolos.smbdospuntos, yytext());
            }
          case 91: break;
          case 17: 
            { return simbolo("(", Simbolos.smbparentabrir, yytext());
            }
          case 92: break;
          case 18: 
            { return simbolo(")", Simbolos.smbparentcerrar, yytext());
            }
          case 93: break;
          case 19: 
            { return simbolo("[", Simbolos.smbcuadradoabrir, yytext());
            }
          case 94: break;
          case 20: 
            { return simbolo("]", Simbolos.smbcuadradocerrar, yytext());
            }
          case 95: break;
          case 21: 
            { return simbolo("{", Simbolos.smbllaveabrir, yytext());
            }
          case 96: break;
          case 22: 
            { return simbolo("}", Simbolos.smbllavecerrar, yytext());
            }
          case 97: break;
          case 23: 
            { string.setLength(0); yybegin(STRING);
            }
          case 98: break;
          case 24: 
            { yybegin(CHARLITERAL);
            }
          case 99: break;
          case 25: 
            { string.append( yytext() );
            }
          case 100: break;
          case 26: 
            { yybegin(YYINITIAL); return simbolo("STRING: " + string.toString(), Simbolos.smbstring, string.toString());
            }
          case 101: break;
          case 27: 
            { return simbolo("Oct: " + yytext(), Simbolos.smboct, yytext());
            }
          case 102: break;
          case 28: 
            { return simbolo("if", Simbolos.smbif, yytext());
            }
          case 103: break;
          case 29: 
            { return simbolo("do", Simbolos.smbdo, yytext());
            }
          case 104: break;
          case 30: 
            { return simbolo("==", Simbolos.smbigualigual, yytext());
            }
          case 105: break;
          case 31: 
            { return simbolo(">=", Simbolos.smbmayorigual, yytext());
            }
          case 106: break;
          case 32: 
            { return simbolo("<=", Simbolos.smbmenorigual, yytext());
            }
          case 107: break;
          case 33: 
            { return simbolo("!=", Simbolos.smbdiferente, yytext());
            }
          case 108: break;
          case 34: 
            { return simbolo("||", Simbolos.smbor, yytext());
            }
          case 109: break;
          case 35: 
            { return simbolo("&&", Simbolos.smband, yytext());
            }
          case 110: break;
          case 36: 
            { return simbolo("+=", Simbolos.smbmasigual, yytext());
            }
          case 111: break;
          case 37: 
            { return simbolo("++", Simbolos.smbmasmas, yytext());
            }
          case 112: break;
          case 38: 
            { return simbolo("-=", Simbolos.smbmenosigual, yytext());
            }
          case 113: break;
          case 39: 
            { return simbolo("--", Simbolos.smbmenosmenos, yytext());
            }
          case 114: break;
          case 40: 
            { return simbolo("*=", Simbolos.smbmultiplicacionigual, yytext());
            }
          case 115: break;
          case 41: 
            { return simbolo("/=", Simbolos.smbdivisionigual, yytext());
            }
          case 116: break;
          case 42: 
            { /* No haga nada */ System.out.println("Lexer: Com de Linea: " + yytext());
            }
          case 117: break;
          case 43: 
            { string.append('\r');
            }
          case 118: break;
          case 44: 
            { string.append('\n');
            }
          case 119: break;
          case 45: 
            { string.append('\t');
            }
          case 120: break;
          case 46: 
            { string.append('\"');
            }
          case 121: break;
          case 47: 
            { string.append('\\');
            }
          case 122: break;
          case 48: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + yytext().charAt(0), Simbolos.smbcharlit, String.valueOf(yytext().charAt(0)));
            }
          case 123: break;
          case 49: 
            { return simbolo("Hex: " + yytext(), Simbolos.smbhex, yytext());
            }
          case 124: break;
          case 50: 
            { return simbolo("for", Simbolos.smbfor, yytext());
            }
          case 125: break;
          case 51: 
            { return simbolo("int", Simbolos.smbint, yytext());
            }
          case 126: break;
          case 52: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\f", Simbolos.smbcharlit, "\f");
            }
          case 127: break;
          case 53: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\b", Simbolos.smbcharlit, "\b");
            }
          case 128: break;
          case 54: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\r", Simbolos.smbcharlit, "\r");
            }
          case 129: break;
          case 55: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\n", Simbolos.smbcharlit, "\n");
            }
          case 130: break;
          case 56: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\t", Simbolos.smbcharlit, "\t");
            }
          case 131: break;
          case 57: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\"", Simbolos.smbcharlit, "\"");
            }
          case 132: break;
          case 58: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\'", Simbolos.smbcharlit, "\'");
            }
          case 133: break;
          case 59: 
            { yybegin(YYINITIAL); return simbolo("CHAR: " + "\\", Simbolos.smbcharlit, "\\");
            }
          case 134: break;
          case 60: 
            { return simbolo("read", Simbolos.smbread, yytext());
            }
          case 135: break;
          case 61: 
            { return simbolo("else", Simbolos.smbelse, yytext());
            }
          case 136: break;
          case 62: 
            { return simbolo("case", Simbolos.smbcase, yytext());
            }
          case 137: break;
          case 63: 
            { return simbolo("char", Simbolos.smbchar, yytext());
            }
          case 138: break;
          case 64: 
            { return simbolo("long", Simbolos.smblong, yytext());
            }
          case 139: break;
          case 65: 
            { return simbolo("void", Simbolos.smbvoid, yytext());
            }
          case 140: break;
          case 66: 
            { /* No haga nada */ System.out.println("Lexer: Com de Bloque: " + yytext());
            }
          case 141: break;
          case 67: 
            { return simbolo("break", Simbolos.smbbreak, yytext());
            }
          case 142: break;
          case 68: 
            { return simbolo("const", Simbolos.smbconst, yytext());
            }
          case 143: break;
          case 69: 
            { return simbolo("short", Simbolos.smbshort, yytext());
            }
          case 144: break;
          case 70: 
            { return simbolo("write", Simbolos.smbwrite, yytext());
            }
          case 145: break;
          case 71: 
            { return simbolo("while", Simbolos.smbwhile, yytext());
            }
          case 146: break;
          case 72: 
            { return simbolo("return", Simbolos.smbreturn, yytext());
            }
          case 147: break;
          case 73: 
            { return simbolo("switch", Simbolos.smbswitch, yytext());
            }
          case 148: break;
          case 74: 
            { return simbolo("default", Simbolos.smbdefault, yytext());
            }
          case 149: break;
          case 75: 
            { return simbolo("continue", Simbolos.smbcontinue, yytext());
            }
          case 150: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
