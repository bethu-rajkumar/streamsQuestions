package javaCodePractcie;
import java.util.*;


public class JoingCommonElements {

	public static void main(String[] args) {
		int[] arr= {10,2,4,15,15,10,11,18};
		int[] arr1= {2,8,98,44,14,4,11,15};

		TreeSet<Integer> set=new TreeSet<>();
		HashSet<Integer> common=new HashSet<>();
		
		for(int num:arr) {
			set.add(num);
		}
		System.out.println("Printed the First array element--"+set);
		for(int num1:arr1) {
			if(set.contains(num1)) {  //
				common.add(num1);
			}
		}
		System.out.println("Common Elements--"+common);
		
		
		

	}

}
