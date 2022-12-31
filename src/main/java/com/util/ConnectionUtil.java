package com.util;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionUtil {
	
		public static Connection getConnection() {
			Connection con=null;
			try {
				InitialContext i = new InitialContext();
				
				DataSource d = (DataSource) i.lookup("java:comp/env/shaadi_com");
			              con=d.getConnection();
			             			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return con;
		}
	}


