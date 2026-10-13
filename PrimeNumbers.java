package javaCodePractcie;

import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {
		IntStream.rangeClosed(2, 100)
		.filter(n->{
			for(int i=2 ; i < n; i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}).forEach(System.out::println);
	}

}
