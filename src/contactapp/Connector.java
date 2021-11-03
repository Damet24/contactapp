/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Damet
 */
public class Connector {
    private static Connection Conn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/db_contacts";
    
    public Connector(){
        Conn = null;
        try{
            Class.forName(driver);
            Conn = DriverManager.getConnection(url, user, password);
            if(Conn != null){
                System.out.println("Coneccion establecida!");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error: " + e.getMessage());
        }
    }
    
    public Connection getConnecton(){
        return Conn;
    }
    
    public void Disconnect(){
        Conn = null;
        if(Conn == null){
                System.out.println("Se ha desconectado:");
            }
    }
}
