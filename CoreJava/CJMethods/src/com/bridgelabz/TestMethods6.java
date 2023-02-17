// Methods retuns objects
package com.bridgelabz;

public class TestMethods6 {
	
	
	Emp m1() {
		System.out.println("M1 method");
		Emp e = new Emp();
		return e;	
		}
	
	X m2() {
		System.out.println("M2 method");
		X x = new X();
		return x;
		}
	
	static String m3() {
		return "M3";
		
	}
	
	public static void main(String[] args) {
		TestMethods6 t = new TestMethods6();
		Emp e1 = t.m1();
		System.out.println(e1);
		X x1 = t.m2();
		System.out.println(x1);
		String str=TestMethods6.m3();
		System.out.println(str);
	}
	
	

}
