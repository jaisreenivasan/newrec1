package com.fun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller2 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,
    IOException
	{
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
	Model bean=new Model();  
  
    try {
        //System.out.println(request.getParameter("fname"));
        bean.setfName(request.getParameter("fname"));
        bean.setlName(request.getParameter("lname"));
        bean.setdesig(request.getParameter("desig"));
        bean.setdob(request.getParameter("date"));
        bean.setPassword(request.getParameter("password"));
        bean.setuserid(request.getParameter("userid"));
        if(request.getParameter("password").compareTo(request.getParameter("rpassword"))==0)
        bean.create();
        else
        	out.println("passwords dont match");
	} catch (Exception e) {
		if(e.toString().compareTo("com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException: Duplicate entry '' for key 'PRIMARY'")==0)
		out.print("userid aldready exists");
		else
		out.print(e);
	}
		    request.setAttribute("bean",bean);  
		    RequestDispatcher rd=request.getRequestDispatcher("NewFile.jsp");  
	        rd.forward(request, response);  
		} 
@Override  
protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
        throws ServletException, IOException {  
	
    doPost(req, resp);  
}  
}  

