package compilador;

import java.awt.ComponentOrientation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class interfaz1 extends javax.swing.JFrame {

    boolean bandera = true;
    ArrayList<String> guardaVariables = new ArrayList<>();//Transformar datos
    ArrayList<String> guardarNumeros = new ArrayList<>();//Transformar datos 
    String letraReduccion[] = {"19", "19", "20", "20", "21", "21", "22", "22", "22", "22", "22", "22", "22", "23", "23", "23", "24", "24", "24", "25", "25", "26", "26", "26"};
    String numReducciones[] = {"3", "1", "3", "1", "2", "1", "3", "3", "3", "3", "3", "3", "1", "3", "3", "1", "3", "3", "1", "3", "1", "3", "1", "1"};
    ArrayList<Integer> pilaEstados = new ArrayList<>();

    public interfaz1() {

        initComponents();

    }

    public void datos(String[] lista) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscarArchivo = new javax.swing.JButton();
        eliminarTexto = new javax.swing.JButton();
        compilar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        errores = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        textConvert = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        textCadena = new javax.swing.JTextPane();
        apTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 740));

        buscarArchivo.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        buscarArchivo.setText("Abrir Fichero");
        buscarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarArchivoActionPerformed(evt);
            }
        });

        eliminarTexto.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        eliminarTexto.setText("Borrar Pantalla");
        eliminarTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTextoActionPerformed(evt);
            }
        });

        compilar.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        compilar.setText("Compilar");
        compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarActionPerformed(evt);
            }
        });

        texto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(texto);

        errores.setEditable(false);
        errores.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(errores);

        textConvert.setEditable(false);
        textConvert.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jScrollPane3.setViewportView(textConvert);

        textCadena.setEditable(false);
        textCadena.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jScrollPane4.setViewportView(textCadena);

        apTabla.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        apTabla.setText("Aplicar Tabla LR");
        apTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(compilar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(apTabla)
                        .addGap(280, 280, 280)
                        .addComponent(eliminarTexto)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarArchivo)
                    .addComponent(eliminarTexto)
                    .addComponent(compilar)
                    .addComponent(apTabla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean principal() {

        return bandera;
    }
    JFileChooser leerGramatica;
    private void buscarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarArchivoActionPerformed
        if (leerGramatica == null) {
            leerGramatica = new JFileChooser();
        }
        leerGramatica.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int seleccion = leerGramatica.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File f = leerGramatica.getSelectedFile();
            try {
                String nombre = f.getName();
                String path = f.getAbsolutePath();
                String contenido = getArchivo(path);
                this.setTitle(nombre);
                texto.setText(contenido);

            } catch (Exception exp) {

            }
        }


    }//GEN-LAST:event_buscarArchivoActionPerformed

    private void eliminarTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTextoActionPerformed
        textConvert.setText("");
        guardaVariables.clear();
        textCadena.setText("");
    }//GEN-LAST:event_eliminarTextoActionPerformed

    public String[][] compilarTablaLR() {
        String tablalr[][] = new String[42][27];
        FileReader fr = null;
        BufferedReader br = null;
        String contenido = "";

        try {
            fr = new FileReader("C:\\Users\\menes\\Documents\\tablalr.txt");
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido += linea + "\n";

            }
        } catch (Exception ex) {
        } finally {
            try {
                br.close();
            } catch (Exception ex) {

            }
        }
        String filas[] = contenido.split("\\n");

        for (int i = 0; i < filas.length; i++) {
            String columnas[] = filas[i].split(",");

            for (int k = 0; k < columnas.length; k++) {
                columnas[k] = columnas[k].replaceAll("\\s", "");
                tablalr[i][k] = columnas[k];
            }

        }
        return tablalr;
    }

    public void tranformarLen(boolean resp) {
        errores.setText("");
        textConvert.setText("");
        textCadena.setText("");
        String textoP = "", textoP2 = "";
        String cadena = "";
        String token = "";
        String tokenReal = "";
        StringTokenizer st = new StringTokenizer(texto.getText(), "\n");

        if (resp) {
            while (st.hasMoreTokens()) {

                token = st.nextToken();

                tokenReal = token;
                if (token.contains(";")) {
                    System.out.println("Parentesis");
                    token = token.replaceAll("[(]", "");
                    token = token.replaceAll("[)]", "");

                }

                String partes[] = token.split("\\s");

                textoP = textConvert.getText();
                textoP2 = textCadena.getText();
                if (verificarExpresion(token, "^(ent)\\s([a-zA-Z]+[0-9]*);\\s*$")) {//Variable sin declaracion inicial
                    partes[1] = partes[1].replaceAll(";", "");

                    textConvert.setText(textoP + "\n" + partes[0] + " " + "id" + guardaVariables.indexOf(partes[1]) + ";");
                    textCadena.setText(textoP2 + "\n" + "ID" + "$");
                } else if (verificarExpresion(token, "^(ent)\\s([a-zA-Z]+[0-9]*)\\s?(=)\\s*(([0-9])*|([a-zA-Z]+[0-9]*))([;]|(\\s*([+]|[-]|[*]|[/]))\\s*(([0-9])*|([a-zA-Z]+[0-9]*)))*\\s*;\\s*$")) {
                    tokenReal = tokenReal.replaceAll(";", " ");
                    cadena = textoP + "\n" + "ent ";
                    textConvert.setText(conOperaciones(cadena, tokenReal, 1) + ";");
                    cadena = textoP2 + "\n";
                    textCadena.setText(conOperaciones(cadena, tokenReal, 2) + "$");
                } else if (verificarExpresion(token, "^\\s?([a-zA-Z]+[0-9]*)\\s?(=)\\s*(([0-9])*|([a-zA-Z]+[0-9]*))([;]|(\\s*([+]|[-]|[*]|[/]))\\s*(([0-9])*|([a-zA-Z]+[0-9]*)))*\\s*;\\s*$")) {//Variable con declaracion
                    tokenReal = tokenReal.replaceAll(";", " ");
                    cadena = textoP + "\n";//+ guardaVariables.indexOf(partes[0])
                    textConvert.setText(conOperaciones(cadena, tokenReal, 1) + ";");
                    cadena = textoP2 + "\n";
                    textCadena.setText(conOperaciones(cadena, tokenReal, 2) + "$");

                }

            }
        }

    }

    public String conOperaciones(String cadena, String token, int tipo) {
        int contador = 0;
        String tokenEvaluar = "";

        System.out.println("Token a evaluar " + token);
        for (int i = 0; i < token.length(); i++) {
            System.out.println("Caracter " + String.valueOf(token.charAt(i)));
            if (!" ".equals(String.valueOf(token.charAt(i)))) {

                tokenEvaluar += String.valueOf(token.charAt(i));//Evaluar token 
                System.out.println("-->" + tokenEvaluar);

            } else {
                //System.out.println("Token a Evaluar " + tokenEvaluar);
                if ("".equals(tokenEvaluar)) {

                    tokenEvaluar += String.valueOf(token.charAt(i));
                }

                tokenEvaluar = tokenEvaluar.replaceAll("\\s*", "");
                System.out.println("Token a evaluar " + tokenEvaluar);
                switch (tokenEvaluar) {
                    case "=":
                        cadena += "=";
                        tokenEvaluar = "";
                        break;
                    case "+":
                        cadena += "+";
                        tokenEvaluar = "";
                        break;
                    case "-":
                        cadena += "-";
                        tokenEvaluar = "";
                        break;
                    case "*":
                        cadena += "*";
                        tokenEvaluar = "";
                        break;
                    case "/":
                        cadena += "/";
                        tokenEvaluar = "";
                        break;
                    case "ent":
                        //cadena += "ent";
                        tokenEvaluar = "";
                        break;
                    case "(":
                        cadena += "(";
                        tokenEvaluar = "";
                        break;
                    case ")":
                        cadena += ")";
                        tokenEvaluar = "";
                        break;
                    default: //El default analizaria las variables!!

                        // partes[i] = partes[i].replaceAll(";", "");
                        if (guardaVariables.contains(tokenEvaluar)) {
                            if (tipo == 1) {
                                cadena += " id" + guardaVariables.indexOf(tokenEvaluar);
                            } else {
                                cadena += "ID";
                            }
                            tokenEvaluar = "";

                        } else if (guardarNumeros.contains(tokenEvaluar)) {
                            if (tipo == 1) {
                                cadena += " cn" + guardarNumeros.indexOf(tokenEvaluar);
                            } else {
                                cadena += "CN";
                            }
                            tokenEvaluar = "";
                        }

                        break;
                }
            }
        }
        return cadena;
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
        textConvert.setText("");
        guardaVariables.clear();
        guardarNumeros.clear();
        textCadena.setText("");
        int error = 0;
        String errores2 = "";
        errores.setText("");
        texto.getText();
        int sino = 0, mientras = 0;
        int llavesino = 0, llavemain = 0, llavepara = 0, llavemientras = 0, parentesis = 0;
        String token = "";
        StringTokenizer st = new StringTokenizer(texto.getText(), "\n");

        while (st.hasMoreTokens()) {

            token = st.nextToken();

            if (verificarExpresion(token, "^Main[(][)][{]\\s*$")) {
                llavemain++;

                while (st.hasMoreTokens()) {
                    token = st.nextToken();
                    if (token.contains(";")) {  //Validar los parentesis 
                        for (int i = 0; i < token.length(); i++) {
                            if (token.charAt(i) == '(') {
                                parentesis++;
                            } else if (token.charAt(i) == ')') {
                                parentesis--;
                            }
                        }
                        if (parentesis == 0) {
                            System.out.println("Parentesis");
                            token = token.replaceAll("[(]", "");
                            token = token.replaceAll("[)]", "");

                        }

                    }

                    System.out.println("Token Inicial" + token);
                    if (verificarExpresion(token, "^\\s?([a-zA-Z]+[0-9]*)\\s?(=)\\s*(([0-9])*|([a-zA-Z]+[0-9]*))([;]|(\\s*([+]|[-]|[*]|[/]))\\s*(([0-9])*|([a-zA-Z]+[0-9]*)))*\\s*;\\s*$") || verificarExpresion(token, "^(ent|dec|text|bin)\\s([a-zA-Z]+[0-9]*);\\s*$") || verificarExpresion(token, "^(ent)\\s([a-zA-Z]+[0-9]*)\\s?(=)\\s*(([0-9])*|([a-zA-Z]+[0-9]*))([;]|(\\s*([+]|[-]|[*]|[/]))\\s*(([0-9])*|([a-zA-Z]+[0-9]*)))*\\s*;\\s*$") || verificarExpresion(token, "^leer[(]([a-zA-Z]+[0-9]*|[']([A-Za-z0-9][\\s]?)*['])[)];\\s*$") || verificarExpresion(token, "^capturar\\s([a-zA-Z]+[0-9]*)+;\\s*$")) {

                        if (verificarExpresion(token, "^(ent)\\s([a-zA-Z]+[0-9]*);\\s*$")) {
                            String partes[] = token.split("\\s");   //Dividimos el token en espacios para guardar el nombre de la variable.

                            partes[1] = partes[1].replaceAll(";", "");//Eliminamos el ; para guardar solo la variable en el arreglo

                            if (!guardaVariables.contains(partes[1])) {//Si la variable no se encuentra en el arreglo se guarda
                                guardaVariables.add(partes[1]);
                            } else {                                    //Si la variable esta repetida hay un error y no compila 
                                error++;
                                errores2 += "Variable ya declarada" + "\n";

                            }
                        } else if (verificarExpresion(token, "^(ent)\\s([a-zA-Z]+[0-9]*)\\s?(=)\\s*(([0-9])*|([a-zA-Z]+[0-9]*))([;]|(\\s*([+]|[-]|[*]|[/]))\\s*(([0-9])*|([a-zA-Z]+[0-9]*)))*\\s*;\\s$")) {//Variable con declaracion
                            //  System.out.println("Token despedazadp " + token);
                            String partes[] = token.split("\\s");   //Dividimos de igual manera el token
                            partes[1] = partes[1].replaceAll("\\s", "");
                            if (!guardaVariables.contains(partes[1])) {//Si la variable declara no esta en el arreglo se guarda
                                guardaVariables.add(partes[1]);

                            } else {
                                errores2 += "Variable ya declarada" + "\n";

                                error++;
                            }

                            for (int i = 2; i < partes.length; i++) {
                                partes[i] = partes[i].replaceAll("\\s", "");
                                System.out.println("Valor de la parte " + partes[i]);
                                switch (partes[i]) {
                                    case "=":

                                        break;
                                    case "+":

                                        break;
                                    case "-":

                                        break;
                                    case "*":

                                        break;
                                    case "/":

                                        break;
                                    case "ent":

                                        break;
                                    case "":
                                        break;
                                    case ";":
                                        break;

                                    default: //El default analizaria las variables!!
                                        partes[i] = partes[i].replaceAll(";", "");

                                        if (guardaVariables.contains(partes[i]) || guardarNumeros.contains(partes[i])) {//Si la variable declara no esta en el arreglo se guarda
                                            System.out.println("Perfecto, ya esta declarada");

                                        } else if (!guardarNumeros.contains(partes[i]) && isNumeric(partes[i])) {

                                            guardarNumeros.add(partes[i]);
                                            System.out.println("Numero guardado en la pila");
                                        } else {
                                            System.out.println("No esta declarado!!");   //Variable ya declarada
                                            errores2 += "Variable no declarada!" + "\n";
                                            error++;
                                        }
                                        break;
                                }
                            }

                        } else if (verificarExpresion(token, "^\\s?([a-zA-Z]+[0-9]*)\\s?(=)\\s*(([0-9])*|([a-zA-Z]+[0-9]*))([;]|(\\s*([+]|[-]|[*]|[/]))\\s*(([0-9])*|([a-zA-Z]+[0-9]*)))*\\s*;\\s$")) { //Agregar operaciones a las variables 
                            String partes[] = token.split("\\s");   //Dividimos de igual manera el token
                            partes[0] = partes[0].replaceAll(";", "");

                            if (guardaVariables.contains(partes[0])) {//Si la variable ya esta declarada proseguimos 
                                for (int i = 1; i < partes.length; i++) {

                                    switch (partes[i]) {
                                        case "=":

                                            break;
                                        case "+":

                                            break;
                                        case "-":

                                            break;
                                        case "*":

                                            break;
                                        case "/":

                                            break;
                                        default: //El default analizaria las variables!!
                                            partes[i] = partes[i].replaceAll(";", "");

                                            if (guardaVariables.contains(partes[i]) || guardarNumeros.contains(partes[i])) {//Si la variable declara no esta en el arreglo se guarda
                                                //System.out.println("Perfecto, ya esta declarada");

                                            } else if (!guardarNumeros.contains(partes[i])) {
                                                guardarNumeros.add(partes[i]);
                                                //System.out.println("Numero guardado en la pila");
                                            } else {
                                                //System.out.println("No esta declarado!!");   //Variable ya declarada
                                                errores2 += "Variable no declarada!" + "\n";
                                                error++;
                                            }
                                            break;
                                    }
                                }

                            } else {
                                errores2 += "Variable no declarada" + "\n";

                                error++;
                            }
                        }

                    } else if ((verificarExpresion(token, "^si[(]([a-zA-Z]+[0-9]*)+\\s(>|<|>=|<=|==|!=)\\s([0-9]*)[)][{]\\s*$"))) {
                        sino++;
                    } else if (verificarExpresion(token, "^[}]sino[{]\\s*$") && sino != 0) {
                        sino--;

                        llavesino++;
                        if (sino == 0) {
                            System.out.println("Operacion sino Declarado Correctamente");
                        }
                        //Falta cerrar la llave del sino
                    } else if (verificarExpresion(token, "^para[(]ent\\s([a-zA-Z]+[0-9]*)*\\s[=]\\s[0-9]+[;]\\s([a-zA-Z]+[0-9]*)+\\s*(>|<|>=|<=)\\s([0-9]*)[;]\\s*([a-zA-Z]+[0-9]*)+[+]{2}[)][{]\\s*")) {
                        llavepara++;
                        System.out.println("Ciclo Para declarado correctamente");
                    } else if ((verificarExpresion(token, "^hacer[{]\\s*$"))) {//hacer - mientras
                        mientras++;

                    } else if ((verificarExpresion(token, "^[}]mientras[(]([a-zA-Z]+[0-9]*)+\\s(>|<|>=|<=|==|!=)\\s([0-9]*)[)];\\s*$") && mientras != 0)) {
                        mientras--;
                        if (mientras == 0) {
                            System.out.println("Ciclo Hacer Mientras Declarado Correctamente");
                        }

                    } else if (verificarExpresion(token, "^mientras[(]([a-zA-Z]+[0-9]*)+\\s(>|<|>=|<=|==|!=)\\s([0-9]*)[)][{]\\s*$")) {
                        llavemientras++;
                        System.out.println("Ciclo Mientras Declarado Correctamente");
                    } else if (verificarExpresion(token, "[}]\\s*")) {
                        if (llavesino != 0) {
                            llavesino--;
                        } else if (llavemientras != 0) {
                            llavemientras--;
                        } else if (llavepara != 0) {
                            llavepara--;
                        } else if (llavemain != 0) {
                            llavemain--;
                        }
                    } else if (verificarExpresion(token, "\\s*")) {
                        System.out.println("Salto de linea");
                    } else {
                        errores2 += "Errores de sintaxis" + "\n";
                        error++;
                    }
                }

                if (error == 0 && llavemain == 0 && llavesino == 0 && llavepara == 0 && llavemientras == 0 && parentesis == 0) {
                    JOptionPane.showMessageDialog(this, "Analizador Lexico Compilado Con Exito");

                    tranformarLen(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Errores Al Compilar");
                    textConvert.setText("");
                    errores.setText(errores2);

                }
            } else {
                errores2 += "Falta el metodo main" + "\n";
                errores.setText(errores2);
            }

        }

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_compilarActionPerformed

    private void apTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apTablaActionPerformed
        //Aplicar tabla LR
        //Requerimos hacer uso de los dos arreglos de la tabla LR
        String[][] tablaLR = compilarTablaLR();//Contiene toda la tablaLR, nos guiaremos por posiciones 
        //[]Fila[]columna

        pilaEstados.add(0);

        String tokenEvaluar = "";
        String token = "";

        StringTokenizer st = new StringTokenizer(textCadena.getText(), "\n");
        String letra[];
        while (st.hasMoreTokens()) {
            token = st.nextToken();

            for (int i = 0; i < token.length(); i++) {
                tokenEvaluar += String.valueOf(token.charAt(i));
                if (")".equals(tokenEvaluar) || "(".equals(tokenEvaluar) || "$".equals(tokenEvaluar) || "ID".equals(tokenEvaluar) || "CN".equals(tokenEvaluar) || "=".equals(tokenEvaluar) || "+".equals(tokenEvaluar) || "-".equals(tokenEvaluar) || "*".equals(tokenEvaluar) || "/".equals(tokenEvaluar)) {//Si no pertenece a ningun token se trata de crear 
                    System.out.println("Token a usar " + tokenEvaluar);

                    switch (tokenEvaluar) {

                        case "ID"://Posicion 1 arreglo columnas 
                            letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][1].split("-");
                            aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            break;
                        case "CN"://Posicion 0 arreglo columnas 
                            letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][0].split("-");
                            aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            break;
                        case "+"://Posicion 11 arreglo columnas 
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][11].split("-");
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                            //System.out.println("Valores de la pila " + pilaEstados.toString());
                            break;
                        case "-"://Posicion 12 arreglo columnas 
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][12].split("-");
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                            break;
                        case "*"://Posicion 13 arreglo columnas 
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][13].split("-");
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                            break;
                        case "/"://Posicon 14 arreglo columnas 
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][14].split("-");
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                            break;
                        case "=":
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][5].split("-");//Ultimo estado de la pila,posicion del caracter
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                            // System.out.println("Valores de la pila " + pilaEstados.toString());
                            break;
                        case "$":
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][18].split("-");//Ultimo estado de la pila,posicion del caracter
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                            if ("ACC".equals(letra[0])) {
                                System.out.println("CADENA ACEPTADA");
                            }
                            break;
                        case "(":
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][16].split("-");
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                        case ")":
                            do {
                                letra = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][17].split("-");
                                aplicarTablaLR(letra, tablaLR);//Aplicamos la tabla 
                            } while ("R".equals(letra[0]));
                            break;

                        default:

                            break;

                    }
                    System.out.println("Valores de la pila " + pilaEstados.toString());
                    tokenEvaluar = "";
                }
            }

            pilaEstados.clear();
            pilaEstados.add(0);

        }
    }//GEN-LAST:event_apTablaActionPerformed
    public void aplicarTablaLR(String letra[], String tablaLR[][]) {
        String valor = "";
        String reduccion = "";
        int numero;
        if ("D".equals(letra[0])) {//Saber si es un Desplazamiento o una reduccion
            numero = Integer.parseInt(letra[1]);
            pilaEstados.add(numero);
        } else if ("R".equals(letra[0])) {

            numero = Integer.parseInt(letra[1]) - 1;//Si es reducciones obtenemos el numero de la reduccion
            for (int j = 0; j < Integer.valueOf(numReducciones[numero]); j++) {//Eliminar datos de la pila
                pilaEstados.remove(pilaEstados.size() - 1);
            }

            //Calcular la letra con el valor de la pila de Estados 
            valor = letraReduccion[numero];//Posicion de la letra a usar

            reduccion = tablaLR[pilaEstados.get(pilaEstados.size() - 1)][Integer.parseInt(valor)];//Obtenemos el nuevo valor
            System.out.println("Valor " + valor + " No.Reducciones -->" + reduccion);
            pilaEstados.add(Integer.parseInt(reduccion));//Añadimos el nuevo numero a la pila y volvemos a calcular

        }

    }

    public boolean verificarExpresion(String cadenaEvaluar, String expresion) {
        Pattern pat = Pattern.compile(expresion);//Compilamos la expresion regular
        Matcher match = pat.matcher(cadenaEvaluar);

        //Si la expresion es correcta, retornara un true
        return match.matches();
    }
//Este metodo sirve para Buscar el archivo y colocar en la variable contenido todo el texto del coumento
//Para plastamarlo en el JTextField 

    public String getArchivo(String ruta) {
        FileReader fr = null;
        BufferedReader br = null;
        String contenido = "";

        try {
            fr = new FileReader(ruta);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido += linea + "\n";
            }
        } catch (Exception ex) {
        } finally {
            try {
                br.close();
            } catch (Exception ex) {

            }
        }
        return contenido;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apTabla;
    private javax.swing.JButton buscarArchivo;
    private javax.swing.JButton compilar;
    private javax.swing.JButton eliminarTexto;
    private javax.swing.JTextPane errores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane textCadena;
    private javax.swing.JTextPane textConvert;
    private javax.swing.JTextPane texto;
    // End of variables declaration//GEN-END:variables
}
