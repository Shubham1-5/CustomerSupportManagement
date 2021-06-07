<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Admin Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<s:include value="pages/welcomeHeader.jsp"></s:include>
	<hr>
	<br>
	<br>
	<div align="center"
		style="background-color: #b3b3ff; height: 28%; width: 99%">
		<s:form action="Adminlogin">
			<br>
			<div align="center"
				style="font-size: 20px; font-weight: bold; text-decoration: underline">Admin
				Login</div>
				<br>
			<div>
				<s:textfield name="AdminId" label="Enter Admin Id"></s:textfield>

				<s:password name="password" label="Enter Password"></s:password>
				<s:submit value="Login" cssClass="btn btn-success"></s:submit>
				<s:actionerror />
			</div>
		</s:form>

	</div>
	<div>
		<s:include value="pages/footer.jsp"></s:include>
	</div>
</body>

</html>