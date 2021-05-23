package com.callcenter.util.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.mysql.jdbc.Driver;

public class BaseDAO {

	protected Connection connection = null;
	protected Statement statement = null;
	protected PreparedStatement preparedStatement = null;
	protected ResultSet resultSet = null;

	public void createConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResourceBundle bundle = ResourceBundle.getBundle("callcenterapplication");
		String url = bundle.getString("dburl");
		String user = bundle.getString("dbuser");
		String password = bundle.getString("dbpassword");
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection successfull.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void closeConnections() {

		try {
			if (!connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
