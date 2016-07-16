package com.ttnd.reap.service;

import org.springframework.stereotype.Component;

import com.ttnd.reap.model.User;

@Component
public interface IService {
	public void save(User user);
	public User checklogin(String id, String password);
	
}
