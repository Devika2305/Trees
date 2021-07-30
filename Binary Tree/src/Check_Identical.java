public class Check_Identical {

		static Node root1 = null;
		static Node root2 = null;
		
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
		
		static boolean chk_Identical(Node root1, Node root2) {
			if(root1 == null && root2 == null)
				return true;
			if(root1 != null && root2 != null && root1.data == root2.data)
			{
				return chk_Identical(root1.left, root2.left) && chk_Identical(root1.right, root2.right);
			}
			return false;
		}
		
		public static void main(String args[]) {
			/*
			 			 1
			 		   /   \
			 		  2     3
			 		 / \   / \
			 		4   5 6   7
			*/
			root1 = new Node(1);
			root1.left = new Node(2);
			root1.left.left = new Node(4);
			root1.left.right = new Node(5);
			root1.right = new Node(3);
			root1.right.left = new Node(6);
			root1.right.right = new Node(7);
			
			
						/*
						 1
					   /   \
					  2     3
					 / \   / \
					4   5 6   7
			*/
			root2 = new Node(1);
			root2.left = new Node(2);
			root2.left.left = new Node(4);
			root2.left.right = new Node(5);
			root2.right = new Node(3);
			root2.right.left = new Node(6);
			root2.right.right = new Node(7);
			
			if(chk_Identical(root1, root2))
				System.out.println("The two trees are identical trees");
			else
				System.out.println("The two trees are not identical trees");
		}

}
