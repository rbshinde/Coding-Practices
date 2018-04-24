package practics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	static class Test{
		private Test(){
			System.out.println("Test const");
		}
		
		public void tes()
		{
			System.out.println("do");
		}
	}
	Solution(){
		
	}
	public int solution(int[] A) {
		// write your code in Java SE 8

		List list = Arrays.stream(A).boxed().collect(Collectors.toList());
		// List<Integer> lists = new ArrayList<>(A);
		int unpaired = 0;
		boolean match = true;

		list.forEach(x -> System.out.println(x));
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				match = true;
				if (i != j) {
					System.out.println(i + " " + j);
					if (A[i] == A[j]) {
						match = false;
						break;
					}

				}
			}
			if (match) {
				unpaired = A[i];
				break;
			}
		}
		return unpaired;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		/*Test t = new Test();
		t.tes();*/
		int A[] = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution.solution(A));
	}
}