/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Socio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crack
 */
public class msocios extends BD{
    public void asistenacias(String columna, String tabla){
        try {
            ResultSet r = this.consultar("select max(" + columna + ") from " + tabla);
            while (r.next()) {
//                return r.getInt(1);
            }
//            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(msocios.class.getName()).log(Level.SEVERE, null, ex);
//            return 0;
        }
    }
    
    public void registrarsocio(Socio s){
        Socio ss = s;
        int g;
        int est;
        if (s.isSexo()) {
            g = 1;
        }else{
            g = 0;
        }
        if (s.isEtd()) {
            est = 1;
        }else{
            est = 0;
        }
        
        this.insertar("socio", "ID,Nombre,Apellido,Edad,Sexo,Foto,Direccion,ETD,ID_Usuario",  s.getId()+",'"+s.getNombre()+"','"+s.getApellidos()+
        "',"+s.getEdad()+",'"+g+"','"+s.getFoto()+"','"+s.getDireccion()+"','"+est+"'");
    }
    
}
