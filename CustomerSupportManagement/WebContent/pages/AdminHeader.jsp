<%@taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link type="text/css" rel="stylesheet" href="css/Admin.css" />
</head>
<body>
	<img src="images/Adm_Header.jpg" height="350" width="1400" />
	<br>
	<br>
	<div align="center" id="menu">
		<ul>
			<li><s:a>Employee</s:a>
				<ul>
					<li><s:a href="addEmployee">Add Employee</s:a></li>
					<li><s:a href="manageEmployee">Employee Management</s:a></li>

				</ul></li>
			<li><s:a>Customer</s:a>
				<ul>
					<li><s:a href="manageCustomer">Customer Management</s:a></li>
					<li><s:a href="queryManagement">Query Management</s:a></li>
				</ul></li>
			<li><s:a>Service</s:a>
				<ul>

					<li><s:a href="assignCustomer">Assign to Employee</s:a></li>
				</ul></li>
			<li><s:a>Reports</s:a>
				<ul>
					<li><s:a href="employeeReport">Employee Report</s:a></li>
					<li><s:a href="customerReport">Customer Report</s:a></li>
				</ul></li>
			<li><s:a href="signOut">Sign out</s:a></li>
		</ul>
	</div>
	<br />
	<br />
	<br />