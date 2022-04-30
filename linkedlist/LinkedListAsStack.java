class Node {
	public int data;
	public Node next; // reference to another object and not the object itself
 
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}	
 
class LinkedList {
	private Node head;
 
	public LinkedList() {
		head = null;
	}
 
	public void insertHead(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		// else link head to newNode and update head
		newNode.next = head;
		head = newNode;
	}
 
	public void print(){
		System.out.println("Printing LinkedListAsStack nodes: ");
		//start at head and traverse until next is null
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}	
 
public class LinkedListAsStack {
	public static void main(String[] args) {
		System.out.println("----- Executing LinkedListAsStack —----");
 
		LinkedList myList = new LinkedList();
		myList.insertHead(5);
		myList.insertHead(3);

		myList.print();
	}
}					

