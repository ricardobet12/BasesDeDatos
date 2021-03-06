package View;

import Controller.Method;
import Controller.MethodRandom;
import Model.PersonA;
import Model.Person;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author richy
 */
public class AddPersonVW extends javax.swing.JFrame {

    MethodRandom metodor = new MethodRandom();

    /**
     * Creates new form PersonVW
     */
    public AddPersonVW() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtDiaNacimiento = new javax.swing.JTextField();
        txtMesDeNacimiento = new javax.swing.JTextField();
        txtAnoNacimiento = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAddText = new javax.swing.JButton();
        btnAddBinary = new javax.swing.JButton();
        addRandom = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Dia de nacimiento:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Mes de nacimiento:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Ano de nacimiento:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        btnAddText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imageText.png"))); // NOI18N
        btnAddText.setText("Agregar tipo texto");
        btnAddText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTextActionPerformed(evt);
            }
        });

        btnAddBinary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddBinary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/binary.png"))); // NOI18N
        btnAddBinary.setText("Agregar tipo binario+texto");
        btnAddBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBinaryActionPerformed(evt);
            }
        });

        addRandom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shuffle.png"))); // NOI18N
        addRandom.setText("Agregar tipo A.Aleatorio");
        addRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRandomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addRandom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddBinary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txtNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaNacimiento)
                            .addComponent(txtMesDeNacimiento)
                            .addComponent(txtAnoNacimiento)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtMesDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reply.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTextActionPerformed
        Method m = new Method();
        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        String dia = txtDiaNacimiento.getText();
        String mes = txtMesDeNacimiento.getText();
        String anio = txtAnoNacimiento.getText();
        String tel = txtTelefono.getText();
        if (nombre.isEmpty() || cedula.isEmpty() || dia.isEmpty() || mes.isEmpty() || anio.isEmpty()
                || tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "datos incompletos, por favor verifique");
        } else {
            int diaN = Integer.parseInt(txtDiaNacimiento.getText());
            int mesN = Integer.parseInt(txtMesDeNacimiento.getText());
            short anoN = Short.parseShort(txtAnoNacimiento.getText());
            Person person = new Person(txtNombre.getText(), txtCedula.getText(), diaN, mesN, anoN, txtTelefono.getText());
            m.addPersonText(person);
            JOptionPane.showMessageDialog(null, "Persona ingresada correctamente");
            txtNombre.setText("");
            txtCedula.setText("");
            txtDiaNacimiento.setText("");
            txtMesDeNacimiento.setText("");
            txtAnoNacimiento.setText("");
            txtTelefono.setText("");
        }
        // m.adicionarPersona(txtNombre.getText(),txtCedula.getText(),txtDiaNacimiento.getText(),txtMesDeNacimiento.getText(),txtAnoNacimiento.getText(),txtTelefono.getText());
    }//GEN-LAST:event_btnAddTextActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed

    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBinaryActionPerformed
        
//            int dia = Integer.parseInt(txtdianac.getText());
//            int mes = Integer.parseInt(txtmesnac.getText());

            Method m = new Method();
            String nombre = txtNombre.getText();
            String cedula = txtCedula.getText();
            String dia = txtDiaNacimiento.getText();
            String mes = txtMesDeNacimiento.getText();
            
            String tel = txtTelefono.getText();
        
            short anio = Short.parseShort(txtAnoNacimiento.getText());
             if (nombre.isEmpty() || cedula.isEmpty() || dia.isEmpty() || mes.isEmpty()
                || tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "datos incompletos, por favor verifique");
        } else {
                try {
                        int diaBinario = (int) Long.parseLong(txtDiaNacimiento.getText());
            int mesBinario = (int) Long.parseLong(txtMesDeNacimiento.getText());
            String diaB = m.calcularBinario(diaBinario);
            String mesB = m.calcularBinario(mesBinario);
                    Person persona = new Person(txtNombre.getText(), txtCedula.getText(), diaB, mesB, anio, txtTelefono.getText());
                    m.addPersonBInary(persona);
                    JOptionPane.showMessageDialog(null, "Persona ingresada correctamente");
                    txtNombre.setText("");
                    txtCedula.setText("");
                    txtDiaNacimiento.setText("");
                    txtMesDeNacimiento.setText("");
                    txtAnoNacimiento.setText("");
                    txtTelefono.setText("");
                } catch (IOException ex) {
                    Logger.getLogger(AddPersonVW.class.getName()).log(Level.SEVERE, null, ex);
                }
       
             }

    }//GEN-LAST:event_btnAddBinaryActionPerformed

    private void addRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRandomActionPerformed
        MethodRandom a = new MethodRandom();
          String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        String dia = txtDiaNacimiento.getText();
        String mes = txtMesDeNacimiento.getText();
        String anio = txtAnoNacimiento.getText();
        String tel = txtTelefono.getText();
        int diaN = Integer.parseInt(txtDiaNacimiento.getText());
        int mesN = Integer.parseInt(txtMesDeNacimiento.getText());
        short anoN = Short.parseShort(txtAnoNacimiento.getText());
          if (nombre.isEmpty() || cedula.isEmpty() || dia.isEmpty() || mes.isEmpty()
                || tel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "datos incompletos, por favor verifique");
        } else {
        //PersonA person = new PersonA(txtNombre.getText(),txtCedula.getText(),diaN,mesN,anoN,txtTelefono.getText(),true);
        try {
            a.crearFileAlumno(new File("AccessRandom.dat"));
            a.añadirPersona(new PersonA(txtNombre.getText(), txtCedula.getText(), diaN, mesN, anoN, txtTelefono.getText(), true));
            System.out.println(txtTelefono.getText());
            a.cerrar();
            JOptionPane.showMessageDialog(this, "El registro se realizó correctamente.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en la escritura de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
          }
    }//GEN-LAST:event_addRandomActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PersonVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PersonVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PersonVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PersonVW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PersonVW().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton addRandom;
    private javax.swing.JButton btnAddBinary;
    public javax.swing.JButton btnAddText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtAnoNacimiento;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtDiaNacimiento;
    public javax.swing.JTextField txtMesDeNacimiento;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
