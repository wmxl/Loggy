<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
import="java.util.*"
import="org.wmxl.dao.LogDao" 
import= "org.wmxl.model.Log"
import= "org.wmxl.model.VideoLog"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Page</title>
</head>
<body>
<h3>Upload Page</h3>
<%
Log log = (Log)session.getAttribute("log");
%>

<form action="update" method="post">

	<input type="hidden" name="id" value="<%out.print(log.getId());%>"/>
	<br>Log Name:<input type="text" name="name" value="<%out.print(log.getName());%>"/>
	<br>Description:<input type="text" name="description" value="<%out.print(log.getDescription());%>"/>
	<br>Content:<input type="text" name="data" value="<%out.print(log.getData());%>"/>
	<br>Size:<input type="text" name="size" value="<%out.print(log.getSize());%>"/> (leave it blank if you choice Text)
	<br>Type:<input type="text" name="type" value="<%out.print(log.getType());%>"/> (leave it blank if you choice Text)
	
	<br><input type="submit" />
</form>

</body>
</html>