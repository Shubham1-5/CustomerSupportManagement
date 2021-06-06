package com.callcenter.adminpage;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.RequestMap;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.callcenter.util.dbconnection.*;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport implements SessionAware {
	private SessionMap<String, Object> session;

	public String AdminId;
	public String password;

	public String getAdminId() {
		return AdminId;
	}

	public void setAdminId(String AdminId) {
		this.AdminId = AdminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = (SessionMap<String, Object>) session;

	}

	@Override
	public void validate() {

		if (AdminId == null || "".equals(AdminId.trim())) {
			addFieldError("AdminId", "Admin ID is required.");
		}
		if (password == null || "".equals(password.trim())) {
			addFieldError("password", "Password  is required.");
		}
	}

	public String execute() {
		// JDBC Call here
		System.out.println("in execute method");
		AdminLoginDAO dao = new AdminLoginDAO();
		boolean flag = dao.validateLogin(this);
		System.out.println("login flag " + flag);
		if (!flag) {
			addActionError("Please enter correct Admin id and password.");
			return "input";
		}

		session.put("AdminId", AdminId);
		return "success";
	}

}
