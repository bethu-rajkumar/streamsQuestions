package javaCodePractcie;
import java.util.*;
public class SumEqulasTarget {
	static int[] arr= {10,1,9,6,3,7,2};
	static int target=9;
	public static void main(String[] args) {

		boilercode();
		optimized();
		secondHightest();




	}
	public  static void boilercode() {
		try {
			for(int i=0; i<arr.length;i++) {
				for(int j=i+1; j<arr.length;j++) {
					int sum=arr[i]+arr[j];
					if(sum==target) {
						System.out.println("Target element--"+arr[i]+"--Index-"+arr[j]);
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public static void optimized() {
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0; i<arr.length;i++) {

			int complement = target-arr[i];

			if(map.containsKey(complement)) {
				System.out.println("Pair found at indices-"+map.get(complement)+" and "+i+" Numbers--"+arr[i] +" "+complement);
				return;
			}
			map.put(arr[i], i);
		}

		System.out.println(map);
	}
	public static void secondHightest() {
		int[] arr= {10,15,10,14,1545,781,54551};

		int second=Arrays.stream(arr)
				.distinct()
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println("second--"+second);
	}

}
