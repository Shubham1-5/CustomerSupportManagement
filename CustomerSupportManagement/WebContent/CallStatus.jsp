<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Call Status</title>
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



		<s:form action="updateStatus">
			<div align="center"
				style="font-size: 20px; font-weight: bold; text-decoration: underline">Update
				Status</div>

			<br>
			<div>
				<s:textfield name="customerId" label="CustomerId" required="true"></s:textfield>
				<s:textfield name="queryId" label="Query ID" required="true"></s:textfield>
				<s:select list="{'Pending','Under Process','Completed'}" name="status"
				label="Status" required="true"></s:select>
			
				<s:submit value="Update" align="center"></s:submit>
				<s:submit value="Cancel" align="center"></s:submit>

			</div>
		</s:form>

	</div>
	<s:include value="pages/footer.jsp"></s:include>

</body>
</html>