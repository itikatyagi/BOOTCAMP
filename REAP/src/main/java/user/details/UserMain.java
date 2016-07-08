package user.details;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import practice.Practice;
import role.details.Role;
import service.Service;

public class UserMain {

	private static SessionFactory factory;

	public static void main(String[] args) {

		
		 /* Service service=new Service(); service.setServiceName("Technology");
		  
		  Practice practice = new Practice(); practice.setPracticeName("JVM");
		  
		  Practice practice1 = new Practice();
		  practice1.setPracticeName("DEVOPS");
		  
		  
		  
		  
		  Role role1=new Role(); role1.setRoleName("Admin");
		  
		  Role role2=new Role(); role2.setRoleName("employee");
		  
		  Role role3=new Role(); role3.setRoleName("SuperVisor");
		  
		  Role role4=new Role(); role4.setRoleName("Practice Head");
		  
		  User employee=new User("reap","nitin","3245578974","nitin.khulbe@gmail.com");
		  
		  
		  service.getPractice().add(practice);
		  service.getPractice().add(practice1);
		  
		  employee.setRole(role1);
		  
		  
		  employee.setPractice(practice); employee.setService(service);
		  
		  
		  
		  SessionFactory sessionFactory=new
		  Configuration().configure().buildSessionFactory(); Session
		  session=sessionFactory.openSession(); Transaction tx=
		  session.beginTransaction();
		  
		  session.save(employee); session.save(role1); session.save(role2);
		  session.save(role3); session.save(role4);
		  
		  session.save(service);
		  
		  tx.commit(); session.close();
		 */

		try {
			factory = new Configuration().configure().buildSessionFactory();

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	
	  /*Method to add an employee record in the database for registration use case*/
	 
	public void addEmployee(String password, String name, String mobileNum, String emailId, Role role, Service service,Practice practice) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			User employee = new User(password, name, mobileNum, emailId); // constructor
			employee.setRole(role);
			employee.setService(service);
			employee.setPractice(practice);
			session.save(employee);
			
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	
}

