package com.bridgelabz;

public class Main {
	
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.add(7);
		list.addAtStart(17);
		list.addAtStart(71);
		list.insert(1,27);
		list.insert(1,77);
		list.insert(1,47);
		list.insert(3, 67);
		list.insert(4,87);
		list.delete(2);
		list.display();
	}

}
