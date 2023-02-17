package com.bridgelabz;

public class ConstructorOverLoadingExample {
	
	ConstructorOverLoadingExample(int a){
		System.out.println("1 arg constructor");
	}
	
	ConstructorOverLoadingExample(char ch){
		System.out.println("1 arge constructor char");
	}
	ConstructorOverLoadingExample(int a ,int b){
		System.out.println("2 arge constructor");
	}
	public static void main(String[] args) {
		new ConstructorOverLoadingExample(10);
		new ConstructorOverLoadingExample(10,20);
		new ConstructorOverLoadingExample('a');
		
	}

}
