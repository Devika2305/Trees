//
import java.util.*;

public class SumAtKthLevel {

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
	
	static int sumAtK(Node Root , int K) {
		int sum =0;
		int level = 0;
		if(Root == null)
			return -1;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(Root);
		q.offer(null);
		
		while(! q.isEmpty()) {
			Node node = q.poll();
			if(node != null) {
				if(level == K)
					sum = sum + node.data;
				
				if(node.left != null)
					q.offer(node.left);
				if(node.right != null)
					q.offer(node.right);
			}
			
			else if(! q.isEmpty()) {
				q.offer(null);
				level++;

			}
		}
		return sum;
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
		
		int K = 2;
		System.out.println("Sum of Nodes at level "+K+" = "+sumAtK(root,K));
		
	}
}
