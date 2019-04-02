import java.util.*;
class Node
{
	int data;
	Node next=null;
	Node(int d)
	{
		data=d;
		next=null;
	}
	int getData()
	{
		return data;
	}
}
public class LinkedList
{
	public static void MiddleOfLinkedList(Node node,int length)
	{
		
		Node temp1=node;
		Node temp2=node;
		if(length%2==0)
		{
			if(length==2)
				System.out.println("Middle of the list is "+temp1.next.data);
			else
			{
				while(temp2.next.next!=null)
				{
					temp1=temp1.next;
					temp2=temp2.next.next;
				}
				System.out.println("Middle of the list is "+temp1.next.data);
			}
		}
		else
		{
			while(temp2.next!=null)
			{
				temp1=temp1.next;
				temp2=temp2.next.next;
			}
			System.out.println("Middle of the list is "+temp1.data);
		}
	}
	public static int Length(Node node)
	{
		int length=0;
		for(Node temp=node;temp!=null;temp=temp.next)
			length++;
		return length;
	}
	public static void PrintList(Node tail)
	{
		System.out.print("Given list is : ");
		for(Node temp=tail;temp!=null;temp=temp.next)
		{
			System.out.print(temp.data+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		Node head=null;
		Node tail=null;
		while((a=sc.nextInt())!=-1)
		{
			if(head==null)
			{
				head=new Node(a);
				tail=head;
			}
			else
			{
				head.next=new Node(a);
				head=head.next;
			}
		}
		PrintList(tail);
		int l=Length(tail);
		MiddleOfLinkedList(tail,l);
	}
}