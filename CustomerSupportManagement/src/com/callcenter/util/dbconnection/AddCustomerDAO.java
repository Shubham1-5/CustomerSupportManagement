package com.callcenter.util.dbconnection;

import java.math.BigInteger;
import java.sql.SQLException;

import com.callcenter.user.AddCustomerAction;

public class AddCustomerDAO extends BaseDAO {

	Boolean flag;

	public boolean addCustomer(AddCustomerAction addCustomerAction) {

		String sqlQuery = "INSERT INTO USER(userId,uName,user_mail,uMobile,uAddress,uPassword)VALUES(?,?,?,?,?,?)";
		createConnection();
		try {
			preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setString(1, addCustomerAction.getUserId());
			preparedStatement.setString(2, addCustomerAction.getUserName());
			preparedStatement.setString(3, addCustomerAction.getUserEmail());
			preparedStatement.setString(4, addCustomerAction.getUserMobile().toString());
			preparedStatement.setString(5, addCustomerAction.getUserAddress());
			preparedStatement.setString(6, addCustomerAction.getPassword());
			flag = preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnections();
		}
		System.out.println(flag);
		if (!flag) {
			return true;
		}
		return false;
	}
}
