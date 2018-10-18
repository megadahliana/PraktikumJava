/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumjava;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.Statement;
public class koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try {
            String url ="jdbc:mysql://localhost/db_bjbnew";
            String user="root";
            String pass="";
            Class.forName("con.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            
            System.out.println("Koneksi berhasil"); 
            
        } 
        catch (Exception e) {
        System.err.println("Koneksi gagal" +e.getMessage());
    }
    }
    
}
