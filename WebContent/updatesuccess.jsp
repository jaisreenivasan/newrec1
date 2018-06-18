<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script >
function change()
{ 
	   if (document.form.userid.value == ""){
		   alert ( "Please enter Userid." );
		   return false;
		   }
		   if (document.form.password.value == ""){
		   alert ( "Please enter password." );
		   return false;
		   }
			   if (document.form.rpassword.value == ""){
				   alert ( "Please renter password." );
				   return false;
				   }
			   if (document.form.password.value !=document.form.rpassword.value){
				   alert ( "passwords dont match" );
				   return false;
				   }
			   return true;
  }</script>
<body>
<form  action="Controller3" method="post" name="form1"> 
userid         :<input type="text" name="userid"><br>
Password       :<input type="password" name="password"><br>  
Retype Password:<input type="password" name="rpassword"><br>
<input type="submit" value="signup">

    <input name="state" type="hidden" value="1">
</form>
</body>
</html>