package com.bridgelabz;

public class Emp {
	int empId;
	
	void displayEmpId() {
		System.out.println(empId);
	}
	// Instance block initialize value to varible while object creation
	{
		empId = 7;
	}
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.displayEmpId();
	}

}
