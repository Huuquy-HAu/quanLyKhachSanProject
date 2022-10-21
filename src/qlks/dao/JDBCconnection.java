/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class JDBCconnection {
    
    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

//localhost:<PORT>  databaseName=<Tên của database vừa tạo>
    public static String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=quan_ly_khack_san;integratedSecurity=true;"
                                   + "encrypt=true;trustServerCertificate=true;";

// Vẫn chừa trống, mặc dù không dùng
    public static String dbUser = "";
    public static String dbPass = "";
}
