package com.Dao;

import com.module.UserDetails;

public interface UserDao {
	
		void save(UserDetails ud);
		UserDetails findById(int id);
		void Update(int id,String name);
		void delete(int id);

}
