// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/LexerColor.flex

import compilerTools.TextColor;
import java.awt.Color;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexerColor {

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
    "\1\0\1\6\1\7\2\0\1\10\1\0\2\11\1\12"+
    "\1\13\1\11\1\13\1\14\1\15\1\16\11\17\1\0"+
    "\1\11\1\0\1\11\3\0\1\20\1\21\1\22\1\20"+
    "\1\23\7\20\1\24\1\25\1\26\1\27\1\20\1\30"+
    "\1\20\1\31\6\20\4\0\1\20\1\0\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\20\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\2\20\1\56\1\20\1\57\1\11"+
    "\1\60\1\11\7\0\1\3\73\0\1\20\7\0\1\20"+
    "\3\0\1\20\3\0\1\20\1\0\1\20\6\0\1\20"+
    "\1\0\1\20\4\0\1\20\7\0\1\20\3\0\1\20"+
    "\3\0\1\20\1\0\1\20\6\0\1\20\1\0\1\20"+
    "\u012b\0\2\3\326\0\u0100\3";

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
    "\1\0\1\1\2\2\2\1\1\3\1\4\2\5\2\6"+
    "\21\2\1\0\1\7\2\0\1\10\1\0\1\1\22\2"+
    "\1\11\2\2\3\0\2\10\2\12\24\2\1\13\1\2"+
    "\2\0\1\10\4\2\1\14\14\2\1\11\1\2\1\0"+
    "\5\2\1\15\4\2\1\16\2\2\1\0\7\2\1\17"+
    "\1\2\1\20\1\21\2\2\1\13\4\2\1\22\2\0"+
    "\4\2\4\0\7\2\4\0\10\2\4\0\5\2\1\23"+
    "\1\2\1\0\1\24\2\0\5\2\1\25\1\2\1\26"+
    "\5\2\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[200];
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
    "\0\0\0\61\0\61\0\142\0\223\0\304\0\61\0\61"+
    "\0\61\0\365\0\u0126\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b"+
    "\0\u024c\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3"+
    "\0\u03d4\0\u0405\0\u0436\0\u0467\0\u0498\0\223\0\223\0\u04c9"+
    "\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651"+
    "\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8\0\u07d9"+
    "\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961"+
    "\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\61\0\u0a56\0\61\0\u0a87"+
    "\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f"+
    "\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97"+
    "\0\u0dc8\0\u0df9\0\u0e2a\0\u0e5b\0\u0188\0\u0e8c\0\u0ebd\0\u0eee"+
    "\0\u09f4\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0188\0\u0fe3\0\u1014"+
    "\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b\0\u119c"+
    "\0\u11cd\0\u11fe\0\u0188\0\u122f\0\u1260\0\u1291\0\u12c2\0\u12f3"+
    "\0\u1324\0\u1355\0\u0188\0\u1386\0\u13b7\0\u13e8\0\u1419\0\u0188"+
    "\0\u144a\0\u147b\0\u14ac\0\u14dd\0\u150e\0\u153f\0\u1570\0\u15a1"+
    "\0\u15d2\0\u1603\0\u0188\0\u1634\0\u0188\0\61\0\u1665\0\u1696"+
    "\0\u15a1\0\u16c7\0\u16f8\0\u1729\0\u175a\0\u178b\0\u17bc\0\u17ed"+
    "\0\u181e\0\u184f\0\u1880\0\u18b1\0\u18e2\0\u1913\0\u1944\0\u1975"+
    "\0\u19a6\0\u19d7\0\u1a08\0\u1a39\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd"+
    "\0\u1b2e\0\u1b5f\0\u1b90\0\u1bc1\0\u1bf2\0\u1c23\0\u1c54\0\u1c85"+
    "\0\u1cb6\0\u1ce7\0\u1d18\0\u1d49\0\u1d7a\0\u1dab\0\u1ddc\0\u1e0d"+
    "\0\u1e3e\0\u1e6f\0\u1ea0\0\u1ed1\0\u0188\0\u1f02\0\u1f33\0\61"+
    "\0\u1f64\0\u1f95\0\u1fc6\0\u1ff7\0\u2028\0\u2059\0\u208a\0\61"+
    "\0\u20bb\0\u0188\0\u20ec\0\u211d\0\u214e\0\u217f\0\u21b0\0\u0188";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[200];
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
    "\1\10\2\11\1\2\1\12\1\13\1\14\2\15\1\16"+
    "\1\17\1\20\3\15\1\21\1\22\1\23\2\15\1\24"+
    "\1\25\1\26\2\15\1\27\3\15\1\30\1\31\1\32"+
    "\1\15\1\33\1\34\1\35\3\15\1\7\63\0\1\3"+
    "\56\0\2\36\1\0\1\36\1\0\1\36\1\37\52\36"+
    "\5\0\1\40\10\0\43\40\12\0\1\41\2\0\1\42"+
    "\57\0\1\43\1\0\1\2\1\44\55\0\1\43\1\0"+
    "\2\14\57\0\42\15\17\0\14\15\1\45\14\15\1\46"+
    "\10\15\17\0\30\15\1\47\11\15\17\0\20\15\1\50"+
    "\21\15\17\0\20\15\1\51\21\15\17\0\20\15\1\52"+
    "\21\15\17\0\17\15\1\53\16\15\1\54\3\15\17\0"+
    "\20\15\1\55\21\15\17\0\35\15\1\56\4\15\17\0"+
    "\24\15\1\57\7\15\1\60\5\15\17\0\30\15\1\61"+
    "\10\15\1\62\17\0\31\15\1\63\10\15\17\0\20\15"+
    "\1\25\21\15\17\0\24\15\1\64\4\15\1\65\10\15"+
    "\17\0\20\15\1\66\21\15\17\0\24\15\1\67\12\15"+
    "\1\70\2\15\17\0\31\15\1\71\10\15\6\0\1\72"+
    "\10\0\43\72\12\73\1\74\46\73\2\42\1\75\1\42"+
    "\1\76\54\42\16\0\1\77\1\100\57\0\2\44\57\0"+
    "\32\15\1\101\7\15\17\0\26\15\1\102\13\15\17\0"+
    "\36\15\1\103\3\15\17\0\30\15\1\104\11\15\17\0"+
    "\14\15\1\105\25\15\17\0\40\15\1\106\1\15\17\0"+
    "\20\15\1\107\21\15\17\0\34\15\1\110\5\15\17\0"+
    "\34\15\1\111\1\15\1\112\3\15\17\0\36\15\1\113"+
    "\3\15\17\0\30\15\1\114\11\15\17\0\20\15\1\115"+
    "\21\15\17\0\36\15\1\116\3\15\17\0\33\15\1\117"+
    "\6\15\17\0\34\15\1\56\5\15\17\0\30\15\1\120"+
    "\11\15\17\0\30\15\1\121\11\15\17\0\32\15\1\122"+
    "\7\15\17\0\30\15\1\123\11\15\17\0\20\15\1\124"+
    "\13\15\1\125\5\15\17\0\27\15\1\126\12\15\6\0"+
    "\1\127\10\0\43\127\12\73\1\130\60\73\1\130\2\73"+
    "\1\131\43\73\2\0\1\75\74\0\2\100\57\0\36\15"+
    "\1\132\3\15\17\0\31\15\1\133\10\15\17\0\20\15"+
    "\1\134\21\15\17\0\35\15\1\135\4\15\17\0\26\15"+
    "\1\136\13\15\17\0\36\15\1\137\3\15\17\0\26\15"+
    "\1\140\13\15\17\0\14\15\1\141\25\15\17\0\20\15"+
    "\1\142\21\15\17\0\20\15\1\143\21\15\17\0\20\15"+
    "\1\125\21\15\17\0\14\15\1\144\25\15\17\0\30\15"+
    "\1\145\11\15\17\0\20\15\1\146\21\15\17\0\37\15"+
    "\1\147\2\15\17\0\36\15\1\150\3\15\17\0\20\15"+
    "\1\151\21\15\17\0\20\15\1\152\21\15\17\0\31\15"+
    "\1\153\10\15\17\0\34\15\1\154\5\15\17\0\14\15"+
    "\1\151\25\15\6\0\1\155\10\0\43\155\12\73\1\130"+
    "\2\73\1\75\43\73\16\0\37\15\1\156\2\15\17\0"+
    "\34\15\1\136\5\15\17\0\34\15\1\137\5\15\17\0"+
    "\14\15\1\157\25\15\17\0\31\15\1\136\10\15\17\0"+
    "\14\15\1\160\25\15\17\0\35\15\1\125\4\15\17\0"+
    "\16\15\1\161\23\15\17\0\30\15\1\162\11\15\17\0"+
    "\26\15\1\163\13\15\17\0\36\15\1\164\3\15\17\0"+
    "\34\15\1\165\5\15\17\0\24\15\1\166\15\15\17\0"+
    "\14\15\1\167\25\15\17\0\34\15\1\170\5\15\17\0"+
    "\36\15\1\171\3\15\17\0\36\15\1\172\3\15\6\0"+
    "\1\173\10\0\43\173\16\0\34\15\1\174\5\15\17\0"+
    "\25\15\1\175\14\15\17\0\30\15\1\56\11\15\17\0"+
    "\23\15\1\176\16\15\17\0\20\15\1\177\21\15\17\0"+
    "\20\15\1\200\21\15\17\0\34\15\1\201\5\15\17\0"+
    "\20\15\1\202\21\15\17\0\34\15\1\203\5\15\17\0"+
    "\24\15\1\204\15\15\17\0\20\15\1\205\21\15\6\0"+
    "\1\206\10\0\43\206\16\0\14\15\1\207\25\15\17\0"+
    "\20\15\1\210\21\15\17\0\14\15\1\211\25\15\17\0"+
    "\34\15\1\212\5\15\17\0\5\15\1\213\34\15\17\0"+
    "\37\15\1\214\2\15\17\0\34\15\1\215\5\15\17\0"+
    "\34\15\1\216\5\15\15\0\1\217\1\0\42\15\15\0"+
    "\1\220\1\0\42\15\17\0\11\15\1\221\30\15\17\0"+
    "\35\15\1\222\4\15\17\0\27\15\1\223\12\15\17\0"+
    "\17\15\1\176\22\15\17\0\6\15\1\224\33\15\24\0"+
    "\1\225\4\0\1\226\1\227\60\0\1\230\45\0\24\15"+
    "\1\231\15\15\17\0\3\15\1\232\1\233\2\15\1\234"+
    "\1\235\31\15\17\0\32\15\1\236\7\15\17\0\24\15"+
    "\1\237\15\15\47\0\1\240\50\0\1\241\60\0\1\242"+
    "\60\0\1\243\40\0\30\15\1\244\11\15\17\0\14\15"+
    "\1\245\11\15\1\246\13\15\17\0\26\15\1\247\13\15"+
    "\17\0\20\15\1\250\21\15\17\0\15\15\1\251\24\15"+
    "\17\0\24\15\1\252\15\15\17\0\20\15\1\253\21\15"+
    "\55\0\1\254\36\0\1\255\104\0\1\256\60\0\1\257"+
    "\20\0\36\15\1\260\3\15\17\0\26\15\1\261\13\15"+
    "\17\0\14\15\1\262\25\15\17\0\14\15\1\263\25\15"+
    "\17\0\22\15\1\263\17\15\17\0\35\15\1\264\4\15"+
    "\17\0\34\15\1\265\5\15\17\0\30\15\1\266\11\15"+
    "\37\0\1\267\66\0\1\270\70\0\1\271\60\0\1\272"+
    "\22\0\14\15\1\252\25\15\17\0\24\15\1\273\15\15"+
    "\17\0\30\15\1\274\11\15\17\0\34\15\1\275\5\15"+
    "\17\0\36\15\1\276\3\15\17\0\36\15\1\277\3\15"+
    "\53\0\1\271\55\0\1\270\60\0\1\300\27\0\41\15"+
    "\1\301\17\0\16\15\1\275\23\15\17\0\31\15\1\302"+
    "\10\15\17\0\14\15\1\303\25\15\17\0\34\15\1\304"+
    "\5\15\17\0\14\15\1\302\25\15\17\0\16\15\1\305"+
    "\23\15\17\0\14\15\1\306\25\15\17\0\37\15\1\307"+
    "\2\15\17\0\35\15\1\310\4\15\17\0\26\15\1\275"+
    "\13\15\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8673];
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
    "\1\0\2\11\3\1\3\11\24\1\1\0\1\1\2\0"+
    "\1\1\1\0\26\1\3\0\1\11\1\1\1\11\27\1"+
    "\2\0\24\1\1\0\15\1\1\0\12\1\1\11\10\1"+
    "\2\0\4\1\4\0\7\1\4\0\10\1\4\0\7\1"+
    "\1\0\1\11\2\0\5\1\1\11\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[200];
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
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
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
  public TextColor yylex() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

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
            { /* Ignorar */
            }
            // fall through
          case 23: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 24: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(48, 63, 159));
            }
            // fall through
          case 25: break;
          case 4:
            { return textColor(yychar, yylength(), new Color(169, 155, 179));
            }
            // fall through
          case 26: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(0, 0, 255));
            }
            // fall through
          case 27: break;
          case 6:
            { return textColor(yychar, yylength(), new Color(35, 120, 147));
            }
            // fall through
          case 28: break;
          case 7:
            { return textColor(yychar, yylength(), new Color(0, 143, 57));
            }
            // fall through
          case 29: break;
          case 8:
            { return textColor(yychar, yylength(), new Color(247, 94, 37));
            }
            // fall through
          case 30: break;
          case 9:
            { return textColor(yychar, yylength(), new Color(48, 63, 129));
            }
            // fall through
          case 31: break;
          case 10:
            { return textColor(yychar, yylength(), new Color(184, 20, 20));
            }
            // fall through
          case 32: break;
          case 11:
            { return textColor(yychar, yylength(), new Color(17, 94, 153));
            }
            // fall through
          case 33: break;
          case 12:
            { return textColor(yychar, yylength(), new Color(148, 58, 173));
            }
            // fall through
          case 34: break;
          case 13:
            { return textColor(yychar, yylength(), new Color(198, 40, 40));
            }
            // fall through
          case 35: break;
          case 14:
            { return textColor(yychar, yylength(), new Color(102, 41, 120));
            }
            // fall through
          case 36: break;
          case 15:
            { return textColor(yychar, yylength(), new Color(212, 129, 6));
            }
            // fall through
          case 37: break;
          case 16:
            { return textColor(yychar, yylength(), new Color(239, 108, 0));
            }
            // fall through
          case 38: break;
          case 17:
            { return textColor(yychar, yylength(), new Color(224, 195, 12));
            }
            // fall through
          case 39: break;
          case 18:
            { return textColor(yychar, yylength(), new Color(121, 107, 255));
            }
            // fall through
          case 40: break;
          case 19:
            { return textColor(yychar, yylength(), new Color(255, 64, 129));
            }
            // fall through
          case 41: break;
          case 20:
            { return textColor(yychar, yylength(), new Color(255, 0, 128));
            }
            // fall through
          case 42: break;
          case 21:
            { return textColor(yychar, yylength(), new Color(92, 51, 10));
            }
            // fall through
          case 43: break;
          case 22:
            { return textColor(yychar, yylength(), new Color(150, 0, 80));
            }
            // fall through
          case 44: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
