//Not yet completed
//pattern using numbers
public class Main 
{
    static int top =-1;
    static void push(char x, char s[])
    {
        s[top++] = x;
        return;
    }
    static void pop()
    {
        top--;
        return;
    }
    public static void main (String[] args) 
    {
        int i;
        char s[] = new char[100];
        char arr[] = {'{','(','(',')',')','}'};
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]=='{' || arr[i] == '(' || arr[i] =='[')
            {
                push(arr[i],s);
            }
            else if( arr[i]=='}' || arr[i] == ')' || arr[i] == ']')
            {
                if(arr[top] == '{' || arr[top] == '(' || arr[top] == '[')
                {
                    pop();
                }
            }
            else
            {
                pop();
            }
        }
        if(top==-1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
