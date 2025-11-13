package java8features.com;

import java.util.ArrayList;
import java.util.List;

public class ForEcahEemployee {
public static void main(String[] args) {
	List<Employee> emp=new ArrayList<>();

	emp.add(new Employee(1, 58000, "Praveen", "Developer"));
	emp.add(new Employee(2, 45000, "Shafi", "Quantity Surveyor"));
	emp.add(new Employee(3, 36000, "Kishore", "tester"));
	emp.add(new Employee(4, 30000, "Ashok", "Analyst"));
	emp.add(new Employee(5, 52000, "Kishore Reddy", "Pd Designer"));
	emp.add(new Employee(6, 45000, "Sekhar", "Developer"));
	
	emp.forEach(e->{
		if (e.getSal() > 50000) {
			System.out.println("Id "+e.getId()+" Employee Name : "+e.getName()+" Designation : "+e.getRole()+" Salary : "+e.getSal());
		}
	});
}
	
	
}
 class Employee{
	public Employee(int id, double sal, String name, String role) {
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String dept) {
		this.role = dept;
	}
	private int id;
private	double sal;
private	String name;
private String role;
	
}
