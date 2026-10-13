package javaCodePractcie;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords {
	static String str="Java is easy and Java is better";
	public static void main(String[] args) {
		usingStreams();
		hashMap();
	}
	private static void usingStreams() {
		Map<String, Long> map=Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		map.entrySet()
		.stream()
		.filter(entry->entry.getValue()>1)
		.forEach(System.out::println);
	}
	private static void hashMap() {
		Arrays.stream(str.split(" "))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()>1)
		.forEach(System.err::println);


	}

}
