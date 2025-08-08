package com.raju.service;

import org.springframework.stereotype.Service;

import com.raju.Entity.Users;
import com.raju.respository.UserRespository;

@Service
class UserService{
	
	private  UserRespository userRespository;
	
	public void addUser(Users user) {
		userRespository.save(user);
		
	}
}