package com.raju.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.raju.Entity.Users;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class userDaoImpl implements userDAO {
	
	private final EntityManager entityManager;

	@Override
	@Transactional
	public String addUser(Users user) {
		
		entityManager.persist(user);
		return "User added succesfully";
		
	}

	@Override
	public List<Users> getUsers() {
		
		TypedQuery<Users>query=entityManager
                .createQuery("FROM Users",Users.class);
           List<Users>list=query.getResultList();		
       
              return list;
		
		
	}

	@Override
	public Users getUserById(Integer id) {
		return entityManager.find(Users.class, id);
		
		
	}

	

}
