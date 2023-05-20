/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku.helper;
import buku.controller.logincontroller;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectorperpus {
    String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    String username = "root";
    String password = "";
    public Connection conn;
    Statement statement;
    
    private static final Logger LOG = Logger.getLogger(connectorperpus.class.getName());
    public connectorperpus(){
        try{
            conn = DriverManager.getConnection(dbUrl, username, password);
            createStatement();
            LOG.info("Koneksi DB Dibuat");
        }
        catch(SQLException exception){
            System.out.println(exception.getMessage());
        }
    }
    
    public void createStatement(){
        try {
            this.statement = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connectorperpus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}