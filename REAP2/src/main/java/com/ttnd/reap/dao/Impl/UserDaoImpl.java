package com.ttnd.reap.dao.Impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ttnd.reap.dao.IUserDao;
import com.ttnd.reap.model.User;

@SuppressWarnings("deprecation")
@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(User user) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		session.close();
	}

	public User checklogin(String id, String password) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class).add(Restrictions.eq("emailId", id))
				.add(Restrictions.eq("password", password));
		return (User) criteria.uniqueResult();
	}

	

	
}
