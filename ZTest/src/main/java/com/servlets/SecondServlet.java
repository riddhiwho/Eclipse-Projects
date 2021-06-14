package com.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("creating servlet using GenericServlet");
		
		res.setContentType("text/html");
		
		res.getWriter().println("<h1>This output is from GenericServlet class</h1>");
	}
	
}
