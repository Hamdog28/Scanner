/* The following code was generated by JFlex 1.6.1 */

package analizador;
import static analizador.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Estuche/Dropbox/NetBeansProjects/Scanner/analizador/src/analizador/Lexer.flex</tt>
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
    "\12\0\1\4\1\56\1\56\1\5\22\0\1\3\1\44\3\0\1\44"+
    "\1\46\1\0\1\50\1\51\1\44\1\37\1\36\1\40\1\36\1\44"+
    "\12\1\1\36\1\47\1\43\1\41\1\42\1\36\1\0\32\2\1\52"+
    "\1\0\1\53\1\44\1\2\1\0\1\6\1\12\1\16\1\23\1\14"+
    "\1\24\1\30\1\20\1\22\1\2\1\15\1\25\1\26\1\21\1\11"+
    "\1\34\1\2\1\13\1\17\1\10\1\7\1\35\1\32\1\27\1\33"+
    "\1\31\1\54\1\45\1\55\1\36\6\0\1\56\u1fa2\0\1\56\1\56"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\5\17\3\10\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\17\3"+
    "\2\16\65\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[107];
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
    "\0\0\0\57\0\136\0\215\0\57\0\57\0\274\0\353"+
    "\0\u011a\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\57\0\u03ac"+
    "\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\57\0\57"+
    "\0\57\0\57\0\57\0\57\0\57\0\u04f5\0\u0524\0\u0553"+
    "\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb"+
    "\0\u06fa\0\u0729\0\u0758\0\u0787\0\215\0\u07b6\0\u07e5\0\u0814"+
    "\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c"+
    "\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04"+
    "\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c"+
    "\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4"+
    "\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c"+
    "\0\u0f9b\0\u0fca\0\u0ff9\0\u1028\0\u1057\0\u1086\0\u10b5\0\u10e4"+
    "\0\u1113\0\u1142\0\u1171";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[107];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\4\1\13\1\14\1\15\1\4\1\16\1\17"+
    "\2\4\1\20\1\21\1\22\1\23\2\4\1\24\1\4"+
    "\1\25\2\4\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\32\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\61\0\1\3\56\0\2\4\3\0"+
    "\30\4\25\0\1\6\53\0\2\4\3\0\1\4\1\46"+
    "\26\4\22\0\2\4\3\0\13\4\1\47\14\4\22\0"+
    "\2\4\3\0\25\4\1\50\2\4\22\0\2\4\3\0"+
    "\5\4\1\51\22\4\22\0\2\4\3\0\6\4\1\52"+
    "\21\4\22\0\2\4\3\0\13\4\1\53\3\4\1\54"+
    "\1\4\1\55\6\4\22\0\2\4\3\0\1\54\2\4"+
    "\1\56\6\4\1\57\15\4\22\0\2\4\3\0\2\4"+
    "\1\60\7\4\1\61\1\4\1\62\7\4\1\63\3\4"+
    "\22\0\2\4\3\0\13\4\1\64\2\4\1\65\11\4"+
    "\22\0\2\4\3\0\3\4\1\66\2\4\1\67\21\4"+
    "\22\0\2\4\3\0\3\4\1\70\13\4\1\71\10\4"+
    "\22\0\2\4\3\0\3\4\1\72\24\4\22\0\2\4"+
    "\3\0\3\4\1\46\24\4\22\0\2\4\3\0\12\4"+
    "\1\73\15\4\22\0\2\4\3\0\3\4\1\74\24\4"+
    "\60\0\1\27\1\0\1\27\55\0\3\27\55\0\1\27"+
    "\56\0\1\27\1\32\55\0\1\27\1\0\1\32\54\0"+
    "\1\27\3\0\1\27\52\0\1\27\4\0\1\27\11\0"+
    "\2\4\3\0\2\4\1\75\25\4\22\0\2\4\3\0"+
    "\11\4\1\76\2\4\1\77\13\4\22\0\2\4\3\0"+
    "\26\4\1\100\1\4\22\0\2\4\3\0\6\4\1\101"+
    "\21\4\22\0\2\4\3\0\2\4\1\102\17\4\1\103"+
    "\5\4\22\0\2\4\3\0\1\4\1\104\26\4\22\0"+
    "\2\4\3\0\11\4\1\105\16\4\22\0\2\4\3\0"+
    "\2\4\1\106\25\4\22\0\2\4\3\0\13\4\1\107"+
    "\14\4\22\0\2\4\3\0\1\70\27\4\22\0\2\4"+
    "\3\0\1\110\4\4\1\111\22\4\22\0\2\4\3\0"+
    "\3\4\1\112\24\4\22\0\2\4\3\0\22\4\1\113"+
    "\1\114\4\4\22\0\2\4\3\0\14\4\1\115\13\4"+
    "\22\0\2\4\3\0\2\4\1\65\25\4\22\0\2\4"+
    "\3\0\1\4\1\116\26\4\22\0\2\4\3\0\16\4"+
    "\1\117\11\4\22\0\2\4\3\0\5\4\1\65\22\4"+
    "\22\0\2\4\3\0\3\4\1\120\24\4\22\0\2\4"+
    "\3\0\13\4\1\121\14\4\22\0\2\4\3\0\14\4"+
    "\1\122\13\4\22\0\2\4\3\0\14\4\1\123\2\4"+
    "\1\124\10\4\22\0\2\4\3\0\3\4\1\65\24\4"+
    "\22\0\2\4\3\0\14\4\1\125\13\4\22\0\2\4"+
    "\3\0\3\4\1\126\24\4\22\0\2\4\3\0\6\4"+
    "\1\127\21\4\22\0\2\4\3\0\1\130\27\4\22\0"+
    "\2\4\3\0\1\4\1\131\26\4\22\0\2\4\3\0"+
    "\14\4\1\132\13\4\22\0\2\4\3\0\20\4\1\65"+
    "\7\4\22\0\2\4\3\0\6\4\1\65\21\4\22\0"+
    "\2\4\3\0\6\4\1\131\21\4\22\0\2\4\3\0"+
    "\2\4\1\133\6\4\1\64\16\4\22\0\2\4\3\0"+
    "\2\4\1\134\25\4\22\0\2\4\3\0\1\4\1\135"+
    "\26\4\22\0\2\4\3\0\5\4\1\64\22\4\22\0"+
    "\2\4\3\0\13\4\1\136\14\4\22\0\2\4\3\0"+
    "\6\4\1\137\21\4\22\0\2\4\3\0\2\4\1\140"+
    "\25\4\22\0\2\4\3\0\4\4\1\122\23\4\22\0"+
    "\2\4\3\0\1\141\27\4\22\0\2\4\3\0\1\64"+
    "\27\4\22\0\2\4\3\0\22\4\1\65\5\4\22\0"+
    "\2\4\3\0\17\4\1\105\10\4\22\0\2\4\3\0"+
    "\15\4\1\65\12\4\22\0\2\4\3\0\1\142\27\4"+
    "\22\0\2\4\3\0\22\4\1\113\5\4\22\0\2\4"+
    "\3\0\13\4\1\65\14\4\22\0\2\4\3\0\15\4"+
    "\1\143\12\4\22\0\2\4\3\0\7\4\1\65\20\4"+
    "\22\0\2\4\3\0\5\4\1\126\22\4\22\0\2\4"+
    "\3\0\11\4\1\144\16\4\22\0\2\4\3\0\14\4"+
    "\1\145\13\4\22\0\2\4\3\0\14\4\1\146\13\4"+
    "\22\0\2\4\3\0\10\4\1\64\17\4\22\0\2\4"+
    "\3\0\6\4\1\123\21\4\22\0\2\4\3\0\3\4"+
    "\1\147\24\4\22\0\2\4\3\0\10\4\1\150\17\4"+
    "\22\0\2\4\3\0\1\4\1\151\26\4\22\0\2\4"+
    "\3\0\2\4\1\73\25\4\22\0\2\4\3\0\6\4"+
    "\1\147\21\4\22\0\2\4\3\0\2\4\1\152\25\4"+
    "\22\0\2\4\3\0\13\4\1\153\14\4\22\0\2\4"+
    "\3\0\10\4\1\65\17\4\22\0\2\4\3\0\16\4"+
    "\1\65\11\4\22\0\2\4\3\0\12\4\1\65\15\4"+
    "\22\0\2\4\3\0\17\4\1\64\10\4\22\0\2\4"+
    "\3\0\6\4\1\70\21\4\22\0\2\4\3\0\1\4"+
    "\1\105\26\4\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4512];
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
    "\1\0\1\11\2\1\2\11\20\1\1\11\7\1\7\11"+
    "\106\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[107];
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
    while (i < 174) {
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
            { return ERROR;
            }
          case 15: break;
          case 2: 
            { lexeme=yytext(); return INT;
            }
          case 16: break;
          case 3: 
            { lexeme=yytext(); return Identificador;
            }
          case 17: break;
          case 4: 
            { /*Ignore*/
            }
          case 18: break;
          case 5: 
            { lexeme=yytext(); return SaltoDeLinea;
            }
          case 19: break;
          case 6: 
            { lexeme=yytext(); return Operador;
            }
          case 20: break;
          case 7: 
            { return PuntoComa;
            }
          case 21: break;
          case 8: 
            { lexeme=yytext(); return ParentesisI;
            }
          case 22: break;
          case 9: 
            { lexeme=yytext(); return ParentesisD;
            }
          case 23: break;
          case 10: 
            { return ParentesisCI;
            }
          case 24: break;
          case 11: 
            { return ParentesisCD;
            }
          case 25: break;
          case 12: 
            { lexeme=yytext(); return LlaveI;
            }
          case 26: break;
          case 13: 
            { return LlaveD;
            }
          case 27: break;
          case 14: 
            { lexeme=yytext(); return PalabraReservada;
            }
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
