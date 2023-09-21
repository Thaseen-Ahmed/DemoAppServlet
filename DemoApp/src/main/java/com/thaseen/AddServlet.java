package com.thaseen;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")

public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;

//		Using session 
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
//		res.sendRedirect("sq");
		
//		Using cookies
		
//		Cookie cookie = new Cookie("k",k+ "");
//		res.addCookie(cookie);
//		
//		res.sendRedirect("sq");
		
		
		
		PrintWriter out  = res.getWriter();
		out.println("The Result is "+ k);
	
		
//		To call Servlet from Servlet there are two method
//		1.RequestDispatcher 
//		2.Redirect
		
//		req.setAttribute("k",k);
			
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req,res);
		
//		Instead of doing with RequestDispatcher we can use sendRedirect() method to get req
		
//		res.sendRedirect("sq?k="+k);
		
		

		
	}
}
