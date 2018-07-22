//input : {(())} output : True
//input : } output : False
public class Main 
{
    static int top =-1;
    static void push(char x, char s[])
    {
        if(top == 99)
        {
            System.out.println("Stack is full");
        }
        else
        {
        s[++top] = x;
        }
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
        char arr[] = {'}'};
        for(i=0;i<arr.length;i++)
        {
            if(top == -1 && (arr[i] == '}' || arr[i] == ')' || arr[i] == ']'))
            {
                System.out.println("False");
                System.exit(0);
            }
            else
            {
                 if(arr[i]=='{' || arr[i] == '(' || arr[i] =='[')
                {
                    push(arr[i],s);
                }
                if( arr[i]=='}')
                {
                    if(arr[top] == '{')
                    {
                        pop();
                    }
                }
                else if(arr[i] == ')')
                {
                    if(arr[top] == '(')
                    {
                        pop();
                    }
                }
                else
                {
                    if(arr[top] == '[')
                    {
                        pop();
                    }
                }
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
