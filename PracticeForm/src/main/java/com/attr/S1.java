package com.attr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet{
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("n1"));
		int j = Integer.parseInt(req.getParameter("n2"));
		
		int s = i+j;
		
		//res.getWriter().println("Result is: " + s);
	
		req.setAttribute("sum", s);
		
		RequestDispatcher rd=req.getRequestDispatcher("S2");
		
		rd.forward(req, res);
		
}
		
}
