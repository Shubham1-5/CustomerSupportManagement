<%@taglib uri="/struts-tags" prefix="s"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="css/style.css" />

<title>Welcome Employee</title>

</head>
<body>
	<s:include value="pages/EmployeeHeader.jsp"></s:include>
	<br>
	<br>
	<div>
	<br>
		<h1 align="center">
			<b>Welcome <s:property value="#session.empName" />!
			</b>
		</h1>
		<br>
	</div>
	<s:include value="pages/footer.jsp"></s:include>
</body>
</html>