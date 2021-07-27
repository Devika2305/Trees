//https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
import java.util.*;
public class LeftView {

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
	
	static void leftView(Node root) {
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		//q.offer(null);
		
		while(! q.isEmpty()) {
			int n = q.size();
			for(int i =1;i<=n;i++) {
				Node node = q.poll();
				if(i == 1)
					System.out.println(node.data);
				if(node.left != null)
					q.offer(node.left);
				if(node.right != null)
					q.offer(node.right);
			}
			
		}
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
		
		leftView(root);
	}
}
