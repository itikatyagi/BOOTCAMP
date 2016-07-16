package com.ttnd.reap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ttnd.reap.dao.IUserDao;
import com.ttnd.reap.model.*;
import com.ttnd.reap.service.IService;


@Component
public class ServiceImpl implements IService{

	@Autowired
	private IUserDao userDao;
	

	public void save(User user) {
		user.setEmailId(user.getEmailId());
		
		userDao.save(user);
	}

	public User checklogin(String id, String password) {
		return userDao.checklogin(id, password);
	}

	
	
	
}
