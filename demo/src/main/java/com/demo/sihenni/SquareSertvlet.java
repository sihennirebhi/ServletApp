package com.demo.sihenni;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareSertvlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		

//String fullName = (String) req.getAttribute("fullName");
//		String fullName =  req.getParameter("fullName");
		
		HttpSession session = req.getSession();
		String fullName = (String) req.getAttribute("fullName");
		
//using Request Dispatcher (RequestDispatcher Interface)
		PrintWriter out = res.getWriter();
		out.println("This is the 3rd time in the Square servlet & the Full Name is : " + fullName);
		
		
		
	}
}
