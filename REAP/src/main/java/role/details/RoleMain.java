package role.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RoleMain {

	public static void main(String[] args) {
		Role role=new Role();
		role.setRoleId(16);
		role.setRoleName("Practice Head");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
        session.save(role);
        session.getTransaction().commit();
        session.close();
		

	}

}
