package jo.secondstep.task4;

public class UserList {

	public static void main(String[] args) {
		SSSDArray arrayList = new SSSDArray(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.print();

		SSSDLinkedList firstLinkedList = new SSSDLinkedList();
		SSSDLinkedList secondLinkedList = new SSSDLinkedList();

		firstLinkedList.add(5);
		firstLinkedList.add(10);
		firstLinkedList.add(0, 6);
		firstLinkedList.add(1, 7);

		secondLinkedList.add(88);
		secondLinkedList.add(44);

		System.out.println("This is first linkedList");
		firstLinkedList.print();

		int sz = firstLinkedList.size();
		firstLinkedList.remove(sz - 1);
		firstLinkedList.removeLast();
		System.out.println("This is first linkedList after removing");
		firstLinkedList.print();

		System.out.println("This is first linkedList");
		firstLinkedList.print();
		System.out.println("This is second linkedList");
		secondLinkedList.print();
		firstLinkedList.addAll(secondLinkedList);
		System.out.println("This is first linkedList after adding second linkedList");
		firstLinkedList.print();

		System.out.println("This is the array list");
		arrayList.print();
		System.out.println("This is second linkedList");
		secondLinkedList.print();
		System.out.println("This is array list after adding second linkedList");
		arrayList.addAll(secondLinkedList);
		arrayList.print();

	}

}
