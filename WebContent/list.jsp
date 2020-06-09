<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"
import="java.util.*"
import="org.wmxl.dao.LogDao" 
import= "org.wmxl.model.Log"
import= "org.wmxl.model.VideoLog"
%>

<html>
<head>
    <title>Log List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>
<body>

<div class="container">
    <div>
        <h1>Loggy</h1>
    </div>
    <div>
        <h1><small>Log List</small></h1>
    </div>
    <div>
        <div>
            <a href="upload.jsp">upload new post</a>
        </div>
    </div>
    <div>
        <div>
            <table>
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Content</th>
                    <th>Options</th>
                </tr>
                </thead>
                <tbody>
                <%
                List<Log> logs = (List<Log>)session.getAttribute("logs");
                           
                for(int i = 0; i < logs.size();i++){
                	Log log = logs.get(i);
                	%>
                	<tr>
                        <td><%out.print(log.getName());%></td>
                        <td><%out.print(log.getDescription());%></td>
                        <td><%out.print(log.getData());%></td>
                        <td>
                        	<a href="delete?id=<%out.print(log.getId());%>">delete</a>|
                        	<a a href="edit?id=<%out.print(log.getId());%>">edit</a>
                        </td>
               		 </tr>
                <%}         
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
