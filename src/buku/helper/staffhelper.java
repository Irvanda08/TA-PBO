/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku.helper;
import buku.controller.logincontroller;
import java.sql.*;
import java.util.logging.Logger;

public class staffhelper {
    connectorperpus conn;
    private static final Logger LOG = Logger.getLogger(logincontroller.class.getName());
    public staffhelper(connectorperpus db){
        this.conn=db;
    }
    
    public ResultSet getKaryawanByUsername(String username,String password){
        
        String query = "SELECT * FROM staff WHERE USERNAME = \""+username+"\""+"AND PASSWORD = \""+password+"\"";
        try{
        
            ResultSet rs = this.conn.statement.executeQuery(query);
            if(rs.next()){
                LOG.info(rs.getString("nama_staff"));
                return rs;
            }
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public void closeConnection() throws SQLException{
        conn.conn.close();
    }
}
