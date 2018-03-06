package GeeksForGeeks;
import java.util.Stack;
public class SpiralTraversal {
	static Node root;
	static class Node 
	{
		int data;
		Node left, right;

		public Node(int item) 
		{
			data = item;
			left = right = null;
		}
	}
	
	void printSpiral(Node node) 
	{
		if (node == null) 
			return; 
		
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(node);
       while(!s1.empty() || !s2.empty())
       {
    	 while(!s1.empty())
    	 {
    		 Node temp = s1.pop();
    		 System.out.println(temp.data);
    		 
    		 if(temp.right!= null)
    			 s2.push(temp.right);
    		 if(temp.left != null)
    		 s2.push(temp.left);
    	 }
    	 
    	 while(!s2.empty())
    	 {
    		 Node temp= s2.pop();
    		 
    		 System.out.println(temp.data);
    		 
    		 if (temp.left!=null)
    		 s1.push(temp.left);
    		 if (temp.right!=null)
        	 s1.push(temp.right);
    		 
    	 }
    	   
    	   
       }
		
	}


	public static void main(String[] args) {
		
		SpiralTraversal tree = new SpiralTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		System.out.println("Spiral Order traversal of Binary Tree is ");
		tree.printSpiral(root);
	
	}

}
