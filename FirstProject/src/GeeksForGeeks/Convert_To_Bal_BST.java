package GeeksForGeeks;
import java.util.*;
public class Convert_To_Bal_BST 
{
	static Node root;
	
	static class Node 
{
	int data;
	Node left, right;

	public Node(int data) 
	{
		this.data = data;
		left = right = null;
	}
}
	static void storeBSTNodes(Node root, Vector<Node> nodes) 
	{
		if(root==null)
			return;
		storeBSTNodes(root.left, nodes);
		nodes.add(root);
		storeBSTNodes(root.right, nodes);
	}

	static Node buildTreeUtil(Vector<Node> nodes, int start, int end) 
			
	{
		if(start>end)
		return null;
		int mid = (start+end)/2;
		Node node = nodes.get(mid);
		 
		node.left = buildTreeUtil(nodes, start, mid-1);
		node.right= buildTreeUtil(nodes, mid+1, end);
		return node;
		
		
		
	}
	void preOrder(Node node) 
	{
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String[] args) 
	{

		Convert_To_Bal_BST tree = new Convert_To_Bal_BST();
		root = new Node(10);
		root.left = new Node(8);
		root.left.left = new Node(7);
		root.left.left.left = new Node(6);
		root.left.left.left.left = new Node(5);
		Vector<Node> nodes = new Vector<Node>();
		storeBSTNodes(root, nodes);

		int n = nodes.size();
		root = buildTreeUtil(nodes, 0, n - 1);
		System.out.println("Preorder traversal of balanced BST is :");
		tree.preOrder(root);
	}
}


