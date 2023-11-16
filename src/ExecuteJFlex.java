
import jflex.exceptions.SilentExit;

/**
 * Clase que ejecuta JFlex para generar analizadores léxicos a partir de archivos de especificación.
 * Se encarga de compilar el archivo Lexer.flex y LexerColor.flex, generando los analizadores léxicos correspondientes.
 *
 * @author Jhonatan Carrillo
 */
public class ExecuteJFlex {

    /**
     * Método principal que inicia la generación de analizadores léxicos usando JFlex.
     *
     * @param omega Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String omega[]) {
        // Rutas a los archivos de especificación Lexer.flex y LexerColor.flex
        String lexerFile = System.getProperty("user.dir") + "/src/Lexer.flex",
               lexerFileColor = System.getProperty("user.dir") + "/src/LexerColor.flex";

        try {
            // Generar los analizadores léxicos a partir de los archivos de especificación
            jflex.Main.generate(new String[]{lexerFile, lexerFileColor});
        } catch (SilentExit ex) {
            // Manejar la excepción en caso de error durante la compilación/generación con JFlex
            System.out.println("Error al compilar/generar el archivo flex: " + ex);
        }
    }
}
