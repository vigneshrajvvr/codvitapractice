//input : a@bc:{de_12?3 output : 3@21:{de_cb?a
public class Main
{
    public static void main (String[] args) 
    {
        int i,j;
        String s;
        //Scanner in = new Scanner(System.in);
        s = "a@bc:{de_12?3";
        char arr[] = s.toCharArray();
        char temp;
        j = arr.length-1;
        i=0;
        while(i<j)
        {
            System.out.println(""+i+" "+j);
            if(((arr[j]>='a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'Z') || (arr[j] >='0' && arr[j] <= '9') ) && ((arr[i] >= 'a' && arr[i] <= 'z') ||( arr[i] >='A' && arr[i] <= 'Z') ||( arr[i] >='0' && arr[i] <='9')) )
            {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
            else if((arr[i] >= 'a' && arr[i] <= 'z') ||( arr[i] >='A' && arr[i] <= 'Z') ||( arr[i] >='0' && arr[i] <='9'))
            {
                i++;
            }
            else if((arr[j]>='a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'Z') || (arr[j] >='0' && arr[j] <= '9'))
            {
                j--;
            }
            else
            {
                i++;
                j--;
            }
        }
        for(i =0;i<arr.length;i++)
        {
            System.out.print(""+arr[i]);
        }
    }
}
