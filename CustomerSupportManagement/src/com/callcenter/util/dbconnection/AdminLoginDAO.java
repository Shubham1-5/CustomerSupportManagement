package com.callcenter.util.dbconnection;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.callcenter.adminpage.AdminAction;

public class AdminLoginDAO extends BaseDAO {

	public boolean validateLogin(AdminAction loginAction) {

		String sqlQuery = "SELECT * FROM ADMIN WHERE ADMID=? ";

		createConnection();

		try {
			preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setString(1, loginAction.getAdminId());

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String passInDB = resultSet.getString(2);

				if (passInDB.equals(loginAction.getPassword())) {
					System.out.println("login success");
					return true;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnections();
		}

		return false;
	}

}
