package maths_interviewbit;

import java.util.ArrayList;

public class Rearrange_Array {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(3);
		arrange(list);
		
	}

	private static void arrange(ArrayList<Integer> a) {
		int max = a.size()+1;
		for(int i = 0; i<a.size(); i++) {
			if(a.get(i)<i) {
				a.set(i, max*a.get(i)+a.get(a.get(i))/max);
			} else {
				a.set(i, max*a.get(i)+a.get(a.get(i)));
			}
			//a.set(i, max*a.get(i)+a.get(a.get(i)));
		}
		for(int i = 0; i<a.size(); i++) {
			a.set(i, a.get(i)%max);
		}
		System.out.println(a);
		
	}
}
