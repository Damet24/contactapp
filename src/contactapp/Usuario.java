/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactapp;

/**
 *
 * @author Damet
 */
public class Usuario {

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
    private String id, nombre, correo;
    
    public Usuario(String id, String n, String c){
        this.id = id;
        nombre = n;
        correo = c;
    }
}
