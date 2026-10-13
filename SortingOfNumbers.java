package javaCodePractcie;

public class SortingOfNumbers {

	public static void main(String[] args) {
		int arr[] = {10,15,41,1,78,12,48,7};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {

				if(arr[i] > arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("After sorted array--"+arr[i]);
		}
	}

}
