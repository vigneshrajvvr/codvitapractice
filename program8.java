public class Main 
{
    static int temp;
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int d = 3;
        int i,j;
        int n= arr.length;
        for(i=0;i<d;i++)
        {
            temp = arr[0];
            for(j=0;j<n-1;j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
