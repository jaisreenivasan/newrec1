<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NewFile</title>
<script>
   function change1(element)
     { document.getElementsByName(element)[0].value = "0";
     if (document.form.name.value == ""){
	   alert ( "Please enter Userid." );
	   return false;
	   }
	   if (document.form.password.value == ""){
	   alert ( "Please enter password." );
	   return false;
	   }
       document.getElementsByName(element)[0].value = "1";
     }
   function change2(element)
   { 
     document.getElementsByName(element)[0].value = "2";
   }
   function change3(element)
   { document.getElementsByName(element)[0].value = "0";
   if (document.form.userid.value == ""){
	   alert ( "Please enter Login Name." );
	   return false;
	   }
	   if (document.form.password.value == ""){
	   alert ( "Please enter password." );

	   return false;
	   }
     document.getElementsByName(element)[0].value = "3";
   }
   function change4(element)
   { document.getElementsByName(element)[0].value = "0";
   if (document.form.name.value == ""){
	   alert ( "Please enter Login Name." );
	 
	   return false;
	   }
	   if (document.form.password.value == ""){
	   alert ( "Please enter password." );
	  
	   return false;
	   }
     document.getElementsByName(element)[0].value = "4";
   }
  
</script>

 </head>
 
<body>
<form  action="Controller" method="post" name="form" >  
Userid       :<input type="text" name="userid"><br>  
Password:<input type="password" name="password"><br>  
<input type="submit" value="login" onClick="change1('state')">
<input type="submit" value="signup" onClick="change2('state')">
<input type="submit" value="update password" onClick="change3('state')">
<input type="submit" value="view employees" onClick="change4('state')">
    <input name="state" type="hidden" value="0">
</form>
</body>
</html>