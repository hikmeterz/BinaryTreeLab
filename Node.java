//package lab4;
public class Node {
	private String value;
	private Node next;

	public Node(String value) {
		this.value = value;
		next = null;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}
}
