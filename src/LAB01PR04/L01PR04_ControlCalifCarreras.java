package LAB01PR04;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class L01PR04_ControlCalifCarreras extends Component {
    static FileReader fr;
    static String datMatriz = "";
    static ArrayList<ArrayList> matriz = new ArrayList();
    static ArrayList<ArrayList> promEstud = new ArrayList();
    static ArrayList nombreCarreras = new ArrayList();

    public static void main(String[] args) {
        L01PR04_ControlCalifCarreras obj = new L01PR04_ControlCalifCarreras();

        try {
            if (obj.selectFile()) {
                obj.readFile();
                obj.enterData();
                obj.printMatriz();
                System.out.println();
                System.out.println(obj.averageGenStudent());
                obj.nombreCarre();
                obj.promPorCarrera();
                obj.promMinMaxCarrera();
                obj.promMinMaxTodCarreras();
            }

        } catch (NumberFormatException e) {
            System.err.println("Alguno de los datos en las calificaciones no es un número, verifique sus datos");
        } catch (IndexOutOfBoundsException p) {
            System.err.println("La posición especificada no existe");
            p.printStackTrace();
        }
    }

    public boolean selectFile() {

        boolean encontrado = false;

        try {
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT", "txt");
            file.setFileFilter(filter);
            file.showOpenDialog(this);
            /**abrimos el archivo seleccionado*/
            File ruta = file.getSelectedFile();
            if (ruta != null) {
                fr = new FileReader(ruta);
                encontrado = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado");
        }
        return encontrado;
    }

    public void readFile() {
        BufferedReader br = new BufferedReader(fr);
        String datos = null;
        try {
            datos = br.readLine();
            while (datos != null) {
                datMatriz += datos + "\n";
                datos = br.readLine();
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            System.err.println("Ha ocurrido un error");
        }
    }

    public void enterData() {
        int contador = -1;
        String num = "";
        for (int i = 0; i < datMatriz.length(); i++) {
            int aux = datMatriz.charAt(i) + "".hashCode();

            if (i == 0) {
                matriz.add(new ArrayList());
                contador++;
            }

            if (aux != 32 && aux != 10) {
                num += datMatriz.charAt(i);
            } else {
                if (num.hashCode() != 0) {
                    matriz.get(contador).add(num);
                }
                num = "";
            }

            if (aux == 10 && ((i + 1) != datMatriz.length()) && (datMatriz.charAt(i + 1) + "".hashCode()) != 10) {
                matriz.add(new ArrayList());
                contador++;
            }


        }
    }

    public void printMatriz() {

        for (int i = 0; i < matriz.size(); i++) {  //para cada alumno (para cada fila)
            for (int j = 0; j < matriz.get(i).size(); j++) {  //se recorre todas la columnas de la fila
                System.out.print(matriz.get(i).get(j) + " "); //se obtiene el elemento i,j
            }
            System.out.println();
        }
    }

    public String averageGenStudent() {
        double suma, prom;
        String est = "";

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    promEstud.add(new ArrayList());
                }
                promEstud.get(i).add(matriz.get(i).get(j));

            }
            promEstud.add(new ArrayList());
        }

        System.out.println("Promedio por estudiante: ");
        for (int i = 0; i < matriz.size(); i++) {
            suma = 0;
            for (int j = 3; j < matriz.get(i).size(); j++) {
                //System.out.print(matriz.get(i).get(j) + " ");
                suma += Double.parseDouble("" + matriz.get(i).get(j));

            }
            prom = suma / (matriz.get(i).size() - 3);
            est += "" + promEstud.get(i).get(0) + ": " + prom + "\n";
            promEstud.get(i).add(prom);
        }

       /* for (int i = 0; i < promEstud.size(); i++) {
            for (int j = 0; j < promEstud.get(i).size(); j++) {
                //System.out.print(promEstud.get(i).get(j) + "  ");
                est += promEstud.get(i).get(j) + "  ";
            }
            //System.out.println();
            est += "\n";
        }*/

        return est;
    }

    public void nombreCarre() {
        nombreCarreras.add(promEstud.get(0).get(2));
        boolean agregarCarrera = true;
        for (int i = 0; i < promEstud.size(); i++) {
            for (int j = 2; j < promEstud.get(i).size() - 1; j++) {
                agregarCarrera = true;
                for (int k = 0; k < nombreCarreras.size(); k++) {
                    if ((promEstud.get(i).get(j)).equals(nombreCarreras.get(k))) {
                        agregarCarrera = false;
                    }
                }
                if (agregarCarrera) {
                    nombreCarreras.add(promEstud.get(i).get(j));
                }
            }
        }

    }

    public void promPorCarrera() {
        String infoPromPorCarrera = "";
        double suma = 0;
        double promedio = 0;
        int contador = 0;
        for (int i = 0; i < nombreCarreras.size(); i++) {
            suma = 0;
            contador = 0;
            for (int j = 0; j < promEstud.size(); j++) {
                for (int k = 2; k < promEstud.get(j).size() - 1; k++) {
                    if ((nombreCarreras.get(i)).equals(promEstud.get(j).get(k))) {
                        suma += Double.parseDouble("" + promEstud.get(j).get(3));
                        contador++;
                    }
                }
            }
            promedio = suma / contador;
            infoPromPorCarrera += "El promedio de la carrera de " + nombreCarreras.get(i) + " es: " + promedio + "\n";
        }

        System.out.println(infoPromPorCarrera);
    }

    public void promMinMaxCarrera() {
        double min = Double.parseDouble("" + promEstud.get(0).get(3));
        double max = Double.parseDouble("" + promEstud.get(1).get(3));
        int posMin = 0;
        int posMax = 1;
        String infoPromMinMaxCarrera = "";

        if ((Double.parseDouble("" + promEstud.get(0).get(3))) > (Double.parseDouble("" + promEstud.get(1).get(3)))) {
            min = Double.parseDouble("" + promEstud.get(1).get(3));
            max = Double.parseDouble("" + promEstud.get(0).get(3));
            posMin = 1;
            posMax = 0;
        }

        for (int i = 0; i < nombreCarreras.size(); i++) {
            for (int j = 0; j < promEstud.get(i).size(); j++) {
                if ((nombreCarreras.get(i)).equals(promEstud.get(j).get(2))) {
                    if (Double.parseDouble("" + promEstud.get(j).get(3)) > max) {
                        max = Double.parseDouble("" + promEstud.get(j).get(3));
                        posMax = j;
                    }

                    if (Double.parseDouble("" + promEstud.get(j).get(3)) < min) {
                        min = Double.parseDouble("" + promEstud.get(j).get(3));
                        posMin = j;
                    }
                }

            }
            infoPromMinMaxCarrera += "El promedio mínimo de la carrera " + nombreCarreras.get(i) + " es " + min +
                    " por el alumno(a) " + promEstud.get(posMin).get(0) + "\n" + "El promedio máximo de la carrera " +
                    nombreCarreras.get(i) + " es " + max + " por el alumno(a) " + promEstud.get(posMax).get(0) + "\n";
        }

        System.out.println(infoPromMinMaxCarrera);
    }

    public void promMinMaxTodCarreras() {
        int posMin = 0;
        int posMax = 1;
        double promMin = Double.parseDouble(""+ promEstud.get(0).get(3));
        double promMax = Double.parseDouble(""+ promEstud.get(1).get(3));
        String infoTodCarreras = "";

        if(promMin > promMax){
            promMin = Double.parseDouble(""+ promEstud.get(1).get(3));
            promMax = Double.parseDouble(""+ promEstud.get(0).get(3));
            posMin = 1;
            posMax = 0;
        }


        for (int i = 0; i < promEstud.size(); i++) {
            for (int j = 3; j < promEstud.get(i).size(); j++) {
                if((Double.parseDouble(""+promEstud.get(i). get(j)) < (promMin))){
                    promMin = Double.parseDouble(""+promEstud.get(i). get(j));
                    posMin = i;
                }

                if((Double.parseDouble(""+promEstud.get(i). get(j)) > (promMax))){
                    promMax = Double.parseDouble(""+promEstud.get(i). get(j));
                    posMax = i;
                }

            }

        }

        System.out.println("El promedio mínimo de todas las carreras es "+ promMin + " del alumno(a) " +
                promEstud.get(posMin).get(0) + " carrera " + promEstud.get(posMin).get(2) + "\n" +
                "El promedio máximo de todas las carreras es " + promMax + " del alumno(a) " +
                promEstud.get(posMax).get(0) + " carrera " + promEstud.get(posMax).get(2) + "\n");

    }

}
