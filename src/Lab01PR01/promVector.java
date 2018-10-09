/**
 * Materia: Estructura de Datos
 * Nombre: Manuel Hernandez Hernandez
 * Feha:  05-10-2018
 * Laboratorio No: 1
 * Titulo: Calcula Promedio Con datos predefinitos
 * Grupo: Sistemas Tercero A
 * Descripcion General de La Clase: Calcula el promedio
 * de un conjunto de datos predefinidos el arreglo.
 * Equipo 4
 */
package Lab01PR01;
//importacion de librerias
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class promVector {        
    public static void main(String[] args) {
        try{
            //inicializa a 10 datos
            int tamVector = 10;
            // declara el arreglo y su tamaño
            float vector[] = new float[tamVector];
            //llama al metodo para generar los datos de el vectos
            vector = generateData(vector, tamVector);

            //muestra el vector
            System.out.println("Datos");
            showData(vector, tamVector);
            //calcula el promedio de la suma de los elementos de el vector
            System.out.println("Promedio");
            System.out.println(metodoPromedio.promedio(vector,tamVector));
            //excepciones para impedir errores
        }catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }catch (StackOverflowError stackOverflowError){
            System.out.println("Error stackOverflowError: "+stackOverflowError.getMessage());
        }                       
    }
    
    //llena los espacios de el vector con numeros aleatorios
    public static float[] generateData(float vector[],int tamVector){
        
        for (int i = 0; i < tamVector; i++) {
               vector[i] = (float) (Math.random() * 10);           
        }
        
        
        return vector;
    }
    //muestra el vector ya generado en la clase main
    public static void showData(float vector[], int tamVector){

        for (int i = 0; i < tamVector; i++) {
            System.out.println(vector[i]);
        }
    }
    
    
}
