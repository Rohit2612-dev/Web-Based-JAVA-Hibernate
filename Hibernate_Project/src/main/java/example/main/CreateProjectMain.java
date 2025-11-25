package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.entity.Project;

public class CreateProjectMain {

	public static void main(String[] args) {
		// configure hibernate
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(example.entity.Project.class);
		cfg.configure("hibernate.cfg.xml");   // fixed

		//Obtain sessionFactory
		SessionFactory factory;
		Session sessionObj;
		
			//Obtain sessionFactory
			factory = cfg.buildSessionFactory();
			//obtain session
			sessionObj = factory.openSession();
			//Instantiate Entity class (create an object of entity class)
			Project myProject = new Project(102, "Hotel Booking", "Python", 30);
			//Obtain transaction
			Transaction tx = sessionObj.beginTransaction();
			//Store data into database
			sessionObj.persist(myProject);   //Stores a record
			//commit the transaction to save changes
			tx.commit();
			//close the session
			sessionObj.close();
			//close the session factory
			factory.close();	
	}
}
