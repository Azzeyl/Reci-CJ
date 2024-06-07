package com.mycompany.conexionsql;

import java.sql.*;
import javax.swing.JOptionPane;

public class usuario extends javax.swing.JFrame {
  
    public usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RECI-CJ (REALIZAR COMPRA)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTipo_Material = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCantidad_Material = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtNombre_Material = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Nombre Material");

        txtNombre.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 255));

        txtApellidos.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 51, 255));

        txtDireccion.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 51, 255));

        txtTipo_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtTipo_Material.setForeground(new java.awt.Color(0, 51, 255));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(0, 0, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR CAMPOS");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Cantidad");

        txtTelefono.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 51, 255));

        txtCantidad_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtCantidad_Material.setForeground(new java.awt.Color(0, 51, 255));

        btnVolver.setBackground(new java.awt.Color(0, 0, 255));
        btnVolver.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Tipo Material");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Precio");

        txtPrecio.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 51, 255));

        txtNombre_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtNombre_Material.setForeground(new java.awt.Color(0, 51, 255));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("Fecha");

        txtFecha.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 51, 255));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REALIZAR COMPRA");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("INGRESAR LOS SIGUIENTES DATOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombre))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5))
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantidad_Material, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtFecha)
                                    .addComponent(txtNombre_Material)
                                    .addComponent(txtTipo_Material))))
                        .addGap(50, 50, 50))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo_Material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre_Material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidad_Material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnVolver))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    //Metodo de GUARDAR
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Se crea una instancia de la clase conexion, usada para establecer la 
        //conexion con la base de datos
        conexion conn = new conexion();
        //Se crea una variable de tipo String llamada "Nombre", se usa para alamacenar
        //los valores ingresados en los campos de texto de la interfaz
        String Nombre = txtNombre.getText();
        //Se crea una variable "Apellidos", para almacenar los valores ingresados
        String Apellidos = txtApellidos.getText();
        //Se crea una variable "Telefono", para almacenar los valores ingresados
        String Telefono = txtTelefono.getText();
        //Se crea una variable "Direccion", para almacenar los valores ingresados
        String Direccion = txtDireccion.getText();
        //Se crea una variable "txtNombre_Material", para almacenar los valores ingresados
        String Nombre_Material = txtNombre_Material.getText();
        //Se crea una variable de tipo int "Cantidad_Material", se usa Integer.parseInt
        //para capturar un dato de tipo String en una variable de tipo entero
        int Cantidad_Material = Integer.parseInt(txtCantidad_Material.getText());
        try{
            //Se establece conexion con la base de datos
            Connection con = conn.establecerConexion();
            //Se prepara la consulta SQL para insertar datos en la tabla usuario
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuario (Nombre, Apellidos, Telefono, Direccion, Nombre_Material, Cantidad_Material) VALUES (?,?,?,?,?,?)");
            //Se establecen los valores de los parametros en la consula SQL
            //los parametros son las variables anteriormente creadas
            ps.setString(1, Nombre);
            ps.setString(2, Apellidos);
            ps.setString(3, Telefono);
            ps.setString(4, Direccion);
            ps.setString(5, Nombre_Material);
            ps.setInt(6, Cantidad_Material);
            //Se ejecuta la actualizacion en la base de datos, insertando un
            // nuevo registro de una nueva compra
            ps.executeUpdate();
            
            //Se crea una instancia de la clase "facturacion", para mostrar una factura
            facturacion f = new facturacion();
            
            //Se establecen los valores en la instancia facturacion, para mostrar
            //informacion sobre la compra, como el nombre, apellidos, telefono entre otros
            f.setNombre(txtNombre.getText());
            f.setApellido(txtApellidos.getText());
            f.setTelefono(txtTelefono.getText());
            f.setTipoMaterial(txtTipo_Material.getText());
            f.setNombreMaterial(txtNombre_Material.getText());
            f.setCantidadMaterial(txtCantidad_Material.getText());
            f.setfecha(txtFecha.getText());
            f.setprecio(txtPrecio.getText());
            f.settotal(txtPrecio.getText());
            //Se hace visible la ventana de facturacion
            f.setVisible(true);         
        } catch(SQLException e){
            //Se envia un mensaje si ocurrio algun error
            JOptionPane.showMessageDialog(null, "Registro  no guardado");  
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
   //Metodo de LIMPIAR CAMPOS
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Lipiar los campos a su valor predeterminado
        // Limpiar el campo de texto del nombre
        txtNombre.setText("");
        // Limpiar el campo de texto de los apellidos
        txtApellidos.setText("");
        // Limpiar el campo de texto del teléfono
        txtTelefono.setText("");
        // Limpiar el campo de texto de la dirección
        txtDireccion.setText("");
        // Limpiar el campo de texto del tipo de material
        txtTipo_Material.setText("");
        // Limpiar el campo de texto del nombre del material
        txtNombre_Material.setText("");
        // Limpiar el campo de texto de la cantidad de material
        txtCantidad_Material.setText("");
        // Limpiar el campo de texto del precio
        txtPrecio.setText("");
        // Limpiar el campo de texto de la fecha
        txtFecha.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        interfaz i = new interfaz();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCantidad_Material;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre_Material;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo_Material;
    // End of variables declaration//GEN-END:variables
}