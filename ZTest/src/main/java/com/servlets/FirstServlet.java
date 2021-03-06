package com.servlets;
import java.io.IOException;

import javax.servlet.*;

public class FirstServlet implements Servlet{
	//life cycle methods
	
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println("creating object...");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		System.out.println("Servicing...");
		
		res.setContentType("text/html");
		
		res.getWriter().println("<h1>This output is from servlet method</h1>");
		
	}
	
	public void destroy() {
		System.out.println("destroying servlet object...");
	}
	
	//non life-cycle methods
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "This servlet is created by Riddhi";
	}
	
	
}
