package com.user;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import java.sql.*;

@MultipartConfig
public class Register extends HttpServlet{
	
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		//getting all the incoming details from the request
		res.setContentType("text/html");
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		Part part=req.getPart("image");
		String filename=part.getSubmittedFileName();
		//res.getWriter().println(filename);
		
//		res.getWriter().println(name);
//		res.getWriter().println(password);
//		res.getWriter().println(email);
		
//		connection
		try {
			Thread.sleep(3000);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "riddhi", "riddhi");
			//System.out.println("connnn   "+con);
			//query
			String q = "insert into user(name, password, email, imageName) values(?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.setString(4, filename);
			
			pstmt.executeUpdate();
			
			//uploading file..
			InputStream is = part.getInputStream();
			byte []data = new byte[is.available()];
			
			is.read(data);
			String path = req.getRealPath("/")+"img"+"/"+filename;
			//res.getWriter().println(path);
			
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			
		res.getWriter().println("done");
			
//			if(con.isClosed()){
//				System.out.println("Connection Closed");
//			}else{
//				System.out.println("connection created");
//			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
			//res.getWriter().println("Error!!");
		}
		
		
		
}
		
}
