<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Report</title>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th {
	height: 50px;
}

button {
	background-color: navy;
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	border-radius: 12px;
}
</style>
</head>
<body style="text-align: center;">
	<s:include value="pages/AdminHeader.jsp"></s:include>
	<s:form action="fetchRecords">
		<button type="submit" name="fetchData" value="fetchRecords">Fetch
			Customer Records</button>
	</s:form>
	<br>

	<s:if test="fetchData=='fetchRecords'">
		<h2 align="center">All Customer Records</h2>
		<fieldset>
			<div style="margin-right: 150px; margin-left: 150px;">
				<table>
					<thead>
						<tr style="background-color: #E0E0E1;">
							<th>User ID</th>
							<th>User Name</th>
							<th>User Address</th>
							<th>User email-id</th>
						</tr>
					</thead>
					<s:iterator id="custInfo" value="custlist">

						<tr>
							<td><s:property value="#custInfo.userId" /></td>
							<td><s:property value="#custInfo.userName" /></td>
							<td><s:property value="#custInfo.userAddress" /></td>
							<td><s:property value="#custInfo.user_mail" /></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</fieldset>
	</s:if>


	<div>

		<s:include value="pages/footer.jsp"></s:include>
	</div>
</body>
</html>