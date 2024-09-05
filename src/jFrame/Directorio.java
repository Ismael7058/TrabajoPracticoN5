package jFrame;

import java.util.TreeMap;
import javax.swing.JOptionPane;
import trabajopracticon5.Contacto;

public class Directorio extends javax.swing.JFrame {

    private TreeMap<Long, Contacto> listContac = new TreeMap<Long, Contacto>();

    public Directorio() {
        initComponents();
        this.setSize(400, 410);
        this.setLocationRelativeTo(null);
        this.setTitle("Directorio");
        this.setResizable(false);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTCiudad = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jBBUscar = new javax.swing.JButton();
        jTDNI1 = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(400, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Teléfono:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Formulario de Contacto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 339, 10));

        jTCiudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jTCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 181, -1));

        jtTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 181, -1));

        jBLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jBGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jBGuardar.setText("Guardar");
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jBBorrar.setBackground(new java.awt.Color(204, 204, 204));
        jBBorrar.setText("Borrar");
        jBBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jBBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("DNI: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 30, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Dirección:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 180, 90, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Apellido:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 150, 90, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Nombre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 120, 90, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Ciudad:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 210, 90, 20));

        jBBUscar.setText("Buscar");
        jBBUscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBUscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBUscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jTDNI1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jTDNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 181, -1));

        jTNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 181, -1));

        jTApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 181, -1));

        jTDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 181, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTCiudad.setText(null);
        jTNombre.setText(null);
        jTApellido.setText(null);
        jTDireccion.setText(null);
        jTCiudad.setText(null);
        jtTelefono.setText(null);

    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jBBUscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBUscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBUscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        agregarContacto();

    }//GEN-LAST:event_jBGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Directorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Directorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBUscar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTDNI1;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    public void agregarContacto() {
        try {
            int dni=Integer.parseInt(jTDNI1.getText());
            long numTel=Long.parseLong(jtTelefono.getText());
            Contacto contacto = new Contacto(dni, jTNombre.getText(), jTApellido.getText(), jTCiudad.getText(), jTDireccion.getText());
            
            
            if(listContac.containsKey(numTel)){
                JOptionPane.showMessageDialog(this, "Un contacto ya posee ese numero de telefono\nFavor de ingresar otro numero de telefono");
                jtTelefono.setText(null);
            } else{
                listContac.put(numTel, contacto);
                JOptionPane.showMessageDialog(this, "Se agrego el contacto:\n" + contacto+"\nTelefono: "+numTel);
            }

        } catch (NumberFormatException ex) {
            //Capturar la excepcion y mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Error: Debes ingresar un numero entero valido");
            jTDNI1.setText(null);
            jtTelefono.setText(null);
            //Limpiar el JTextField para que el usuario vuelva a intentar

        } 
    }

}
