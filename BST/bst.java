package BST;
public class bst {
	
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
	
	static void inorder(Node root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void main(String args[]) {
	
		root = insertBST(root,5);
		insertBST(root,1);
		insertBST(root,3);
		insertBST(root,4);
		insertBST(root,2);
		insertBST(root,7);
		System.out.println("Inorder for the BST  ");
		inorder(root);
	}
}
