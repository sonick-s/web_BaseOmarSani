/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class conexion {
   

    Connection conectar = null;
    
    String usuario="root";
    String Contraseña="ismael2004";
    String db="scbint";
    String ip="localhost";
    String puerto="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+db;
    
    public Connection estableceConexion(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar=DriverManager.getConnection(cadena,usuario,Contraseña);
        JOptionPane.showConfirmDialog(null, "la conecion esta good");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error a la conexion"+e);
        }
        return conectar;
    
    
    }
    
}
