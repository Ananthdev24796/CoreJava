package com.bridgelabz;

public class MethodOverLoadingExample {
	
	
	// Method overloading
	
	
	int methodAdd(int a,int b) {
		
		return a+b;
	}
	
	int methodAdd(int a, int b,int c) {
	return a+b+c;
		
	}
	
	public static void main(String[] args) {
		MethodOverLoadingExample t = new MethodOverLoadingExample();
		System.out.println(t.methodAdd(5,5));
		System.out.println(t.methodAdd(5,5,5));
	}

}
