<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "s" uri = "/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Call Action</title>
<style>
.button {
    background-color: #0055ff;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>

</head>
<body>
<s:include value="pages/EmployeeHeader.jsp"></s:include>
<div align="center" style="margin-top:10%; margin-bottom:5% ">
	<s:form action="">
	<input type="submit" class="button" value="Recieve Call">
</s:form>
</div>

<s:include value="pages/footer.jsp"></s:include>
</body>
</html>