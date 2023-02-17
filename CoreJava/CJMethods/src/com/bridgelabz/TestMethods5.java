package com.bridgelabz;

public class TestMethods5 {
	
	// instance method
	int m1() {
		System.out.println("m1 method");
		return 10;
		}
	
	float m2() {
		System.out.println("m2 method");
		return 10.5f;
	}
	
	// static method
	 static char ch() {
		 System.out.println("ch method");
		 return 'c';
	 }
	 public static void main(String[] args) {
		 TestMethods5 t = new TestMethods5();
		 int x =t.m1();
		 System.out.println(x);
		 float y =t.m2();
		 System.out.println(y);
		 char cha = TestMethods5.ch();
		 System.out.println(cha );
		 
	}

}
