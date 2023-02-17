package com.bridgelabz;

public abstract class Parent {
	
	abstract void method1();
	abstract void method2();
	abstract void method3();
	void method4() {
		System.out.println("Method 4");
	}
	

}

class Child extends Parent{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2");
	}

	@Override
	void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method 3");
	}
	
	public static void main(String[] args) {
		Child t = new Child();
		t.method1();
		t.method2();
		t.method3();
		t.method4();
	}
}
