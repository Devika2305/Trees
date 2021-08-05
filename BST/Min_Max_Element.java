package BST;
public class Min_Max_Element {

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
	
	static Node min_iter(Node root) {
		if(root == null)
			return null;
		while(root.left != null)
			root = root.left;
		return root;
	}
	
	static Node min_recur(Node root) {
		if(root == null)
			return null;
		if(root.left == null)
			return root;
		 return min_recur(root.left);
		
	}
	
	static Node max_iter(Node root) {
		if(root == null)
			return null;
		while(root.right != null)
			root = root.right;
		return root;
	}
	
	static Node max_recur(Node root) {
		if(root == null)
			return null;
		if(root.right == null)
			return root;
		 return max_recur(root.right);
		
	}
	
	static Node insertBST(Node root, int val) {

		if(root == null) {
			return new Node(val);
		}
		if(val < root.data)
			root.left = insertBST(root.left,val);
		else
			root.right = insertBST(root.right,val);
		return root;
	}
	
	public static void main(String[] args) {

		root = insertBST(root,5);
		insertBST(root,1);
		insertBST(root,3);
		insertBST(root,4);
		insertBST(root,2);
		insertBST(root,7);
		System.out.println("Minimum & Maximum element in BST using Recursion" );
		System.out.println("Minimum element in BST "+ min_recur(root).data);
		System.out.println("Maximum element in BST "+ max_recur(root).data);
		
		System.out.println("Minimum & Maximum element in BST using Iteration");
		System.out.println("Minimum element in BST "+ min_iter(root).data);
		System.out.println("Maximum element in BST "+ max_iter(root).data);
	}

}
