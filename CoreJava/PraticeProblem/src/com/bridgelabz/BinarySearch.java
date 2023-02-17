package com.bridgelabz;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		int[] array = { 10,20,30,40,50,60};
		int searchelement = 40;
		
		int index = bsearch(array,0,array.length-1,searchelement);
		System.out.println("Element found at index" + index );
		
		
	}

	private static int bsearch(int[] array, int low , int high, int searchelement) {
		
		if(high >= low) {
			int mid = (low+(high-low)/2);
			if(array[mid] == searchelement) 
				return mid;
				
				if(searchelement > array[mid]) {
					return bsearch(array,mid+1,high,searchelement);
				}
				if(searchelement < array[mid]) {
					return bsearch(array,low,mid-1,searchelement);
				}
			}
		
		return -1;
		
	}
}
