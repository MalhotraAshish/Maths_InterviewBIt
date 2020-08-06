package maths_interviewbit;

import java.util.ArrayList;

public class FizzBuzz {
	public static void main(String args[]) {
		int N = 15;
		System.out.println(fizzBuzz(N));
	}

	private static ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(String.valueOf(i + 1));
		}

		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(list.get(i)) % 5 == 0 && Integer.parseInt(list.get(i)) % 3 == 0) {
				list.set(i, "FizzBuzz");
			} else if (Integer.parseInt(list.get(i)) % 5 == 0) {
				list.set(i, "Buzz");
			} else if (Integer.parseInt(list.get(i)) % 3 == 0) {
				list.set(i, "Fizz");
			}
		}

		return list;
	}
}
