package contactapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    
    private static Connection Conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/db_contacts";
    
    public Conector(){
        Conn = null;
        try{
            Class.forName(driver);
            Conn = DriverManager.getConnection(url, user, password);
            if(Conn != null){
                System.out.println("Conexion: establecida");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error: " + e.getMessage());
        }
    }
    
    public Connection getConector(){
        return Conn;
    }
    
    public void Desconectar(){
        Conn = null;
        if(Conn == null){
            System.out.println("Conexion: desconectada");
        }
    }
}
