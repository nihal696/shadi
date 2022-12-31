package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.module.UserDetails;
import com.util.ConnectionUtil;

public class UserDaoo implements UserDao {

	


	@Override
	public void save(UserDetails ud) {
		Connection con = ConnectionUtil.getConnection();
		try {
	PreparedStatement ps = con.prepareStatement("insert into userdetails(age,username,email,gender,country,city,mobilenumber) Values(?,?,?,?,?,?,?)");
		ps.setInt(1, ud.getAge());
		ps.setString(2, ud.getName());
		ps.setString(3, ud.getEmail());
		ps.setString(4, ud.getGender());
		ps.setString(5, ud.getCountry());
		ps.setString(6, ud.getCity());
		ps.setString(7, ud.getMobilenumber());
		
		 int ex = ps.executeUpdate();
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	  @Override
	  public UserDetails findById(int id) { 
		  UserDetails ud=new UserDetails();
		  ud.setId(id);
	  Connection conn = ConnectionUtil.getConnection();
	  try {
	   PreparedStatement st= conn.prepareStatement("select * from userdetails where id=?");
	  st.setInt(1, id);
	  ResultSet rs = st.executeQuery();
	  while(rs.next()) {
	  ud.setAge(rs.getInt(2));
	  ud.setName(rs.getString(3));
	  ud.setEmail(rs.getString(4));
	  ud.setGender(rs.getString(5));
	  ud.setCountry(rs.getString(6)); 
	  ud.setCity(rs.getString(7));
	  ud.setMobilenumber(rs.getString(8));
	  }
	  
	  
	  } catch (SQLException e) {
	  
	  e.printStackTrace(); }
	return ud;
	  
	  
	  
	  }


	@Override
	public void Update(int id, String name) {
		Connection c = ConnectionUtil.getConnection();
		try {
			PreparedStatement pd = c.prepareStatement("update userdetails set username=? where id=?");
			pd.setString(1, name);
			pd.setInt(2, id);
			pd.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void delete(int id) {
		Connection co = ConnectionUtil.getConnection();
		try {
			PreparedStatement pos = co.prepareStatement("delete from userdetails where id=? ");
			pos.setInt(1, id);
			pos.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	

			

	
}
