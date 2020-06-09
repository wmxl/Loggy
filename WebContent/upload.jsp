<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Page</title>
</head>
<body>
<h3>Upload Page</h3>

<form action="upload" method="post">
	<div>
		<label><input type="radio" name="logType" value="TextLog">Text</label>
		<label><input type="radio" name="logType" value="VideoLog">Video</label>
		<label><input type="radio" name="logType" value="AudioLog">Audio</label>
		<label><input type="radio" name="logType" value="ImageLog">Image</label>
	</div>
	<br>Log Name:<input type="text" name="name" />
	<br>Description:<input type="text" name="description" />
	<br>Content:<input type="text" name="data" />
	<br>Size:<input type="text" name="size" /> (leave it blank if you choice Text)
	<br>Type:<input type="text" name="type" /> (leave it blank if you choice Text)
	
	<br><input type="submit" />
</form>

</body>
</html>