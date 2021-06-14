package com.servlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class ThirdServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("creating servlet using HttpServlet");
		
		res.setContentType("text/html");
		
		res.getWriter().println("<h1>This output is from HttpServlet class</h1>");
	}
}
