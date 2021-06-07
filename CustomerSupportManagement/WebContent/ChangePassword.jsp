<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Change Password</title>

</head>
<body>
	<div>
		<s:include value="pages/EmployeeHeader.jsp"></s:include>
	</div>
	<div align="center" style="background-color: #b3b3ff; width: 99%">
		<div style="color: red">
			<s:actionerror />
			<s:actionmessage />
		</div>
		<s:form action="changeEmployeePassword" validate="true" method="post">
			<br>

			<s:textfield name="empId" label="Enter Employee Id"></s:textfield>
			<s:password name="oldPassword" label="Enter Old Password"></s:password>
			<s:password name="newPassword" label="Enter New Password"></s:password>


			<s:submit value="ChangePassword" cssClass="btn btn-success"></s:submit>



		</s:form>
	</div>

	<div>
		<s:include value="pages/footer.jsp"></s:include>
	</div>

</body>
</html>