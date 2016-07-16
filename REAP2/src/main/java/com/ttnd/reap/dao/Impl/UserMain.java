package com.ttnd.reap.dao.Impl;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Set;

import com.ttnd.reap.model.Practice;
import com.ttnd.reap.model.Role;
import com.ttnd.reap.model.Service;
import com.ttnd.reap.model.User;



public class UserMain {

	public static void main(String[] args) {
	
		Service service=new Service();
		
		service.setServiceName("Technology");
		
		Practice practice = new Practice();

		practice.setPracticeName("JVM");
		
		
    	Role role1=new Role();

		role1.setRoleName("Admin");
		
		Role role2=new Role();
	
		role2.setRoleName("User");
		
		Role role3=new Role();
	
		role3.setRoleName("SuperVisor");
		
		Role role4=new Role();
	
		role4.setRoleName("Practice Head");
		
		HashSet<Role> role=new HashSet(); 
		
		role.add(role1);
		role.add(role2);
		role.add(role3);
		role.add(role4);
		
		
		User user=new User();
	
		
		
		user.setRole(role1);
		
		user.setPractice(practice);
		user.setService(service);
	
		//practice.setService(service);
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		
        session.save(user);
        session.save(role);
        session.save(practice);
        session.save(service);
        
        tx.commit();
        session.close();

	}

}
