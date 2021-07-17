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
	public void addNode(int num) {
		Node newNode = new Node(num);
		 
		if (head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void appendNode(int num) {
        Node newNode = new Node(num);
        if (head == null) {
			head = newNode;
			return;
		}
        newNode.next =null;   	
	    Node tail = head;
	    while(tail.next != null) {
			tail = tail.next;
		}	
	    tail.next = newNode;
    }
	public void insert(int num, Node prev) {
    	Node newNode = new Node(num);
    	newNode.next = prev.next;
    	prev.next = newNode; 
    }
	public void delete(int num) {
        Node temp = head, prev = null;
        if (temp != null && temp.num == num) {
        	head = temp.next; 
        	return;
        }
        while (temp != null && temp.num != num) {
        	prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
        	return;
        }
         prev.next = temp.next;
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
	
		list.addNode(70);
		list.addNode(30);
		list.addNode(56);
		
		list.appendNode(56);
		list.appendNode(30);
		list.appendNode(70);;

		
		list.create(56);
		list.create(70);
		list.insert(30,list.head);
		
		list.create(56);
		list.create(30);
		list.create(70);
		list.delete(56);
		
		list.display();
		
	}
}
