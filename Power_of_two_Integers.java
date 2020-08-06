package maths_interviewbit;

public class Power_of_two_Integers {

	public static void main(String args[]) {
		int n = 8;
		System.out.println(isPower(n));
	}

	private static int isPower(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			// System.out.println(i);
			int y = 2;

			double p = Math.pow(i, y);

			while (p <= n && p > 0) {
				if (p == n)
					return 1;
				y++;
				p = Math.pow(i, y);
			}
		}
		return 0;
	}

}
