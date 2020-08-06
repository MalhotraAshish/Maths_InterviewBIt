package maths_interviewbit;

import java.util.Arrays;

public class Next_Similar_Number {
	public static void main(String args[]) {
		String A = "218765";
		System.out.println(solve(A));
	}

	private static String solve(String a) {
		String result = "";
		char arr[] = a.toCharArray();
		int k;
		for (k = arr.length - 1; k > 0; k--) {
			if (arr[k] > arr[k - 1]) {
				int x = arr[k-1], min = k;
				for (int j = k + 1; j < arr.length; j++) {
					if (arr[j] > x && arr[j] < arr[min]) {
						min = j;
					}
				}
				char temp = arr[k-1];
				arr[k-1] = arr[min];
				arr[min] = temp;
				break;
			}
		}
		if (k == 0) {
			return "-1";
		} else {
			Arrays.sort(arr,k,arr.length);
		}

		for (int i = 0; i < arr.length; i++) {
			result = result+arr[i];
		}
		return result;
	}
}
