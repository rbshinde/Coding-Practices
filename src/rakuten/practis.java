package rakuten;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class practis {
	public static void main(String[] args) {
		
		Map<String,Integer> playingTime = new HashMap<String,Integer>();
	    long singlePlay = 0, doublePlay = 0, player = new Scanner(System.in).nextInt();
	    for(int i=0;i<player;i++) {
	     String[] data = new Scanner(System.in).nextLine().split("\\s");
	     IntStream.range(Integer.parseInt(data[0])+1,Integer.parseInt(data[1])+1).forEach(index->{playingTime.put(String.valueOf(index), playingTime.containsKey(String.valueOf(index))? playingTime.get(String.valueOf(index)) + 1 : 1);});
	    }
	    doublePlay = playingTime.entrySet().stream().filter(map -> map.getValue() / 4 >= 1).collect(Collectors.counting());
	    singlePlay = playingTime.entrySet().stream().filter(map -> map.getValue() / 2 >= 1).collect(Collectors.counting());
	    System.out.println("Output " + (singlePlay-doublePlay) + " " + doublePlay);
		
		/* Map<String,Integer> playingTime = new HashMap<String,Integer>();
		    long singlePlay = 0, doublePlay = 0, player = new Scanner(System.in).nextInt();
		    for(int i=0;i<player;i++) 
		    Arrays.asList(new Scanner(System.in).nextLine().split("\\s")).forEach(index->{playingTime.put(index+1, playingTime.containsKey(index+1)? playingTime.get(index+1) + 1 : 1);});
		    doublePlay = playingTime.entrySet().stream().filter(map -> map.getValue() / 4 >= 1).collect(Collectors.counting());
		    singlePlay = playingTime.entrySet().stream().filter(map -> map.getValue() / 2 >= 1).collect(Collectors.counting());
		    System.out.println("Output " + (singlePlay-doublePlay) + " " + doublePlay);*/

	}
}
