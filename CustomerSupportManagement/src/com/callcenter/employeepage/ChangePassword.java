package com.callcenter.employeepage;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;


import com.callcenter.util.dbconnection.ChangePaawordDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

public class ChangePassword extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session;
	private String empId;
	private String oldPassword;
	private String newPassword;
	
	

	public String getEmpId() {
		return empId;
	}



	@RequiredFieldValidator(type=ValidatorType.FIELD, message="Employee Id is required")
	public void setEmpId(String empId) {
		this.empId = empId;
	}



	public String getOldPassword() {
		return oldPassword;
	}


	@RequiredFieldValidator(type=ValidatorType.FIELD, message="Old Password is required")
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}



	public String getNewPassword() {
		return newPassword;
	}


	@RequiredFieldValidator(type=ValidatorType.FIELD, message="New Password is required")
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
		
	}

	@Override
	public void validate() {

		
	}
	

public String execute() {
	// JDBC Call here
	System.out.println("in execute method");
	ChangePaawordDAO dao = new ChangePaawordDAO();
	boolean flag = dao.validateLogin(this);
	if(!flag)
	{
		addActionError("Invalid password. Try Again");
		return "input";
		
	}
	else{
		addActionError("SuccessFully Changed.");
		
		return "success";
		
	}
	

}
}