//package lab4;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String [] args) {
		
		
		Scanner k = new Scanner(System.in);
		Queue q = new Queue();
		
		System.out.println("String giriniz: ");
		
		
	
		
		Scanner scan = new Scanner(k.nextLine());
		
		
		scan.useDelimiter(" ");
		
		
		while(scan.hasNext()){
			
			q.enqueue(scan.next());
		
			
		}
		
		BinaryTree tree = new BinaryTree();
		int i=0;
		while(!q.isEmpty()) {
			
			tree.add(q.dequeue(),i);
			i++;
		}
		
	
		tree.printTree();
		
		System.out.println("PostOrder");
		
		System.out.println("**************************************");
		
		tree.printpostOrder();
		
		
		
		
	}

}
