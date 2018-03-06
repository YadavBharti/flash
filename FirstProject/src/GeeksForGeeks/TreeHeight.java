package GeeksForGeeks;

public class TreeHeight {
     
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
		   Node root;
		    
		  int height(Node node)
		    {
		        
		        if (node == null)
		        {
		            return 0;
		        }    
		        
		        else
		        {
		        int lheight = height(root.left);
		        int rheight = height(root.right);
		        if (lheight > rheight)
	                return (lheight + 1);
	             else
	                return (rheight + 1);
		        //return (1 + Math.max(height(node.left), height(node.right)));
		        }
		    }
		 
		    public static void main(String args[])
		    {
		        /* creating a binary tree and entering the nodes */
		        TreeHeight tree = new TreeHeight();
		        tree.root = new Node(1);
		        tree.root.left = new Node(2);
		        tree.root.right = new Node(3);
		        tree.root.left.left = new Node(4);
		        tree.root.left.right = new Node(5);
		       System.out.println( tree.height(tree.root));
		 
		    }
	}


