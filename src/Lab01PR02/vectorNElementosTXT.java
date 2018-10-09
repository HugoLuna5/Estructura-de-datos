package Lab01PR02;

import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoLuna
 */
public class vectorNElementosTXT extends javax.swing.JFrame {

    public String value;
    public String fileUrl;
    public String data;

    /**
     * Creates new form vectorNElementosTXT2
     */
    public vectorNElementosTXT() {
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
        selectFile = new java.awt.Button();
        fieldNameFile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputView = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnOption = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enterView = new javax.swing.JTextArea();
        options = new javax.swing.JComboBox<>();
        labelModificar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        modifyField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        selectFile.setActionCommand("Seleccionar Archivo");
        selectFile.setLabel("Seleccionar Archivo");
        selectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileActionPerformed(evt);
            }
        });

        outputView.setColumns(20);
        outputView.setRows(5);
        jScrollPane1.setViewportView(outputView);

        jLabel1.setText("Salida");

        btnOption.setLabel("Aceptar");
        btnOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionActionPerformed(evt);
            }
        });

        jLabel2.setText("Entrada");

        enterView.setColumns(20);
        enterView.setRows(5);
        jScrollPane2.setViewportView(enterView);

        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insertar", "Modificar", "Eliminar", "Ordenar", "Buscar" }));

        labelModificar.setText("Modificar");

        modifyField.setColumns(20);
        modifyField.setRows(5);
        jScrollPane3.setViewportView(modifyField);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(options, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2)
                    .addComponent(labelModificar)
                    .addComponent(jScrollPane3))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNameFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(labelModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileActionPerformed
        // TODO add your handling code here:

        try {
            File file = Utils.filesSelector();
            fileUrl = file.getAbsolutePath();
            fieldNameFile.setText(fileUrl);

            String numeros[] = new String[Utils.count(fileUrl)];
            numeros = Utils.readFile(fileUrl);
            data = Utils.data(numeros);
            enterView.setText(data);
            modifyField.setText(data);

        } catch (NullPointerException n) {
            System.err.println("Error: " + n.getMessage());
        }

    }//GEN-LAST:event_selectFileActionPerformed


    private void btnOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionActionPerformed
        // TODO add your handling code here:
        verifyOptionSelected();
    }//GEN-LAST:event_btnOptionActionPerformed

    public void verifyOptionSelected() {

        switch (options.getSelectedIndex()) {
            case 0://insertar
                value = JOptionPane.showInputDialog(rootPane, "Ingresa un valor", this);

                String datos = data + " " + value;

                data = datos;
                Utils.escribirarchivo(datos, fileUrl);
                enterView.setText(datos);
                outputView.setText(datos);
                modifyField.setText(datos);

                break;
            case 1://modificar
                String numeros[] = new String[Utils.count(fileUrl)];
                numeros = Utils.readFile(fileUrl);
                String infoFile = modifyField.getText();
                Utils.escribirarchivo(infoFile, fileUrl);

                String infoChange = Utils.data(numeros);
                data = infoChange;
                outputView.setText(infoChange);

                break;
            case 2://eliminar
                String numberDelete = JOptionPane.showInputDialog(rootPane, "Ingresa el valor a eliminar", this);

                String numeros2[] = new String[Utils.count(fileUrl)];
                numeros2 = Utils.readFile(fileUrl);

                
                String numbersDeleted = Utils.deleteNumber(numeros2, numberDelete);
                 Utils.escribirarchivo(numbersDeleted, fileUrl);
                data = numbersDeleted;
                enterView.setText(numbersDeleted);
                outputView.setText(numbersDeleted);

                break;
            case 3://ordenar
                
                String order[] = new String[Utils.count(fileUrl)];
                order = Utils.readFile(fileUrl);
                 String result = Utils.data(Utils.ordenarConBurbuja(order));

                outputView.setText(result);
                
                
                break;
            case 4://buscar
                
                String numberSearch = JOptionPane.showInputDialog(rootPane, "Ingresa el valor a buscar", this);

                String numerosSearch[] = new String[Utils.count(fileUrl)];
                numerosSearch = Utils.readFile(fileUrl);

                
                String search = Utils.search(numerosSearch, numberSearch);
                 JOptionPane.showMessageDialog(rootPane,search);
                         
                 
                
                
                
                break;
        }

    }

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
            java.util.logging.Logger.getLogger(vectorNElementosTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vectorNElementosTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vectorNElementosTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vectorNElementosTXT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vectorNElementosTXT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnOption;
    private javax.swing.JTextArea enterView;
    private javax.swing.JTextField fieldNameFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelModificar;
    private javax.swing.JTextArea modifyField;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JTextArea outputView;
    private java.awt.Button selectFile;
    // End of variables declaration//GEN-END:variables
}
