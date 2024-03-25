package co.edu.sena;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {

        String url="";
        String username="root";
        String password="";

        try {
            Connetion conn = DriverManager.getConnection(url,username,password);
            System.out.println("Conexion exitosa");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Fallo la conexion");
        }
        ;
    }
}