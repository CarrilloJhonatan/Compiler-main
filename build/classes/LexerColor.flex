import compilerTools.TextColor;
import java.awt.Color;

%%
%class LexerColor
%type TextColor
%char
%{
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
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
{Comentario} { return textColor(yychar, yylength(), new Color(247, 94, 37)); }
{EspacioEnBlanco} { /*Ignorar*/ }

/* Tipos de dato */
Color | Texto | Entero | Real {  return textColor(yychar, yylength(), new Color(148, 58, 173)); }

/* Número */
{Entero} {  return textColor(yychar, yylength(), new Color(35, 120, 147)); }
{Real} { return textColor(yychar, yylength(), new Color(184, 20, 20)); }

/* Colores */
#[{Letra} | {Digito}]{6} {  return textColor(yychar, yylength(), new Color(224, 195, 12)); }

/* Texto */
\"{EntradaDeCaracter}*\" { return textColor(yychar, yylength(), new Color(0, 143, 57)); }

/* Oparadores de agrupacion */
"(" { return textColor(yychar, yylength(), new Color(169, 155, 179)); }
")" { return textColor(yychar, yylength(), new Color(169, 155, 179));  }
"{" { return textColor(yychar, yylength(), new Color(169, 155, 179));  }
"}" { return textColor(yychar, yylength(), new Color(169, 155, 179));  }

/* Signos de puntuacion */
"," { return textColor(yychar, yylength(), new Color(169, 155, 179));  }
";" { return textColor(yychar, yylength(), new Color(169, 155, 179));  }

/* Operador de asignacion */
= { return textColor(yychar, yylength(), new Color(169, 155, 179));  }

/* Movimiento */
adelante | atras | izquierda | derecha | norte | sur | este | oeste { return textColor(yychar, yylength(), new Color(17, 94, 153));  }

/* Pintar */
pintar { return textColor(yychar, yylength(), new Color(212, 129, 6));  }

/* Detener Pintar */
detenerPintar { return textColor(yychar, yylength(), new Color(255, 64, 129));  }

/* TOMAR O PONER */
tomar | poner { return textColor(yychar, yylength(), new Color(102, 41, 120));  }

/* SUERTE */
suerte { return textColor(yychar, yylength(), new Color(239, 108, 0));  }

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
derechaEsNegro { return textColor(yychar, yylength(), new Color(150, 0, 80));  }

/* Repetir */
repetir | repetirMientras { return textColor(yychar, yylength(), new Color(121, 107, 255));  }

/* Interrumpir */
interrumpir { return textColor(yychar, yylength(), new Color(255, 64, 129));  }

/* Condicional Si */
si | sino { return textColor(yychar, yylength(), new Color(48, 63, 129)); }

/* Operadores Logicos */
"&" | "|" { return textColor(yychar, yylength(), new Color(48, 63, 159));  }

/* Operadores Aritméticos */
\+ { return textColor(yychar, yylength(), new Color(0, 0, 255)); }
\- { return textColor(yychar, yylength(), new Color(0, 0, 255)); }
\* { return textColor(yychar, yylength(), new Color(0, 0, 255)); }
\/ { return textColor(yychar, yylength(), new Color(0, 0, 255)); }

/* Mensaje.Texto("") */
Mensaje\.Texto { return textColor(yychar, yylength(), new Color(92, 51, 10)); }

/* Funciones de Captura */
Captura\.Texto | Captura\.Entero | Captura\.Real { return textColor(yychar, yylength(), new Color(255, 0, 128)); }

/* Final */
final { return textColor(yychar, yylength(), new Color(198, 40, 40));  }

/* Identificador */
{Identificador} {  /*Ignorar*/ }

/* Numero Erroneo */
0{Entero} { /* Ignorar */ }

/* Identificador Erroneo */
{Identificador} { /* Ignorar */ }

. { /* Ignorar */ }