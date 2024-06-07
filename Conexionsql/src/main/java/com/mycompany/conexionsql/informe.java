/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conexionsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class informe extends javax.swing.JFrame {
   //Metodo de TipoMaterialMayor
    public void TipoMaterialMayor() {
    // Se crea una instancia de la clase "conexion" para establecer la conexión con la base de datos.
    conexion conn = new conexion();
    try { 
        // Se establece la conexión con la base de datos.
        Connection con = conn.establecerConexion();
        // Se prepara la consulta SQL para obtener el valor máximo de la columna "cantidad_Material" en la tabla "almacen".
        PreparedStatement ps = con.prepareStatement("SELECT MAX(cantidad_Material) FROM almacen");
        // Se ejecuta la consulta y se obtiene el conjunto de resultados.
        ResultSet rs = ps.executeQuery();
        // Se verifica si hay resultados.
        if (rs.next()) {
            // Se obtiene el valor máximo de la columna "cantidad_Material".
            int maxCantidadMaterial = rs.getInt(1);
            // Se muestra el valor máximo en un componente de la interfaz gráfica (en este caso, txtTipoMAX).
            txtTipoMAX.setText(String.valueOf(maxCantidadMaterial));
        } else {
            // Si no hay resultados, se muestra un mensaje indicando que no hay datos en la tabla "almacen".
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla almacen");
        }
    } catch (SQLException e) {
        // En caso de excepción SQL, se muestra un mensaje de error al usuario.
        JOptionPane.showMessageDialog(null, "No se pudo ejecutar");
    }
}
    //Metodo de promedioMaterialesPeso
    public void promedioMaterialesPeso() {
    // Se crea una instancia de la clase "conexion" para establecer la conexión con la base de datos.
    conexion conn = new conexion();
    try {   
        // Se establece la conexión con la base de datos.
        Connection con = conn.establecerConexion();
        // Se prepara la consulta SQL para obtener el promedio de la columna "peso" en la tabla "almacen".
        PreparedStatement ps = con.prepareStatement("SELECT AVG(peso) FROM almacen");
        // Se ejecuta la consulta y se obtiene el conjunto de resultados.
        ResultSet rs = ps.executeQuery();
        // Se verifica si hay resultados.
        if (rs.next()) {
            int promedio = rs.getInt(1);
            // Se muestra el valor promedio en un componente de la interfaz gráfica (en este caso, txtPromedio).
            txtPromedio.setText(String.valueOf(promedio));
        } else {
            // Si no hay resultados, se muestra un mensaje indicando que no hay datos en la tabla "almacen".
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla almacen");
        }
    } catch (SQLException e) {
        // En caso de excepción SQL, se muestra un mensaje de error al usuario.
        JOptionPane.showMessageDialog(null, "No se pudo ejecutar");
    }
}
   //Metodo sumaMateriales
    public void sumaMateriales() {
    // Se crea una instancia de la clase "conexion" para establecer la conexión con la base de datos.
    conexion conn = new conexion();
    try {       
        // Se establece la conexión con la base de datos.
        Connection con = conn.establecerConexion();
        // Se prepara la consulta SQL para obtener la suma de la columna "cantidad_Material" en la tabla "almacen".
        PreparedStatement ps = con.prepareStatement("SELECT SUM(cantidad_Material) FROM almacen");
        // Se ejecuta la consulta y se obtiene el conjunto de resultados.
        ResultSet rs = ps.executeQuery();
        // Se verifica si hay resultados.
        if (rs.next()) {
            // Se obtiene el valor de la suma de la columna "cantidad_Material".
            int suma = rs.getInt(1);
            // Se muestra el valor de la suma en un componente de la interfaz gráfica (en este caso, txtSuma).
            txtSuma.setText(String.valueOf(suma));
        } else {
            // Si no hay resultados, se muestra un mensaje indicando que no hay datos en la tabla "almacen".
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla almacen");
        }
    } catch (SQLException e) {
        // En caso de excepción SQL, se muestra un mensaje de error al usuario.
        JOptionPane.showMessageDialog(null, "No se pudo ejecutar");
    }
}
    //Metodo maximoUsuario  (Usuario con mayor material vendido)
    public void maximoUsuario() {
    // Se crea una instancia de la clase "conexion" para establecer la conexión con la base de datos.
    conexion conn = new conexion();
    try {
        // Se establece la conexión con la base de datos.
        Connection con = conn.establecerConexion();
        // Se prepara la consulta SQL para obtener el nombre del usuario con la máxima cantidad de materiales.
        PreparedStatement ps = con.prepareStatement("SELECT Nombre FROM usuario WHERE cantidad_Material = (SELECT MAX(cantidad_Material) FROM usuario)");
        // Se ejecuta la consulta y se obtiene el conjunto de resultados.
        ResultSet rs = ps.executeQuery();
        // Se verifica si hay resultados.
        if (rs.next()) {
            // Se obtiene el nombre del usuario con la máxima cantidad de materiales.
            String maxU = rs.getString(1);
            // Se muestra el nombre del usuario en un componente de la interfaz gráfica (en este caso, txtUsuarioMAX).
            txtUsuarioMAX.setText(maxU);
        } else {
            // Si no hay resultados, se muestra un mensaje indicando que no hay datos en la tabla "usuario".
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla usario");
        }
    } catch (SQLException e) {
        // En caso de excepción SQL, se muestra un mensaje de error al usuario.
        JOptionPane.showMessageDialog(null, "No se pudo ejecutar");
    }
}
    //Metodo maximoEmpresa (Empresa con mayor material comprado)
    public void maximoEmpresa() {
    // Se crea una instancia de la clase "conexion" para establecer la conexión con la base de datos.
    conexion conn = new conexion();
    try {       
        // Se establece la conexión con la base de datos.
        Connection con = conn.establecerConexion();
        // Se prepara la consulta SQL para obtener el nombre de la empresa con la máxima cantidad de materiales.
        PreparedStatement ps = con.prepareStatement("SELECT Nombre_Empresa FROM empresa WHERE Cantidad_Material = (SELECT MAX(Cantidad_Material) FROM empresa)");
        // Se ejecuta la consulta y se obtiene el conjunto de resultados.
        ResultSet rs = ps.executeQuery();
        // Se verifica si hay resultados.
        if (rs.next()) {
            // Se obtiene el nombre de la empresa con la máxima cantidad de materiales.
            String maxE = rs.getString(1);
            // Se muestra el nombre de la empresa en un componente de la interfaz gráfica (en este caso, txtEmpresaMAX).
            txtEmpresaMAX.setText(maxE);
        } else {
            // Si no hay resultados, se muestra un mensaje indicando que no hay datos en la tabla "empresa".
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla empresa");
        }
    } catch (SQLException e) {
        // En caso de excepción SQL, se muestra un mensaje de error al usuario.
        JOptionPane.showMessageDialog(null, "No se pudo ejecutar");
    }
}

    
    
    public informe() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RECI-CJ (INFORME)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSuma = new javax.swing.JButton();
        txtUsuarioMAX = new javax.swing.JButton();
        txtEmpresaMAX = new javax.swing.JButton();
        txtTipoMAX = new javax.swing.JButton();
        txtPromedio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jButton6.setText("jButton2");

        jButton9.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Tipo de material con mayor cantidad:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 120, 310, 22);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SALIR");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 153), null, null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 440, 220, 29);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INFORME");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 40, 190, 40);

        txtSuma.setEnabled(false);
        jPanel1.add(txtSuma);
        txtSuma.setBounds(30, 260, 220, 30);

        txtUsuarioMAX.setEnabled(false);
        jPanel1.add(txtUsuarioMAX);
        txtUsuarioMAX.setBounds(30, 320, 220, 30);

        txtEmpresaMAX.setEnabled(false);
        jPanel1.add(txtEmpresaMAX);
        txtEmpresaMAX.setBounds(30, 390, 220, 30);

        txtTipoMAX.setEnabled(false);
        txtTipoMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoMAXActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipoMAX);
        txtTipoMAX.setBounds(30, 140, 220, 30);

        txtPromedio.setEnabled(false);
        jPanel1.add(txtPromedio);
        txtPromedio.setBounds(30, 200, 220, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Promedio de los materiales de acuerdo al peso:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 180, 330, 22);

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Suma de todos los material del alamcen:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 240, 270, 22);

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Usuario con mayor material vendido:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 300, 270, 22);

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Generar un informe de las bases de datos");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 80, 260, 22);

        jLabel8.setBackground(new java.awt.Color(255, 255, 0));
        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Empresa con mayor material comprado:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 370, 290, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        interfaz i = new interfaz();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTipoMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoMAXActionPerformed

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
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(informe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new informe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtEmpresaMAX;
    private javax.swing.JButton txtPromedio;
    private javax.swing.JButton txtSuma;
    private javax.swing.JButton txtTipoMAX;
    private javax.swing.JButton txtUsuarioMAX;
    // End of variables declaration//GEN-END:variables
}
