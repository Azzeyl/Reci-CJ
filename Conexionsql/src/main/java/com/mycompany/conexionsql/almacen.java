package com.mycompany.conexionsql;

import java.sql.*;
import javax.swing.JOptionPane;

public class almacen extends javax.swing.JFrame {

    public almacen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RECI-CJ (NUEVO MATERIAL)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTipo_Material = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad_Material = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtNombre_Material = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtValorkg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Nombre Material");

        txtTipo_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtTipo_Material.setForeground(new java.awt.Color(0, 0, 255));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR CAMPOS");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Cantidad");

        txtCantidad_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtCantidad_Material.setForeground(new java.awt.Color(0, 0, 255));

        btnVolver.setBackground(new java.awt.Color(0, 0, 255));
        btnVolver.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Tipo Material");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Peso");

        txtPeso.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 255));

        txtNombre_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtNombre_Material.setForeground(new java.awt.Color(0, 0, 255));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Valor (kg)");

        txtValorkg.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtValorkg.setForeground(new java.awt.Color(0, 0, 255));
        txtValorkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorkgActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" NUEVO MATERIAL");

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("En esta opción, se puede añadir un nuevo material a la");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("tabla de almacen, el cual evaluara si el material existe");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("se sumara la cantidad que se ingresa y si no existe se");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("añade un nuevo registro.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipo_Material)
                            .addComponent(txtNombre_Material)
                            .addComponent(txtCantidad_Material)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeso)
                            .addComponent(txtValorkg)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addGap(12, 12, 12)
                        .addComponent(btnVolver)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipo_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidad_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtValorkg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    //Metodo boton Guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    // Se crea una instancia de la clase "conexion" para establecer la conexión con la base de datos.
    conexion conn = new conexion();
    // Se obtienen los valores de los campos de texto en la interfaz gráfica.
    String Tipo_Material = txtTipo_Material.getText();
    String Nombre_Material = txtNombre_Material.getText();
    int Cantidad_Material = Integer.parseInt(txtCantidad_Material.getText());
    float peso = Float.parseFloat(txtPeso.getText());
    float valorkg =  Float.parseFloat(txtValorkg.getText());

    try {
        // Se establece la conexión con la base de datos.
        Connection con = conn.establecerConexion();
        // Llamada al procedimiento almacenado de sql server llamado Nuevo_Materiales
        String storedProcedureCall = "{call Nuevo_Materiales(?, ?, ?, ?, ?)}";
        try (CallableStatement callableStatement = con.prepareCall(storedProcedureCall)) {
            // Se establecen los valores de los parámetros del procedimiento almacenado.
            callableStatement.setString(1, Tipo_Material);
            callableStatement.setString(2, Nombre_Material);
            callableStatement.setInt(3, Cantidad_Material);
            callableStatement.setFloat(4, peso);
            callableStatement.setFloat(5, valorkg);

            // Ejecuta el procedimiento almacenado
            callableStatement.execute();
            // Se muestra un mensaje de éxito al usuario.
            JOptionPane.showMessageDialog(null, "Procedimiento almacenado ejecutado exitosamente.");
        }
    } catch(SQLException e){
            // En caso de excepción SQL, se muestra un mensaje de error al usuario y se imprime la traza de la excepción.
        JOptionPane.showMessageDialog(null, "Error al ejecutar el procedimiento almacenado");
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Se establece el texto de los campos de texto a cadena vacía para limpiar la interfaz.
        txtTipo_Material.setText("");
        txtNombre_Material.setText("");
        txtCantidad_Material.setText("");
        txtPeso.setText("");
        txtValorkg.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        interfaz i = new interfaz();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtValorkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorkgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorkgActionPerformed

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
            java.util.logging.Logger.getLogger(almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCantidad_Material;
    private javax.swing.JTextField txtNombre_Material;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTipo_Material;
    private javax.swing.JTextField txtValorkg;
    // End of variables declaration//GEN-END:variables
}
