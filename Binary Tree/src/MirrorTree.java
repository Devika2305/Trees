//https://www.geeksforgeeks.org/create-a-mirror-tree-from-the-given-binary-tree/
public class MirrorTree {

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
	
	static void inOrder(Node root) {   //Root > Left > Right
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	static void mirror(Node root) {
		if(root == null) 
			return;
		mirror(root.left);
		mirror(root.right);
		//swapping the left and right children of the current node
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	public static void main(String args[]) {
		/* 
		 * Orignal Tree
		 			 5
		 		   /   \
		 		  3     6
		 		 / \   
		 		2   4 
		*/
		root = new Node(5);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.right = new Node(6);
		
		/*
		 * Mirrored Tree
		             5
		 		   /  \
		 		  6     3
		 		       / \
		 		      4   2 
		  
		*/
		System.out.println("Inorder of Original Tree = ");
		inOrder(root);
		System.out.println();
		System.out.println("Inorder of Mirror Tree = ");
		mirror(root);
		inOrder(root);
		
		
	}
}
