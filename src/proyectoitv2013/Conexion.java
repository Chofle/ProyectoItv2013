/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itv2013;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
  
    static Connection conexion = null;
    
    public static boolean conectar(String host, String usuario, String pass) {        
        try {
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://"+host+"/itv2013",
                    usuario, pass);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}