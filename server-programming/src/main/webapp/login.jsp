<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    <title>Login Page</title>
    <link rel="stylesheet" />    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
  </head>

<meta charset="utf-8">
<title></title>

</head>
<body>


<form id="login-form" action="login" method="post">
<br>
<br>
<br>
<h2> Admin Login</h2>

  <div class="container">
                <label for="email">Email:</label>
    <input type="text" placeholder="Enter Email id" name="email" required>

    <label for="password">Password:</label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit">Login</button>
    
  </div>

  <div class="container" style="background-color:#f1f1f1">
  
  <br>${message}
    
  </div>
</form>


</body>


</html>