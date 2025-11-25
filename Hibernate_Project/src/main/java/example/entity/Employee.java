package example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "Employee_Master")

public class Employee {
	@Id 
	@Column(name ="emp_no")
	private Integer empNo;
	@Column(name ="emp_name", length =30)
	private String name;
	
	@Column(name ="emp_sal")
	private float salary;
	
	public Employee() {
		
	}
	

	public Employee(Integer empNo, String name, float salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}


	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
