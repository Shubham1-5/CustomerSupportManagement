<%@taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
	<title>Error</title>
</head>
 <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="lib/bootstrap/css/bootstrap-grid.min.css"></script>
<body>
<s:include value="pages/welcomeHeader.jsp"></s:include>
<div id="error">	
        <p style="font-size:20px;">This site is currently unavailable kindly contact the administrator</p>
        <br>
       <a type="button" href="contact.html" class="btn btn-danger">Back home</a>
 </div>
 <s:include value="pages/footer.jsp"></s:include>
</body>
<style type="text/css">
#error{
	padding-top: 290px;
	text-align: center;
}

</style>
</html>