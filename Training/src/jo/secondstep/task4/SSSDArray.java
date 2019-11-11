package jo.secondstep.task4;

public class SSSDArray implements SSSList {

	private int[] myArray;
	private int length = 0;

	public SSSDArray(int size) {
		myArray = new int[size];
	}

	@Override
	public void add(int element) {
		if (!checkIfValidSize())
			resize();
		myArray[length] = element;
		length++;
	}

	@Override
	public void add(int index, int element) {
		if (!checkIfValidSize())
			resize();

		if (!checkValidIndex(index))
			System.out.println("The index is out of array range");
		else {
			shiftRigth(index, length);
			myArray[index] = element;
			length++;
		}
	}

	@Override
	public void addFirst(int element) {
		if (!checkIfValidSize())
			resize();

		shiftRigth(0, length);
		myArray[0] = element;
		length++;
	}

	@Override
	public void addLast(int element) {
		add(element);
	}

	@Override
	public int size() {
		return length;
	}

	@Override
	public boolean contains(int element) {

		for (int i = 0; i < length; i++) {
			if (myArray[i] == element)
				return true;
		}
		return false;
	}

	@Override
	public int get(int index) {

		if (!checkValidIndex(index)) {
			System.out.println("Index out of range");
			return 0;
		} else {
			return myArray[index];
		}

	}

	@Override
	public void remove(int index) {

		if (!checkValidIndex(index))
			System.out.println("Index out of range");
		else {
			shiftRigth(index, length);
			length--;
		}
	}

	@Override
	public void removeFirst() {

		if (!checkValidIndex(0))
			System.out.println("Empty array");
		else {
			shiftLeft(1, length);
			length--;
		}

	}

	@Override
	public void removeLast() {
		if (!checkValidIndex(length))
			System.out.println("Empty array");
		else
			length--;
	}

	@Override
	public void addAll(SSSList list) {
		addAll(length, list);
	}

	@Override
	public void addAll(int index, SSSList list) {
		for(int i=0;i<list.size();i++)
		{
			add(index, list.get(i));
				index++;
		}
	}

	@Override
	public int indexOf(int element) {
		for (int i = 0; i < length; i++) {
			if (myArray[i] == element)
				return i;
		}
		System.out.println("Elemnt not found");
		return -1;
	}

	@Override
	public void clear() {
		myArray = null;
		length = 0;
	}

	@Override
	public void set(int index, int element) {
		if (checkValidIndex(index))
			myArray[index] = element;
	}

	@Override
	public void print() {
		System.out.println("Your array has " + length +" elements");
		for (int i = 0; i < length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}

	public void resize() {
		int[] newArray = new int[(length * 3) / 2 + 1];
		for (int i = 0; i < length; i++) {
			newArray[i] = myArray[i];
		}
		myArray = newArray;
	}

	public void shiftRigth(int start, int end) {
		for (int i = end; i > start; i--) {
			myArray[i] = myArray[i - 1];
		}
	}

	public void shiftLeft(int start, int end) {
		for (int i = start; i <= end; i++) {
			myArray[i - 1] = myArray[i];
		}
	}

	boolean checkIfValidSize() {
		if (myArray.length <= length)
			return false;
		else
			return true;
	}

	boolean checkValidIndex(int index) {
		if (index < 0 || index > length)
			return false;
		return true;
	}
}
