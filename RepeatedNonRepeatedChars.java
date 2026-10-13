package javaCodePractcie;
import java.util.*;

public class RepeatedNonRepeatedChars {

	public static void main(String[] args) {
		String str="RajKumarBethu".toLowerCase();
		Map<Character,Integer> map=new HashMap<>();

		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
		ArrayList<Character> list=new ArrayList<>();
		List<Character> repeated=new ArrayList<>();
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				list.add(entry.getKey());
			}else
				repeated.add(entry.getKey());
		}
		System.out.println("Non-Repeated chars--"+list);
		System.out.println("Repeated chars--"+repeated);

	}

}
