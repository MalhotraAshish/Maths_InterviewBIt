package maths_interviewbit;

public class Excel_Column_Number {
	
	public static void main(String args[]) {
		System.out.println(titleToNumber("AB"));
	}

	private static int titleToNumber(String A) {
		int n = A.length();
        int compute = 1;
        for(int i=0;i<n-1;i++){
            int alph = (A.charAt(i)-'A')+1;
            compute += (Math.pow(26,(n-i-1)) * alph);
        }
        compute += (A.charAt(n-1)-'A');
        return compute;
	}

}
