// uwu

package contactapp;

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
