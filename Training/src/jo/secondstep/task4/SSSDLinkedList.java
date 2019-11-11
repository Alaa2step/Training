package jo.secondstep.task4;

public class SSSDLinkedList implements SSSList {

	private Node head;
	private Node tail;
	private int length;

	public SSSDLinkedList() {
		head = null;
		tail = null;
		length = 0;
	}

	@Override
	public void add(int element) {
		Node newNode = new Node(element);
		newNode.setNext(null);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		length++;
	}

	@Override
	public void add(int index, int element) {
		if (index == 0) {
			addFirst(element);
			return;
		}
		if (index == length) {
			addLast(element);
			return;
		}
		if (!checkValidIndex(index))
			System.out.println("Index out of range");
		else {
			int count = 0;
			Node prevNode = head;
			Node currentNode = head;
			Node newNode = new Node(element);
			while (currentNode != null) {
				if (count == index) {
					newNode.setNext(currentNode);
					prevNode.setNext(newNode);
					break;
				}
				prevNode = currentNode;
				currentNode = currentNode.getNext();
				count++;
			}
			length++;
		}
	}

	@Override
	public void addFirst(int element) {
		Node newNode = new Node(element);
		newNode.setNext(head);
		head = newNode;
		length++;
	}

	@Override
	public void addLast(int element) {
		Node newNode = new Node(element);
		tail.setNext(newNode);
		newNode.setNext(null);
		tail = newNode;
		length++;
	}

	@Override
	public int size() {
		return length;
	}

	@Override
	public boolean contains(int element) {
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.getValue() == element) {
				return true;
			}
			currentNode = currentNode.getNext();
		}
		return false;
	}

	@Override
	public int get(int index) {

		if (!checkValidIndex(index)) {
			System.out.println("Index out of range");
			return -1;
		} else {
			int count = 0;
			Node currentNode = head;
			while (currentNode != null) {
				if (count == index) {
					return currentNode.getValue();
				}
				currentNode = currentNode.getNext();
				count++;
			}
			return -1;
		}
	}

	@Override
	public void remove(int index) {

		if (index == 0) {
			removeFirst();
			return;
		}
		int count = 0;
		Node currentNode = head;
		Node prevNode = head;
		while (currentNode != null) {
			if (count == index) {
				prevNode.setNext(currentNode.getNext());
				if (index == length - 1)
					tail = prevNode;
			}
			prevNode = currentNode;
			currentNode = currentNode.getNext();

			count++;
		}
		length--;
	}

	@Override
	public void removeFirst() {

		head = head.getNext();
	}

	@Override
	public void removeLast() {

		remove(length - 1);
	}

	@Override
	public void addAll(SSSList list) {
		addAll(length, list);
	}

	@Override
	public void addAll(int index, SSSList list) {

		for (int i = 0; i < list.size(); i++) {
			add(index, list.get(i));
			index++;
		}

	}

	@Override
	public int indexOf(int element) {
		int count = 0;
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.getValue() == element) {
				return count;
			}
			currentNode = currentNode.getNext();
			count++;
		}
		return 0;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
	}

	@Override
	public void set(int index, int element) {
		int count = 0;
		Node currentNode = head;
		while (currentNode != null) {
			if (count == index) {
				currentNode.setValue(element);
				break;
			}
			currentNode = currentNode.getNext();
			count++;
		}
	}

	@Override
	public void print() {
		System.out.println("Your linkedList has "+length+" elements");
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.getValue() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	boolean checkValidIndex(int index) {
		if (index < 0 || index >= length)
			return false;
		return true;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	
}
