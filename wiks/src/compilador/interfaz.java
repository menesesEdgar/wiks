package compilador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class interfaz extends javax.swing.JFrame {

   
    boolean bandera = true;

    public interfaz() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jScrollPane1.setViewportView(texto);

        jScrollPane2.setViewportView(errores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buscarArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(compilar)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarTexto)
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarArchivo)
                    .addComponent(eliminarTexto)
                    .addComponent(compilar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 660));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarTextoActionPerformed

    public String getToken(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            String linea = lista[i];
            for (int j = 0; j < linea.length(); j++) {

            }

        }
        return "";
    }
    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
        int error=0;
        int contVar=0,contCons=0;
        texto.getText();
        int sino = 0, mientras = 0;
        int llavesino = 0, llavemain = 0, llavepara = 0, llavemientras = 0;
        String token = "";
        StringTokenizer st = new StringTokenizer(texto.getText(), "\n");

        while (st.hasMoreTokens()) {
            token = st.nextToken();
            System.out.println(token);
            if (verificarExpresion(token, "^Main[(][)][{]\\s*$")) {
                llavemain++;
                System.out.println("Correcto");
                while (st.hasMoreTokens()) {
                    token = st.nextToken();
                    System.out.println(token);
                    if (verificarExpresion(token, "^(ent|dec|text|bin)\\s([a-zA-Z]+[0-9]*);\\s*$") || verificarExpresion(token, "^leer[(]([a-zA-Z]+[0-9]*|[']([A-Za-z0-9][\\s]?)*['])[)];\\s*$") || verificarExpresion(token, "^capturar\\s([a-zA-Z]+[0-9]*)+;\\s*$")) {
                        System.out.println("Variable declarada correctamente");
                        if(verificarExpresion(token, "^(ent)\\s([a-zA-Z]+[0-9]*);\\s*$")){
                            String partes[] = token.split("\\s");
                            
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
                    } else if(verificarExpresion(token, "\\s*")){
                        System.out.println("Salto de linea");
                    }else{
                        System.out.println("Error de Sintaxis");
                        error++;
                    } 
                }

                if (error == 0 && llavemain == 0 && llavesino == 0 && llavepara == 0 && llavemientras == 0) {
                    JOptionPane.showMessageDialog(this, "Analizador Lexico Compilado Con Exito");
                } else {
                    JOptionPane.showMessageDialog(this, "Errores Al Compilar");
                }
            } else {
                System.out.println("Metodo Main incorrecto");
            }

        }

        try {
            analizadorSintactico analizador = new analizadorSintactico();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_compilarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarArchivo;
    private javax.swing.JButton compilar;
    private javax.swing.JButton eliminarTexto;
    private javax.swing.JTextPane errores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane texto;
    // End of variables declaration//GEN-END:variables
}
