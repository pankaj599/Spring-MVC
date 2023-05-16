<!DOCTYPE html>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.List"%>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>ModelAndView</title>
</head>
<body>
	<h1>yo</h1>
	<%
	Integer i=(Integer)request.getAttribute("rollno.");
	LocalDateTime ti=(LocalDateTime)request.getAttribute("time");%>
	
	<h1>
	roll no is <%=i %>
	<br>
	Time is <%=ti %></h1>
	<h1>address is using expression language is "" ${address }</h1>
</body>
</html>