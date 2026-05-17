/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jccam
 */
public class Conexion {
    static String url="jdbc:mysql://localhost:3306/LIBRERIA";
    static String user="root";
   static String pass="tu contraseña";
   Connection con;

    public Conexion() {
        try
       {
       con=DriverManager.getConnection(url,user,pass);
           System.out.println("Conexión exitosa");
       }catch(SQLException e)
       {
        e.printStackTrace();
       }
    }

    public Connection getCon() {
        return con;
    }
}
