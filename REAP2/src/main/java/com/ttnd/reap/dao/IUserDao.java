package com.ttnd.reap.dao;

import com.ttnd.reap.model.User;

public interface IUserDao {
	public void save(User user);
	public User checklogin(String id, String password);
	
	
}
