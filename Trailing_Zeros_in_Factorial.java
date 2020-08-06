package maths_interviewbit;

public class Trailing_Zeros_in_Factorial {
	public static void main(String args[]) {
		int n = 5;
		System.out.println(trailingZeroes(n));
	}

	private static int trailingZeroes(int n) {
		int count = 0;
		while(n != 0) {
			n = n/5;
			count = count + n;
		}
		return count;
	}
}
