/*
 * Materia: Estructura de datos
 * Nombre: Manuel Hernandez Hernandez
 * Feha: 05-10-2018
 * Laboratorio No: 1
 * Titulo: Vector de n elementos
 * Grupo: Sistemas Computacionales 3"A
 * Descripcion General de La Clase: Este programa contiene un vector de n elemtos
 * y perimte leer un archivo de texto y realiza operaciones como:
 * modificar,insertar,elimiar,ordenar y buscar.
 */
package Lab01PR02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author HugoLuna
 */
public class Utils {

    
    //leyendo txt con el selector de archivos
    public static File filesSelector() {
        File file = null;
        try {

            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            jfc.setMultiSelectionEnabled(true);
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            jfc.setFileFilter(filter);

            jfc.setDialogTitle("Selecciona un archivo");
            int returnValue = jfc.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {

                file = jfc.getSelectedFile();

            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return file;

    }
    // metodo para leer el archivo de texto
    public static String[] readFile(String archivo) {
        int contador = 0;
        Scanner entrada = null;
        Scanner entrada2 = null;
        int contadorTamano = 0;
        String vector[] = null;
        try {
            //leyendo el archivo atravez de Scanner
            entrada = new Scanner(new FileReader(archivo));
            entrada2 = new Scanner(new FileReader(archivo));
            // iteracion 
            while (entrada.hasNextInt()) {
                int d = entrada.nextInt();
                contadorTamano++;
            }
            // variable vector de tipo string donde almacena el contador del tamaño
            vector = new String[contadorTamano];
            //segunda iteracion al leer el archivo
            while (entrada2.hasNextInt()) {
                int d2 = entrada2.nextInt();
                vector[contador] = String.valueOf(d2);
                contador++;
            }
            //validacion del programa al no encontrar archivo
        } catch (FileNotFoundException e) {
            System.out.println("Error abriendo el fichero: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error");
        } finally {
            
            if (entrada != null && entrada2 != null) {
                entrada.close();
                entrada2.close();
            }
        }

        return vector;

    }

    //metodo del contador del archivo de texto
    public static int count(String archivo) {
        int contador = 0;
        // Scanner se utiliza para leer las entradas de los archivos
        Scanner entrada = null;
        Scanner entrada2 = null;
        int contadorTamano = 0;
        //definir como nulo el vector de tipo string
        String vector[] = null;
        try {
            //llama al archivo de texto atraves de la entrada Scanner
            entrada = new Scanner(new FileReader(archivo));
            entrada2 = new Scanner(new FileReader(archivo));
            //iterador que verifica y recorre los datos del archivo de texto
            while (entrada.hasNextInt()) {
                int d = entrada.nextInt();
                contadorTamano++;
            }
            //realiza la segunda entrada de Scanner
            vector = new String[contadorTamano];
            //iterador para la 2da entrada 
            while (entrada2.hasNextInt()) {
                int d2 = entrada2.nextInt();
                vector[contador] = String.valueOf(d2);
                contador++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error abriendo el fichero: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error");
        } finally {
            if (entrada != null && entrada2 != null) {
                entrada.close();
                entrada2.close();
            }
        }

        return vector.length;

    }
    
    
    //metodo para recorrer los datos 
    public static String data(String vector[]){
        String datos = "";
        for (int i = 0; i < vector.length; i++) {
            datos = datos + " "+vector[i];
            
        }
        
        return datos;
        
    }
    
    //medoto para escibir en el archivo txt
     public static void escribirarchivo(String informacionarchivo, String fileURL) {
        try {// validacion 
            //librerias para leer un archivo y escribir
            FileWriter fw = new FileWriter(fileURL);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(informacionarchivo);
            salida.close();
        } catch (IOException exepcion) {// fin validacion

        }
    }
    
     // elimina los datos que se muestran en la interfaz
     public static String deleteNumber(String vector[],String number){
         String auxiliar = "";
         //ciclo que recorre el vector
         for (int i = 0; i < vector.length; i++) {
             if (!vector[i].equals(number)) {
                 auxiliar = auxiliar + " "+vector[i];
             }
             
         }
         
         return auxiliar;
         
         
     }
     
     //metodo para convertir datos a entero
     public static int[] convertToInt(String vector[]){
         //vector de tipo entero
         int vectorInt[] = new int[vector.length];
         
         //ciclo que recorre el vector y a su vez cambia el tipo de dato
         for (int i = 0; i < vectorInt.length; i++) {
             //casting para cambiar el tipo de dato
            vectorInt[i] = Integer.parseInt(vector[i]);
             
         }
         
         return vectorInt;
         
     }
     
     //metodo para buscar dentro del txt
    public static String search(String vector[],String number){
         String auxiliar = "";
         for (int i = 0; i < vector.length; i++) {
             if (vector[i].equals(number)) {
                 auxiliar = auxiliar + "Encontrado en la posición"+i;
             }
             
         }
         
         return auxiliar;
         
         
     }     
    
    
    public static String[] ordenarConBurbuja(String vector[]){
    //Obtiene el numero de elementos del vector
    int n = vector.length,aux = 0;
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                if (Integer.parseInt(vector[j]) > Integer.parseInt(vector[j+1])) {
                    aux = Integer.parseInt(vector[j]);
                    
                    vector[j] = vector[j+1];
                    vector[j+1] = String.valueOf(aux);
                }
                
            }
            
        }
        return vector;
    
    }
}