package com.fun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller3 extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,
    IOException
	{
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
	Model bean=new Model();  
  
    try {
        bean.setfName(request.getParameter("userid"));
        bean.setlName(request.getParameter("password"));
        bean.update();
	} catch (Exception e) {
		
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


