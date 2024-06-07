/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conexionsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tblDevoluciones extends javax.swing.JFrame {
  
    private void cargarTablaDevoluciones(){
         
        DefaultTableModel modeloTablaUsu = (DefaultTableModel)tblDevolucion.getModel();
        modeloTablaUsu.setRowCount(0); //Primera ejecucion se limpie tabla
        //variables
        PreparedStatement ps;
        ResultSet rs; 
        ResultSetMetaData rsmd;
        int columnas;
        conexion conn = new conexion();
        
        try{
            Connection con = conn.establecerConexion();
            ps = con.prepareStatement("SELECT id_devolucion, nombre_Empresa, estado FROM devoluciones");    
            //ejecutar consulta
            rs = ps.executeQuery();
            rsmd = rs.getMetaData(); //traer metadata de la consulta
            columnas = rsmd.getColumnCount();//saber columnas consulta
            while(rs.next()){//traer datos consulta
                Object[] fila = new Object[columnas];
                for(int indice=0; indice<columnas;indice++){
                    fila[indice] = rs.getObject(indice + 1 );
                }
                modeloTablaUsu.addRow(fila);//asingar toda la fila
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());    
        }   
     }
    
    public tblDevoluciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RECI-CJ (BD-DEVOLUCIONES)");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDevolucion = new javax.swing.JTable();
        btnActualizartblUsuarios6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        tblDevolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id_devolucion", "nombre_Empresa", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDevolucion);

        btnActualizartblUsuarios6.setBackground(new java.awt.Color(0, 0, 255));
        btnActualizartblUsuarios6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnActualizartblUsuarios6.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizartblUsuarios6.setText("ACTUALIZAR TABLA");
        btnActualizartblUsuarios6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizartblUsuarios6ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ELIMINAR REGISTRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(0, 0, 255));
        btnVolver.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnActualizartblUsuarios6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizartblUsuarios6)
                    .addComponent(jButton1)
                    .addComponent(btnVolver))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizartblUsuarios6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizartblUsuarios6ActionPerformed
        cargarTablaDevoluciones();
    }//GEN-LAST:event_btnActualizartblUsuarios6ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        baseDeDatos db = new baseDeDatos();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int filaSeleccionada = tblDevolucion.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
        return;
    }

    int idDevolucion = (int) tblDevolucion.getValueAt(filaSeleccionada, 0);

    // Llamar al método de eliminación en la clase conexion
    conexion conn = new conexion();
    conn.eliminarDevolucion(idDevolucion);

    // Vuelve a cargar la tabla después de la eliminación
    cargarTablaDevoluciones();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(tblDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tblDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tblDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tblDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tblDevoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizartblUsuarios6;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDevolucion;
    // End of variables declaration//GEN-END:variables
}
