package com.callcentre.addemployee;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.callcenter.util.dbconnection.AddEmployeeDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddEmployeeAction extends ActionSupport implements SessionAware {
	String name;
	String email;
	String address;
	String mobile;
	String designation;
	String qualification;
	String gender;
	String password;
	String dob;
	String maritalstatus;
	String employeeId;
	String adminId;

	private SessionMap<String, Object> session = null;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;

	}

	@Override
	public void validate() {
		if (adminId == null || "".equals(adminId.trim())) {
			addFieldError("adminId", "Admin Id is required.");

		}
		if (name == null || "".equals(name.trim())) {
			addFieldError("name", "Employee name is required.");
		}
		if (employeeId == null || "".equals(employeeId.trim())) {
			addFieldError("employeeId", "Employee Id is required.");
		}
		if (address == null || "".equals(address.trim())) {
			addFieldError("address", "Address is required.");
		}
		if (designation == null || "".equals(designation.trim())) {
			addFieldError("designation", "Designation is required.");
		}
		if (qualification == null || "".equals(qualification.trim())) {
			addFieldError("qualification", "Qualification is required.");
		}
		if (password == null || "".equals(password.trim())) {
			addFieldError("password", "Password is required.");
		}
		if ((dob == null || "".equals(dob.trim()))) {
			addFieldError("dob", "DOB is required.");
		}
		if(!dob.matches("[1-2][7-9][7-9][0-9]-[0-1][0-9]-[0-3][0-9]")){
			
			addFieldError("dob", "DOB should be in correct format.");
			
		}
		
		if (email == null || "".equals(email.trim()) || (!email.contains("@"))) {
			addFieldError("email", "Enter correct from of Email id");
		}
	}

	public String execute() {
		AddEmployeeDAO dao = new AddEmployeeDAO();
		Boolean flag = dao.addEmployee(this);
		System.out.println(flag);
		if (!flag) {
			addActionError("Please, enter correct details");
			return "input";
		} else {
			addActionError("Added Successfully!!");
		}

		return "success";
	}

}
