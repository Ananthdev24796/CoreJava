package com.bridgelabz;

public class TestMethod1 {
	
	// Instance methods
	void m1() {
		System.out.println("Instance method");
	}
	// Static methods
	 static void m2() {
		 System.out.println("static method");
	 }
	 public static void main(String[] args) {
		 TestMethod1 t = new TestMethod1();
		 t.m1();
		 TestMethod1.m2();
	}

}
