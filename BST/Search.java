package BST;
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
	
	static Node find(Node root, int el) {
		if(el == root.data)
			return root;
		if(el < root.data)
			return find(root.left,el);
		if(el > root.data)
			return find(root.right,el);
		else
			return null;
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
	
	public static void main(String args[]) {
		
		root = insertBST(root,5);
		insertBST(root,1);
		insertBST(root,3);
		insertBST(root,4);
		insertBST(root,2);
		insertBST(root,7);
		
		int el = 2;
		if(find(root,el) != null)
			System.out.println("The element "+el+" is present in the BST");
		else
			System.out.println("The element "+el+" is not present in the BST");
	}

}
