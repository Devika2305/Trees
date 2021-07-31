import java.util.*;

public class Leaf_Half_Full_Nodes {

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
	
	static int leaf_node(Node root) {
		if(root == null)
			return -1;
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int count = 0;
		while(! q.isEmpty()) {
			Node node = q.poll();
			if(node.left == null && node.right == null)
				count++;
			if(node.left != null)
				q.offer(node.left);
			if(node.right != null)
				q.offer(node.right);
		}
		return count;
		
	}
	
	static int half_leaf_node(Node root) {
		if(root == null)
			return -1;
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		Node node;
		int count = 0;
		while(! q.isEmpty()) {
			node = q.poll();
			if(node.left == null && node.right != null || node.right == null && node.left != null)
				count++;
			if(node.left != null)
				q.offer(node.left);
			if(node.right != null)
				q.offer(node.right);
		}
		return count;
		
	}
	static int full_node(Node root) {
		if(root == null)
			return -1;
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		Node node;
		int count = 0;
		while(! q.isEmpty()) {
			node = q.poll();
			if(node.right != null && node.left != null)
				count++;
			if(node.left != null)
				q.offer(node.left);
			if(node.right != null)
				q.offer(node.right);
		}
		return count;
		
	}
	
	public static void main(String args[]) {
		/*
		 			 1
		 		   /   \
		 		  2     3
		 		 / \   / \
		 		4   5 6   7
		 	   /   /
		 	  8   9
		*/
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.right.left = new Node(9);
		
		System.out.println("Number of leaf node = "+leaf_node(root));
		System.out.println("Number of half leaf node = "+half_leaf_node(root));
		System.out.println("Number of full leaf node = "+full_node(root));		
	}
	
}
