package practics;

class Solution2 {
    public int solution(int N) {
        // write your code in Java SE 8
        
        String binaryString = Integer.toBinaryString(N);
        System.out.print(binaryString);
        int count = 0,bigGap = 0;
        for(int i=0; i < binaryString.length(); i++){
            char c = binaryString.charAt(i);
            
            if(c=='0') {
            	count++;
            }else {
            	if(count > bigGap)
            	bigGap = count;
            	count = 0;
            	
            }
            
            if(i == binaryString.length()-1)
            {	if(count > bigGap)
                	bigGap = count;
            }
        }
        
        return bigGap;
    }
}