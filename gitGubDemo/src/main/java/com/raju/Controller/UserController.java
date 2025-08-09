package com.raju.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raju.Entity.Users;
import com.raju.dao.userDAO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
	
	private final userDAO userDAO;
	
	@PostMapping("addUser")
	public String addUser(@RequestBody Users user) {
		return userDAO.addUser(user);
		  
	}
	
	@GetMapping("getAllUsers")
	public List<Users> getUers() {
		 return userDAO.getUsers();
			
	}
	
	@GetMapping("getUser")
	public Users getUser(@RequestParam Integer id) {
		return userDAO.getUserById(id);	
	}
}//
