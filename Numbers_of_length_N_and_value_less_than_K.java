package maths_interviewbit;

import java.util.ArrayList;

public class Numbers_of_length_N_and_value_less_than_K {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(5);
		System.out.println(solve(list,2,21));
	}

	private static int solve(ArrayList<Integer> list, int A, int B) {
		int count = 0;
		int tempB = B;
		while(tempB>0) {
			count++;
			tempB = tempB/10;
		}
		if(list.size() == 0) {
			
			return 0;
		}else if(count<A) {
			
			return 0;
		}else if(count > A) {
			
			if(list.contains(0)) {
				if(A == 1 && list.contains(0)) {
					return (int) ((int) (list.size()-1)*Math.pow(list.size(), A-1))+1;
				}
				return (int) ((int) (list.size()-1)*Math.pow(list.size(), A-1));
			}else {
				return (int) Math.pow(list.size(), A);
			}
			
		}else {
			
			int ans = 0;
			if(A == 1) {
				for(int i = 0 ; i<list.size(); i++) {
					if(list.get(i)<B) {
						ans++;
					}
				}
				return ans;
			}else {
				int temp[] = new int[A];
				for(int i = A-1; i>=0; i--) {
					temp[i] = B%10;
					B = B/10;
				}
				int countx = 0;
				for(int i = 0; i<list.size();i++) {
					if(list.get(i) == 0) {
						continue;
					}
					if(list.get(i)>temp[0]) {
						break;
					}
					countx++;
				}
				ans = (int) (ans + ((countx)*(Math.pow(list.size(),A-1))));
				int flag = 0, j = 0;
				for(int i =0; i<list.size(); i++) {
					if(list.get(i) == temp[j]) {
						flag = 1;
					}
				}
				j++;
				while(flag == 1 && j<=A-1) {
					flag = 0;
					int county = 0;
					for(int i = 0; i<list.size(); i++) {
						if(list.get(i)>temp[j]) {
							county++;
						}
						if(list.get(i) == temp[j]) {
							flag = 1;
						}
					}
					ans = (int) (ans - ((county)*Math.pow(list.size(), A-j-1)));
					j++;
				}
				if(j == A && flag == 1) {
					ans--;
				}
				return ans;
			}
		}
	}
}
