<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Using Model</title>
</head>
<body>
	<%
	String N=(String)request.getAttribute("name");
	String Eml=(String)request.getAttribute("email");%>
	
	<h1>Name is <%=N %></h1>
	<h1>Email is <%=Eml %></h1>
	<h1>Password is ${password }</h1>
</body>
</html>