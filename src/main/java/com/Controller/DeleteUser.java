package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.UserDaoo;



@WebServlet("/bye")
public class DeleteUser extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int ii = Integer.parseInt(req.getParameter("id")) ;
		
		UserDaoo u=new UserDaoo();
		u.delete(ii);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Deleted Successfully");
	}
	

	
	
}
