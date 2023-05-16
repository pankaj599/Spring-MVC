<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Using Model</title>
</head>
<body>
	<h1>this is home page guys</h1>
	<%
	String st=(String)request.getAttribute("name");
	List<String> x=(List<String>)request.getAttribute("nm");
	%>
	<h1>
	Name is <%=st %></h1>
	<h1>
	friends list is 
	<%
	for(String p:x)
	{
		out.println(p);
	}
	%></h1>
</body>
</html>