/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumni202457201031;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
/**
 *
 * @author asus
 */
public class koneksi {
    private static Connection mysqlconfig;
    
    public static Connection konek() {
        
        try {
            //url koneksi ke database:jdbc:mysql://[host]:[port]/[nama_database]
            String url = "jdbc:mysql://localhost:3306/alumni202457201031";
            
            //Username database
            String user = "root";
            
            //password database
            String pass = "";
            
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            //Menampilkan pesan error jika koneksi gagal
            System.err.println(e.getMessage());
        }
        
        //Mengembalikan objek koneksi (bisa null jika gagal)
        return mysqlconfig;    
    }    
}