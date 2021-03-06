package com.practice;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		//Sets the content type of the response being sent to the client, if the response has not been committed yet.

		res.setContentType("text/html");
		//res.getWriter().println("<h2>Welcome To Register Servlet</h2>");
		
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String cond=req.getParameter("condition");
		
		if(cond!=null) {
			res.getWriter().println("<h2> Name: " + name + "</h2>");
			res.getWriter().println("<h2> Email: " + email + "</h2>");
			res.getWriter().println("<h2> Password: " + password + "</h2>");                  
			res.getWriter().println("<h2> Course: " + course + "</h2>");
			res.getWriter().println("<h2> Gender: " + gender + "</h2>");
			                                  
			//assume data has been saved to db... forward to success servlet 
			
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req, res);
			
			
		}else {
			res.getWriter().println("<h1>Please accept terms & conditions</h1>");
			
			//include output of index.html through rd.include();
			
			//get object of request dispatcher
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			//call include method
			rd.include(req, res);
			
			
		}
		
	}
}
