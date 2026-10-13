package javaCodePractcie;

public class MinMaxNumbers {

	public static void main(String[] args) {
		int[] arr= {10,21,45,452,12,1,7,8};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min =arr[i];
			}else if(arr[i] > max) {
				max=arr[i];
			}
			
		}
		System.out.println("Minimum  Number-"+min);
		System.out.println("Maximum  Number-"+max);
		

	}

}
