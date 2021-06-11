package com.callcenter.user;

import java.math.BigInteger;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.callcenter.util.dbconnection.AddCustomerDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddCustomerAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session = null;
	public String userId;
	public String userName;
	public String userEmail;
	public String userMobile;
	public String userAddress;
	public String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = (SessionMap<String, Object>) session;

	}

	@Override
	public void validate() {

		if (userId == null || "".equals(userId.trim())) {
			addFieldError("userId", "User ID is required.");
		}
		if (userName == null || "".equals(userName.trim())) {
			addFieldError("userName", "Username is required.");
		}
		if (userEmail == null || "".equals(userEmail.trim()) || (!userEmail.contains("@"))) {
			addFieldError("userEmail", "Enter correct from of Email id");
		}
		if (userAddress == null || "".equals(userAddress.trim())) {
			addFieldError("userAddress", "User address is required.");
		}
		if (password == null || "".equals(password.trim())) {
			addFieldError("password", "Password is required.");
		}
		if ((userMobile == null || "".equals(userMobile.trim()))
				|| (!userMobile.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))) {
			addFieldError("userMobile", "User Mobile no. is required.");
		}
	}

	public String execute() {
		// JDBC Call here
		System.out.println("in execute method");
		AddCustomerDAO dao = new AddCustomerDAO();
		boolean flag = dao.addCustomer(this);
		System.out.println("login flag " + flag);
		if (!flag) {
			addActionError("Please Enter Correct Details.");
			return "input";
		} else {
			addActionError("Added Successfully!");
		}

		return "success";
	}
}
