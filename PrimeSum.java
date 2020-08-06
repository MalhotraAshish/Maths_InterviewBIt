package maths_interviewbit;

import java.util.ArrayList;

public class PrimeSum {
	public static void main(String args[]) {
		int n = (int) Math.sqrt(8);
		System.out.println(n);
		ArrayList<Integer> list = primesum(n);
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
	}

	private static ArrayList<Integer> primesum(int n) {
		ArrayList<Integer> pair = new ArrayList<Integer>();
		int arr[] = findPrime(n);
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==1 && arr[n-i] == 1) {
				pair.add(i);
				pair.add(n-i);
				break;
			}
		}
		return pair;
	}

	private static int[] findPrime(int n) {
		int arr[] = new int[n+1];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 1;
		}
		arr[0] = 0;
		arr[1] = 0;
		for(int i = 2; i< Math.sqrt(n); i++) {
			if(arr[i] == 1) {
				for(int j = 2; j*i<n; j++) {
					arr[j*i] = 0;
				}
			}
		}
		return arr;
	}
}
