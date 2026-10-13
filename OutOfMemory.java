package javaCodePractcie;

import java.util.ArrayList;

public class OutOfMemory {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();

		while(true) {
			list.add(1000);
		}
		//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

		//orrr
		//		int size=10;
		//		for(int i=0;i<1000;i++) {
		//			int[] nums=new int[size];
		//			size=size*2;
		//		}
	}

}
