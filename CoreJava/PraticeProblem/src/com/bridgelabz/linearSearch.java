package com.bridgelabz;

public class linearSearch {
	public static void main(String[] args) {
		int[] array = { 10,20,30,40,50};
		int key = 40;
		int i = 0;
		while(i < array.length) {
		if(key == array[i]) {
			System.out.println(key +" Key present at index "+ i);
			break;
		 	}
			i++;
			
    	}
		
		if(i == array.length) {
			System.out.println("key not found");
		}
	}		
}
