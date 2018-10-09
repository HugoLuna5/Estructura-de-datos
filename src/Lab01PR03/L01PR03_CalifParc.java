package Lab01PR03;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class L01PR03_CalifParc extends Component {
    static FileReader fr;
    static String datMatriz = "";
    static ArrayList<ArrayList<Double>> matriz = new ArrayList();
    static ArrayList<Double> promAlumnos = new ArrayList();
    public static void main(String[] args) {

        L01PR03_CalifParc obj = new L01PR03_CalifParc();
        try{
            if(obj.selectFile()){
                obj.readFile();
                obj.enterData();
                obj.printMatriz();
                System.out.println();
                System.out.println(obj.averageStudent());
                System.out.println(obj.averageGroup());
                System.out.println(obj.averageMinMaxGroup());
            }

        }catch (NumberFormatException e){
            System.err.println("Alguno de los datos en el archivo no es un número, verifique sus datos");
        }catch (IndexOutOfBoundsException p){
            System.err.println("La posición especificada no existe");
        }
    }

    public boolean selectFile(){

        boolean encontrado = false;

        try {
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT", "txt");
            file.setFileFilter(filter);
            file.showOpenDialog(this);
            /**abrimos el archivo seleccionado*/
            File ruta =file.getSelectedFile();
            if(ruta != null){
                fr = new FileReader(ruta);
                encontrado = true;
            }
        } catch (FileNotFoundException e) {
                 JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
        return encontrado;
    }

    public void readFile(){
        BufferedReader br = new BufferedReader(fr);
        String datos = null;
        try {
            datos = br.readLine();
            while (datos != null){
                datMatriz += datos + "\n";
                datos = br.readLine();
            }
            fr.close();
            br.close();
        } catch (IOException e) {
                 JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }

    public void enterData(){
        int contador = -1;
        String num = "";
        for (int i = 0; i < datMatriz.length(); i++) {
            int aux = datMatriz.charAt(i)+ "".hashCode();

            if(i == 0){
                matriz.add(new ArrayList<Double>());
                contador ++;
            }

            if(aux != 32 && aux != 10){
                num += datMatriz.charAt(i);
            }else {
                if(num.hashCode() != 0 ){
                    matriz.get(contador).add(Double.parseDouble(num));
                }
                num = "";
            }

            if(aux == 10 && ((i +1) != datMatriz.length()) && (datMatriz.charAt(i + 1)+ "".hashCode()) != 10){
                matriz.add(new ArrayList<Double>());
                contador++;
            }


        }
    }

    public void printMatriz(){

        for(int i = 0; i < matriz.size(); i++){  //para cada alumno (para cada fila)
            for(int j = 0; j < matriz.get(i).size(); j++){  //se recorre todas la columnas de la fila
                System.out.print(matriz.get(i).get(j) + " "); //se obtiene el elemento i,j
            }
            System.out.println();
        }
    }

    public String averageStudent(){
        double suma, prom;
        String est = "";
        for(int i = 0; i < matriz.size(); i++){
            suma = 0;
            for(int j = 0; j < matriz.get(i).size(); j++){
                //System.out.print(matriz.get(i).get(j) + " ");
                suma += matriz.get(i).get(j);

            }
            prom = suma / matriz.get(i).size();
            est += "Estudiante " + (i + 1) + ": "+ prom + "\n";
            promAlumnos.add(prom);
        }
        return est;
    }

    public String averageGroup(){
        double suma = 0, prom;
        String grup = "";
        for (int i = 0; i < promAlumnos.size(); i++) {
            suma += promAlumnos.get(i);
        }
        prom = suma / promAlumnos.size();
        grup = "El promedio del grupo es: " + prom;
        return grup;
    }

    public String averageMinMaxGroup(){
        double min = promAlumnos.get(0);
        double max = promAlumnos.get(1);
        int posMin = 0, posMax = 1;
        String minMaxGrup = "";
        if(min > max){
            min = promAlumnos.get(1);
            posMin = 1;
            max = promAlumnos.get(0);
            posMax = 0;
        }
        for (int i = 2; i < promAlumnos.size(); i++) {
            if(promAlumnos.get(i) < min){
                min = promAlumnos.get(i);
                posMin = i;
            }

            if(promAlumnos.get(i) > max){
                max = promAlumnos.get(i);
                posMax = i;
            }
        }
        minMaxGrup = "El promedio mínimo del grupo es "+ min + " del estudiante " + (posMin + 1) +
                "\nEl promedio máximo del grupo es "+ max + " del estudiante " + (posMax + 1);
        return minMaxGrup;
    }



}
