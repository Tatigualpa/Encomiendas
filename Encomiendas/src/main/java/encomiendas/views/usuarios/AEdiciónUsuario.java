/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package encomiendas.views.usuarios;

/**
 *
 * @author kedos
 */
public class AEdiciónUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AEdiciónUsuario
     */
    public AEdiciónUsuario() {
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

        jPRegistroAdministrador = new javax.swing.JPanel();
        jLCédula = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jLApellidos = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLTeléfonoPrincipal = new javax.swing.JLabel();
        jLCiudad = new javax.swing.JLabel();
        jLRol = new javax.swing.JLabel();
        jTeléfonoSecundario = new javax.swing.JLabel();
        jCBRol = new javax.swing.JComboBox<>();
        jLTípoLicencia = new javax.swing.JLabel();
        jCBTípoLicencia = new javax.swing.JComboBox<>();
        jLEstado = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox<>();
        jLTablaAgencía = new javax.swing.JLabel();
        jTFCédula = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFTeléfonoPrincipal = new javax.swing.JTextField();
        jTFTeléfonoSecundario = new javax.swing.JTextField();
        jTFCiudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLAgencia = new javax.swing.JLabel();
        jTFAgencia = new javax.swing.JTextField();
        jTFIdUsuario = new javax.swing.JTextField();
        jLIdUsuario = new javax.swing.JLabel();
        jLTablaAgencía1 = new javax.swing.JLabel();
        jBActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLCédula.setText("Cédula:");

        jLNombres.setText("Nombres:");

        jLApellidos.setText("Apellidos:");

        jLCorreo.setText("Correo:");

        jLTeléfonoPrincipal.setText("Teléfono Principal:");

        jLCiudad.setText("Ciudad:");

        jLRol.setText("Rol:");

        jTeléfonoSecundario.setText("Teléfono Secundario:");

        jCBRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado", "Conductor" }));

        jLTípoLicencia.setText("Típo Licencia:");

        jCBTípoLicencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A1", "B", "C", "E" }));

        jLEstado.setText("Estado:");

        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Desabilitado", " ", " " }));

        jLTablaAgencía.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLTablaAgencía.setText("Tabla Agencia:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLAgencia.setText("Agencia:");

        javax.swing.GroupLayout jPRegistroAdministradorLayout = new javax.swing.GroupLayout(jPRegistroAdministrador);
        jPRegistroAdministrador.setLayout(jPRegistroAdministradorLayout);
        jPRegistroAdministradorLayout.setHorizontalGroup(
            jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroAdministradorLayout.createSequentialGroup()
                        .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTeléfonoSecundario)
                                    .addComponent(jLTablaAgencía))
                                .addGap(18, 18, 18)
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFTeléfonoSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTeléfonoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroAdministradorLayout.createSequentialGroup()
                                        .addComponent(jLAgencia)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLTeléfonoPrincipal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jLTípoLicencia)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTípoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jLEstado)
                                .addGap(18, 18, 18)
                                .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jLRol)
                                .addGap(18, 18, 18)
                                .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPRegistroAdministradorLayout.createSequentialGroup()
                                .addComponent(jLCiudad)
                                .addGap(18, 18, 18)
                                .addComponent(jTFCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                        .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistroAdministradorLayout.createSequentialGroup()
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLApellidos)
                                    .addComponent(jLCorreo))
                                .addGap(18, 18, 18)
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(jTFApellidos)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPRegistroAdministradorLayout.createSequentialGroup()
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombres)
                                    .addComponent(jLCédula))
                                .addGap(18, 18, 18)
                                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFCédula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPRegistroAdministradorLayout.setVerticalGroup(
            jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistroAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCédula)
                    .addComponent(jTFCédula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRol)
                    .addComponent(jCBRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombres)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTípoLicencia)
                    .addComponent(jCBTípoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidos)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstado)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTeléfonoPrincipal)
                    .addComponent(jTFTeléfonoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTeléfonoSecundario)
                    .addComponent(jTFTeléfonoSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTablaAgencía)
                    .addComponent(jLAgencia)
                    .addComponent(jTFAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCiudad))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLIdUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLIdUsuario.setText("Id Usuario:");

        jLTablaAgencía1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLTablaAgencía1.setText("Edición de Usuarios");

        jBActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPRegistroAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLIdUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jTFIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLTablaAgencía1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTablaAgencía1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdUsuario))
                .addGap(18, 18, 18)
                .addComponent(jPRegistroAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(AEdiciónUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AEdiciónUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AEdiciónUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AEdiciónUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AEdiciónUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JComboBox<String> jCBEstado;
    private javax.swing.JComboBox<String> jCBRol;
    private javax.swing.JComboBox<String> jCBTípoLicencia;
    private javax.swing.JLabel jLAgencia;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCiudad;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLCédula;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLIdUsuario;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLRol;
    private javax.swing.JLabel jLTablaAgencía;
    private javax.swing.JLabel jLTablaAgencía1;
    private javax.swing.JLabel jLTeléfonoPrincipal;
    private javax.swing.JLabel jLTípoLicencia;
    private javax.swing.JPanel jPRegistroAdministrador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAgencia;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFCiudad;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFCédula;
    private javax.swing.JTextField jTFIdUsuario;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFTeléfonoPrincipal;
    private javax.swing.JTextField jTFTeléfonoSecundario;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jTeléfonoSecundario;
    // End of variables declaration//GEN-END:variables
}
