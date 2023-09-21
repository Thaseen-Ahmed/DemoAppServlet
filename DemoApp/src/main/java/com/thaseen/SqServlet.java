package com.thaseen;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sq")

public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
//		int p = Integer.parseInt(req.getParameter("num1"));
//		int q = Integer.parseInt(req.getParameter("num2"));
		
//		 int s=p*q;
		
//		int k = (int) req.getAttribute("k");
//		k=k*k;
//		 

		
//		int k =Integer.parseInt(req.getParameter("k"));
		
//		we use session to maintain login in the website if user goes to another page and to confirm  
//		if the user is active 
//		HttpSession session = req.getSession();
//		session.removeAttribute("k"); //we can remove the data from session using this method

		
//		int k= (int) session.getAttribute("k");
		
//		Using cookies
		int k=0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k")) 
				k=Integer.parseInt(c.getValue());
			
		}
//		int k=0;
			k=k*k;
	
		PrintWriter out = res.getWriter();
		out.println("The result is "+ k);
//		out.println("Hello to Square the answer for "+p+" and   "+q + " is "+ s);
		
		System.out.println("SQ is Called");
	}
}
