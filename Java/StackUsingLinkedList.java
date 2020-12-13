
class Node {
	int data;
	Node next;

	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.next = null;
	}
}

public class StackUsingLinkedList {

	private Node head;

	public StackUsingLinkedList() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	public void display() {
		if (this.head == null) {
			System.out.println("Linked List is empty");
		} else {
			Node temp = this.head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public int peek() {
		if (this.head == null) {
			return -1;
		} else {
			return this.head.data;
		}
	}

	public int pop() {
		if (this.head == null) {
			return -1;
		} else {
			Node temp = this.head;
			this.head = this.head.next;
			return temp.data;
		}
	}

	public int size() {
		int count = 0;
		var temp = this.head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}
