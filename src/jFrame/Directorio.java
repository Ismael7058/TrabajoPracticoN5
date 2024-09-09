package jFrame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import trabajopracticon5.Contacto;

public class Directorio extends javax.swing.JFrame {

    private TreeMap<Long, Contacto> listContac = new TreeMap<>();

    public Directorio() {
        initComponents();
        this.setSize(360, 425);
        this.setLocationRelativeTo(null);
        this.setTitle("Directorio");
        this.setResizable(false);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLFormulario = new javax.swing.JLabel();
        jTDNI = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLDireccion = new javax.swing.JLabel();
        jLCiudad = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jLTelefono = new javax.swing.JLabel();
        jBBorrar = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTDireccion = new javax.swing.JTextField();
        jTCiudad = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLBuscar = new javax.swing.JLabel();
        jLTipoDate = new javax.swing.JLabel();
        jLingreso = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jTIngresoBuscar = new javax.swing.JTextField();
        jCBTelefono = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTADatoContacto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(351, 401));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFormulario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLFormulario.setForeground(new java.awt.Color(0, 153, 204));
        jLFormulario.setText("Formulario de Contacto");

        jTDNI.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLDNI.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLDNI.setText("DNI: ");

        jLNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLNombre.setText("Nombre:");

        jLApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLApellido.setText("Apellido:");

        jLDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLDireccion.setText("Dirección:");

        jLCiudad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLCiudad.setText("Ciudad:");

        jBGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jBGuardar.setText("Guardar");
        jBGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        jBLimpiar.setText("Limpiar");
        jBLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jLTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLTelefono.setText("Teléfono:");

        jBBorrar.setBackground(new java.awt.Color(204, 204, 204));
        jBBorrar.setText("Borrar");
        jBBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jTNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTApellido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTCiudad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCiudad)
                            .addComponent(jLTelefono)
                            .addComponent(jLDireccion)
                            .addComponent(jLApellido)
                            .addComponent(jLNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLFormulario))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpiar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLFormulario)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBBorrar)
                    .addComponent(jBLimpiar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Formulario", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLBuscar.setForeground(new java.awt.Color(0, 153, 204));
        jLBuscar.setText("Buscar Contacto");
        jPanel1.add(jLBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLTipoDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLTipoDate.setText("Tipo de dato:");
        jPanel1.add(jLTipoDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 20));

        jLingreso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLingreso.setText("Ingrese el dato:");
        jPanel1.add(jLingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 20));

        jBBuscar.setBackground(new java.awt.Color(204, 204, 204));
        jBBuscar.setText("Buscar");
        jBBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jTIngresoBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(jTIngresoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 144, -1));

        jCBTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telefono", "Apellido", "Ciudad" }));
        jCBTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jCBTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 144, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, 10));

        jTADatoContacto.setColumns(20);
        jTADatoContacto.setRows(5);
        jScrollPane3.setViewportView(jTADatoContacto);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 300, 140));

        jTabbedPane1.addTab("Buscar", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        agregarContacto();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTCiudad.setText(null);
        jTNombre.setText(null);
        jTApellido.setText(null);
        jTDireccion.setText(null);
        jTCiudad.setText(null);
        jtTelefono.setText(null);
        jTDNI.setText(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        borrarContacto(Long.parseLong(jtTelefono.getText()));
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String criterio = jCBTelefono.getSelectedItem().toString();
        String valor = jTIngresoBuscar.getText();
        jTADatoContacto.setText(null);

        switch (criterio) {
            case "Telefono":
                try {
                    long telefono = Long.parseLong(valor);
                    if (listContac.containsKey(telefono)) {
                        Contacto contacto = listContac.get(telefono);
                        jTADatoContacto.append("Teléfono: " + telefono + "\n" + contacto.toString() + "\n\n");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontraron contactos asociados a este telefono");
                    }
                } catch (NumberFormatException e) {
                    jTADatoContacto.append("Por favor ingresa un número de teléfono válido.\n");
                }
                break;

            case "Apellido":
                Set<Long> listaTelefono = buscarTelef(jTIngresoBuscar.getText());

                if (listaTelefono.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No se encontraron telefonos asociados a este apellido");
                } else {
                    for (Long tel : listaTelefono) {
                        jTADatoContacto.append("Teléfono: " + tel + "\n");
                    }
                }
                break;

            case "Ciudad":
                ArrayList<Contacto> contactosCiudad = buscarContactos(valor);
                if (!contactosCiudad.isEmpty()) {
                    for (Contacto contacto : contactosCiudad) {
                        jTADatoContacto.append(contacto.toString() + "\n\n");
                    }
                }
                break;

            default:
                jTADatoContacto.append("Selecciona un criterio de búsqueda válido.\n");
                break;
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jCBTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTelefonoActionPerformed

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
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBTelefono;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLFormulario;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLTipoDate;
    private javax.swing.JLabel jLingreso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTADatoContacto;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCiudad;
    private javax.swing.JTextField jTDNI;
    private javax.swing.JTextField jTDireccion;
    private javax.swing.JTextField jTIngresoBuscar;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

//A-----------------------------------------
    public void agregarContacto() {
        try {
            int dni = Integer.parseInt(jTDNI.getText());
            long numTel = Long.parseLong(jtTelefono.getText());
            Contacto contacto = new Contacto(dni, jTNombre.getText(), jTApellido.getText(), jTCiudad.getText(), jTDireccion.getText());

            if (listContac.containsKey(numTel)) {
                JOptionPane.showMessageDialog(this, "Un contacto ya posee ese numero de telefono\nFavor de ingresar otro numero de telefono");
                jtTelefono.setText(null);
            } else {
                listContac.put(numTel, contacto);
                JOptionPane.showMessageDialog(this, "Se agrego el contacto:\n" + contacto + "\nTelefono: " + numTel);
            }

        } catch (NumberFormatException ex) {
            //Capturar la excepcion y mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "Error: Debes ingresar un numero entero valido");
            jTDNI.setText(null);
            jtTelefono.setText(null);
            //Limpiar el JTextField para que el usuario vuelva a intentar

        }
    }

//C-----------------------------------------    
    public Set<Long> buscarTelef(String apellido) {
        Set<Long> listaTelefono;
        listaTelefono = new HashSet<>();
        for (Map.Entry<Long, Contacto> entry : listContac.entrySet()) {
            if (entry.getValue().getApellido().equals(apellido)) {
                listaTelefono.add(entry.getKey());
            }
        }
        return listaTelefono;
    }

//D-----------------------------------------
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        //Se exige la ciudad a buscar por parametro
        ArrayList<Contacto> listaCiudad = new ArrayList<>();
        //La ArrayList que se pide para retornar
        boolean aux = true;
        //Para verificar si esa ciudad existe la listaContac
        for (Contacto contacto : listContac.values()) {
            //Foreach que recorra la lista de contacto principal por los valores
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                //Se compara si la ciudades son las mismas
                listaCiudad.add(contacto);
                //Si son la mismas ciudades se guarda el contacto en la ArrayList listaCiudad
                aux = false;
                //Si existe aux se le guarda falso para el if fuera del for
            }
        }
        if (aux) {
            //Este mensaje solamente se muestra si no se encuetra la ciudad a buscar
            JOptionPane.showMessageDialog(this, "No se encotro la ciudad " + ciudad);
        }
        return listaCiudad;
    }

//E-----------------------------------------
    public void borrarContacto(Long numero) {
        //numero es la key a borrar
        if (listContac.containsKey(numero)) {
            //Se verifica si la clave existe en la listContac
            listContac.remove(numero);
            //Se elimina el contacto y numero por la key
            JOptionPane.showMessageDialog(this, "Se borro el contacto " + numero);
        } else {
            //Si no se encuentra esa key sale un mensaje
            JOptionPane.showMessageDialog(this, "No se encontro el contacto " + numero);
        }
    }
}
