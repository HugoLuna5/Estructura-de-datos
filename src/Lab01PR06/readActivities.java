/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01PR06;


import LAB01PR04.L01PR04_ControlCalifCarreras;
import Lab01PR01.metodoPromedio;
import Lab01PR02.vectorNElementosTXT;
import Lab01PR03.L01PR03_CalifParc;
import Lab01PR05.readImage;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class readActivities extends javax.swing.JFrame {

    /**
     * Creates new form readImage
     */
    public readActivities() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAcercaDe = new javax.swing.JButton();
        btnAct1 = new javax.swing.JButton();
        btnAct2 = new javax.swing.JButton();
        btnAct3 = new javax.swing.JButton();
        btnAct4 = new javax.swing.JButton();
        btnAct5 = new javax.swing.JButton();
        btnInfoAct1 = new javax.swing.JButton();
        btnInfoAct2 = new javax.swing.JButton();
        btnInfoAct3 = new javax.swing.JButton();
        btnInfoAct4 = new javax.swing.JButton();
        btnInfoAct5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Baghdad", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LAB01_Programas_EQ4");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 60, 310, 30);

        jLabel3.setFont(new java.awt.Font("Baghdad", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Practica 1:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 20, 280, 30);

        btnAcercaDe.setText("Acerca de");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcercaDe);
        btnAcercaDe.setBounds(280, 380, 120, 40);

        btnAct1.setText("Actividad 1");
        btnAct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAct1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAct1);
        btnAct1.setBounds(210, 150, 120, 40);

        btnAct2.setText("Actividad 2");
        btnAct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAct2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAct2);
        btnAct2.setBounds(210, 190, 120, 40);

        btnAct3.setText("Actividad 3");
        btnAct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAct3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAct3);
        btnAct3.setBounds(210, 230, 120, 40);

        btnAct4.setText("Actividad 4");
        btnAct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAct4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAct4);
        btnAct4.setBounds(210, 270, 120, 40);

        btnAct5.setText("Actividad 5");
        btnAct5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAct5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAct5);
        btnAct5.setBounds(210, 310, 120, 40);

        btnInfoAct1.setText("Info. actividad 1");
        btnInfoAct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAct1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfoAct1);
        btnInfoAct1.setBounds(370, 150, 130, 40);

        btnInfoAct2.setText("Info. actividad 2");
        btnInfoAct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAct2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfoAct2);
        btnInfoAct2.setBounds(370, 190, 130, 40);

        btnInfoAct3.setText("Info. actividad 3");
        btnInfoAct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAct3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfoAct3);
        btnInfoAct3.setBounds(370, 230, 130, 40);

        btnInfoAct4.setText("Info. actividad 4");
        btnInfoAct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAct4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfoAct4);
        btnInfoAct4.setBounds(370, 270, 130, 40);

        btnInfoAct5.setText("Info. actividad 5");
        btnInfoAct5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAct5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfoAct5);
        btnInfoAct5.setBounds(370, 310, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen fondo pr1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 710, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "\n"
                + "Materia: Estructura de Datos\n"
                + "Nombre: Manuel Hernandez Hernandez\n"
                + "Feha: 05-10-2018\n"
                + "Laboratorio No: 1\n"
                + "Titulo: Alumno\n"
                + "Grupo: Sistemas Tercero A\n"
                + "Equipo numero 5 \n"
                + "Integrantes:\n"
                + "Gustavo Martinez Licona \n"
                + "Hugo Dario Luna Cruz\n"
                + "Gerardo Facundo Del Angel");
    }//GEN-LAST:event_btnAcercaDeActionPerformed

    private void btnAct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAct3ActionPerformed

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
                 JOptionPane.showMessageDialog(null, "Alguno de los datos en el archivo no es un número, verifique sus datos");
        }catch (IndexOutOfBoundsException p){
               JOptionPane.showMessageDialog(null, "La posición especificada no existe");
        }
    }//GEN-LAST:event_btnAct3ActionPerformed
    static FileReader fr;
    static String datMatriz = "";
    static ArrayList<ArrayList<Double>> matriz = new ArrayList();
    static ArrayList<Double> promAlumnos = new ArrayList();
    private void btnAct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAct4ActionPerformed
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
              JOptionPane.showMessageDialog(null, "Alguno de los datos en las calificaciones no es un número, verifique sus datos");
        } catch (IndexOutOfBoundsException p) {
                JOptionPane.showMessageDialog(null, "La posición especificada no existe");
            p.printStackTrace();
        }
    }//GEN-LAST:event_btnAct4ActionPerformed

    static ArrayList<ArrayList> promEstud = new ArrayList();
    static ArrayList nombreCarreras = new ArrayList();

    private void btnAct5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAct5ActionPerformed
        // TODO add your handling code here:
        readImage pr5 = new readImage();
        pr5.setVisible(true);
    }//GEN-LAST:event_btnAct5ActionPerformed

    private void btnAct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAct1ActionPerformed
        // TODO add your handling code here:

        int op = 0;
        String menu = "";
        try {
            do {

                menu = "";
                menu += "****** Menú ******\n";
                menu += "1 para ara ejecutar el programa por datos predefinidos\n";
                menu += "2 para ejecutar el programa por datos ingresados \n";
                menu += "3 para regresar a la ventana principal\n";
                menu += "Elija una opción";
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (op) {
                    case 1:

                        int tamVector = 10;
                        float vector[] = new float[tamVector];

                        vector = generateData(vector, tamVector);

                        showData(vector, tamVector);

                        JOptionPane.showMessageDialog(null, "Promedio" + metodoPromedio.promedio(vector, tamVector));

                        break;
                    case 2:
                        int tamV = 0;
                        tamV = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos"));

                        float vectorN[] = new float[tamV];
                        vectorN = enterDataN(vectorN, tamV);
                        showDataN(vectorN, tamV);
                        JOptionPane.showMessageDialog(null, "Promedio" + metodoPromedio.promedioN(vectorN, tamV));
                        break;
                    case 3:
                        if (op == 3) {
                            JOptionPane.showMessageDialog(null, "regresando a ventana principal");
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "selecciona un numero del 1 al 3");
                        break;
                }
            } while (op != 3);
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, ("Error: " + e.getMessage()));
        } catch (StackOverflowError stackOverflowError) {
               JOptionPane.showMessageDialog(null, ("Error stackOverflowError: " + stackOverflowError.getMessage()));
        }

    }//GEN-LAST:event_btnAct1ActionPerformed

    public static float[] generateData(float vector[], int tamVector) {

        for (int i = 0; i < tamVector; i++) {
            vector[i] = (float) (Math.random() * 10);
        }

        return vector;
    }

    public static void showData(float vector[], int tamVector) {

        String cad = "";
        for (int i = 0; i < tamVector; i++) {
            cad += vector[i] + " \n";
        }
        cad += "\n";
        JOptionPane.showMessageDialog(null, "Datos generados: \n" + cad);
    }

    public static float[] enterDataN(float vectorN[], int tamV) {

        for (int i = 0; i < tamV; i++) {

            vectorN[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la posición: " + (i + 1)));

        }

        return vectorN;
    }

    public static void showDataN(float vectorN[], int tamV) {

        String cad = "";
        for (int i = 0; i < tamV; i++) {
            cad += vectorN[i] + " \n";
        }
        cad += "\n";
        JOptionPane.showMessageDialog(null, "Datos generados: \n" + cad);
    }

    private void btnAct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAct2ActionPerformed
        // TODO add your handling code here:
        vectorNElementosTXT pr2 = new vectorNElementosTXT();
        pr2.setVisible(true);

    }//GEN-LAST:event_btnAct2ActionPerformed

    private void btnInfoAct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAct1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Programa que calcula el promedio para un conjunto de datos de tres maneras diferentes que son:.\n"
                + "Versión 1: Con datos predefinidos.\n"
                + "Versión 2: Con n datos ingresados por teclado");

    }//GEN-LAST:event_btnInfoAct1ActionPerformed

    private void btnInfoAct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAct2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Programa que permite elegir un archivo de texto (TXT) a leer/procesar \n"
                + " que hace sus operaciones básicas: \n"
                + "insertar, modificar, eliminar, ordenar, buscar. \n");
    }//GEN-LAST:event_btnInfoAct2ActionPerformed

    private void btnInfoAct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAct3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "El Programa le permite elegir el archivo de texto (TXT) que  almacena n calificaciones parciales de una asignatura para m estudiantes,\n"
                + " una vez almacenada esta información,  el programa calcula el promedio general por estudiante,\n"
                + " el promedio del grupo, el promedio mínimo y máximo del grupo.");
    }//GEN-LAST:event_btnInfoAct3ActionPerformed

    private void btnInfoAct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAct4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Programa le permite  elegir el archivo de texto (TXT).\n"
                + " Permite llevar un control de n calificaciones para m estudiantes y p carreras obtenidas desde un archivo de texto (TXT).\n"
                + "El Programa calcula:\n"
                + "-el promedio general de cada estudiante \n "
                + "-el promedio por cada carrera\n"
                + "-el promedio mínimo y máximo de cada carrera"
                + "-el promedio mínimo y máximo de todas las carreras.\n"
                + "\n El estudiante de el archivo de texto (TXT) debe estar conformado por: \n"
                + "Nombre \n"
                + "iniciales de la materia\n"
                + "iniciales de la carrera\n"
                + "las calificaciones a declarar.\n"
                + "Por ejemplo:\n"
                + "Juan FP ISC 85 93 88.6 79");

    }//GEN-LAST:event_btnInfoAct4ActionPerformed

    private void btnInfoAct5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAct5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "el Programa le permite elegir una imagen a color, \n"
                + "para luego extraer y visualizar cada uno de sus componentes R, G y B, \n "
                + "así también convertirlo y visualizarlo en escala de grises.");
    }//GEN-LAST:event_btnInfoAct5ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(readActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(readActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(readActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(readActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readActivities().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnAct1;
    private javax.swing.JButton btnAct2;
    private javax.swing.JButton btnAct3;
    private javax.swing.JButton btnAct4;
    private javax.swing.JButton btnAct5;
    private javax.swing.JButton btnInfoAct1;
    private javax.swing.JButton btnInfoAct2;
    private javax.swing.JButton btnInfoAct3;
    private javax.swing.JButton btnInfoAct4;
    private javax.swing.JButton btnInfoAct5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
