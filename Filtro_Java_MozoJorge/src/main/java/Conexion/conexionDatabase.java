/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author camper
 */
public class conexionDatabase {
    public String driver = "com.mysql.cj.jdbc.Driver" ;
    
    // nombre de la BBDD
    public String database = "KanohaDDBB" ;
    
    //Host
    public String hostname = "172.16.101.157" ;
    
    //puerto 
    public String port = "3306" ;
    
    // Ruta de la base de datos 
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    
    // UserName 
    public String username = "root";
    
    
     // User Password
    public String password = "1099738869" ;
    
    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
        }

        return conn;
    }
}
