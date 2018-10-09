/**
 * Materia: Estructura de Datos
 * Nombre: Manuel Hernandez Hernandez
 * Feha: 05-10-2018
 * Laboratorio No: 1
 * Titulo: Calcula Promedio Con datos ingresados por el usuario conn implementacion de Metodo
 * Grupo: Sistemas Tercero A
 * Descripcion General de La Clase: implemetnacion de el metodo para calcular el promedio de la clase
 * Equipo 4
 */
package Lab01PR01;

/**
 *
 * @author gustavo
 */
public class metodoPromedio {
    
    //la implementacion deek metodo paracalcula el promedio de el vector
    public static float promedio(float vector[],int tamVector){
        //se inicializa y declaran las variables 
        float auxiliar = 0;
        float promedio = 0;
        
        //ciclo que hace la suma de los elementos almacenados en el vector
        for (int i = 0; i < tamVector; i++) {
            
                auxiliar = auxiliar + vector[i];
            }
        //calcula el promedio ya teniendo la suma entre el tamaño de el vector
            promedio = auxiliar / tamVector;
        
        
       //regresa el promedio
        return promedio;
    }
    
        public static float promedioN(float vectorN[],int tamV){
        //se inicializa y declaran las variables 
        float auxiliar = 0;
        float promedio = 0;
        
        //ciclo que hace la suma de los elementos almacenados en el vector
        for (int i = 0; i < tamV; i++) {
            
                auxiliar = auxiliar + vectorN[i];
            }
        //calcula el promedio ya teniendo la suma entre el tamaño de el vector
            promedio = auxiliar / tamV;
        
        
       //regresa el promedio
        return promedio;
    }
    
    
    
    
}
