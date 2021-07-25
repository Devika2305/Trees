//https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1
import java.util.*;
public class ReversreLevelOrder {

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
	
	static void Reverse(Node root) {
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		Stack<Node> s = new Stack<>();
		q.offer(root);
		//q.offer(null);
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			s.push(node);
			if(node.right != null)
				q.offer(node.right);
			if(node.left != null)
				q.offer(node.left);
			
		}
		
		while(!s.isEmpty())
			System.out.print(s.pop().data+" ");
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
		
		System.out.println("Reverse Level Order Traversal");
		Reverse(root);
	}
}
