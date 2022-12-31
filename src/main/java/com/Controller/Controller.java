package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDaoo;
import com.module.UserDetails;

@WebServlet("/papa")
public class Controller extends HttpServlet {
	
	UserDaoo dao=new UserDaoo();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int s1 = Integer.parseInt(req.getParameter("age"));
		String s2 = req.getParameter("name");
		String s3 = req.getParameter("gender");
		String s4 = req.getParameter("email");
		String s5 = req.getParameter("country");
		String s6 = req.getParameter("city");
		String s7 = req.getParameter("number");
		
		UserDetails u=new UserDetails();
		u.setAge(s1);
		u.setName(s2);
		u.setGender(s3);
		u.setEmail(s4);
		u.setCountry(s5);
		u.setCity(s6);
		u.setMobilenumber(s7);
		
		dao.save(u);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Added Successfully</h1>");
		
		
	}
	
	

}
