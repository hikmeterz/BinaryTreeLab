//package lab4;

public class NodeT {
	  String data;
	  NodeT left, right, parent;
	  
	  int num;
	  public NodeT(String item,int num) {
	    data = item;
	    left = right = null;
	    this.num=num;
	  }
	  public NodeT(String item) {
		  
		  data=item;
		  left=right=null;
		  
		  
	  }

	  public NodeT (String value, NodeT parent) {
		    this.data = value;
		    left = null;
		    right = null;
		    this.parent = parent;
	  }
	  public boolean hasRight() {
		  if(this.right!=null)
			  return true;
		  else
			  return false;
		  
		  
	  }
	  
	  public boolean hasLeft() {
		  if(this.left!=null)
			  return true;
		  else
			  return false;
		  
		  
	  }
	  
	  
}
