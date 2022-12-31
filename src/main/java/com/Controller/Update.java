package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDaoo;


@WebServlet("/hello")
public class Update extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 int i = Integer.parseInt(req.getParameter("id"));
		 String ps = req.getParameter("name");
		 
		 UserDaoo d=new UserDaoo();
		 d.Update(i, ps);
		 
		 resp.setContentType("text/html");
		 PrintWriter out = resp.getWriter();
		 out.print("<h1>Updated Successfully</h1>");
	}
	
	

}
