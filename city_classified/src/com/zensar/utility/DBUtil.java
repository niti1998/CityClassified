package com.zensar.utility;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getDbConnection() {

		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/city_classified";
		String dbUserName = "root";
		String dbPassword = "root";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			 con = DriverManager.getConnection(url, dbUserName, dbPassword);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
