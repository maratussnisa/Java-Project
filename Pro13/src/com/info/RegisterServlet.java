package com.info;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n = request.getParameter("username");
		String p = request.getParameter("password");
		String e = request.getParameter("email");
		String l = request.getParameter("language");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root", "root");
			
			PreparedStatement ps = conn.prepareStatement("insert into USERTABLE values(?,?,?,?)");
			
			ps.setString(1, n);
			ps.setString(2, p);
			ps.setString(3, e);
			ps.setString(4, l);
			
			int i = ps.executeUpdate();
			if (i>0)
				out.print("You are successfully registered...");
		} catch (Exception e2) {
			System.out.println(e2);
		}
		
		out.close();
	}

}
