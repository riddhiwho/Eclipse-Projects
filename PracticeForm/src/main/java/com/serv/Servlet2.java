package com.serv;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setContentType("text/html");
		
		Cookie[] cookies = req.getCookies();
		boolean f = false;
		String name="";
		
		if(cookies==null) {
			res.getWriter().println("You are new user, submit your name first.");
			return;
		}else {
			for(Cookie c: cookies) {
				String tname = c.getName();
				if(tname.equals("user_name")) {
					f=true;
					name = c.getValue();
				}
			}
		}
		
		
		if(f) {
			res.getWriter().println("Hello " + name+ ", Welcome to Servlet 2");
		}
		
		
		
	}
}