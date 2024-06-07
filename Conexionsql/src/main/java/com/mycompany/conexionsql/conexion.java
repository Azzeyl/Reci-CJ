
package com.mycompany.conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    Connection conectar = null;
    
    String usuario = "CPK";
    String contra = "uniminuto2022";
    String bd = "reciclaje";
    String ip = "localhost";
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try{
            String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd+";trustServerCertificate = true;";
            conectar= DriverManager.getConnection(cadena,usuario,contra);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error conectar "+ e.toString());
        }
        return conectar;
    }
    //Metodo obtenerResultado
    //Se pasa como parametro del metodo una variable de tipo String nombreEmpresa
    public String obtenerResultado(String nombreEmpresa) {
        //Se crea una variable de tipo String
        String resultado = "";
        try {
            //Se establece conexion con la base de datos
            Connection con = establecerConexion();
            // Se define la consulta SQL para obtener el estado de las devoluciones de la empresa especificada.
            String sql = "SELECT estado FROM devoluciones WHERE nombre_Empresa = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                // Se establece el valor del parámetro en la consulta SQL.
                ps.setString(1, nombreEmpresa);
                // Se ejecuta la consulta y se obtiene el conjunto de resultados.
                try (ResultSet rs = ps.executeQuery()) {
                    // Si hay resultados, se asigna el valor del estado a la variable resultado.
                    if (rs.next()) {
                        resultado = rs.getString("estado");
                    } else {
                        // Si no hay resultados, se asigna un mensaje indicando que no se encontraron resultados.
                        resultado = "No se encontraron resultados";
                    }
                }
            }
        } catch (SQLException e) {
            // En caso de excepción SQL, se imprime la traza de la excepción y se asigna un mensaje de error a la variable resultado.
            e.printStackTrace();
            resultado = "Error al obtener el resultado";
        }
        // Se devuelve el resultado (estado de las devoluciones o mensaje de error).
        return resultado;
    }
    
    public void eliminarDevolucion(int idDevolucion) {
        try (Connection con = establecerConexion()) {
            con.setAutoCommit(false);

            String sql = "DELETE FROM devoluciones WHERE id_devolucion = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idDevolucion);
                ps.executeUpdate();
            }

            con.commit(); // Confirma la transacción
        } catch (SQLException e) {
            e.printStackTrace();
            // Si ocurre un error, realiza un rollback para deshacer la transacción
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }
    }
    
    public void eliminarEmpresa(int idEmpresa) {
        try (Connection con = establecerConexion()) {
            con.setAutoCommit(false);

            String sql = "DELETE FROM empresa WHERE id_empresa = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idEmpresa);
                ps.executeUpdate();
            }

            con.commit(); // Confirma la transacción
        } catch (SQLException e) {
            e.printStackTrace();
            // Si ocurre un error, realiza un rollback para deshacer la transacción
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }
    }
    
    public void eliminarAlmacen(int idAlmacen) {
        try (Connection con = establecerConexion()) {
            con.setAutoCommit(false);

            String sql = "DELETE FROM almacen WHERE id_almacen = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idAlmacen);
                ps.executeUpdate();
            }

            con.commit(); // Confirma la transacción
        } catch (SQLException e) {
            e.printStackTrace();
            // Si ocurre un error, realiza un rollback para deshacer la transacción
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }
    }
    
    public void eliminarUsuario(int idUsuario) {
        try (Connection con = establecerConexion()) {
            con.setAutoCommit(false);

            String sql = "DELETE FROM usuario WHERE id_usuario = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idUsuario);
                ps.executeUpdate();
            }

            con.commit(); // Confirma la transacción
        } catch (SQLException e) {
            e.printStackTrace();
            // Si ocurre un error, realiza un rollback para deshacer la transacción
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
        }
    }
}
