package com.mycompany.viveyatravel.servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.viveyatravel.modelo.dao.*;



public class ConectarBD {
    public Connection getConexion() {
        Connection cnx = null;
        
          String url = "jdbc:mysql://mysql-apptesting.alwaysdata.net:3306/apptesting_viajes?useTimeZone=true&"
                + "serverTimezone=UTC&autoReconnect=true";

        String user = "432080_viaje";
        String clave = "viaje2026";

        String Driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(Driver);
            cnx = DriverManager.getConnection(url, user, clave);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return  cnx;
    }
    
    public static void main(String[] args) throws SQLException {
        ConectarBD cdb = new ConectarBD();
        Connection cnx = cdb.getConexion();
        System.out.println("Conexion exitosa a " + cnx.getCatalog());
        
        
    }
}
