// creation of userdefine checked exception by paranet constructor approach 
package com.bridgelabz;

import java.util.Scanner;

public class ExceptionHandlingExample3 {

	 public void status(int age) throws InvalidAgeException {
			if (age > 18) {
				System.out.println("Eligible to vote");
				
			}
			else {
			  throw new InvalidAgeException("not eligible / by zero ");
			}
		}
		
		public static void main(String[] args) throws InvalidAgeException {
			ExceptionHandlingExample3 t = new ExceptionHandlingExample3();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the AGE");
			int age =sc.nextInt();
			t.status(age);
		}
}
