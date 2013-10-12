package com.uttara;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		out.println("<html>");
		out.println("<body>");
		out.println("Thanks  Mr." + "  " + name + "  "+ "for visiting roseindia<br>");
		out.println("Now you can see your password : " + "  " + pass + "<br>");
		out.println("</body></html>");
		
		
	}
}