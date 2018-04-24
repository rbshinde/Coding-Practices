package practics;
import java.util.Arrays;
import java.util.Scanner;

class Subset_sum
{
    static  int countStrings(int n)
    {
        int a[] = new int [n];
        int b[] = new int [n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i-1] + b[i-1];
            b[i] = a[i-1];
        }
        return a[n-1] + b[n-1];
    }
    /* Driver program to test above function */
    public static void main (String args[])
    {
          //System.out.println(countStrings(1045));
    	
    	 for(int i=0;i<2;i++) 
 		    Arrays.asList(new Scanner(System.in).nextLine().split("\\s")).forEach(index-> System.out.println(index));
    }
}