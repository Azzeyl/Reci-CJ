package com.mycompany.conexionsql;

import java.sql.*;
import javax.swing.JOptionPane;

public class empresa extends javax.swing.JFrame {
  
    public empresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RECI-CJ (REALIZAR VENTA)");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre_Empresa = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNombre_Material = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCantidad_Material = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipo_Material = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        rbExito = new javax.swing.JRadioButton();
        rbPendiente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Nombre empresa");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Dirección");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Nombre Material");

        txtNombre_Empresa.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtNombre_Empresa.setForeground(new java.awt.Color(0, 0, 255));
        txtNombre_Empresa.setFocusTraversalPolicyProvider(true);

        txtDireccion.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 255));
        txtDireccion.setFocusTraversalPolicyProvider(true);

        txtCorreo.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 255));
        txtCorreo.setFocusTraversalPolicyProvider(true);

        txtNombre_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtNombre_Material.setForeground(new java.awt.Color(0, 0, 255));
        txtNombre_Material.setFocusTraversalPolicyProvider(true);

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

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Cantidad Material");

        txtTelefono.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 255));
        txtTelefono.setFocusTraversalPolicyProvider(true);

        txtCantidad_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtCantidad_Material.setForeground(new java.awt.Color(0, 0, 255));
        txtCantidad_Material.setFocusTraversalPolicyProvider(true);

        btnVolver.setBackground(new java.awt.Color(0, 0, 255));
        btnVolver.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Estado de pago");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Precio");

        txtPrecio.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 255));
        txtPrecio.setFocusTraversalPolicyProvider(true);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Tipo Material");

        txtTipo_Material.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtTipo_Material.setForeground(new java.awt.Color(0, 0, 255));
        txtTipo_Material.setFocusTraversalPolicyProvider(true);

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REALIZAR VENTA");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("INGRESAR LOS SIGUIENTES DATOS");

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Fecha");

        txtFecha.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 255));
        txtFecha.setFocusTraversalPolicyProvider(true);

        rbExito.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        rbExito.setForeground(new java.awt.Color(0, 0, 255));
        rbExito.setText("exito");

        rbPendiente.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        rbPendiente.setForeground(new java.awt.Color(0, 0, 255));
        rbPendiente.setText("pendiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(txtCantidad_Material)
                                    .addComponent(txtNombre_Material)
                                    .addComponent(txtTipo_Material)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtNombre_Empresa)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbExito, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbPendiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(99, 99, 99)
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTipo_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad_Material, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rbExito)
                            .addComponent(rbPendiente)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    //Metodo del boton GUARDAR
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Se crea una instancia de la clase conexion, usada para establecer la 
        //conexion con la base de datos
        conexion conn = new conexion();
        //Se crea una variable "Nombre_Empresa", para almacenar los valores ingresados
        String Nombre_Empresa = txtNombre_Empresa.getText();
        //Se crea una variable "Direccion", para almacenar los valores ingresados
        String Direccion = txtDireccion.getText();
        //Se crea una variable "Telefono", para almacenar los valores ingresados
        String Telefono = txtTelefono.getText();
        //Se crea una variable "Correo", para almacenar los valores ingresados
        String Correo = txtCorreo.getText();
        //Se crea una variable "Nombre_Material", para almacenar los valores ingresados
        String Nombre_Material = txtNombre_Material.getText();
        //Se crea una variable de tipo int "Cantidad_Material", se usa Integer.parseInt
        //para capturar un dato de tipo String en una variable de tipo entero
        int Cantidad_Material = Integer.parseInt(txtCantidad_Material.getText());
        //Se crea una variable para guardar la eleccion del Radio Button.
        String pagos;
        //Se crea una condicion IF, para verificar que opcion a seleccionado el usuario
        if(rbExito.isSelected()== true){
        //Si se selecciono el campo de exito, la varible de pago toma el valor de "exito"
	pagos = "exito";
        }else if(rbPendiente.isSelected() == true){
        //Si se selecciono el campo de pendiente, la varible de pago toma el valor de "pendiente"    
	pagos = "pendiente";
        }else{
        //Se crea una condicion else, si el usuario no selecciona ningun valor la variable toma "no hay"
	pagos = "no hay";
        }
        try{
            //Se establece conexion con la base de datos
            Connection con = conn.establecerConexion();
            //Se prepara la consulta SQL para insertar datos en la tabla empresa
            PreparedStatement ps = con.prepareStatement("INSERT INTO empresa (Nombre_Empresa, Direccion, Telefono, Correo, "
                    + "Nombre_Material, Cantidad_Material, Pagos) VALUES (?,?,?,?,?,?,?)");
             //Se establecen los valores de los parametros en la consula SQL
            //los parametros son las variables anteriormente creadas
            ps.setString(1, Nombre_Empresa);
            ps.setString(2, Direccion);
            ps.setString(3, Telefono);
            ps.setString(4, Correo);
            ps.setString(5, Nombre_Material);
            ps.setInt(6, Cantidad_Material);
            ps.setString(7, pagos);
            //Se ejecuta la actualizacion en la base de datos, insertando un
            // nuevo registro de una nueva venta
            ps.executeUpdate();
           //Se crea una instancia de la clase "facturaVenta", para mostrar una factura
            facturaVenta f = new facturaVenta();
            //Se establecen los valores en la instancia facturaVenta, para mostrar
            //informacion sobre el NombreEmpresa,Direccion,Telefono,TipoMaterial entre otros
            f.setNombreEmpresa(txtNombre_Empresa.getText());
            f.setDireccion(txtDireccion.getText());
            f.setTelefono(txtTelefono.getText());
            f.setTipoMaterial(txtTipo_Material.getText());
            f.setNombreMaterial(txtNombre_Material.getText());
            f.setCantidadMaterial(txtCantidad_Material.getText());
            f.setPrecio(txtPrecio.getText());
            f.setFecha(txtFecha.getText());
            f.setPrecioTotal(txtPrecio.getText());
            //Se hace visible la ventana de facturacion
            f.setVisible(true);
            //Se usa el metodo para cerrar la ventana de RealizarVenta
            this.dispose();
        } catch(SQLException e){
            //Se envia un mensaje si ocurrio algun error
            JOptionPane.showMessageDialog(null, "Registro  no guardado");  
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
   //Metodo de LIMPIAR CAMPOS
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         //Limpiar los campos a su valor predeterminado
        // Limpiar el campo de texto de Nombre_Empresa
        txtNombre_Empresa.setText("");
        // Limpiar el campo de texto de la Direccion
        txtDireccion.setText("");
        // Limpiar el campo de texto del numero de Telefono
        txtTelefono.setText("");
        // Limpiar el campo de texto del Correo
        txtCorreo.setText("");
        // Limpiar el campo de texto de Tipo_Material
        txtTipo_Material.setText("");
        // Limpiar el campo de texto de Nombre_Material
        txtNombre_Material.setText("");
        // Limpiar el campo de texto de Cantidad_Material
        txtCantidad_Material.setText("");
        // Limpiar el campo de texto de Precio
        txtPrecio.setText("");
        // Limpiar el campo de texto de Fecha
        txtFecha.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Se crea una instancia de la clase interfaz
        interfaz i = new interfaz();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empresa().setVisible(true);
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbExito;
    private javax.swing.JRadioButton rbPendiente;
    private javax.swing.JTextField txtCantidad_Material;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre_Empresa;
    private javax.swing.JTextField txtNombre_Material;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo_Material;
    // End of variables declaration//GEN-END:variables
}
