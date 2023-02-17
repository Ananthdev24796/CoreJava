package com.bridgelabz;

public class TestUserDefine {
	
	void m1() {
		System.out.println("m1 method");
	}
	
	TestUserDefine(){
		System.out.println("0-args constr");
	}
	TestUserDefine(int a){
		System.out.println("1 - args constr");
	}
	public static void main(String[] args) {
		TestUserDefine t = new TestUserDefine();
		TestUserDefine t1 = new TestUserDefine(10);
		t1.m1();
		
	}
	
}
