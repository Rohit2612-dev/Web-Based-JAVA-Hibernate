package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;
import example.utils.HibernateUtils;

public class AddDepartmentMain {

	public static void main(String[] args) {
		//This class add several departments into Department_master table
	
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				){
				Department d1 = new Department(11, "IT", "Pune", null);
				Department d2 = new Department(12, "Finance", "Mumbai", null);
				Department d3 = new Department(13, "Medical", "Ahmedabad", null);
				Department d4 = new Department(14, "IT", "Gurugram", null);
				Department d5 = new Department(15, "Semi-Government", "Pune", null);
				Department d6 = new Department(16, "Central", "Delhi", null);
				
				Transaction tx = sessionObj.beginTransaction();
				sessionObj.persist(d1);
				sessionObj.persist(d2);
				sessionObj.persist(d3);
				sessionObj.persist(d4);
				sessionObj.persist(d5);
				sessionObj.persist(d6);
				tx.commit();
				System.out.println("Departments added successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
