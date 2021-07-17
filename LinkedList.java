package bridgelabz;

import bridgelabz.LinkedList.Node;

public class LinkedList {
	class Node {
		int num;
		Node next;
		
		public Node(int num) {
			this.num = num;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public Node create(int num) {
		Node newNode = new Node(num);
		 
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		return newNode;
	}
	public void display() {
		Node current = head;

		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singley linked list:");
		while(current != null) {
			System.out.println(current.num+"");
			current = current.next;
		}
		System.out.println();	
	}
	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList Problems");
		
		LinkedList list = new LinkedList();
		
		list.create(56);
		list.create(30);
		list.create(70);
		
		list.display();
		
	}
}
