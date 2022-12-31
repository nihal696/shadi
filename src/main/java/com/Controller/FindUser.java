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


@WebServlet("/hii")
public class FindUser extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("id"));
		
		UserDaoo oo=new UserDaoo();
		UserDetails uu = oo.findById(i);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print(uu);
	}
	
	

}
