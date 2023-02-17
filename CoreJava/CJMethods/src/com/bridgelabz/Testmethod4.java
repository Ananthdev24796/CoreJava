package com.bridgelabz;

public class Testmethod4 {
	
	// instance variables
	
	int a =10;
	int b =20;
	
	// instance method
	
	void addTwoNumbers(int a , int b) { // local varibles
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		
	}
	public static void main(String[] args) {
		Testmethod4 t = new Testmethod4();
		t.addTwoNumbers(2, 2);
	}

}
