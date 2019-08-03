package LinkedList;
/*
 * Given a key (or data) to be inserted into the linked list of size N. 
 * The task is to insert the element at head or tail of the linked list depending on 
 * the input just before it p. If p is 0, then insert the element at beginning else insert 
 * at end.

Hint : When inserting at the end, make sure that you handle NULL explicitly.
 */
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
		
class LinkeListAccordingTo0and1 
{
     /* Drier program to test above functions */
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
            LList myList = new LList();
			int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                if(a2==0)
                    myList.insertAtBeginning(a1);
                else
                    myList.insertAtEnd(a1);
            }
			myList.printList();
		}
	}
}


/*This is a function problem.You only need to complete the function given below*/
/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class LList
{
    Node head; // Please do not remove this
    
    // Should insert a node at the beginning
	void insertAtBeginning(int x)
	{
	    if(head==null)
	    {
	        Node k = new Node(x);
	        head = k;
	    }
	    else
	    {
	        Node n = new Node(x);
	        n.next = head;
	        head = n;
	    }
	}
	
	// Should insert a node at the end
	void insertAtEnd(int x)
	{
	    Node n = head;
	    if(n==null)
	    {
	        Node K = new Node(x);
	        head = K;
	    }
	    else
	    {
	        while(n.next!=null)
	        {
	            n = n.next;
    	    }
	        Node k  = new Node(x);
	        n.next = k;
	    }
	}
	// Please do not delete this
	void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}
