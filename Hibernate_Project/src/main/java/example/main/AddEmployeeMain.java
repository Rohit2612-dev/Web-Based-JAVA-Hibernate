package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Employee;
import example.utils.HibernateUtils;


public class AddEmployeeMain {

	public static void main(String[] args) {
		//This class adds several employees into employee_master table
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				){
			Employee e1 = new Employee(101, "Rohit", 20000);
			Employee e2 = new Employee(102, "Jignesh", 12000);
			Employee e3 = new Employee(103, "Chinnu", 15000);
			Employee e4 = new Employee(104, "Mohite", 25000);
			Employee e5 = new Employee(105, "Manav", 30000);
			Employee e6 = new Employee(106, "Jadhav", 32000);
			
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(e1);
			sessionObj.persist(e2);
			sessionObj.persist(e3);
			sessionObj.persist(e4);
			sessionObj.persist(e5);
			sessionObj.persist(e6);
			tx.commit();
			System.out.println("Employees are added successfully.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
