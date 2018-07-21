//Not yet completed
//pattern using numbers
import java.util.Scanner;
public class Pattern
{
    public static int N =1,i=3;
    static void recursionrow(int n)
    {
        if(n<1)
        {
            i=i+N;
            return;
        }
        if(n<=N)
        {
            System.out.print(N+" ");
            N++;
        }
        if(i>0)
        {
            System.out.print(" ");
            i--;
        }
        recursionrow(n-1);
    }
    static void recursion(int n)
    {
        if(n<1)
        {
            return;
        }
        recursionrow(n);
        System.out.println("");
        recursion(n-1);
    }
    public static void main(String args[])
    {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        recursion(n);
    }
}
