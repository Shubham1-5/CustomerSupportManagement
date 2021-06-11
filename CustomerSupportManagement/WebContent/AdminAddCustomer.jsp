<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Add Customer</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
	<s:include value="pages/AdminHeader.jsp"></s:include>
	<div align="center"
		style="border: 1; background-color: #99ccff; height: 75%; width: 100%; font-size: 150">

		<s:form action="UserForm">
			<div align="center"
				style="font-size: 20px; font-weight: bold; text-decoration: underline">Add
				Customer</div>
			<br>

			<div>
				<s:textfield name="userId" label="User Id" required="true"></s:textfield>
				<s:textfield name="userName" label="User Name" required="true"></s:textfield>
				<s:textfield name="userEmail" label="Email Id" required="true"></s:textfield>
				<s:textfield name="userMobile" label="Mobile Number" required="true"></s:textfield>

				<s:textfield name="userAddress" label="Address" required="true"></s:textfield>

				<s:password name="password" label="Password" required="true"></s:password>

				<s:submit value="Register"></s:submit>
				<s:submit value="Cancel"></s:submit>

				<s:actionerror />

			</div>

		</s:form>
	</div>
	<br>
	<div>
		<s:include value="pages/footer.jsp"></s:include>
	</div>

</body>
</html>