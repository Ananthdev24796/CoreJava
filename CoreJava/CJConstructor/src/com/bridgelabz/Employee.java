package com.bridgelabz;

public class Employee {
	
	int empid;
	String empname;
	float empsalary;
	
//	Employee(){
//		empid= 1234;
//		empname = "tom";
//		empsalary = 124.50f;
//				
//	}
	
	
	Employee(int empid,String empname,float empsalary){ // local variable
			// Assinging  of value local variable to instance varible
		  this.empid = empid;
		  this.empname = empname;
		  this.empsalary= empsalary;
		
	}
	void display() {
		System.out.println("employee id :"+ empid);
		System.out.println("employee name :"+ empname);
		System.out.println("employee salary :"+ empsalary);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(1234,"tom",45.500f);
		emp.display();
		Employee emp1 = new Employee(678,"jerry",47.000f);
		emp1.display();
	}
	

}
