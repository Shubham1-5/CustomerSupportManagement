<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Query</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
	<s:include value="pages/EmployeeHeader.jsp"></s:include>

	<div align="center"
		style="border: 1; background-color: #80dfff; height: 75%; width: 100%; font-size: 150">


		<div>
			<font style="size: 40px; color: red;"> <s:actionerror />
			</font>

		</div>

		<s:form action="EmployeeaddQueryform">
			<div align="center"
				style="font-size: 20px; font-weight: bold; text-decoration: underline">Add
				Query</div>
			<br>
			<div>
				<s:textfield name="adminId" label="Admin Id"></s:textfield>
				<s:textfield name="userId" label="User Id" required="true"></s:textfield>
				<s:textfield name="EmpId" label="Employee Id" required="true"></s:textfield>
				<s:textfield name="queryId" label="Query Id" required="true"></s:textfield>

				<s:textarea name="description" label="Description" required="true"
					maxLength="50"></s:textarea>
				<s:textfield name="queryDate" label="Date" required="true"
					placeholder="YYYY-MM-DD"></s:textfield>


				<s:textfield name="status" label="Status" required="true"></s:textfield>


				<s:submit value="Submit"></s:submit>
				<s:submit value="Cancel"></s:submit>

			</div>

		</s:form>
	</div>
	<div>
		<s:include value="pages/footer.jsp"></s:include>
	</div>
</body>
</html>