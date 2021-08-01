public class Search {

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
	
	static boolean search(Node root, int data) {
		if(root == null)
			return false;
		if(root.data == data)
			return true;
		return search(root.left,data) || search(root.right,data);
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
		
		int data = 1;
		if(search(root,data))
			System.out.println("The element "+data+" is found in tree");
		else
			System.out.println("The element "+data+" is not found in tree");
		
	}
}
