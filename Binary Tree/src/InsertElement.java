import java.util.*;
public class InsertElement {

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
	
	static void insert(Node Root, int data) {
		if(Root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(Root);
		
		while(! q.isEmpty()) {
			Node node = q.poll();
			if(node.left != null)
				q.offer(node.left);
			else {
				node.left = new Node(data);
				return;
			}
			if(node.right != null)
				q.offer(node.right);
			else {
				node.right = new Node(data);
				return;
			}
		}
			
		return;
	}
	
	static void inOrder(Node root) {   //Root > Left > Right
		if(root == null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
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
		
		System.out.println("Before Insertion InOrder Traversal");
		inOrder(root);
		insert(root,8);
		insert(root,9);
		System.out.println();
		System.out.println("After insertion inorder traversal ");
		inOrder(root);
		
	}
}
