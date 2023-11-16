// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\5"+
    "\1\0\1\6\1\7\1\10\1\0\1\11\1\0\1\12"+
    "\1\13\1\14\1\0\1\15\1\16\1\0\1\17\1\20"+
    "\11\21\1\0\1\22\2\0\1\23\2\0\1\24\1\25"+
    "\1\26\1\24\1\27\7\24\1\30\1\31\1\32\1\33"+
    "\12\24\4\0\1\24\1\0\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\2\24\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\2\24\1\57\1\24\1\60\1\61\1\62\1\63\7\0"+
    "\1\3\73\0\1\24\7\0\1\24\3\0\1\24\3\0"+
    "\1\24\1\0\1\24\6\0\1\24\1\0\1\24\4\0"+
    "\1\24\7\0\1\24\3\0\1\24\3\0\1\24\1\0"+
    "\1\24\6\0\1\24\1\0\1\24\u012b\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\3\1\1\3\1\4\1\5\1\6"+
    "\2\1\2\7\1\10\15\11\1\12\1\13\1\0\1\14"+
    "\1\0\1\15\2\0\1\2\2\16\16\11\1\17\3\11"+
    "\1\0\1\20\2\0\20\11\1\21\2\11\2\0\1\2"+
    "\15\11\1\17\2\11\1\0\1\11\1\22\2\11\1\23"+
    "\4\11\1\24\2\11\1\0\5\11\1\25\1\11\1\26"+
    "\1\27\1\21\4\11\1\30\30\11\1\31\7\11\1\32"+
    "\1\11\1\33\5\11\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
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
    "\0\0\0\64\0\64\0\150\0\234\0\320\0\u0104\0\64"+
    "\0\64\0\64\0\64\0\u0138\0\u016c\0\u01a0\0\u01d4\0\64"+
    "\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c\0\u0340\0\u0374"+
    "\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\64\0\64\0\234"+
    "\0\234\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\64\0\u05b0"+
    "\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c\0\u0750"+
    "\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0"+
    "\0\u0924\0\u0958\0\u098c\0\64\0\u09c0\0\u09f4\0\u0a28\0\u0a5c"+
    "\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc"+
    "\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0208\0\u0d68"+
    "\0\u0d9c\0\u0dd0\0\u0e04\0\u09c0\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4"+
    "\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074"+
    "\0\u10a8\0\u0208\0\u10dc\0\u1110\0\u1144\0\u1178\0\u0208\0\u11ac"+
    "\0\u11e0\0\u0208\0\u1214\0\u1248\0\u127c\0\u12b0\0\u0208\0\u12e4"+
    "\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u0208"+
    "\0\u1484\0\u0208\0\64\0\u13e8\0\u14b8\0\u14ec\0\u1520\0\u1554"+
    "\0\u1588\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4"+
    "\0\u1728\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894"+
    "\0\u18c8\0\u18fc\0\u1930\0\u1964\0\u1998\0\u19cc\0\u1a00\0\u1a34"+
    "\0\u1a68\0\u0208\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0"+
    "\0\u1bd4\0\u0208\0\u1c08\0\u0208\0\u1c3c\0\u1c70\0\u1ca4\0\u1cd8"+
    "\0\u1d0c\0\u0208";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
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
    "\1\2\2\3\1\0\1\4\1\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\2\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\2\10\21\1\22\1\21\1\23\1\24"+
    "\1\25\1\26\2\21\1\27\2\21\1\30\1\31\1\32"+
    "\1\21\1\33\1\34\1\35\3\21\1\36\1\10\1\37"+
    "\66\0\1\3\61\0\2\40\1\0\1\40\1\0\1\40"+
    "\1\41\55\40\5\0\1\42\12\0\2\42\2\0\35\42"+
    "\1\0\1\42\25\0\35\43\21\0\1\44\61\0\1\45"+
    "\2\0\1\46\64\0\1\47\1\50\62\0\2\17\62\0"+
    "\2\21\2\0\35\21\23\0\2\21\2\0\13\21\1\51"+
    "\15\21\1\52\3\21\23\0\2\21\2\0\24\21\1\53"+
    "\10\21\23\0\2\21\2\0\14\21\1\54\20\21\23\0"+
    "\2\21\2\0\30\21\1\55\4\21\23\0\2\21\2\0"+
    "\20\21\1\56\6\21\1\57\5\21\23\0\2\21\2\0"+
    "\23\21\1\60\10\21\1\61\23\0\2\21\2\0\24\21"+
    "\1\62\5\21\1\63\2\21\23\0\2\21\2\0\14\21"+
    "\1\25\20\21\23\0\2\21\2\0\20\21\1\64\3\21"+
    "\1\65\10\21\23\0\2\21\2\0\14\21\1\66\20\21"+
    "\23\0\2\21\2\0\20\21\1\67\11\21\1\70\2\21"+
    "\23\0\2\21\2\0\14\21\1\71\7\21\1\72\10\21"+
    "\10\0\1\73\12\0\2\73\2\0\35\73\1\0\1\73"+
    "\21\0\2\43\2\0\35\43\26\0\1\74\40\0\14\75"+
    "\1\76\47\75\2\46\1\3\1\46\1\4\57\46\20\0"+
    "\2\50\62\0\2\21\2\0\14\21\1\77\20\21\23\0"+
    "\2\21\2\0\27\21\1\100\5\21\23\0\2\21\2\0"+
    "\21\21\1\101\13\21\23\0\2\21\2\0\27\21\1\102"+
    "\1\21\1\103\3\21\23\0\2\21\2\0\31\21\1\104"+
    "\3\21\23\0\2\21\2\0\23\21\1\105\11\21\23\0"+
    "\2\21\2\0\14\21\1\106\20\21\23\0\2\21\2\0"+
    "\31\21\1\107\3\21\23\0\2\21\2\0\26\21\1\110"+
    "\6\21\23\0\2\21\2\0\27\21\1\55\5\21\23\0"+
    "\2\21\2\0\22\21\1\111\12\21\23\0\2\21\2\0"+
    "\23\21\1\112\11\21\23\0\2\21\2\0\23\21\1\113"+
    "\11\21\23\0\2\21\2\0\25\21\1\114\7\21\23\0"+
    "\2\21\2\0\23\21\1\115\11\21\23\0\2\21\2\0"+
    "\14\21\1\116\12\21\1\117\5\21\23\0\2\21\2\0"+
    "\33\21\1\120\1\21\23\0\2\21\2\0\22\21\1\121"+
    "\12\21\10\0\1\122\12\0\2\122\2\0\35\122\1\0"+
    "\1\122\1\0\14\75\1\123\63\75\1\123\2\75\1\124"+
    "\44\75\20\0\2\21\2\0\21\21\1\125\13\21\23\0"+
    "\2\21\2\0\10\21\1\126\24\21\23\0\2\21\2\0"+
    "\24\21\1\127\10\21\23\0\2\21\2\0\14\21\1\130"+
    "\20\21\23\0\2\21\2\0\14\21\1\131\20\21\23\0"+
    "\2\21\2\0\14\21\1\117\20\21\23\0\2\21\2\0"+
    "\10\21\1\132\24\21\23\0\2\21\2\0\23\21\1\133"+
    "\11\21\23\0\2\21\2\0\14\21\1\134\20\21\23\0"+
    "\2\21\2\0\32\21\1\135\2\21\23\0\2\21\2\0"+
    "\14\21\1\136\20\21\23\0\2\21\2\0\31\21\1\137"+
    "\3\21\23\0\2\21\2\0\14\21\1\140\20\21\23\0"+
    "\2\21\2\0\14\21\1\141\20\21\23\0\2\21\2\0"+
    "\24\21\1\142\10\21\23\0\2\21\2\0\27\21\1\143"+
    "\5\21\23\0\2\21\2\0\31\21\1\144\3\21\23\0"+
    "\2\21\2\0\10\21\1\140\24\21\10\0\1\145\12\0"+
    "\2\145\2\0\35\145\1\0\1\145\1\0\14\75\1\123"+
    "\2\75\1\3\44\75\20\0\2\21\2\0\10\21\1\146"+
    "\24\21\23\0\2\21\2\0\30\21\1\117\4\21\23\0"+
    "\2\21\2\0\27\21\1\147\5\21\23\0\2\21\2\0"+
    "\12\21\1\150\22\21\23\0\2\21\2\0\23\21\1\151"+
    "\11\21\23\0\2\21\2\0\21\21\1\152\13\21\23\0"+
    "\2\21\2\0\31\21\1\153\3\21\23\0\2\21\2\0"+
    "\27\21\1\154\5\21\23\0\2\21\2\0\20\21\1\155"+
    "\14\21\23\0\2\21\2\0\27\21\1\144\5\21\23\0"+
    "\2\21\2\0\10\21\1\156\24\21\23\0\2\21\2\0"+
    "\27\21\1\157\5\21\23\0\2\21\2\0\31\21\1\160"+
    "\3\21\23\0\2\21\2\0\31\21\1\161\3\21\23\0"+
    "\2\21\2\0\24\21\1\147\10\21\10\0\1\162\12\0"+
    "\2\162\2\0\35\162\1\0\1\162\21\0\2\21\2\0"+
    "\23\21\1\55\11\21\23\0\2\21\2\0\17\21\1\163"+
    "\15\21\23\0\2\21\2\0\14\21\1\164\20\21\23\0"+
    "\2\21\2\0\14\21\1\165\20\21\23\0\2\21\2\0"+
    "\27\21\1\166\5\21\23\0\2\21\2\0\14\21\1\167"+
    "\20\21\23\0\2\21\2\0\27\21\1\170\5\21\23\0"+
    "\2\21\2\0\20\21\1\171\14\21\23\0\2\21\2\0"+
    "\14\21\1\172\20\21\10\0\1\173\12\0\2\173\2\0"+
    "\35\173\1\0\1\173\21\0\2\21\2\0\10\21\1\174"+
    "\24\21\23\0\2\21\2\0\27\21\1\175\5\21\23\0"+
    "\2\21\2\0\3\21\1\176\31\21\23\0\2\21\2\0"+
    "\32\21\1\177\2\21\23\0\2\21\2\0\27\21\1\200"+
    "\5\21\23\0\2\21\2\0\27\21\1\201\5\21\23\0"+
    "\2\21\2\0\7\21\1\202\25\21\23\0\2\21\2\0"+
    "\30\21\1\203\4\21\23\0\2\21\2\0\22\21\1\204"+
    "\12\21\23\0\2\21\2\0\13\21\1\163\21\21\23\0"+
    "\2\21\2\0\4\21\1\205\30\21\23\0\2\21\2\0"+
    "\20\21\1\206\14\21\23\0\2\21\2\0\1\21\1\207"+
    "\1\210\2\21\1\211\1\212\26\21\23\0\2\21\2\0"+
    "\25\21\1\213\7\21\23\0\2\21\2\0\20\21\1\214"+
    "\14\21\23\0\2\21\2\0\23\21\1\215\11\21\23\0"+
    "\2\21\2\0\10\21\1\216\10\21\1\217\13\21\23\0"+
    "\2\21\2\0\21\21\1\220\13\21\23\0\2\21\2\0"+
    "\14\21\1\221\20\21\23\0\2\21\2\0\11\21\1\222"+
    "\23\21\23\0\2\21\2\0\20\21\1\223\14\21\23\0"+
    "\2\21\2\0\14\21\1\224\20\21\23\0\2\21\2\0"+
    "\31\21\1\225\3\21\23\0\2\21\2\0\21\21\1\226"+
    "\13\21\23\0\2\21\2\0\10\21\1\227\24\21\23\0"+
    "\2\21\2\0\10\21\1\230\24\21\23\0\2\21\2\0"+
    "\16\21\1\230\16\21\23\0\2\21\2\0\30\21\1\231"+
    "\4\21\23\0\2\21\2\0\27\21\1\232\5\21\23\0"+
    "\2\21\2\0\23\21\1\233\11\21\23\0\2\21\2\0"+
    "\10\21\1\234\24\21\23\0\2\21\2\0\20\21\1\235"+
    "\14\21\23\0\2\21\2\0\23\21\1\236\11\21\23\0"+
    "\2\21\2\0\27\21\1\237\5\21\23\0\2\21\2\0"+
    "\31\21\1\240\3\21\23\0\2\21\2\0\31\21\1\241"+
    "\3\21\23\0\2\21\2\0\27\21\1\242\5\21\23\0"+
    "\2\21\2\0\34\21\1\243\23\0\2\21\2\0\12\21"+
    "\1\237\22\21\23\0\2\21\2\0\24\21\1\244\10\21"+
    "\23\0\2\21\2\0\10\21\1\245\24\21\23\0\2\21"+
    "\2\0\27\21\1\246\5\21\23\0\2\21\2\0\10\21"+
    "\1\244\24\21\23\0\2\21\2\0\12\21\1\247\22\21"+
    "\23\0\2\21\2\0\10\21\1\250\24\21\23\0\2\21"+
    "\2\0\32\21\1\251\2\21\23\0\2\21\2\0\30\21"+
    "\1\252\4\21\23\0\2\21\2\0\21\21\1\237\13\21"+
    "\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7488];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\4\11\4\1\1\11\15\1\2\11"+
    "\1\0\1\1\1\0\1\1\2\0\1\1\1\11\23\1"+
    "\1\0\1\11\2\0\23\1\2\0\21\1\1\0\14\1"+
    "\1\0\10\1\1\11\57\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
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
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            { return token(yytext(), "ERROR", yyline, yycolumn);
            }
            // fall through
          case 28: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 29: break;
          case 3:
            { return token(yytext(), "OP_LOGICO", yyline, yycolumn);
            }
            // fall through
          case 30: break;
          case 4:
            { return token(yytext(), "PARENTESIS_A", yyline, yycolumn);
            }
            // fall through
          case 31: break;
          case 5:
            { return token(yytext(), "PARENTESIS_C", yyline, yycolumn);
            }
            // fall through
          case 32: break;
          case 6:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 33: break;
          case 7:
            { return token(yytext(), "NUMERO", yyline, yycolumn);
            }
            // fall through
          case 34: break;
          case 8:
            { return token(yytext(), "PUNTO_COMA", yyline, yycolumn);
            }
            // fall through
          case 35: break;
          case 9:
            { return token(yytext(), "ERROR_2", yyline, yycolumn);
            }
            // fall through
          case 36: break;
          case 10:
            { return token(yytext(), "LLAVE_A", yyline, yycolumn);
            }
            // fall through
          case 37: break;
          case 11:
            { return token(yytext(), "LLAVE_C", yyline, yycolumn);
            }
            // fall through
          case 38: break;
          case 12:
            { return token(yytext(), "TEXTO", yyline, yycolumn);
            }
            // fall through
          case 39: break;
          case 13:
            { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn);
            }
            // fall through
          case 40: break;
          case 14:
            { return token(yytext(), "ERROR_1", yyline, yycolumn);
            }
            // fall through
          case 41: break;
          case 15:
            { return token(yytext(), "CONDICIONAL_SI", yyline, yycolumn);
            }
            // fall through
          case 42: break;
          case 16:
            { return token(yytext(), "OP_ASIGNACION", yyline, yycolumn);
            }
            // fall through
          case 43: break;
          case 17:
            { return token(yytext(), "MOVIMIENTO", yyline, yycolumn);
            }
            // fall through
          case 44: break;
          case 18:
            { return token(yytext(), "TIPO_DATO", yyline, yycolumn);
            }
            // fall through
          case 45: break;
          case 19:
            { return token(yytext(), "FINAL", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 20:
            { return token(yytext(), "TOMAR", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 21:
            { return token(yytext(), "PINTAR", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 22:
            { return token(yytext(), "SUERTE", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 23:
            { return token(yytext(), "COLOR", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 24:
            { return token(yytext(), "REPETIR", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 25:
            { return token(yytext(), "INTERRUMPIR", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          case 26:
            { return token(yytext(), "DETENER_PINTAR", yyline, yycolumn);
            }
            // fall through
          case 53: break;
          case 27:
            { return token(yytext(), "VER", yyline, yycolumn);
            }
            // fall through
          case 54: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
