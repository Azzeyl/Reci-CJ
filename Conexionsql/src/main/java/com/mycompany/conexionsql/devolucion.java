package com.mycompany.conexionsql;

import java.sql.*;
import javax.swing.JOptionPane;

public class devolucion extends javax.swing.JFrame {
    //Metodo para crear un nuevo registro en la tabla devolucion
    private void obtenerResultadoYInsertar(String nombreEmpresa) {
    //Se crea una instancia de la clase conexion, usada para establecer la 
    //conexion con la base de datos
    conexion conn = new conexion();
    try {
        //Se establece conexion con la base de datos
        Connection con = conn.establecerConexion();
        //Se prepara la consulta SQL para insertar un nuevo registro en la tabla devoluciones
        PreparedStatement ps = con.prepareStatement("INSERT INTO devoluciones (nombre_Empresa) VALUES (?)");
        //Se establecen los valores de los parametros en la consula SQL
        //los parametros en la primera posicion de la varible String nombreEmpresa{
        //variable brinda por el metodo obtenerResultado
        ps.setString(1, nombreEmpresa);
        //Se ejecuta la actualizacion en la base de datos, insertando un
        // nuevo registro de una nueva devolucion
        ps.executeUpdate();
        
        //Se crea una variable resultado, en la cual se almacena por medio de la instancia de conexion
        //el metodo obtenerResultado de la clase conexion, a este metodo se le pasa como parametro
        //la variable nombreEmpresa el cual contiene el nombre de la empresa ingresado por el usuario
        String resultado = conn.obtenerResultado(nombreEmpresa);
        //en el JtextFiel se agrega el parametro de resultado, obtenido del metodo obtenerResultado
        // de la clase conexion
        txtResultado.setText(resultado);
    } catch (SQLException e) {
        //Se envia un mensaje si ocurrio algun error
        JOptionPane.showMessageDialog(null, "Registro no guardado");
    }
    }
    
    public devolucion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RECI-CJ (SOLICITAR DEVOLUCIÓN)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnSolicitar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Nombre Empresa");

        txtNombreEmpresa.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        txtNombreEmpresa.setForeground(new java.awt.Color(0, 0, 255));

        btnVolver.setBackground(new java.awt.Color(0, 0, 204));
        btnVolver.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnSolicitar.setBackground(new java.awt.Color(0, 0, 204));
        btnSolicitar.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnSolicitar.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitar.setText("SOLICITAR DEVOLUCIÓN");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Resultado");

        txtResultado.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 0, 255));
        txtResultado.setEnabled(false);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("resultado, hay que tener en cuenta que si la empresa");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Llenar el siguiente formulario para solicitar una");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("      SOLICITAR DEVOLUCIÓN");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("lo contrario será rechazada.");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("devolución de un material. Además, si la devolución");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("fue aprobada o no, se mostrará en el campo de ");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("esta pendiente, se podrá aceptará la devolución, de");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreEmpresa)
                                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSolicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitar)
                    .addComponent(btnVolver))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        interfaz i = new interfaz();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    //Metodo de boton Solicitar devolucion
    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
     //Se crea una variable de tipo String para almacenar el valor del campo
    String nombreEmpresa = txtNombreEmpresa.getText();
    
    //Despues de obtener el valor del campo de la interfaz se llama al metodo
    //obtenerResultadoYInsertar para realizar la inserción y obtener el resultado
    obtenerResultadoYInsertar(nombreEmpresa);
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    
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
            java.util.logging.Logger.getLogger(devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new devolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
