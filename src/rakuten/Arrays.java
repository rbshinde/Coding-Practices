package rakuten;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by fabiotiriticco on 24/04/2016.
 */
public class Arrays {

    // 100%
    private static int[] cyclicRotationSolution(int[] A, int K) {
        int[] rotated = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int newPos = (i + K) % A.length;
            rotated[newPos] = A[i];
        }
        return rotated;
    }
    //100%
    private static int oddOccurrencesSolution3(int[] A) {
       
    int r = 0;
    //xor each value.. odd one will be left
    for(int i=0;i<A.length;i++)
        r ^=A[i];
 
    return r;
    }
    // 66%
    private static int oddOccurrencesSolution(int[] A) {
        // create array list
        ArrayList<Integer> arList = new ArrayList<>();
        for (int aA : A) {
            arList.add(aA);
        }

        // find the lonesome bastard
        while (arList.size() > 1) {
            int current = arList.get(0);
            arList.remove(0);
            int indexOfCopy = arList.indexOf(current);
            if (indexOfCopy == -1) {
                return current;
            } else {
                arList.remove(indexOfCopy);
            }
        }

        if (arList.size() == 1) {
            return arList.get(0);
        }

        return -1;
    }

    // 66%
    private static int oddOccurrencesSolution2(int[] A) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int a : A) {
            if (occurrences.containsKey(a)) {
                Integer currentOc = occurrences.get(a);
                occurrences.put(a, currentOc + 1);
            } else {
                occurrences.put(a, 1);
            }
        }
        for (Integer key : occurrences.keySet()) {
            if (occurrences.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        int[] testA = new int[]{3, 8, 9, 7, 6};
        int[] rot = cyclicRotationSolution(testA, 3);
        for (int aRot : rot) {
            System.out.print(aRot);
        }

        int[] testB = new int[]{9, 3, 9, 3, 9, 7, 9};
       System.out.println(oddOccurrencesSolution(testB));
        System.out.println(oddOccurrencesSolution3(testB));
    }
}