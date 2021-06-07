package com.callcenter.util.dbconnection;
import java.sql.PreparedStatement;
import com.callcenter.employeepage.ChangePassword;
import java.sql.SQLException;
public class ChangePaawordDAO extends BaseDAO{
	boolean flag1,flag=true;
	public boolean validateLogin(ChangePassword loginAction){
		String sqlQuery = "SELECT * FROM EMPLOYEE WHERE EMPID=?";
		String updateQuery="UPDATE EMPLOYEE SET EMP_PASSWORD=? WHERE EMPID=?";
		createConnection();

		try {
			preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setString(1, loginAction.getEmpId());

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				String passInDB = resultSet.getString(11);
				String empName=resultSet.getString(3);
				if (passInDB.equals(loginAction.getOldPassword())) {
					System.out.println("login success");
					flag1=true;
					
				}
			}
				if(flag1)
				{
					System.out.println("in update password");
					preparedStatement = connection.prepareStatement(updateQuery);
					preparedStatement.setString(1, loginAction.getNewPassword());
					preparedStatement.setString(2, loginAction.getEmpId());

					 flag=preparedStatement.execute();
					
				}
					if(!flag)
					{	
						System.out.println("update successfully");
						return true;
					}
					
		}
		
		 catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnections();
		}

		return false;
	}



		
	}


