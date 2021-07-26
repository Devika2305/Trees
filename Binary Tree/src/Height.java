//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1

import java.util.*;
public class Height {

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
	
		static int height_recursion(Node root) {
			if(root == null)
				return 0;
			
			int left = height_recursion(root.left);
			int right = height_recursion(root.right);
			return (Math.max(left, right)+1);
		}
		
		static int height_iterative(Node root) {
			if(root == null)
				return 0;
			Queue<Node> q = new LinkedList<>();
			q.offer(root);
			q.offer(null);
			int count = 0;
			
			while(!q.isEmpty()) {
				Node node = q.poll();
				if(node != null) {
					if(node.left !=  null)
						q.offer(node.left);
					if(node.right != null)
						q.offer(node.right);
				}
				else {
					count++;
					if(! q.isEmpty())
						q.offer(null);
				}
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
		*/
		root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Height of the tree using recursion = "+height_recursion(root));
		System.out.println("Height of the tree using iteration = "+height_iterative(root));		
	}
}
