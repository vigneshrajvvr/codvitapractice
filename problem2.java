//input : 8 1 2 2 0 4 4 0 5 output : 1 4 8 5 0 0 0 0 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    int arr[] = new int[100],n,i,j,temp;
	    Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i=0;i<n;i++)
		{
		    arr[i] = in.nextInt();
		}
		for(i =0;i<n;i++)
		{
		    if(arr[i] == arr[i+1])
		        {
		            arr[i] += arr[i+1];
		            arr[i+1] = 0;
		        }
		}
		for(i=0;i<n;i++)
		{
		    if(arr[i]==0)
		    {
		        for(j=i+1;j<n;j++)
		        {
		            if(arr[j]!=0)
		            {
		                temp = arr[j];
		                arr[i] = arr[j];
		                arr[j] = 0;
		                break;
		            }
		        }
		    }
		}
		for(i =0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
	}	
}
