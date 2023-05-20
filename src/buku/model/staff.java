/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku.model;
import buku.helper.connectorperpus;
import buku.helper.staffhelper;
import java.sql.SQLException;
import java.sql.ResultSet;

public class staff {
    private String username;
    private String password;
    private int Id;
    private String Nama;
    public staff(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return Id;
    }

    public String getNama() {
        return Nama;
    }
    
    public boolean getKaryawanByUsername(){
        staffhelper kh = new staffhelper(new connectorperpus());
        try{
            ResultSet rs = kh.getKaryawanByUsername(username,password);
            if(rs!=null){
                username = rs.getString("username");
                password = rs.getString("password");
                this.Id = rs.getInt("id_staff");
                this.Nama = rs.getString("nama_staff");
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
}
