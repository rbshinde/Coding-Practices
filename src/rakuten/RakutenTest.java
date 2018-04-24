package rakuten;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 																									
																									
	Q: Please write answer code using your preferable language(e.g. Java / Python / Javascript). Expect candidate to be resolved within 10 lines and 2 hours.																								
																									
	We have ping pong room in our office and there is one table.																								
	What we want to know is when we know people's availability for their playing time, how many hours can we play either singles or doubles in a day.																								
																									
	Condition:																								
	The working hours are 9-18.																								
	The table is only one table.																								
	When gathering two, three people, we can play singles.																								
	When gathering over four people, we can play doubles.																								
																									
	Input:																								
		The first line of the input givens the number of players T, T players available time follow.																							
		Each consists of one line with Integer S E. S represents start time, and E resresents end time.																							
																									
		Ex:																							
		"2
		9 10
		9 12"																							
		It means 2 players can play ping pong. The 1st player can play from 9 to 10 and the 2nd player can play ping pong from 9 to 12.																							
																									
	Output:																								
		The output one line containing x y. where x is singles hours count and y is double hours.																							
		The above input means player 1 can play ping pong from 9 to 10, and player 2 can play ping pong from 9 to 12.																							
																									
		So expected output of above example is																							
		1 0																							
																									
																									
	Data you need to solve is here:																								
																									
	Q1	Input	"2
				9 10
				9 12"																						
		Output	1 0																						
																									
	Q2	Input	"4
				9 10
				9 12
				13 15
				10 18"																						
		Output	5 0																						
																									
	Q3	Input	"7
				9 11
				12 14
				13 15
				11 18
				14 18
				10 14
				15 18"																						
		Output	7 1																						
																									
	Q4	Input	"9
				9 10
				9 12
				14 15
				16 18
				14 18
				10 13
				15 18
				10 14
				9 13"																						
		Output	6 2																						
																									
	Q5	Input	"8
				9 14
				15 17
				12 13
				16 18
				10 15
				14 16
				9 13
				9 15"																						
		Output	5 3																						
						
 * 
 * */



public class RakutenTest {

	public static void main(String[] args) {
		Map<Integer,Integer> playingTime = new HashMap<Integer,Integer>();
		long doublePlay = 0;
		
		int[] data = {6,1,1,2,2,2,3};//{8,1,3,1,4,5,6,3,2};
		for(int tmp:data) {
			if(playingTime.get(tmp)!=null) {
				playingTime.put(tmp, playingTime.get(tmp) + 1 );
			}else {
				playingTime.put(tmp,  1 );
			}
		}
		
		 doublePlay =playingTime.entrySet().stream().filter(map -> map.getValue() >= 2).collect(Collectors.counting());
		System.out.println("Output " + (doublePlay));
	}
	
	static int countDuplicates(int[] numbers) {
        /*
         * Write your code here.
         */
         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int[] data = {6,1,1,2,2,2,3};//{8,1,3,1,4,5,6,3,2};
		for(int tmp:data) {
			if(map.get(tmp)!=null) {
				map.put(tmp, map.get(tmp) + 1 );
			}else {
				map.put(tmp,  1 );
			}
		}
		int count =0;
		 Iterator it = map.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        if((int)pair.getValue() >=2)
		        	count++;
		    }
		return count;

	
	}
	

}
