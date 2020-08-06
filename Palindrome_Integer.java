package maths_interviewbit;

public class Palindrome_Integer {
	
	public static void main(String args[]) {
		int num = 2147447412;
		System.out.println(isPalindrome(num));
	}

	private static boolean isPalindrome(int num) {
		String number = String.valueOf(num);
		for(int i = 0; i<number.length()/2; i++) {
			if(Character.compare( number.charAt(i),number.charAt(number.length()-i-1)) != 0) {
				return false;
			}
		}
		return true;
	}

}
