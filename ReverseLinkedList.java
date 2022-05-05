import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
}

class ReverseLinkedList
{
	static Scanner scan = new Scanner(System.in);
	Node head;
	static int size = 0; 
	
	void addElement(int data)
	{
		
		
		if(head==null)
		{
			head = new Node(data);
			//System.out.println(head.data + " is added");
			size++;
		}
		else
		{
			
			Node newNode = new Node (data);
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
			//System.out.println(newNode.data + " is added");
			size++;
		}
	}
	
	void display()
	{
		if(head==null)
			System.out.println("List is empty");
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	void delete()
	{
		if(head==null)
			System.out.println("List is empty");
		else
		{
			Node temp = head;
			Node back = null;
			while(temp.next != null)
			{
				back = temp;
				temp = temp.next;
			}
			System.out.println(temp.data + " is deleted from the list");
			back.next = null;
		}
	}
	
	void reverse()
	{
		if(head==null)
			System.out.println("List is empty");
		else
		{
			Node current = head;
			Node prev = null;
			Node next = null;
			while(current != null)
			{
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			head = prev;
		}
	}
	
	public static void main(String[] args)
	{

		ReverseLinkedList li = new ReverseLinkedList();
		
		int a = scan.nextInt();
		
		
		while(a>0){
			
			int b = scan.nextInt();
			for(int i=0; i<b; i++){
				int data = scan.nextInt();
				li.addElement(data);
			}
			li.reverse();
			li.display();	
			a--;
			
			li.head = null;
			
		}
	}
}