<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service Management</title>

</head>
<body>
<s:include value="pages/AdminHeader.jsp"></s:include>
	
<center>
</b></center>
<br>
<br>
<s:form action="login">
<table style=border-color:black;background-color:#99ccff;   align="center"  width="99%" >
<tr>
<th>Select the mode of operation you want :</th>


<td ><input type="radio" name="record" value="Add new record">Add New Record
<input type="radio" name="record" value="Modify Old record">Modify Old Record</td>
</tr>
<br>
<tr align="center">
<td >User Id : <input type="text" name="userid"></td>
</tr>
<tr align="center" >
<td >QueryId : <input type="text" name="queryId"></td>
</tr>
<tr align="center">
<td >InchargeEmp :
 <select name="Employee">
<option>D</option>
<option>E</option>
<option>F</option>
</select></td>
</tr>
<tr align="center">
<td >Description : <input type="text" name="description"></td>
</tr>
<tr align="center" >
<td ><input type="submit" name="submit">
<input type="button" value="cancel"></td>
</tr>
</table>
</s:form>
<br>
<br>

<s:include value="pages/footer.jsp"></s:include>

</body>
</html>