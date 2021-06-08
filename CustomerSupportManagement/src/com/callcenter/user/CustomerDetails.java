package com.callcenter.user;

import java.io.Serializable;

public class CustomerDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId, userName, userAddress, user_mail;

	public CustomerDetails(String userId, String uName, String uAddress, String user_mail) {
		super();
		this.userId = userId;
		this.userName = uName;
		this.userAddress = uAddress;
		this.user_mail = user_mail;
	}

	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

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

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
}
