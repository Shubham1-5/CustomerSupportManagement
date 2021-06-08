package com.callcenter.util.dbconnection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.callcenter.user.CustomerDetails;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.ResultSet;

public class CustomerDAO {

	protected Connection connection = null;
	protected Statement statement = null;
	protected PreparedStatement preparedStatement = null;
	protected java.sql.ResultSet resultset;

	public List<CustomerDetails> getCustomerData() {

		try {
			new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ResourceBundle bundle = ResourceBundle.getBundle("callcenterapplication");
		String url = bundle.getString("dburl");
		String user = bundle.getString("dbuser");
		String password = bundle.getString("dbpassword");

		List<CustomerDetails> custlist = new ArrayList<CustomerDetails>();
		CustomerDetails customeDetails = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection successfull.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			statement = connection.createStatement();
			String sqlquery = "SELECT userId,uName,uAddress,user_mail FROM user";
			resultset = statement.executeQuery(sqlquery);

			if (resultset != null) {
				while (resultset.next()) {
					customeDetails = new CustomerDetails();
					customeDetails.setUserId(resultset.getString("userId"));
					customeDetails.setUserName(resultset.getString("uName"));
					customeDetails.setUserAddress(resultset.getString("uAddress"));
					customeDetails.setUser_mail(resultset.getString("user_mail"));
					custlist.add(customeDetails);
				}
			}
		} catch (SQLException e1) {
			e1.printStackTrace();

		} finally {
			try {
				resultset.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return custlist;
	}
}