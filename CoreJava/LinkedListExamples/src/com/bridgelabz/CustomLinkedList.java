package com.bridgelabz;

public class CustomLinkedList {
	Node head;
	
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node currentNode = head;
			while(currentNode!= null) {
				currentNode = currentNode.next;
			}
			currentNode.next=newNode;
		}
		
		
	}

	public void addAtStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		
		
	}

	public void insert(int index, int data) {
		if(index == 0) {
			addAtStart(data);
		}else {
			Node newNode = new Node(data);
			Node currentNode = head;
			
			for(int i = 0; i< index-1;i++) {
				currentNode = currentNode.next;
				
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
		
	}

	public void delete(int index) {
		//Node newNode = new Node(index);
		if(index == 0) {
			head = head.next;
		}else {
			Node currentNode = head;
			for(int i = 0; i< index-1;i++) {
				currentNode = currentNode.next;
				
			}
			currentNode.next = currentNode.next.next;
		}
		
		
		
	}

	public void display() {
		Node currentNode = head;
		if(currentNode == null) {
			System.out.println("LinkedList is Empty");
		}else {
			while(currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
		}
		
		
	}

}
