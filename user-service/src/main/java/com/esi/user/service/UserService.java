package com.esi.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.user.dao.UserDao;
import com.esi.user.entity.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public User login(User user){
		return userDao.login(user);
	}

}
