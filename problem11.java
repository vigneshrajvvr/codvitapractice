// Hackerrank Hourglass problem
//Not yet completed
public class hourglass
{
    public static void main(String argsp[])
    {
        int arr[][] = {{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,9,2,-4,-4,0},{0,0,0,-2,0,0},{0,0,-1,-2,-4,0}};
        int i,j;
        int sum =0, max =0, i1 =0, i2=3, j1 =0 ,j2 =3,k=0;
        while(i2 <= 6)
        {
            for(i=i1;i<i2;i++)
            {
                for(j=j1;j<j2;j++)
                {
                    if((j % 2 == 0) && (i == ((int)(i1+i2)/2)))
                        continue;
                    else
                        sum = sum + arr[i][j];
                }
            }
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
        return max;
        System.out.println("Maximum hour glass sum : "+max);
    }
}

