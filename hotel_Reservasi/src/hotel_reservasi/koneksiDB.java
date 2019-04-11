/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_reservasi;

/**
 *
 * @author Buala
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksiDB {
    // Menyiapkan paramter JDBC untuk koneksi ke datbase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/hotel_reservation";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
        
        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
            // buat query ke database
            String sql = "SELECT * FROM customer";
            
            
                     // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            // tampilkan hasil query
            
            while(rs.next()){
                System.out.println("email: " + rs.getString("email"));
                System.out.println("nama: " + rs.getString("nama"));
                System.out.println("password: " + rs.getString("pass"));
                System.out.println("nomor telepon: " + rs.getString("nomor_telepon"));
            }
            
            stmt.close();
            conn.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }
    
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hotel_reservation", "root", "");
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
}; //To change body of generated methods, choose Tools | Templates.