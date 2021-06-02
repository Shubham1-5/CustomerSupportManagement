package com.callcenter.util.dbconnection;

import java.sql.SQLException;

import com.callcentre.addemployee.AddEmployeeAction;

public class AddEmployeeDAO extends BaseDAO {

	Boolean flag=true;

	public boolean addEmployee(AddEmployeeAction addEmployeeAction) {

		String sqlQuery = "INSERT INTO EMPLOYEE(AdmId,empId,empName,emp_mail,emp_address,Gender,dob,MaritalStatus,designation,qualification,emp_password)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		createConnection();

		try {
			preparedStatement = connection.prepareStatement(sqlQuery);

			preparedStatement.setString(1, addEmployeeAction.getAdminId());
			preparedStatement.setString(2, addEmployeeAction.getEmployeeId());
			preparedStatement.setString(3, addEmployeeAction.getName());
			preparedStatement.setString(4, addEmployeeAction.getEmail());
			preparedStatement.setString(5, addEmployeeAction.getAddress());
			preparedStatement.setString(6, addEmployeeAction.getGender());
			preparedStatement.setString(7, addEmployeeAction.getDob());
			preparedStatement.setString(8, addEmployeeAction.getMaritalstatus());
			preparedStatement.setString(9, addEmployeeAction.getDesignation());
			preparedStatement.setString(10, addEmployeeAction.getQualification());
			preparedStatement.setString(11, addEmployeeAction.getPassword());
			flag = preparedStatement.execute();
			System.out.println(flag);

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
