//package lab4;

import java.util.LinkedList;

public class BinaryTree {
	NodeT root;
	
	public void  add(String value,int num){
		if(num==0) {
			root= new NodeT(value);
			insert(root,null,num);
		}	
		else {
			NodeT newnode = new NodeT(value);
		
			insert(root,newnode,num);
		}
		
	}
  
	public void insert(NodeT root, NodeT newnode,int num){
        if (root == null) return;
        else{
            int parent = (num-1)/2;
            if( parent==0 ){
                if (root.left == null)
                    root.left = newnode;
                else 
                    root.right = newnode;
            }
            else {
                root = ((parent%2)==1) ? root.left: root.right; 
                insert(root,newnode,parent);
            }
        }
    }
    
	public void printTree() {
		
		print(root);
		
	}
	
    public void print(NodeT root){
    	//System.out.println(root.data);
    	if(root!=null) {
	        LinkedList<NodeT> ls = new LinkedList<NodeT>();
	        LinkedList<NodeT> ls1 = new LinkedList<NodeT>();
	        LinkedList<NodeT> t;
	        ls.addLast(root);
	        while (ls.size() != 0) {
	            t = ls;
	            ls = ls1;
	            ls1 = t;  
	            while(ls1.size()!=0) {
	                NodeT temp = ls1.poll();
	                System.out.print(temp.data+"|");
	                if(temp.left != null) 
	                    ls.addLast(temp.left);
	                if(temp.right != null) 
	                    ls.addLast(temp.right);
	            }
	            System.out.println();
	        }
    
    	}else return;
    }public void printpostOrder() {
    	postOrder(root);
    	
    }
    
    public void postOrder(NodeT node){
    	if (node == null) {
    		return; 
    	}
    	postOrder(node.left);
    	postOrder(node.right);
    	System.out.print(node.data + " "); 
    }

    
    
	
	
}
