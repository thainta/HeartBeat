/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import connect.OracleConnUtils;
/**
 *
 * @author tuanpham
 */
public class TestConnectJDBC {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        return OracleConnUtils.getOracleConnection();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Get connection...");
        Connection conn = TestConnectJDBC.getConnection();
        System.out.println("Get connection " + conn); 
        System.out.println("Done!");
    }
}
