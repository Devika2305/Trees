//https://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/
public class BuildTree_Pre_In_order {

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
	
	static int index = 0;
	static Node buildTree(int preorder[], int inorder[], int start, int end) {
		if(start > end)
			return null;
		int curr = preorder[index++];
		Node subRootNode = new Node(curr);
		
		if(start == end)
			return subRootNode;
		int pos = search(inorder,start,end,subRootNode.data);
		subRootNode.left = buildTree(preorder,inorder,start,pos-1);
		subRootNode.right = buildTree(preorder,inorder,pos+1,end);
		
		return subRootNode;
	}
	static int search(int[] inorder, int start, int end, int curr) {

		for(int i =start;i<=end;i++) {
			if(inorder[i] == curr)
				return i;
		}
		return -1;
	}
	
	static void printInorder(BuildTree_Pre_In_order.Node root2) {
		if(root == null)
			return;
		
		printInorder(root.left);
		System.out.print(root.data+" ");
	    printInorder(root.right);
		
	}
	
	public static void main(String[] args) {

		int inorder[] = {4,2,1,5,3};
		int preorder[] = {1,2,4,3,5};
		Node root = buildTree(preorder,inorder,0,inorder.length-1);
		
		System.out.println(root.data);
		System.out.println("Inorder traversal for constructed tree is : ");
		printInorder(root);

	}	
}
