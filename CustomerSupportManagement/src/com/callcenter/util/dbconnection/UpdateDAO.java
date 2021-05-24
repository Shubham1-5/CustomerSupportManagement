package com.callcenter.util.dbconnection;

import java.sql.SQLException;

import com.callcenter.user.UpdateQueryAction;

public class UpdateDAO extends BaseDAO {

	int flag;

	public boolean addUpdate(UpdateQueryAction updateQueryAction) {
		// TODO Auto-generated method stub

		String sqlQuery = "UPDATE EMPUSERTXN SET STATUS=? WHERE USERID=? AND QUERYID=?";
		createConnection();

		try {
			preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setString(1, updateQueryAction.getStatus());
			preparedStatement.setString(2, updateQueryAction.getCustomerId());
			preparedStatement.setInt(3, updateQueryAction.getQueryId());

			flag = preparedStatement.executeUpdate();
			System.out.println(flag);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnections();
		}
		System.out.println(flag);
		if (flag>0) {
			System.out.println("return true");
			
			return true;
				}
		return false;

	}

}
