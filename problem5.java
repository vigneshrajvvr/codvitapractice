public class Main
{
    public static void main (String[] args) 
    {
        int i;
        String s = "abcdef";
        char arr[] = s.toCharArray();
        char temp;
        for(i=1;i<=(arr.length/2);i++)
        {
            temp = arr[arr.length-i];
            arr[arr.length-i] = arr[i-1];
            arr[i-1] = temp;
        }
        for(i =0;i<arr.length;i++)
        {
            System.out.print(""+arr[i]);
        }
    }
}
