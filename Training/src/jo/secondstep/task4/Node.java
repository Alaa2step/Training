package jo.secondstep.task4;

public class Node {

    private Node next;
    private int value;
    public Node(int val) {
        this.value = val;
    }
	public Node getNext() {
		return next;
	}
	public int getValue() {
		return value;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}
