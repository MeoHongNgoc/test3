package test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* @author MeoHongNgoc*/

public class DAO {
    public static Connection getConnection(){
            try {
                Connection cons = null;
                cons = DriverManager.getConnection("jdbc:sqlserver://MEO-HONG-NGOC\\SQLEXPRESS:1433;"
                        + "databaseName=Test3;"
                        + "user = sa ; password = 25102000");
                return cons;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return null;
        }
    public static void main(String[] args) {
        new DAO();
    }
}
