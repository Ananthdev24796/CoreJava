package com.bridgelabz;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] array = { 14,6,7,9,46,77};
		int temp;
		int size = array.length;
		
//		for(int i = 0 ; i<size ; i++) {
//			for(int j = i+1 ; j<size;j++) {
//				
//				if(array[i]>array[j]) {
//					temp = array[i];
//					array[i]=array[j];
//					array[j]=temp;
//					
//				}
//			}
//		}
//		
//		System.out.println(array[size-2]);
		
		int max = 0;
		int secondmax = 0;
		
		for(int i = 0; i < size; i++) {
			if(max < array[i]) {
				secondmax = max;
				max = array[i];
			}
			else if (max != array[i] && secondmax<array[i]) {
				secondmax = array[i];
			}
		}
		System.out.println(secondmax);
		
	}

}
