/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import qlks.modal.User;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class UserDao {

    private java.sql.Connection connection;

    public java.sql.Connection getConnection() {
        return connection;
    }

    public void setConnection(java.sql.Connection conn) {
        this.connection = conn;
    }

    public java.sql.Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBCconnection.driverName);
        connection = DriverManager.getConnection(JDBCconnection.dbURL, JDBCconnection.dbUser, JDBCconnection.dbPass);
        System.out.println("CONNECTTED!");
        return connection;
    }

    public List<User> getAllUsers() throws ClassNotFoundException, SQLException {
        List<User> users = new ArrayList<User>();

        connection = getConnect();

        String sql = "SELECT * FROM khack_hang";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("UserName"));
                user.setGioiTinh(rs.getString("GioiTinh"));
                user.setPhone(rs.getString("phone"));
                user.setLoaiPhong(rs.getString("loai_phong"));
                user.setGiaPhong(rs.getString("gia_phong"));
                user.setTinhTrang(rs.getString("tinh_trang"));
                users.add(user);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public void addUser(User user) throws ClassNotFoundException, SQLException {
        connection = getConnect();

        String sql = "INSERT INTO khack_hang(UserName,GioiTinh,phone,loai_phong,gia_phong,tinh_trang) VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getGioiTinh());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getLoaiPhong());
            preparedStatement.setString(5, user.getGiaPhong());
            preparedStatement.setString(6, user.getTinhTrang());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) throws ClassNotFoundException, SQLException {
        connection = getConnect();

        String sql = "UPDATE khack_hang SET UserName = ? GioiTinh= ? phone = ? loai_phong = ? gia_phong= ? tinh_trang=? WHERE ID = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getGioiTinh());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getLoaiPhong());
            preparedStatement.setString(5, user.getGiaPhong());
            preparedStatement.setString(6, user.getTinhTrang());
            preparedStatement.setInt(7, user.getId());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) throws ClassNotFoundException, SQLException {
        connection = getConnect();

        String sql = "delete from khack_hang where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
