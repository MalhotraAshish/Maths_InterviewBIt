package maths_interviewbit;

public class Sorted_Permutation_Rank {
	public static void main(String args[]) {
		String input = "baa";
		System.out.println(findRank(input));
	}

	private final static int DIVISOR = 1000003;

	public static int findRank(String a) {
		if (a.length() == 1) {
			return 1;
		}
		int sortedPosition = getSortedPosition(a);
		int posRank = (sortedPosition * factorial(a.length() - 1)) % DIVISOR;
		return (posRank + findRank(a.substring(1))) % DIVISOR;
	}

	/**
	 * Sorted position is the rank in ascending order of the first character. input
	 * string should always be of length greater than 1.
	 * 
	 * @param a
	 * @return
	 */
	private static int getSortedPosition(String a) {
		int rank = 0;
		for (int i = 1; i < a.length(); i++) {
			if (a.charAt(i) < a.charAt(0)) {
				rank++;
			}
		}
		return rank;
	}

	/**
	 * Method to return factorial of a number with mod of 1000003
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		int prod = 1;
		for (int i = 1; i <= n; i++) {
			prod *= i;
			prod %= DIVISOR;
		}
		return prod;
	}
}
