package maths_interviewbit;

public class Verify_Prime {
	
	public static void main(String args[]) {
		int N = 39601;
		System.out.println(isPrime(N));
	}

	private static boolean isPrime(int N) {
		for(int i = 2; i<= Math.sqrt(N); i++) {
			if(N%i == 0) {
				return false;
			}
		}
		return true;
	}

}
