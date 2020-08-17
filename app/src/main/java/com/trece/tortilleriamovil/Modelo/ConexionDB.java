package com.trece.tortilleriamovil.Modelo;

import android.widget.Toast;

import java.sql.*;

public class ConexionDB {
    private Connection con = null;

    public Connection conectarDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.1.82:3306/proyectotortilleria","root","");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return con;
    }
    
}
