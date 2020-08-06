package maths_interviewbit;

import java.util.ArrayList;

public class Sum_of_pairwise_Hamming_Distance {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(96);
		list.add(96);
		list.add(7);
		list.add(81);
		list.add(2);
		list.add(13);
		System.out.println(hammingDistance(list));
	}

	private static int hammingDistance(ArrayList<Integer> A) {
		int n = A.size();
        int dist = 0;
        for(int i = 0; i < 31; i++) {
            int oneCount = 0;
            for(int j = 0; j < n; j++) {
                int num = A.get(j);
                oneCount += (num & 1 << i) != 0? 1 : 0;
            }
            int zeroCount = n - oneCount;
            dist += (2L * oneCount * zeroCount) % 1000000007;
            dist = dist % 1000000007;
        }
        return dist;
	}

	private static int distance(Integer n1, Integer n2) {
		int xor = n1 ^ n2;
		int setBit = 0; 
		while(xor>0) {
			setBit = setBit + xor & 1;
			xor >>= 1;
		}
		return setBit;
	}

}
