package com.callcenter.user;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.callcenter.util.dbconnection.UpdateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateQueryAction extends ActionSupport implements SessionAware {

	String customerId;
	String status;
	Integer queryId;
	private SessionMap<String, Object> session;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getQueryId() {
		return queryId;
	}

	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = (SessionMap<String, Object>) session;

	}

	@override
	public void validate() {
		if ((customerId == null || "".equals(customerId.trim())) || (queryId == null)) {
			addFieldError("error", "All field are required.");

		}

	}

	public String execute() {
		// JDBC Call here
		System.out.println("in execute method");
		UpdateDAO update = new UpdateDAO();
		boolean flag = update.addUpdate(this);
		System.out.println(flag);
		if (!flag) {
			System.out.println("not found");
			addActionError("Match not found!");
			return "input";
		} else {
			addActionError("Updated Successfully!");
			System.out.println("found");
			return "success";
		}
	}
}
