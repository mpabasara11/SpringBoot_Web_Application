<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  


.login{  
        width: 382px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 80px;  
        background:#ccccff;  
        border-radius: 15px ;  
          
}

h2{  
    text-align: center;  
    color: #277582;  
    padding: 20px; }
    
    label{  
    color: #08ffd1;  
    font-size: 17px;  
}  


</style>
</head>
<body>

        <center>
            <h2>Login Here</h2>
            <div class="login">  
            <table >
            <form id="login" action="log" method="post">
            <tr>
           <td align="left">Username:</td>
         <td align="right"><input type="text" name="username"></td>
            
            </tr>
            <tr>
            
           <td align="left">Password:</td>  
           <td align="right">   <input type="password" name="password"></td>
           </tr>
           <tr>
           </br>
           </tr>
           <tr>
           
            <td align="char"><input type="submit" value="LOGIN"></td>
           
            </table>
         </div>
        
            </form>
          
        </center>
</body>
</html>