/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class ClassKoneksi {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=biodataDB; encrypt=true; trustServerCertificate=true;";
    private static final String USERNAME = "sa";
    private static final String PASSWORD="ninisninis";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: "+e.getMessage());
        }
        return conn;
    }
}
