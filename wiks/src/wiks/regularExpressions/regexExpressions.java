package wiks.regularExpressions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.*;

public class regexExpressions {

    public static void main(String[] args) {
        //compilarTablaLR();
//        String main = "^main[(][)][{]\\s+$";//funciona
//        
//        String ent = "^(ent|dec|text|bin)\\s([a-zA-Z]+[0-9]*);$";//funciona
//        String entDeclarada = "^(ent)\\s([a-zA-Z]+[0-9]*)\\s?(=)\\s?([0-9])*;$";//funciona
        String operacion = "^(ent)\\s([a-zA-Z]+[0-9]*)\\s?(=)\\s*(([0-9])*|([a-zA-Z]+[0-9]*))([;]|(\\s*([+]|[-]|[*]|[/]))\\s*(([0-9])*|([a-zA-Z]+[0-9]*)))*\\s*;$";
        //      String entDeclarada = "^(ent)\\s([a-zA-Z]+[0-9]*)\\s?(=)\\s?([0-9]*|([a-zA-Z]+[0-9]*))\\s?(;|(([\\+|\\-|\\*|\\/]?)\\s?[(]?([0-9]*|([a-zA-Z]+[0-9]*)))))*$";//funciona       
//        String leer = "^leer[(]([a-zA-Z]+[0-9]*|[']([A-Za-z0-9][\\s]?)*['])[)];$";//Funciona, falta ver si quiero permitir o no espacios

//        String capturar = "^capturar\\s([a-zA-Z]+[0-9]*)+;$";//Funciona, falta ver la cantidad de espacio que quiero permitir
//       
        // String sisino = "^si[(]([a-zA-Z]+[0-9]*)+\\s(>|<|>=|<=|==|!=)\\s([0-9]*)[)][{][}]sino[{]\\s*[}]$";//Funciona
//       
//        String para = "^para[(]ent\\s([a-zA-Z]+[0-9]*)*\\s[=]\\s[0-9]+[;]\\s([a-zA-Z]+[0-9]*)+\\s*(>|<|>=|<=)\\s([0-9]*)[;]\\s*([a-zA-Z]+[0-9]*)+[+]{2}[)]";//Funciona solo de ver espacios
//        
//        
//        String mientras = "^mientras[(]([a-zA-Z]+[0-9]*)+\\s(>|<|>=|<=|==|!=)\\s([0-9]*)[)][{]\\s+[}]$";//Funciona
//        
//        String hacermientras = "^hacer[{]\\s*[}]mientras[(]([a-zA-Z]+[0-9]*)+\\s(>|<|>=|<=|==|!=)\\s([0-9]*)[)];$";
//        
//        String comentario = "^[$]\\s+([a-zA-Z]+[0-9]*)\\s*[$]$";//Funciona
        //String pruebas = "[+]";
        //String ePruebas = "";
        //verificarExpresion(ePruebas, pruebas);
        String ejemploent = "ent dato1 = dato + datop;";
        //String ejemplooperacion = "dato1 =(dato;";
//        String ejemploleer = "leer('Esto es un ejemplo');";
//        String ejemplocapturar = "capturar dato213as;";
//        String ejemplosisino = "si(edgar123 != 12){}sino{}";
//        String ejemplopara = "para(ent dato1a = 12; dato1a > 10;dato++)";
//        String ejemplomientras = "mientras(edgar >= 12){ }";
//        String ejemplohacermientras = "hacer{ }mientras(dati1 != 10);";
//        String ejemplocomentario = "$  hola  $";
//        String ejemploMain = "main(){ ";
//        
//        verificarExpresion(ejemploMain, main);
        verificarExpresion(ejemploent, operacion);
        // verificarExpresion(ejemplooperacion, operacion);
//        verificarExpresion(ejemplopara, para);
//        verificarExpresion(ejemplomientras, mientras);
//        verificarExpresion(ejemplohacermientras, hacermientras);
//        verificarExpresion(ejemploleer, leer);
//        verificarExpresion(ejemplocapturar, capturar);
//        verificarExpresion(ejemplosisino, sisino);
//        verificarExpresion(ejemplocomentario, comentario);

    }

    public static void verificarExpresion(String cadenaEvaluar, String expresion) {
        Pattern pat = Pattern.compile(expresion);//Compilamos la expresion regular
        Matcher match = pat.matcher(cadenaEvaluar);

        if (match.matches()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

    public static void compilarTablaLR() {
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

    }

}
