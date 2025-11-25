package example.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.entity.Department;
import example.entity.Employee;
import example.entity.Exam;

public class HibernateUtils {
	
	//This class handles programmatically configuration and returns sessionFactory
	public static SessionFactory getSessionFactory() throws Exception{
		Configuration cfg = new Configuration();
		
		cfg.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdac");
		cfg.setProperty("hibernate.connection.username", "root");
		cfg.setProperty("hibernate.connection.password", "root");
		cfg.setProperty("hibernate.show_sql", "true");
		cfg.setProperty("hibernate.hbm2ddl.auto", "update");
		
		//Adding entity class to the configuration
		cfg.addAnnotatedClass(Exam.class);
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
}
