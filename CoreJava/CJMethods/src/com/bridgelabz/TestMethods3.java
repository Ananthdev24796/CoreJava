package com.bridgelabz;

public class TestMethods3 {
	
	// instance method
	void  m1(X x , Emp e) {
		System.out.println("M1 method");
	}
	
	// static methods 
	static void m2(Y y,Student s)
	{
		System.out.println("M2 methods");
		
	}
	public static void main(String[] args) {
		TestMethods3 t1 = new TestMethods3();
		X x = new X();
		Emp e = new Emp();
		t1.m1(x, e);
		
		Y y = new Y();
		Student s = new Student();
		TestMethods3.m2(y, s);
		
		
	}

}
