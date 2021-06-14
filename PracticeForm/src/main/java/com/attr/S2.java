package com.attr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet{
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		
		int p = i*j;
	
		int sum = (int) req.getAttribute("sum");
		
		res.getWriter().println("<h1>");
		res.getWriter().println("Sum: " + sum);
		res.getWriter().println("Product: " + p);
		res.getWriter().println("</h1>");
		
		
		
}
		
}
