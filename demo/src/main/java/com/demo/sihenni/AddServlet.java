package com.demo.sihenni;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//only post method will be used in the index.html file 
	//when using the doPost method in the servlet.
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String fNameReq = req.getParameter("fname");
		String lNameReq = req.getParameter("lname");
		
		String fullName = fNameReq + " " + lNameReq;
		
		PrintWriter out = res.getWriter();
		out.println("The Full Name is : " + fullName);
	
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
		
	}

}
