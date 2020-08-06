package maths_interviewbit;

public class Largest_Coprime_Divisor {
	public static void main(String args[]) {
		int num1 = 90;
		int num2 = 45;
		
		System.out.println(cpFact(num1,num2));
	}

	private static int cpFact(int num1, int num2) {
		while(gcd(num1,num2)!=1) {
			num1 = num1/gcd(num1,num2);
		}
		return num1;
	}

	private static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}
		
		return gcd(num2,num1%num2);
	}

}
