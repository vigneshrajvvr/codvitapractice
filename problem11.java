// Hackerrank Hourglass problem
//Not yet completed
public class hourglass
{
    public static void main(String argsp[])
    {
        int arr[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
        int i,j;
        int n = arr.length, sum =0,max =0, i1 =0, i2=3, j1 =0 ,j2 =3;
        while(i2 <= 6)
        {
            for(i=i1;i<i2;i++)
            {
                for(j=j1;j<j2;j++)
                {
                    sum = sum + arr[i][j];
                }
            }
            System.out.println(""+j2);
            if(j2<=6) {
                j1++;
                j2++;
            }
            if(j2>6)
            {
                i1++;
                i2++;
                j1=0;
                j2=3;
            }
            if(sum > max)
                max = sum;
            System.out.println(""+sum);
            sum =0;
        }
        System.out.println("Maximum hour glass sum : "+max);
    }
}

