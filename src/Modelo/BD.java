/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author crack
 */
public class BD {
    protected static Connection getConnection(){
        Connection conexion =null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor= "jdbc:mysql://localhost/Gym";
            String usuarioBD="root";
            String passwordDB="";
            conexion = DriverManager.getConnection(servidor,usuarioBD,passwordDB);
        }catch( ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex, "Error 1 en la conexion con la BD "+ ex.getMessage(),JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex, "Error 2 en la conexion con la BD"+ ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        }
        finally{
            return conexion;
        }
    }
}
