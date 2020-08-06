package maths_interviewbit;

public class Excel_Column_Title {
	public static void main(String args[]) {
		System.out.println(convertToTitle(28));
	}

	private static String convertToTitle(int A) {
		String result = "";
		while(A>0) {
			A--;
			int remainder = A%26;
			char digit = (char) (remainder+65);
			result = digit+result;
			A = (A-remainder)/26;
		}
		return result;
	}
}
