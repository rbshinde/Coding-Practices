package rakuten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>();
		
		int[][] data = new int[4][4];
		data[0][0] = 9;
		data[0][1] = 10;
		
		data[1][0] = 9;
		data[1][1] = 12;
		
		data[2][0] = 13;
		data[2][1] = 15;
		
		data[3][0] = 10;
		data[3][1] = 18;
		
		/*data[2][0] = 14;
		data[2][1] = 15;
		
		data[3][0] = 16;
		data[3][1] = 18;
		
		data[4][0] = 14;
		data[4][1] = 18;
		
		data[5][0] = 10;
		data[5][1] = 13;
		
		data[6][0] = 15;
		data[6][1] = 18;
		
		data[7][0] = 10;
		data[7][1] = 14;
		
		data[8][0] = 9;
		data[8][1] = 13;*/
		
		
		for(int i=0;i<data.length;i++) {
			int tmp = 0;
			for(int j=0;j<data[i][1]-data[i][0];j++) {
				if(tmp==0) {
					tmp = data[i][0]+1;
				}else {
					tmp +=1;
				}
				result.add(tmp);
			}
		}
		
		int singlePlay=0;
		int doublePlay=0;
        Map<Object, Integer> map= new HashMap<Object, Integer>();
        for(Object s: result.toArray()){
        	System.out.println();
            map.put(s,Collections.frequency(result,s));
        }
        
        System.out.println(map);
        for(Entry<Object, Integer> entry : map.entrySet()) {
        	int tmp = 0;
        	if(entry.getValue() / 4 > 1) {
        		tmp = entry.getValue() / 4;
        		doublePlay+=tmp;
        	}
        	if(entry.getValue()-tmp / 2 > 1) {
        		singlePlay += (entry.getValue()-tmp) /2;
        	}
        	
        }
        System.out.println(singlePlay+" "+doublePlay);

	}
}
