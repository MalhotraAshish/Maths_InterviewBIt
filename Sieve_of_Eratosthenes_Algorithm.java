package maths_interviewbit;

import java.util.ArrayList;

public class Sieve_of_Eratosthenes_Algorithm {
	public static void main(String args[]) {
		System.out.println(sieve(15));
	}

	private static ArrayList<Integer> sieve(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i<= n; i++) {
			list.add(1);
		}
		list.set(0, 0);
		list.set(1, 0);
		
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(list.get(i) == 1) {
				for(int j = 2 ; i*j<=n; j++) {
					list.set(j*i, 0);
				}
			}
		}
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) == 1) {
				result.add(i);
			}
		}
		return result;
	}
}
