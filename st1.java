import java.util.*;

import level.Node;


public class st1 {
	class  Node{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	Node root;
	st1()
	{
		root=null;
	}
	public void insert(int data)
	{
		root=in(root , data);
	}
	public	Node in(Node root,int data)
		{
			if(root==null)
			{
				root= new Node(data);
				return root;
			}
			 
			 if (data > root.data) 
		            root.left = in(root.left, data); 
		        else if (data < root.data) 
		            root.right = in(root.right, data); 
				
				return root;
		
		}
		public void inorder()  { 
		       inorderRec(root); 
		    } 
		public void inorderRec(Node root)
		{
			if(root != null)
			{
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
			}
		
	}
		/*public void h1()
		{
			int h= height(root);
			int i;
			for(i=h;i>0;i--)
			{
				inorder();
				break;
			}
		}*/
		public int height(Node root) {
			  if (root == null) 
			         return 0; 
			     else { 

			        
			         int lh = height(root.left); 
			         int rh = height(root.right); 

			       
			         if (lh > rh) 
			             return (lh + 1); 
			         else
			             return (rh + 1); 
			     } 
		}
		public void print(Node root,int level)
		{
			if(root == null)
			{
				return;
			}
			if(level==1)
			{
				System.out.println(root.data);
			}
			if(level >1)
			{
				print(root.left,level-1);
				print(root.right,level-1);
			}
			
		}

	public static void main(String arg[])

	
	{
	st1 s= new st1();
	s.insert(3);
	s.insert(2);
	s.insert(4);
	s.insert(5);
	s.insert(6);
	
	s.print(s.root,4); s.print(s.root,3);s.print(s.root,2);
	s.print(s.root,1);
	}
}
