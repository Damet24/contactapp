/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactapp;

/**
 *
 * @author danie
 */
public class Sesion {
    private static Usuario usuario;
    
    public static String getUserId(){
        return usuario.getId();
    }
    
    public static String getUserEmail(){
        return usuario.getCorreo();
    }
    
    public static String getUserName(){
        return usuario.getNombre();
    }
    
    public static void InitSesion(Usuario u){
        usuario = u;
    }
}
