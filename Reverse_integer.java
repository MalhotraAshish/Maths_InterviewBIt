package maths_interviewbit;

public class Reverse_integer {

	public static void main(String args[]) {
		int num = -123;
		System.out.println(reverse(num));
	}

	private static int reverse(int num) {
		boolean negative = false;
		if (num < 0) {
			negative = true;
			num = num * -1;
		}
		long reversed = 0;
		while (num > 0) {
			reversed = (reversed * 10) + (num % 10);
			num = num / 10;
		}
		if (reversed > Integer.MAX_VALUE) {
			return 0;
		}
		if(negative) {
			return (int) ((-1)*reversed);
		}
		return (int) reversed;
	}

}
