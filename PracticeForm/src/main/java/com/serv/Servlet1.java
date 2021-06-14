package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		String name = req.getParameter("name");
		
		res.getWriter().println("Hello " + name+ ", Welcome to Servlet 1");
		PrintWriter out = res.getWriter();
		out.println("<a href='Servlet2'>Go to Servlet 2</a>");
		
		Cookie c = new Cookie("user_name", name);
		res.addCookie(c);
		
	}
}
