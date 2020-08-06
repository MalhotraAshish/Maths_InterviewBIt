package maths_interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class All_Factors {
	public static void main(String args[]) {
		int N = 36;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		factors = findFactors(N);
		System.out.println(factors);
	}

	private static ArrayList<Integer> findFactors(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				list.add(i);
				if(i != Math.sqrt(n)) {
					list.add(n/i);
				}
			}
		}
		Collections.sort(list);
		return list;
	}
}
