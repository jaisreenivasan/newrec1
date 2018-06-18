<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup Page</title>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
 
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
 
  <script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
 
   
 
  <link rel="stylesheet" href="/resources/demos/style.css" />

  <style>
 
    .datepicker{
 
       
 
    }
 
  </style>
 <script>
 function change()
 { if (document.form.fname.value == ""){
	   alert ( "Please enter first name." );
	   return false;
	   }
	   if (document.form.lname.value == ""){
	   alert ( "Please enter lastname." );
	   return false;
	   }
	   if (document.form.userid.value == ""){
		   alert ( "Please enter Userid." );
		   return false;
		   }
		   if (document.form.password.value == ""){
		   alert ( "Please enter password." );
		   return false;
		   }
		   if (document.form.date.value == ""){
			   alert ( "Please enter date." );
			   return false;
			   }
			   if (document.form.desig.value == ""){
			   alert ( "Please enter designation." );
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
   }
</script>

</head>
<body>
<form  action="Controller2" method="post" name="form" onsubmit="return change()"> 
FirstName      :<input type="text" name="fname"><br>  
LastName       :<input type="text" name="lname"><br>
DOB            :<input type="text"  name="date"><br>
Designation    :<input type="text" name="desig"><br>
Password       :<input type="password" name="password"><br>  
userid         :<input type="text" name="userid"><br>
Retype Password:<input type="password" name="rpassword"><br>
<input type="submit" value="signup">
    <input name="state" type="hidden" value="1">
</form>
</body>
</html>