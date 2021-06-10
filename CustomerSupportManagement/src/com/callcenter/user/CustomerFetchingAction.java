package com.callcenter.user;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callcenter.util.dbconnection.CustomerDAO;
import com.mysql.jdbc.ResultSet;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerFetchingAction extends ActionSupport {
	List<CustomerDetails> custlist = null;
	String fetchData = null;
	CustomerDAO daoObj = null;

	public List<CustomerDetails> getCustlist() {
		return custlist;
	}

	public void setCustlist(List<CustomerDetails> custlist) {
		this.custlist = custlist;
	}

	public String getFetchData() {
		return fetchData;
	}

	public void setFetchData(String fetchData) {
		this.fetchData = fetchData;
	}

	public CustomerDAO getDaoObj() {
		return daoObj;
	}

	public void setDaoObj(CustomerDAO daoObj) {
		this.daoObj = daoObj;
	}

	public String execute() throws SQLException {
		if (fetchData.equals("fetchRecords")) {
			custlist = new ArrayList<CustomerDetails>();
			custlist = new CustomerDAO().getCustomerData();
		}
		return "SUCCESS";
	}
}
