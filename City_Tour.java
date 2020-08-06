package maths_interviewbit;

import java.util.ArrayList;

public class City_Tour {
	public static void main(String args[]) {
		int A = 5;
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(2);
		B.add(3);
		System.out.println(solve(A, B));
	}

	private static int solve(int A, ArrayList<Integer> B) {
		if(A < B.size()) {
			return 0;
		}else if(A == B.size()) {
			return 0;
		}else if(A-B.size() == 2) {
			return 1;
		}else {
			return factorial(A-B.size());
		}
	}

	private static int factorial(int i) {
		if (i == 0) {
			return 1;
		}
		if (i == 1) {
			return 1;
		}
		return i * factorial(i - 1);
	}
}
