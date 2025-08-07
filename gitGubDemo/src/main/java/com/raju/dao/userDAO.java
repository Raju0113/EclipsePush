package com.raju.dao;

import java.util.List;

import com.raju.Entity.Users;

public interface userDAO {
	
	String addUser(Users user);
	
	 List<Users> getUsers();
	 Users getUserById(Integer id);

	
	

}
