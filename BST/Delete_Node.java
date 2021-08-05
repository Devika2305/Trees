package BST;

import BST.bst.Node;
public class Delete_Node {

		static Node root = null;
		
	void delete(int data){
        root = deleteRec(root, data);
    }
    public static Node deleteRec(Node root,int data) {
    	if(root==null) {
    		return root;
    	}
    	if(data<root.data)
    		root.left = deleteRec(root.left, data);
        else if (data>root.data)
            root.right = deleteRec(root.right, data);
        else {
        	//If a node has one or no children
        	if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
        	//If a nose has 2 children
        	root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
    	return root;	
    }
    
    public static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    
    
	public static void main(String[] args) {

		root = bst.insertBST(root,5);
		bst.insertBST(root,1);
		bst.insertBST(root,3);
		bst.insertBST(root,4);
		bst.insertBST(root,2);
		bst.insertBST(root,7);
		System.out.println("Inorder before deletion");
		bst.inorder(root);
		deleteRec(root,4);
		System.out.println();
		System.out.println("Inorer after deletion");
		bst.inorder(root);
		
	}

}
