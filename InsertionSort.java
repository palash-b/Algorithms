/**
 * Created by Palash Bhatia on 2/23/2017.
 */
public class InsertionSort
{
    public static void main (String [] args)
    {
        int a[] = {12,6,8,4,2,1};
        int current;
        int i,j=0;
        int tmp;

        for (i=0;i<a.length;i++)
        {
            current = a[i];
            j = i-1;
            while(j>=0 && a[j]>=current)
            {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = current;
        }
        for (i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
