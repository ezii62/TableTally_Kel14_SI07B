/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.*;

/**
 *
 * @author FAHREZI FIKRI AL KHAFID_2311103056_SI07B
 */
public class db_connection {
    static final String URL ="jdbc:mysql://localhost:3306/tabletally";
    static final String USER ="root";
    static final String PASSWORD ="";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

