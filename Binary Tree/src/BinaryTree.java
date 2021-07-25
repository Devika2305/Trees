
public class BinaryTree {

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
	
	static void preOrder(Node root) {   //Root > Left > Right
		if(root == null)
			return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void inOrder(Node root) {   //Root > Left > Right
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	static void postOrder(Node root) {   //Root > Left > Right
		if(root == null)
			return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
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
		
		System.out.println("Pre Order  ");
		preOrder(root);
		System.out.println();
		System.out.println("In Order  ");
		inOrder(root);
		System.out.println();
		System.out.println("Post Order  ");
		postOrder(root);
	}
	
}
