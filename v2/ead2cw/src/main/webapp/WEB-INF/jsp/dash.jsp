<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 550px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
        
    /* On small screens, set height to 'auto' for the grid */
    @media screen and (max-width: 767px) {
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>


<div class="container-fluid">
  <div class="row content" align="center">
    <div class="col-sm-15 sidenav hidden-xs">
     
      <ul class="nav nav-pills nav-stacked">
     
        <li class="active"><a href="#section1"><h2><b>Library Management system</b></h2></a></li>
       
        <li><a href="section1">Add Book</a></li>
        <li><a href="section2">Issue Book</a></li>
        <li><a href="/"><input type="button" value="Log Out"></a></li>
        
        
      </ul><br>
    </div>
    <br>


       
       
      </div>
    </div>

</body>
</html>