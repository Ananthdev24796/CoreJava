package com.bridgelabz;

public class ExecptionHandlingExamples {
	
	void person1() throws InterruptedException {
		System.out.println("sleep mode");
		Thread.sleep(3000);
		
	}
	
	void person2() throws InterruptedException {
		{
			person1();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ExecptionHandlingExamples test = new ExecptionHandlingExamples();
		test.person2();
	}

}
