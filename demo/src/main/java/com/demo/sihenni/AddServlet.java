package com.demo.sihenni;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String fNameReq = req.getParameter("fname");
		String lNameReq = req.getParameter("lname");
		
		String fullName = fNameReq + " " + lNameReq;
		
		PrintWriter out = res.getWriter();
		out.println("The Full Name is : " + fullName);
	
		
		
	}

}
