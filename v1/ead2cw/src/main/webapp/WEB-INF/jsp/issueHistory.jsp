<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Issue History</title>
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

<h1>Issue History</h1>
<table id="customers">
<thead>
  <tr>
    <th>Book Id</th>
    <th>Book Title</th>
    <th>Book Author</th>
    <th>Book Category</th>
    <th>Issued Date</th>
    <th>Borrowers Name</th>
    <th>Borrowers Contact Number</th>

  </tr>
  </thead>
  
    <c:forEach var="IssueBooks" items="${issueList}">
  <tr>
    <td>${IssueBooks.book_id}</td>
    <td>${IssueBooks.book_Title}</td>
    <td>${IssueBooks. book_Author}</td>
    <td>${IssueBooks.book_Category}</td>
    <td>${IssueBooks.issued_Date}</td>
    <td>${IssueBooks.borrowers_Name}</td>
    <td>${IssueBooks.borrowers_Contact}</td>
    
  </tr>
   </c:forEach>
 

</table>
<form action="RefreshIssueHistory">
 <button type="submit" >Refresh</button>
</form>


</body>
</html>