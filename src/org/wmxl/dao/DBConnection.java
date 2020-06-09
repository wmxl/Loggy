package org.wmxl.dao;
import java.sql.*;

public class DBConnection {
	static String  driverClass = "com.mysql.jdbc.Driver";
	static String dbUrl = "jdbc:mysql://localhost:3306/log_db";
	static String userNmae = "root";
	static String passWord = "Qq@5623238";
	
	public static Connection getConnection(){
		Connection connection = null;
        try {
        	Class.forName(driverClass);
        	connection = DriverManager.getConnection(dbUrl,userNmae,passWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("connection DB successfully!");
        return connection;
    }
    public static void closeAll(Connection connection){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
