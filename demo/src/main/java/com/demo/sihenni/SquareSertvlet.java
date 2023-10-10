package com.demo.sihenni;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareSertvlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// using Request Dispatcher (RequestDispatcher Interface)
		PrintWriter out = res.getWriter();
		out.println("You R in the Square servlet");
		
		
		
	}
}
