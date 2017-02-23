/**
 * Created by Palash Bhatia on 2/23/2017.
 */
public class SelectionSort
{
    public static void main (String [] args)
    {
        int a[] = {12,6,8,4,2,1};
        int min;
        int i;
        int j;
        int tmp;

        for(i=0;i<a.length-1;i++)
        {
            min = i;
            for(j=i+1;j<a.length;j++)
            {
                if (a[j]<a[min])
                {
                    min= j;
                }

            }
            tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
