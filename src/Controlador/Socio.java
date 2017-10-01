/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
/**
 *
 * @author crack
 */
public class Socio {
    
    //Variables
    int id;
    String nombre;
    String apellidos;
    int edad;
    boolean sexo; //false = mujer, True = Hombre
    String foto;
    String Direccion;
    boolean etd;
    
    //Instanciar Modelo
    msocios ms = new msocios();
    
    //Los setter
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEtd(boolean etd) {
        this.etd = etd;
    }
    
    //Los getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public String getFoto() {
        return foto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public boolean isEtd() {
        return etd;
    }
    
    public void registrarsocio(int id, String nombre, String apellidos, int edad, boolean sexo, String foto, String Direccion, boolean etd){
        Socio s = new Socio();
        s.setApellidos(apellidos);
        s.setDireccion(Direccion);
        s.setEdad(edad);
        s.setEtd(etd);
        s.setFoto(foto);
        s.setId(id);
        s.setNombre(nombre);
        s.setSexo(sexo);
        ms.registrarsocio(s);
    }
    
}
