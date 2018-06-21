package com.fun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Model { 
	public String fname,lname,password,desig,userid,dob;
	public Connection con = null;
	public PreparedStatement preparedStatement = null;
	public ResultSet resultSet = null;

/*public String url="jdbc:mysql://localhost:3306/login";
public String username="root";
public String passwd = "jaisreenivasan";
*/
	public String	driverClassName="org.h2.Driver";
			public String		url="jdbc:h2:mem:myDb;DB_CLOSE_DELAY=-1";
					public String		username="sa";
							public String	passwd="sa";
public String getfName() {  
    return fname;  
} 
public String getlName() {  
    return lname;  
} 
public String getdesig() {  
    return desig;  
} 
public String getuserid() {  
    return userid;  
} 
public String getdob() {  
    return dob;  
} 
public void setuserid(String userid) {  
this.userid = userid;  
}
  
public void setfName(String fname) {  
this.fname = fname;  
}  
public void setlName(String lname) {  
this.lname = lname;  
} 
public void setdesig(String desig) {  
this.desig = desig;  
}
public void setdob(String dob) {  
this.dob = dob;  
}
public void setPassword(String password) {  
this.password = password;  
} 
public String getPassword() {  
return password;  
}  

public void create() throws Exception
{
		    Class.forName(driverClassName);
		    con= DriverManager.getConnection(url,username,passwd);
		    //statement = con.createStatement();

		    preparedStatement = con
		        .prepareStatement("insert into  login.user (userid,first_name,last_name,designation,date,password) values(?,?,?,?,?,?)");
		    preparedStatement.setString(1,userid);
		    preparedStatement.setString(2,fname);
		    preparedStatement.setString(3,lname);
		    preparedStatement.setString(4,desig);
		    preparedStatement.setString(5,dob);
		    preparedStatement.setString(6,password);
		   preparedStatement.executeUpdate();
		   con.close();

  }
public void update() throws Exception
{
		    Class.forName("com.mysql.jdbc.Driver");
		    con= DriverManager.getConnection(url,username,passwd);
		    //statement = con.createStatement();

		    preparedStatement = con
		        .prepareStatement("update login.user set password=? where userid=?");
		    preparedStatement.setString(1,password);
		    preparedStatement.setString(2,userid);
		   preparedStatement.executeUpdate();
		   con.close();

  }
public int printcount() throws Exception
{ Class.forName("com.mysql.jdbc.Driver");
con= DriverManager.getConnection(url,username,passwd);
preparedStatement = con
.prepareStatement("select userid,first_name,last_name,date,designation from login.user");
ResultSet rs=preparedStatement.executeQuery();
int i=0;
while (rs.next())
{
	i++;
}

con.close();
return i;
}
public void assign(int i) throws Exception
{ Class.forName("com.mysql.jdbc.Driver");
con= DriverManager.getConnection(url,username,passwd);
preparedStatement = con
.prepareStatement("select userid,first_name,last_name,date,designation from login.user");
ResultSet rs=preparedStatement.executeQuery();

for(int j=0;j<i;j++)
	rs.next();
 setuserid(rs.getString(1));
setfName(rs.getString(2));
setlName(rs.getString(3));
setdesig(rs.getString(5));
setdob(rs.getString(4));
con.close();
}


public boolean check() throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
    con= DriverManager.getConnection(url,username,passwd);
    //statement  = con.createStatement();
    String sql="select * from user where userid=? and password=?";
    preparedStatement=con.prepareStatement(sql);
    preparedStatement.setString(1,userid);
    preparedStatement.setString(2,password);
	resultSet=preparedStatement.executeQuery();
	
       int count = 0;
  while (resultSet.next()) {
    count++;
  }
  con.close();
	if(count>=1)
	{
	return true;
	}
	else
		return false;


}
	
}

