//package lab4;

public class Queue {
	private Node head;
	private Node tail;

	private int size;
	
	public Queue() {
		head = new Node("-1");
		tail = new Node("-1");
		head.setNext(tail);
	}

	public boolean isEmpty() {
		return head.getNext() == tail;
	}

	public void enqueue(String value) {
		tail.setValue(value);
		tail.setNext(new Node("-1"));
		tail = tail.getNext();
		size++;
	}

	public String dequeue() {
		if(isEmpty())
			return "-1";
		head = head.getNext();
		String value = head.getValue();
		head.setValue("-1");
		return value;
	}

	public String peek() {
		if(!isEmpty())
			return head.getNext().getValue();
		else
			return "-1";
	}

	public int getSize() {
		
		return size;
	}

}


