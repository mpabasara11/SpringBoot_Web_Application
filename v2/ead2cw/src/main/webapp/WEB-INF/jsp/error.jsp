<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
if(response.getStatus() == 500){ %>
<center><font color="red"><%=exception.getMessage() %></font></center><br>

<%-- include login page --%>
<%@ include file="home.jsp"%>
<%}else {%>
Hi There, error code is <%=response.getStatus() %><br>
Please go to <a href="/">home page</a>
<%}
%>

</body>
</html>