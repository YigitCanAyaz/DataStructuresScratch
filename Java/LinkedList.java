
public class LinkedList {

	private int size;
	private Node node, head, tail;

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	public void addFirst(int data) {
		node = new Node(data);
		if (isEmpty())
			tail = head = node;
		else {
			node.next = head;
			head = node;
		}
		size++;
	}

	public void addLast(int data) {
		node = new Node(data);
		if (isEmpty())
			tail = head = node;
		else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public boolean contains(int data) {
		if (isEmpty()) {
			return false;
		} else {
			var current = head;
			while (current != null) {
				if (current.data == data)
					return true;
				else
					current = current.next;
			}
			return false;
		}
	}

	public int indexOf(int data) {
		if (isEmpty()) {
			return -1;
		} else {
			var current = head;
			int index = 0;
			while (current != null) {
				if (current.data == data)
					return index;
				else {
					current = current.next;
					index++;
				}
			}
			return -1;
		}
	}

	public int getSize() {
		return size;
	}

	public int deleteLast() throws Exception {
		if (isEmpty())
			throw new Exception("List is empty!");
		else {
			var current = head;

			if (current == tail) {
				var deletedLast = current;
				tail = head = current = null;
				size--;
				return deletedLast.data;
			}
			while (current.next != tail) {
				current = current.next;
			}
			var deletedLast = current.next;
			current.next = null;
			tail = current;
			size--;
			return deletedLast.data;
		}
	}

	public int deleteFirst() throws Exception {
		if (isEmpty())
			throw new Exception("List is empty!");
		else {
			var deletedFirst = head;
			var newFirst = head.next;
			head = null;
			head = newFirst;
			size--;
			return deletedFirst.data;
		}
	}

	public int[] toArray() {

		int[] array = new int[getSize()];
		var current = head;
		int index = 0;
		while (current != null) {
			array[index++] = current.data;
			current = current.next;
		}
		return array;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void reverse() {
		var current = head;
		Node prev = null;
		while (current != null) {
			var next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		tail = head;
		tail.next = null;
		head = prev;
	}

	public int getKthNumber(int k) {
		reverse();
		var current = head;
		for (int i = 1; i < k; i++) {
			current = current.next;
		}
		return current.data;
	}
}
