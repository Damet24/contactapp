package contactapp;

public class Usuario {   
    
    private String id, nombre, correo;
    
    public Usuario(String id, String n, String c){
        this.id = id;
        nombre = n;
        correo = c;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
}
