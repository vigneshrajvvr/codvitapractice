import java.util.Scanner;
public class Main
{
    static String recursion(String s[], int n, String s1)
    {
        s1 += s[n-1];
        if(n>0)
        {
            recursion(s,n--,s1);
        }
        return s1;
    }
	public static void main(String[] args)
	{
	    int i;
	    String s,s1="";
	    Scanner in = new Scanner(System.in);
	    s = in.nextLine();
	    String words[] = s.split(" ");
	    System.out.println(""+recursion(words,words.length,s1));
	    //System.out.println(""+recursion(str, 0, str.length()));
	}	
}
