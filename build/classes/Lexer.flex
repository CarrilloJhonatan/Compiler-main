import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Entero = 0 | [1-9][0-9]*
Real = {Entero}("."{Entero})?
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/* Identificador */
\${Identificador} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/* Tipos de dato */
color | texto | entero | real { return token(yytext(), "TIPO_DATO", yyline, yycolumn); }

/* Número */
{Entero} { return token(yytext(), "ENTERO", yyline, yycolumn); }
{Real} { return token(yytext(), "REAL", yyline, yycolumn); }

/* Colores */
#[{Letra} | {Digito}]{6} { return token(yytext(), "COLOR", yyline, yycolumn); }

/* Texto */
\"{EntradaDeCaracter}*\" { return token(yytext(), "TEXTO", yyline, yycolumn); }

/* Oparadores de agrupacion */
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}" { return token(yytext(), "LLAVE_C", yyline, yycolumn); }

/* Signos de puntuacion */
"," { return token(yytext(), "COMA", yyline, yycolumn); }
";" { return token(yytext(), "PUNTO_COMA", yyline, yycolumn); }

/* Operador de asignacion */
= { return token(yytext(), "OP_ASIGNACION", yyline, yycolumn); }

/* Movimiento */
adelante | atras | izquierda | derecha | norte | sur | este | oeste { return token(yytext(), "MOVIMIENTO", yyline, yycolumn); }

/* Pintar */
pintar { return token(yytext(), "PINTAR", yyline, yycolumn); }

/* Detener Pintar */
detenerPintar { return token(yytext(), "DETENER_PINTAR", yyline, yycolumn); }

/* TOMAR O PONER */
tomar | poner { return token(yytext(), "TOMAR", yyline, yycolumn); }

/* SUERTE */
suerte { return token(yytext(), "SUERTE", yyline, yycolumn); }

/* VER */
izquierdaEsObstaculo |
izquierdaEsClaro |
izquierdaEsBaliza |
izquierdaEsBlanco |
izquierdaEsNegro |
frenteEsObstaculo |
frenteEsClaro |
frenteEsBaliza |
frenteEsBlanco |
frenteEsNegro |
derechaEsObstaculo |
derechaEsClaro |
derechaEsBaliza |
derechaEsBlanco |
derechaEsNegro { return token(yytext(), "VER", yyline, yycolumn); }

/* Repetir */
repetir | repetirMientras { return token(yytext(), "REPETIR", yyline, yycolumn); }

/* Interrumpir */
interrumpir { return token(yytext(), "INTERRUMPIR", yyline, yycolumn); }

/* Condicional Si */
si | sino { return token(yytext(), "CONDICIONAL_SI", yyline, yycolumn); }

/* Operadores Logicos */
"&" | "|" { return token(yytext(), "OP_LOGICO", yyline, yycolumn); }

/* Operadores Aritméticos */
\+ { return token(yytext(), "SUMA", yyline, yycolumn); }
\- { return token(yytext(), "RESTA", yyline, yycolumn); }
\* { return token(yytext(), "MULTIPLICACION", yyline, yycolumn); }
\/ { return token(yytext(), "DIVISION", yyline, yycolumn); }

/* Mensaje.Texto("") */
Mensaje\.Texto { return token(yytext(), "MENSAJE_TEXTO", yyline, yycolumn); }

/* Funciones de Captura */
Captura\.Texto | Captura\.Entero | Captura\.Real { return token(yytext(), "CAPTURA_TIPODATO", yyline, yycolumn); }

/* Final */
final { return token(yytext(), "FINAL", yyline, yycolumn); }

/* Numero Erroneo */
0{Entero} { return token(yytext(), "ERROR_1", yyline, yycolumn); }

/* Identificador Erroneo */
{Identificador} { return token(yytext(), "ERROR_2", yyline, yycolumn); }




. { return token(yytext(), "ERROR", yyline, yycolumn); }