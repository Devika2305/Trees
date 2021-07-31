import java.util.*;
public class DeepestNode {

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
	
	static Node deep(Node Root) {
		if(Root == null)
			return null;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(Root);
		q.offer(null);
		Node node = null;
		while(! q.isEmpty()) {
			node = q.poll();
			if(node != null) {
				if(node.left != null)
					q.offer(node.left);
				if(node.right != null)
					q.offer(node.right);
			}
		}
		return node;
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
		
		System.out.println("Deepest Node = "+ deep(root).data);
		
		
	}
}
