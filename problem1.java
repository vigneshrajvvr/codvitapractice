// input : array_size, array_values, number__values...input : 8 1 1 1 1 1 1 1 1 3 output: 1 1 1 0 1 1 1 0 1 1 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    int arr[] = new int[100],n,k,j,i,l,count=0;
	    Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i=0;i<n;i++)
		{
		    arr[i] = in.nextInt();
		}
		k=in.nextInt();
		for(i=0;i<n;i++)
		{
		    j=i+1;
		    if(arr[i]==1 && arr[j] ==1)
		    {
		        count++;
		    }
		    if(count==1)
		    {
		        for(l=n;l>=i+k;l--)
		        {
		            arr[l+1] = arr[l];
		        }
		        arr[i+k] = 0;
		        n++;
		    }
		}
		for(i=0;i<n;i++)
		{
		    System.out.print(" "+arr[i]);
		}
	}
}
