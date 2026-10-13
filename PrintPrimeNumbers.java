package javaCodePractcie;

import java.util.stream.IntStream;

public class PrintPrimeNumbers extends Exception {

	public static void main(String[] args) {
		primeNumbers();
		streamsprimeNumbers();
	}
	static  void primeNumbers() {

		for(int n=2; n<=100; n++) {
			int count=0;

			for(int i=1; i<=n;i++) {
				if(n % i== 0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n);
			}
		}

	}
	static void streamsprimeNumbers() {
		IntStream.rangeClosed(2, 100)
		.filter(n -> IntStream.range(2, n)
				.noneMatch(i-> n % i ==0))
		.forEach(System.err::println);
	}

}
