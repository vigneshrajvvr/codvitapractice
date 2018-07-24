//Simple linkedlist using character elements
import java.util.*;
class Node
{
    char data;
    Node next;
}
class stackbraces
{
    Node head;
    void insert(char b)
    {
        Node node = new Node();
        node.data = b;
        node.next = null;
        if(head == null)
        {
            head = node;
        }
        else 
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next =node;
        }
        
    }
    void show()
    {
        Node show = head;
        while(show!= null)
        {
            System.out.println(""+show.data);
            show = show.next;
        }
    }
}
public class Main
{
	public static void main(String[] args)
	{
	    int n,i;
	    stackbraces s = new stackbraces();
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the number of characters :");
	    n = in.nextInt();
	    for(i=0;i<n;i++)
	    {
	        s.insert(in.next().charAt(0));
	    }
	    s.show();
	}
}
