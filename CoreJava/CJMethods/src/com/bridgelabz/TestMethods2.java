package com.bridgelabz;

public class TestMethods2 {

	// Instance method 
		void newmethod(int a , int b )   {  // local variables
			System.out.println("Instance method");
			System.out.println(a);
			System.out.println(b);
		}
		// Static method
		 static void newmethod1(String s,char c) {
			 System.out.println("static method");
			 System.out.println(s);
			System.out.println(c);
		 }
		 public static void main(String[] args) {
			 TestMethods2 t = new TestMethods2();
			 t.newmethod(7,9);
			 TestMethods2.newmethod1("core",'j');
		}

}
