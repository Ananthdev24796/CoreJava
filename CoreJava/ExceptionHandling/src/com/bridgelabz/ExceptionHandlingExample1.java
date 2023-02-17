package com.bridgelabz;

public class ExceptionHandlingExample1 {
	void person1()  {
		System.out.println("sleep mode");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void person2() {
		{
			person1();
		}
	}
	public static void main(String[] args)  {
		ExceptionHandlingExample1 test = new ExceptionHandlingExample1();
		test.person2();
	}
}
