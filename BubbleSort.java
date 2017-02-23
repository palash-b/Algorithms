/**
 * Created by Palash Bhatia on 2/12/2017.
 */
public class BubbleSort
{
    public static void main(String[] args)
    {
        int a[] = {12,6,8,4,2,1};
        for (int i= 0;i<a.length-1;i++)
        {
            for (int j = 0; j<a.length-1-i;j++)
            {
                if (a[j] > a[j+1])
                {
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }

        }
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
