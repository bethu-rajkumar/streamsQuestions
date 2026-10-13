package javaCodePractcie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ZeroMovement {

	public static void main(String[] args) {
		int[] arr= {10,0,15,0,12,16,0,1,14};
		
	List<Integer> list=Stream.concat(Arrays.stream(arr)
			.filter(n->n==0)
			.boxed(),
			Arrays.stream(arr)
			.filter(n->n !=0)
			.boxed())
			.toList();
	System.out.println("Movement of Zero's----"+list);
	
	int[] res=IntStream.concat(Arrays.stream(arr).filter(n->n==0), Arrays.stream(arr).filter(n->n!=0)).toArray();
	System.out.println("Result in Array");
	for(int num:res) {
		System.out.print(num);
	}
	}

}
