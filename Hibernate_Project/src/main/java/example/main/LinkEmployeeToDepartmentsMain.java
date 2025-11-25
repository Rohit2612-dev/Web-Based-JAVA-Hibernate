package example.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;
import example.entity.Employee;
import example.utils.HibernateUtils;


public class LinkEmployeeToDepartmentsMain {

	public static void main(String[] args) {
		// This class loads all the employees and departments and link them.....

		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				){
			//Loading all the employees
			Employee emp1 = sessionObj.find(Employee.class, 101);
			Employee emp2 = sessionObj.find(Employee.class, 102);
			Employee emp3 = sessionObj.find(Employee.class, 103);
			Employee emp4 = sessionObj.find(Employee.class, 104);
			Employee emp5 = sessionObj.find(Employee.class, 105);
			Employee emp6 = sessionObj.find(Employee.class, 106);
			
			//Loading all the departments to which employees are to be linked
			
			Department dept1 = sessionObj.find(Department.class, 11);
			Department dept2 = sessionObj.find(Department.class, 12);
			Department dept3 = sessionObj.find(Department.class, 13);
			Department dept4 = sessionObj.find(Department.class, 14);
			Department dept5 = sessionObj.find(Department.class, 15);
			Department dept6 = sessionObj.find(Department.class, 16);
			
			Transaction tx = sessionObj.beginTransaction();
				//Populating the list of employees: emp1, emp2, emp3, emp4, emp5, emp6
			List<Employee> empList= List.of(emp1, emp2);
			//Adding this employees in the form of list to 1st department
			
			dept1.setEmployeeList(empList);
			dept2.addEmployee(emp4);
			dept2.addEmployee(emp3);
			dept3.addEmployee(emp6);
			dept3.addEmployee(emp5);
			
//			dept2.addEmployee(emp6);
			
			tx.commit();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
