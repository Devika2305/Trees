public class Max_Min_Element {

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
	
	static int minimum(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int min=root.data;
		if(root.left!=null)
			min=Math.min(minimum(root.left),min);
		if(root.right!=null)
			min=Math.min(minimum(root.right),min);
		return min;
	}


	 static int maximum(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int max=root.data;
		if(root.left!=null)
			max=Math.max(max, maximum(root.left));
		if(root.right!=null)
			max=Math.max(max, maximum(root.right));
		return max;
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
		
		System.out.println("Maximum: "+maximum(root));	
		System.out.println("Minimum: "+minimum(root));
		
	}
}




