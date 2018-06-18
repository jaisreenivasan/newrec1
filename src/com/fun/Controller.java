package com.fun;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet{
	Model bean=new Model();  
	private static final long serialVersionUID = 1L;
	boolean status;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,
    IOException
	{     
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		String LINE ="<br>";
				
		String userid=request.getParameter("userid");
	String password=request.getParameter("password");
	String state=request.getParameter("state");
	
    if(state.compareTo("2")==0)
    try {
		RequestDispatcher rd=request.getRequestDispatcher("Realsignup.jsp"); 
        rd.forward(request, response);
	} catch (Exception e) {
		out.print(e);
	}
	
	else if(state.compareTo("1")==0)
	{ boolean status=false;
	try {
		bean.setuserid(userid);  
	    bean.setPassword(password);  
		status =bean.check();
		
		  if(status){  
		        RequestDispatcher rd=request.getRequestDispatcher("loginsuccess.jsp");  
		        rd.forward(request, response);  
		    }  
		    else{  
		        RequestDispatcher rd=request.getRequestDispatcher("loginerror.jsp");  
		        rd.forward(request, response);  
		    }
	} catch (Exception e) {
		out.print(e);
	}  
    
    
	}
	else if(state.compareTo("3")==0) 
	{boolean status=false;
	try {
		bean.setuserid(userid);  
	    bean.setPassword(password);  
		status = bean.check();
		//status=true;
		  if(status){  
		        RequestDispatcher rd=request.getRequestDispatcher("updatesuccess.jsp");  
		        rd.forward(request, response);  
		    }  
		    else{  
		        RequestDispatcher rd=request.getRequestDispatcher("loginerror.jsp");  
		        rd.forward(request, response);  
		    }
	} catch (Exception e) {
		out.print(e);
	} 
	}
	else if(state.compareTo("4")==0)
	{
		int j=0;
		try {
			j = bean.printcount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(j<=0)
			out.print("no records");
		else {
			out.print("s.no->userid->firstname->lastname->designation->dob");
		for(int i=1;i<=j;i++)
		{try {
			bean.assign(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//out.format(LINE+"|%4d|",i+"->"+"|%6s|"+bean.getuserid()+"->"+"|%9s|"+bean.getfName()+"->"+"|%10s|"+bean.getlName()+"->"+"|%10s|"+bean.getdesig()+"->"+bean.getdob());
		out.format(LINE);
		out.format(i+"->  "+bean.getuserid()+"->  "+bean.getfName()+"->  "+bean.getlName()+"->  "+bean.getdesig()+" ->"+bean.getdob());
		
		}
	}
	}
	else
	{
		RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");  
        rd.forward(request, response);  
	}
		
		    request.setAttribute("bean",bean);  
		  
		} 
@Override  
protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
        throws ServletException, IOException {  
	
    doPost(req, resp);  
}  
}  

