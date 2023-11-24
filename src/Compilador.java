
// Importación de librerías y paquetes necesarios para la aplicación
import com.formdev.flatlaf.FlatIntelliJLaf;
import compilerTools.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * La clase Compilador representa una aplicación de compilador con interfaz
 * gráfica. Este código está diseñado para el lenguaje de programación Costeñol.
 *
 * @author Jhonatan Carrillo
 */
public class Compilador extends javax.swing.JFrame {

    // Variables de instancia
    private String title;
    private Directory directorio;
    private ArrayList<Token> tokens;
    private ArrayList<ErrorLSSL> errors;
    private ArrayList<TextColor> textsColor;
    private Timer timerKeyReleased;
    private ArrayList<Production> identProd;
    private HashMap<String, String> identificadores;
    private HashMap<String, Boolean> variablesAsignadas; // Mapa para rastrear si las variables han sido asignadas
    private boolean codeHasBeenCompiled = false;

    /**
     * Constructor de la clase Compilador que inicializa la interfaz gráfica y
     * otros componentes.
     */
    public Compilador() {
        initComponents();
        init();
    }

    /**
     * Inicializa la configuración inicial de la aplicación, como título,
     * ubicación y eventos.
     */
    private void init() {
        title = "Costeñol";
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setTitle(title);
        directorio = new Directory(this, jtpCode, title, ".pqek"); // Configura el directorio para operaciones de archivo
        addWindowListener(new WindowAdapter() {// Agrega un WindowListener para cerrar la aplicación al presionar "X"
            @Override
            public void windowClosing(WindowEvent e) {
                directorio.Exit();
                System.exit(0);
            }
        });
        Functions.setLineNumberOnJTextComponent(jtpCode); // Configura la numeración de líneas en el componente de texto
        timerKeyReleased = new Timer((int) (1000 * 0.3), (ActionEvent e) -> {
            timerKeyReleased.stop();
            colorAnalysis(); // Inicia el análisis de colores después de un retraso de 0.3 segundos
        });
        Functions.insertAsteriskInName(this, jtpCode, () -> {
            timerKeyReleased.restart(); // Reinicia el temporizador cuando se inserta un asterisco en el nombre
        });
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();
        variablesAsignadas = new HashMap<>();
        Functions.setAutocompleterJTextComponent(new String[]{}, jtpCode, () -> {
            timerKeyReleased.restart();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        buttonsFilePanel = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        panelButtonCompilerExecute = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOutputConsole = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        rootPanel.setBackground(new java.awt.Color(32, 32, 32));

        buttonsFilePanel.setBackground(new java.awt.Color(114, 117, 120));

        btnAbrir.setBackground(new java.awt.Color(69, 142, 204));
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(69, 142, 204));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(69, 142, 204));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarC.setBackground(new java.awt.Color(69, 142, 204));
        btnGuardarC.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarC.setText("Guardar como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsFilePanelLayout = new javax.swing.GroupLayout(buttonsFilePanel);
        buttonsFilePanel.setLayout(buttonsFilePanelLayout);
        buttonsFilePanelLayout.setHorizontalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsFilePanelLayout.setVerticalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnGuardarC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpCode.setToolTipText("");
        jScrollPane1.setViewportView(jtpCode);

        panelButtonCompilerExecute.setBackground(new java.awt.Color(114, 117, 120));

        btnCompilar.setBackground(new java.awt.Color(69, 142, 204));
        btnCompilar.setForeground(new java.awt.Color(255, 255, 255));
        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        btnEjecutar.setBackground(new java.awt.Color(69, 142, 204));
        btnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonCompilerExecuteLayout = new javax.swing.GroupLayout(panelButtonCompilerExecute);
        panelButtonCompilerExecute.setLayout(panelButtonCompilerExecuteLayout);
        panelButtonCompilerExecuteLayout.setHorizontalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompilar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEjecutar)
                .addContainerGap())
        );
        panelButtonCompilerExecuteLayout.setVerticalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompilar)
                    .addComponent(btnEjecutar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jtaOutputConsole.setEditable(false);
        jtaOutputConsole.setBackground(new java.awt.Color(255, 255, 255));
        jtaOutputConsole.setColumns(20);
        jtaOutputConsole.setRows(5);
        jScrollPane2.setViewportView(jtaOutputConsole);

        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Componente léxico", "Lexema", "[Línea, Columna]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTokens.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblTokens.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblTokens);

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rootPanelLayout.createSequentialGroup()
                        .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonsFilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Método que se ejecuta al hacer clic en el botón "Nuevo". Invoca el método
     * New() de la clase directorio y limpia los campos de la aplicación.
     */
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        directorio.New();
        clearFields();
    }//GEN-LAST:event_btnNuevoActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Abrir". Si la operación
     * de apertura de archivo es exitosa, realiza el análisis de colores y
     * limpia los campos de la aplicación.
     */
    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (directorio.Open()) {
            colorAnalysis();
            clearFields();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Guardar". Si la
     * operación de guardado es exitosa, limpia los campos de la aplicación.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (directorio.Save()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Guardar como". Si la
     * operación de guardado como es exitosa, limpia los campos de la
     * aplicación.
     */
    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        if (directorio.SaveAs()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Compilar". Comprueba si
     * el título contiene "*" o es igual al título predeterminado. Si es así,
     * guarda el archivo antes de compilar y luego realiza la compilación. Si
     * no, simplemente realiza la compilación.
     */
    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        if (getTitle().contains("*") || getTitle().equals(title)) {
            if (directorio.Save()) {
                compile();
            }
        } else {
            compile();
        }
    }//GEN-LAST:event_btnCompilarActionPerformed
    /**
     * Método que se ejecuta al hacer clic en el botón "Ejecutar". Invoca el
     * método de compilación haciendo clic en el botón "Compilar". Si el código
     * se ha compilado y no hay errores, muestra los bloques de código en orden
     * de ejecución en la consola. En caso de errores, muestra un mensaje de
     * error.
     */
    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        btnCompilar.doClick();
        if (codeHasBeenCompiled) {
            if (!errors.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se puede ejecutar el código ya que se encontró uno o más errores",
                        "Error en la compilación", JOptionPane.ERROR_MESSAGE);
            } else {
                CodeBlock codeBlock = Functions.splitCodeInCodeBlocks(tokens, "{", "}", ";");
                System.out.println(codeBlock);
                ArrayList<String> blocksOfCode = codeBlock.getBlocksOfCodeInOrderOfExec();
                System.out.println(blocksOfCode);
                executeCode(blocksOfCode, 1);

            }
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    // Método para ejecutar bloques de código, permitiendo repeticiones
    private void executeCode(ArrayList<String> blocksOfCode, int repeats) {
        // Itera a través del número de repeticiones especificado
        for (int j = 1; j <= repeats; j++) {
            // Variable para almacenar el código de repetición actual
            int repeatCode = -1;

            // Itera a través de los bloques de código
            for (int i = 0; i < blocksOfCode.size(); i++) {
                // Obtiene el bloque de código actual
                String blockOfCode = blocksOfCode.get(i);

                // Comprueba si hay un código de repetición activo
                if (repeatCode != -1) {
                    // Obtiene la posición del marcador de repetición en el bloque de código
                    int[] markerPosition = CodeBlock.getPositionOfBothMarkers(blocksOfCode, blockOfCode);

                    // Ejecuta el bloque de código repetido
                    executeCode(new ArrayList<>(blocksOfCode.subList(markerPosition[0], markerPosition[1])), repeatCode);

                    // Restablece el código de repetición
                    repeatCode = -1;

                    // Actualiza el índice de iteración para saltar el bloque de código repetido
                    i = markerPosition[1];
                } else {
                    // Si no hay código de repetición, divide el bloque de código en sentencias individuales
                    String[] sentences = blockOfCode.split(";");

                    // Itera a través de las sentencias e imprime cada una en la consola
                    for (String sentence : sentences) {
                        sentence = sentence.trim();
                        if (sentence.contains("Mensaje.Texto")) {
                            String contenido = sentence.split("\\(\\s*\"")[1].split("\"\\s*\\)")[0];
                            JOptionPane.showMessageDialog(null, contenido);
                        } else if (sentence.contains("Captura.Texto")) {
                            // Dividir la sentencia en el paréntesis y eliminar espacios adicionales
                            String[] parts = sentence.split("\\(");

                            // Extraer el identificador (nombre de la variable) y eliminar espacios adicionales
                            String identificador = parts[1].replaceAll("\\s|\\)", "");

                            // Verificar si el identificador existe en el mapa
                            if (identificadores.containsKey(identificador)) {
                                // Obtener el valor asignado mediante un JOptionPane
                                String valorAsignado = JOptionPane.showInputDialog("Ingrese el valor para la variable '" + identificador + "' de tipo 'Texto':");

                                // Actualizar el mapa con el nuevo valor
                                identificadores.put(identificador, valorAsignado);

                                // Mostrar el valor asignado
                                JOptionPane.showMessageDialog(null, "Valor asignado a '" + identificador + "': " + valorAsignado);
                                System.out.println("Valor asignado a '" + identificador + "': " + valorAsignado);
                            } else {
                                // Manejar el caso en el que el identificador no existe
                                JOptionPane.showMessageDialog(null, "Identificador no encontrado: " + identificador);
                                System.out.println("Identificador no encontrado: " + identificador);
                            }
                        } else if (sentence.contains("Captura.Entero")) {
                            // Dividir la sentencia en el paréntesis y eliminar espacios adicionales
                            String[] parts = sentence.split("\\(");

                            // Extraer el identificador (nombre de la variable) y eliminar espacios adicionales y el paréntesis final
                            String identificador = parts[1].replaceAll("\\s|\\)", "");

                            // Verificar si el identificador existe en el mapa
                            if (identificadores.containsKey(identificador)) {
                                // Obtener el valor asignado mediante un JOptionPane
                                String valorAsignado = JOptionPane.showInputDialog("Ingrese el valor entero para la variable '" + identificador + "':");

                                try {
                                    // Intentar convertir el valor ingresado a un entero
                                    int valorEntero = Integer.parseInt(valorAsignado);

                                    // Actualizar el mapa con el nuevo valor
                                    identificadores.put(identificador, String.valueOf(valorEntero));

                                    // Mostrar el valor asignado
                                    JOptionPane.showMessageDialog(null, "Valor entero asignado a '" + identificador + "': " + valorEntero);
                                    System.out.println("Valor entero asignado a '" + identificador + "': " + valorEntero);
                                } catch (NumberFormatException e) {
                                    // Manejar el caso en el que no se puede convertir a un entero
                                    JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un valor entero válido.");
                                    System.out.println("Error: Por favor, ingrese un valor entero válido.");
                                }
                            } else {
                                // Manejar el caso en el que el identificador no existe
                                JOptionPane.showMessageDialog(null, "Identificador no encontrado: " + identificador);
                                System.out.println("Identificador no encontrado: " + identificador);
                            }
                        } else if (sentence.contains("Captura.Real")) {
                            // Dividir la sentencia en el paréntesis y eliminar espacios adicionales
                            String[] parts = sentence.split("\\(");

                            // Extraer el identificador (nombre de la variable) y eliminar espacios adicionales y el paréntesis final
                            String identificador = parts[1].replaceAll("\\s|\\)", "");

                            // Verificar si el identificador existe en el mapa
                            if (identificadores.containsKey(identificador)) {
                                // Obtener el valor asignado mediante un JOptionPane
                                String valorAsignado = JOptionPane.showInputDialog("Ingrese el valor real para la variable '" + identificador + "':");

                                try {
                                    // Intentar convertir el valor ingresado a un número real
                                    double valorReal = Double.parseDouble(valorAsignado);

                                    // Actualizar el mapa con el nuevo valor
                                    identificadores.put(identificador, String.valueOf(valorReal));

                                    // Mostrar el valor asignado
                                    JOptionPane.showMessageDialog(null, "Valor real asignado a '" + identificador + "': " + valorReal);
                                    System.out.println("Valor real asignado a '" + identificador + "': " + valorReal);
                                } catch (NumberFormatException e) {
                                    // Manejar el caso en el que no se puede convertir a un número real
                                    JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un valor real válido.");
                                    System.out.println("Error: Por favor, ingrese un valor real válido.");
                                }
                            } else {
                                // Manejar el caso en el que el identificador no existe
                                JOptionPane.showMessageDialog(null, "Identificador no encontrado: " + identificador);
                                System.out.println("Identificador no encontrado: " + identificador);
                            }
                        }
                        System.out.println(sentence);
                    }
                }
            }
        }
    }

    /**
     * Método principal para realizar la compilación del código. Limpia los
     * campos, realiza el análisis léxico, muestra los tokens en la tabla,
     * realiza el análisis sintáctico y semántico, imprime la salida en la
     * consola, y marca que el código ha sido compilado.
     */
    private void compile() {
        clearFields();
        lexicalAnalysis();
        fillTableTokens();
        syntacticAnalysis();
        semanticAnalysis();
        printConsole();
        codeHasBeenCompiled = true;
    }

    /**
     * Realiza el análisis léxico del código. Extrae tokens del código fuente y
     * los agrega a la lista de tokens.
     */
    private void lexicalAnalysis() {
        Lexer lexer;
        try {
            File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexer = new Lexer(entrada);
            while (true) {
                Token token = lexer.yylex();
                if (token == null) {
                    break;
                }
                tokens.add(token);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
    }

    /**
     * Realiza el análisis sintáctico del código. Utiliza la clase Grammar para
     * mostrar las gramáticas.
     */
    private void syntacticAnalysis() {
        Grammar gramatica = new Grammar(tokens, errors);

        /* Eliminacion de Errores    */
        gramatica.delete(new String[]{"ERROR", "ERROR_1", "ERROR_2"}, 1);

//        /* Reglas específicas para capturas de datos    */
//        gramatica.group("CAPTURA_TIPODATO", "Captura.Texto | Captura.Entero | Captura.Real", true);

        /* Agrupacion de valores    */
        gramatica.group("VALOR", "ENTERO | COLOR | TEXTO | REAL", true);

        /* Declaracion de variables    */
        gramatica.group("VARIABLE", "IDENTIFICADOR TIPO_DATO OP_ASIGNACION VALOR", true, identProd);
//        gramatica.group("VARIABLE", "IDENTIFICADOR TIPO_DATO OP_ASIGNACION CAPTURA_TIPODATO", true, identProd);
        gramatica.group("VARIABLE", "IDENTIFICADOR TIPO_DATO", true);
        gramatica.group("VARIABLE", "TIPO_DATO OP_ASIGNACION VALOR", true, 2, "Error Sintactico {}: Falta el Identificador de la Variable [#, %]");
        gramatica.group("VARIABLE", "IDENTIFICADOR TIPO_DATO OP_ASIGNACION", 3, "Error Sintactico {}: Falta el Valor de la Declaracion [#, %]");

        gramatica.finalLineColumn();
        gramatica.initialLineColumn();

        /* Eliminacion de Tipos de datos y de operadores de asignacion    */
        gramatica.delete("TIPO_DATO", 4, "Error Sintactico {}: El tipo de dato no está en una Declaración [#, %]");
        gramatica.delete("OP_ASIGNACION", 5, "Error Sintactico {}: El Operador de Asignación no está en una Declaración [#, %]");

        /* Agrupar de identificadores y definición de parámetros    */
        gramatica.group("VALOR", "IDENTIFICADOR", true);
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");

        /* Expresiones aritméticas */
        gramatica.group("EXP_ARITMETICA", "(VALOR (SUMA | RESTA | MULTIPLICACION | DIVISION) VALOR)+", true, 17,
                "Error Sintactico {}: Error en la expresión aritmética [#, %]");

        /* Agrupar de identificadores y definición de parámetros    */
        gramatica.group("FUNCION", "(MOVIMIENTO | PINTAR | DETENER_PINTAR | TOMAR | SUERTE | VER | INTERRUMPIR | MENSAJE_TEXTO | CAPTURA_TIPODATO)", true);

        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)? PARENTESIS_C", true);
        gramatica.group("FUNCION_COMP", "FUNCION (VALOR | PARAMETROS)? PARENTESIS_C", true, 6,
                "Error Sintactico {}: Falta el paréntesis que abre la función [#, %]");
        gramatica.finalLineColumn();
        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)", true, 7,
                "Error Sintactico {}: Falta el paréntesis que cierra la función [#, %]");
        gramatica.initialLineColumn();

        /* Eliminación de Funciones Incompletas    */
        gramatica.delete("FUNCION", 8, "Error Sintactico {}: La función no está declarada correctamente");

        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
            gramatica.group("EXP_LOGICA", "(FUNCION_COMP | EXP_LOGICA | EXP_ARITMETICA) (OP_LOGICO (FUNCION_COMP | EXP_LOGICA | EXP_ARITMETICA))+");
            gramatica.group("EXP_LOGICA", "PARENTESIS_A (EXP_LOGICA | FUNCION_COMP | EXP_ARITMETICA) PARENTESIS_C");

        });

        /* Eliminación de Operadores Lógicos   */
        gramatica.delete("OP_LOGICO", 9, "Error Sintactico {}: El Operador Lógico no está contenido en una expresión");

        /* Agrupación de Exp. lógicas y aritméticas como valor y parámetros   */
        gramatica.group("VALOR", "EXP_LOGICA | EXP_ARITMETICA");
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");

        /* Agrupación de Estructuras de Control   */
        gramatica.group("EST_CONTROL", "(REPETIR | CONDICIONAL_SI)");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A PARENTESIS_C");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL (VALOR | PARAMETROS)");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A (VALOR | PARAMETROS) PARENTESIS_C");

        /* Eliminación de Estructuras de Control Incompletas   */
        gramatica.delete("EST_CONTROL", 11, "Error Sintactico {}: La estructura de Control No está Declarada Correctamente [#, %]");

        /* Eliminación de paréntesis  */
        gramatica.delete(new String[]{"PARENTESIS_A", "PARENTESIS_C"}, 12, "Error Sintactico {}: El paréntesis [] no está contenido en una Agrupación [#, %]");

        gramatica.finalLineColumn();
        /* Verificación de punto y coma al final de una sentencia */
        // Identificadores O variables
        gramatica.group("VARIABLE_PC", "VARIABLE PUNTO_COMA");
        gramatica.group("VARIABLE_PC", "VARIABLE", true, 13, "Error Sintactico {}: Falta el Punto y Coma al final de la Variable [#, %]");
        // Funciones
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP PUNTO_COMA");
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP", true, 14, "Error Sintactico {}: Falta el Punto y Coma al final de la Declaración de Función [#, %]");

        gramatica.initialLineColumn();

        /* Eliminación del punto y coma */
        gramatica.delete("PUNTO_COMA", 15, "Error Sintactico {}: El punto y coma no está al final de una sentencia [#, %]");

        /* Sentencias */
        gramatica.group("SENTENCIAS", "(VARIABLE_PC | FUNCION_COMP_PC | EST_CONTROL_COMP_LASLC_ARIT)+");
        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
            gramatica.group("EST_CONTROL_COMP_LASLC_ARIT", "EST_CONTROL_COMP LLAVE_A (SENTENCIAS | EXP_ARITMETICA)? LLAVE_C", true);
            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC_ARIT)+");
        });

        /* Estructuras de función incompletas */
        gramatica.loopForFunExecUntilChangeNotDetected(() -> {
            gramatica.initialLineColumn();
            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP (SENTENCIAS)? LLAVE_C", true, 15,
                    "Error Sintactico {}: Falta la llave que abre en la estructura de control [#, %]");

            gramatica.finalLineColumn();
            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP LLAVE_A (SENTENCIAS)", true, 16,
                    "Error Sintactico {}: Falta la llave que cierra en la estructura de control [#, %]");
            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC)");

        });

        gramatica.delete(new String[]{"LLAVE_A", "LLAVE_C"}, 16, "Error Sintactico {}: La llave [] no está contenida en una agrupación [#, %]");

        gramatica.show();
    }

    private String capturarDato(String tipoDato) {
        String mensaje = "Ingrese un valor para el tipo de dato " + tipoDato + ":";
        return JOptionPane.showInputDialog(null, mensaje);
    }

    /**
     * /**
     * Realiza el análisis semántico del código.
     */
    private void semanticAnalysis() {
        // Mapa para verificar tipos de datos
        HashMap<String, String> identDataType = new HashMap<>();
        identDataType.put("Color", "COLOR");
        identDataType.put("Entero", "ENTERO");
        identDataType.put("Texto", "TEXTO");
        identDataType.put("Real", "REAL");

        // Verificar si hay elementos en identProd
        if (identProd != null && !identProd.isEmpty()) {
            // Crear un conjunto para rastrear identificadores ya declarados
            Set<String> declaredIdentifiers = new HashSet<>();

            // Ahora podemos entrar en el bucle para realizar el análisis semántico
            for (Production id : identProd) {
                String identificador = id.lexemeRank(0);
                String tipoDato = id.lexemeRank(1);

                // Verificar si el tipo de dato es reconocido
                if (!identDataType.containsKey(tipoDato)) {
                    errors.add(new ErrorLSSL(1, "Error Semantico {}: Tipo de dato no reconocido [#, %]", id, true));
                } else if (!identDataType.get(tipoDato).equals(id.lexicalCompRank(-1))) {
                    errors.add(new ErrorLSSL(1, "Error Semantico {}: La llave [] Valor no Compatible con el Tipo de Dato [#, %]", id, true));
                }

                // Verificar si el identificador ya ha sido declarado
                if (declaredIdentifiers.contains(identificador)) {
                    errors.add(new ErrorLSSL(3, "Error Semantico {}: La variable '" + identificador + "' ya ha sido declarada [#, %]", id, false));
                } else {
                    declaredIdentifiers.add(identificador);

                    // Agregar la variable al mapa
                    identificadores.put(identificador, tipoDato);

                    // Verificar si hay una asignación de valor o captura de datos
                    if (id.lexemeRank(2).equals("OP_ASIGNACION")) {
                        // Obtener el identificador al que se asigna el valor
                        String identificadorAsignado = id.lexemeRank(3);

                        // Verificar si el identificador asignado existe
                        if (!declaredIdentifiers.contains(identificadorAsignado)) {
                            errors.add(new ErrorLSSL(5, "Error Semantico {}: El identificador '" + identificadorAsignado + "' no ha sido declarado [#, %]", id, false));
                        }
                    } else if (id.lexemeRank(2).equals("CAPTURA_TIPODATO")) {
                        // Capturar datos mediante JOptionPane
                        String valorCapturado = capturarDato(tipoDato);

                        // Puedes hacer más validaciones o procesamiento según tus necesidades
                        // Aquí simplemente estoy imprimiendo el valor capturado
                        System.out.println("Valor capturado para '" + identificador + "': " + valorCapturado);
                    }
                }

                System.out.println(identificador);
                System.out.println(tipoDato);
            }
        }
    }

    /**
     * Realiza el análisis de colores del código. Limpia la lista de colores,
     * extrae los rangos de colores y los aplica al JTextPane.
     */
    private void colorAnalysis() {
        /* Limpiar el arreglo de colores */
        textsColor.clear();
        /* Extraer rangos de colores */
        LexerColor lexerColor;
        try {
            File codigo = new File("color.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexerColor = new LexerColor(entrada);
            while (true) {
                TextColor textColor = lexerColor.yylex();
                if (textColor == null) {
                    break;
                }
                textsColor.add(textColor);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
        Functions.colorTextPane(textsColor, jtpCode, new Color(40, 40, 40));
    }

    /**
     * Llena la tabla de tokens con la información de los tokens.
     */
    private void fillTableTokens() {
        tokens.forEach(token -> {
            Object[] data = new Object[]{token.getLexicalComp(), token.getLexeme(), "[" + token.getLine() + ", " + token.getColumn() + "]"};
            Functions.addRowDataInTable(tblTokens, data);
        });
    }

    /**
     * Imprime la salida en la consola, indicando si la compilación tuvo
     * errores. Muestra los errores ordenados por línea y columna.
     */
    private void printConsole() {
        int sizeErrors = errors.size();
        if (sizeErrors > 0) {
            Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            for (ErrorLSSL error : errors) {
                String strError = String.valueOf(error);
                strErrors += strError + "\n";
            }
            jtaOutputConsole.setText("Compilación terminada...\n" + strErrors + "\nLa compilación terminó con errores...");
        } else {
            jtaOutputConsole.setText("Compilación terminada...");
        }
        jtaOutputConsole.setCaretPosition(0);
    }

    /**
     * Limpia los campos y establece las variables en su estado inicial.
     */
    private void clearFields() {
        Functions.clearDataInTable(tblTokens);
        jtaOutputConsole.setText("");
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        variablesAsignadas.clear();
        codeHasBeenCompiled = false;
    }

    /**
     * Método principal que inicia la aplicación. Establece el aspecto visual
     * (look and feel) de Nimbus si está disponible. Crea e muestra la interfaz
     * gráfica del compilador.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     * caso).
     */
    public static void main(String args[]) {
        /* Establecer el aspecto visual Nimbus (interfaz de usuario) */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* Si Nimbus (introducido en Java SE 6) no está disponible, se utiliza el aspecto visual predeterminado.
     * Para más detalles, consultar http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Crear y mostrar el formulario (interfaz gráfica) */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                // Establecer el look and feel Flat IntelliJ
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("LookAndFeel no soportado: " + ex);
            }
            // Crear una instancia del compilador y hacerla visible
            new Compilador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel buttonsFilePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtaOutputConsole;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JPanel panelButtonCompilerExecute;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTable tblTokens;
    // End of variables declaration//GEN-END:variables
}
