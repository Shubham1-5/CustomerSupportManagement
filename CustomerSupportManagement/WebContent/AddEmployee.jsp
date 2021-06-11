<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>

</head>

<body>
	<s:include value="pages/AdminHeader.jsp"></s:include>



	<s:form action="addEmployeeform" method="post">

		<div>
			<font style="size: 40px; color: red;"> <s:actionerror />
			</font>

		</div>

		<div align="center"
			style="font-size: 20px; font-weight: bold; text-decoration: underline">Add
			Employee</div>


		<table align="center"
			style="border: 1; background-color: #80dfff; height: 75%; width: 100%; font-size: 150">

			<s:textfield name="adminId" label="Admin Id" required="true"></s:textfield>
			<s:textfield name="name" label="Name" required="true"></s:textfield>
			<s:textfield name="employeeId" label="Employee ID" required="true"></s:textfield>
			<s:textfield name="email" label="Email ID" required="true"></s:textfield>

			<s:textfield name="address" label="Address" required="true"></s:textfield>



			<s:textfield name="designation" label="Designation" required="true"></s:textfield>

			<s:textfield name="qualification" label="Qualification"
				required="true"></s:textfield>


			<s:radio list="{'M','F'}" label="Gender" name="gender"
				required="true"></s:radio>

			<s:password name="password" label="Password" required="true"></s:password>

			<s:textfield name="dob" label="Date of Birth"
				placeholder="YYYY-MM-DD"></s:textfield>

			<s:select list="{'Married','Single','Widow'}" name="maritalstatus"
				label="Marital Status" required="true">

			</s:select>


			<s:submit align="center" value="Register"></s:submit>
			<s:submit align="center" value="Cancel"></s:submit>

		</table>

	</s:form>
	<br>

	<div>
		<s:include value="pages/footer.jsp"></s:include>
	</div>
</body>
</html>