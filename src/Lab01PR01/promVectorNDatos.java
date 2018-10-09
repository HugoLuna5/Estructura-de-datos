/**
 * Materia: Estructura de Datos
 * Nombre: Manuel Hernandez Hernandez
 * Feha:  05-10-2018
 * Laboratorio No: 1
 * Titulo: Calcula Promedio Con datos n datos ingresados por teclado e implementado en un metodo
 * Grupo: Sistemas Tercero A
 * Descripcion General de La Clase: Calcula el promedio
 * de un conjunto de n datos ingresados por teclado e implementado en un metodo.
 * Equipo 4
 */
package Lab01PR01;
//importacion de librerias
import java.util.InputMismatchException;
import java.util.Scanner;

public class promVectorNDatos {

//metodo main
    public static void main(String[] args) {

        try{
            // se llama a la libreria Scanner
            Scanner t = new Scanner(System.in);
            //declara e inicializa variable para delarar el tamaño de el vector
            int tamVector = 0;

            //pide al usuario que ingrese el tamaño de el vector
            System.out.println("Ingrese el número de datos");
            tamVector = t.nextInt();

//se declara el vector
            float vector[] = new float[tamVector];
//llamado  al metodo para llenar las casillas de el vector
            vector = enterData(vector, tamVector, t);

            //llamado al metodo para mostrar el vector ingresado
            System.out.println("Datos");
            showData(vector, tamVector);
            //llamado ala implementacion de el metodo para mostrar el promedio de lso datos ingresados
            System.out.println("Promedio");
            System.out.println(metodoPromedio.promedio(vector,tamVector));
            
            //excepciones para impedir los errores
        }catch (InputMismatchException input){
            System.out.println("Error stackOverflowError: "+input.getMessage());
        }catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }



    }

//metodo para el llenado de el vector introducido por el usuario
    public static float[] enterData(float vector[],int tamVector, Scanner t){

        for (int i = 0; i < tamVector; i++) {
            System.out.println("Ingrese el valor de la posición: "+(i+1));
            vector[i] = t.nextFloat();
        }


        return vector;
    }
//metodo para mostrar el vector ya ingresado
    public static void showData(float vector[], int tamVector){

        for (int i = 0; i < tamVector; i++) {
            System.out.println(vector[i]);
        }
    }
}
