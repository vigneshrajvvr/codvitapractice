//equivalent braces usign linked list
//Not yet completed
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
        System.out.println("");
        while(show!= null)
        {
            System.out.print(show.data+" ");
            show = show.next;
        }
    }
    int compare()
    {
        int count =0;
        Node compare = new Node();
        compare = head;
        while(compare!=null)
        {
            char c= compare.data;
            if((c=='}' || c == ')' || c==']') && compare == head)
            {
                break;
            }
            else
            {
                if(c == '{' || c == '(' || c == ']')
                {
                    if(compare == head)
                    {
                        Node n1 = head;
                    }
                    else
                    {
                        Node n2 = new Node();
                        n2.data = c;
                        n2.next = null;
                        n1.next = n2;
                    }
                }
                else
                {
                    if(c == '}')
                    {
                        if(n2.data == '{')
                        {
                            while(head.next.next != null)
                        }
                    }
                }
            }
            compare = comapre.next;
        }
        return count;
    }
}
public class Main
{
    public static int count =0;
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
