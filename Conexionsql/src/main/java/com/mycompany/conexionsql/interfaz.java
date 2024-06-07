package com.mycompany.conexionsql;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("RECI-CJ");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnInforme = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText(" CopyRight 2023 - ReciCJ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 440, 166, 22);

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("REALIZAR COMPRA");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 130, 240, 29);

        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("REALIZAR VENTA");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 170, 240, 29);

        jButton4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("BASES DE DATOS");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(60, 250, 240, 29);

        btnInforme.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        btnInforme.setForeground(new java.awt.Color(0, 0, 255));
        btnInforme.setText("GENERAR INFORME");
        btnInforme.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });
        jPanel1.add(btnInforme);
        btnInforme.setBounds(60, 330, 240, 29);

        jButton5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("REALIZAR DEVOLUCION");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(60, 210, 240, 29);

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
        jButton3.setBounds(60, 370, 240, 29);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PANTALLA DE INICIO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 100, 160, 20);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RECI-CJ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 60, 160, 40);

        jButton7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("AÑADIR MATERIAL");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(60, 290, 240, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo de boton REALIZAR DEVOLUCION
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Se instancia un objeto de la clase devolucion, para la ventana de "Realizar Devolucion"
        devolucion d = new devolucion();
        //Usar setVisible para hacer visible la ventana 
        d.setVisible(true);
        //Se usa el método dispose para cerrar la ventana actual, la ventana de Interfaz
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    //Metodo de boton GENERAR INFORME
    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        //Se instancia un objeto de la clase informe, para la ventana de "Generar Informe"
        informe i = new informe();
        //Usar setVisible para hacer visible la ventana 
        i.setVisible(true);
        //Se usa la instancia i para llamar al método "TipoMaterialMayor()" 
        i.TipoMaterialMayor();
        //Se usa la instancia i para llamar al método "promedioMaterialesPeso()" 
        i.promedioMaterialesPeso();
        //Se usa la instancia i para llamar al método "maximoUsuario()" 
        i.maximoUsuario();
        //Se usa la instancia i para llamar al método "sumaMateriales()" 
        i.sumaMateriales();
        //Se usa la instancia i para llamar al método "maximoEmpresa()" 
        i.maximoEmpresa();
        //Se usa el método dispose para cerrar la ventana actual, la ventana de Interfaz
        this.dispose();
    }//GEN-LAST:event_btnInformeActionPerformed
    
//Metodo de boton BASES DE DATOS
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Se instancia un objeto de la clase baseDeDatos, para la ventana de "Bases de Datos"
        baseDeDatos bd = new baseDeDatos();
        //Usar setVisible para hacer visible la ventana 
        bd.setVisible(true);
       //Se usa el método dispose para cerrar la ventana actual, la ventana de Interfaz
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    //Metodo de boton REALIZAR VENTA
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Se instancia un objeto de la clase empresa, para la ventana de "Realizar Venta"
        empresa Cempresa = new empresa();
        //Usar setVisible para hacer visible la ventana 
        Cempresa.setVisible(true);
        //Se usa el método dispose para cerrar la ventana actual, la ventana de Interfaz
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    //Metodo de boton REALIZAR COMPRA
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Se instancia un objeto de la clase usuario, para la ventana de "Realizar Compra"
        usuario Uventa = new usuario();
        //Usar setVisible para hacer visible la ventana 
        Uventa.setVisible(true);
        //Se usa el método dispose para cerrar la ventana actual, la ventana de Interfaz
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    //Metodo de boton AÑADIR MATERIAL
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //Se instancia un objeto de la clase almacen, para la ventana de "Añadir Material"
        almacen a = new almacen();
        //Usar setVisible para hacer visible la ventana 
        a.setVisible(true);
        //Se usa el método dispose para cerrar la ventana actual, la ventana de Interfaz
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed
    //Metodo de boton SALIR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Cerrar la aplicación al presionar el botón
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
