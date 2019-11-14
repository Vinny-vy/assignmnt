import java.util.*;


public class st2 {
class Node{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
		}
}
Node root;
st2()
{
	Node root= null;
}
public void insrt(int data)
{
	root= in(root ,data);
}
public Node in(Node root, int data)
{
	if(root == null)
	{
		root= new Node(data);
		return root;
	}
	if(data < root.data)
	root.left=in(root.left,data);
	if(data > root.data)
		root.right=in(root.right,data);
	return root;
		
}
/*/public void print()
{
	if(root != null)
	{
		System.out.println(root.data);
	}
}
public void h1()
{
	int h= height(root);
	int i;
	for(i=0;i<h;i++)
	{
	print(root,i);
		//break;
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
		
		print(root.right,level-1);
		print(root.left,level-1);
	}
	
}
public static void main(String args[])
{
	st2 ss = new st2();
	ss.insrt(2);
	ss.insrt(3);
	ss.insrt(1);
	ss.insrt(5);
	//ss.insrt(1);
	//ss.h1();
	ss.print(ss.root, 1);
	ss.print(ss.root,2);
	ss.print(ss.root,3);
	
	
}
}
