<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #3366FF;
  color: white;
}
</style>
</head>
<body>
<h1>Book List</h1>
<table id="customers">
<thead>
  <tr>

    <th>Book Id</th>
    <th>Book Title</th>
    <th>Book Author</th>
    <th>Book Category</th>
  </tr>
    </thead>
  
  <c:forEach var="books" items="${bookList}">
  <tr>
    <td>${books.book_id}</td>
    <td>${books.book_Title}</td>
    <td>${books.book_Author}</td>
    <td>${books.book_Category}</td>
  </tr>
  
  ${issueList}
  </c:forEach>

 
</table>
 
<form action="refreshBookList">
 <button type="submit"  >Refresh</button>
</form>







</body>
</html>