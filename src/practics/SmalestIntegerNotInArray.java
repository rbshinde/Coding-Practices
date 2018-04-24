package practics;
class SmalestIntegerNotInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
       int shift = segregate (A, A.length);
       int arr2[] = new int[A.length-shift];
       int j=0;
       for(int i=shift;i<A.length;i++)
           {
               arr2[j] = A[i];
               j++;
           }
           
         return findMissingPositive(arr2,j);
    }
    
    int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
           if (arr[i] <= 0)  
           {
               int temp;
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               // increment count of non-positive 
               // integers
               j++;  
           }
        }
      
        return j;
    }
    int findMissingPositive(int arr[], int size)
    {
      int i;
      
      // Mark arr[i] as visited by making 
      // arr[arr[i] - 1] negative. Note that 
      // 1 is subtracted because index start 
      // from 0 and positive numbers start from 1
      for(i = 0; i < size; i++)
      {
        if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
          arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
      }
      
      // Return the first index value at which 
      // is positive
      for(i = 0; i < size; i++)
        if (arr[i] > 0)
          return i+1;  // 1 is added becuase indexes 
                       // start from 0
      
      return size+1;
    }
    public static void main(String[] args) {
    	SmalestIntegerNotInArray solution = new SmalestIntegerNotInArray();
    	int A[] = {-1, -3};
    	System.out.println(solution.solution(A));
	}
}