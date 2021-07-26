//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1
public class Diameter {

	static Node root = null;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	static int height(Node node) {
		if(node == null)
			return 0;
		
		return (Math.max(height(node.left),height( node.right))+1);
	}
	
	static int diameter(Node root) {
		
		if(root == null)
			return 0;
		
 		int left = height(root.left);
		int right = height(root.right);
		
		int curr_diameter = left + right+ 1;
		int left_diameter = diameter(root.left);
		int right_diameter = diameter(root.right);
		return Math.max(Math.max(left_diameter, right_diameter),curr_diameter);
	}
	
	public static void main(String args[]) {
		/*
		 			 1
		 		   /   \
		 		  2     3
		 		 / \   / \
		 		4   5 6   7
		*/
		root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Diameter of the tree = "+diameter(root));
	}
}
