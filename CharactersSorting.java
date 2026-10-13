package javaCodePractcie;

import java.util.ArrayList;
import java.util.List;

public class CharactersSorting {

	public static void main(String[] args) {
		
		Object[] arr= {'a','b','&',1,2,5,'d',8};
		
		List<Character> list=new ArrayList<>();
		List<Character> special=new ArrayList<>();
		List<Integer> numbers=new ArrayList<>();

		for(Object obj:arr) {
			if(obj instanceof Character ) {
				
				char ch=(char) obj;   //Type casting
				if(Character.isLetter(ch)) {
					list.add(ch);
				}else
					special.add(ch)	;
			}
			else if(obj instanceof Integer) {
				int i=(int) obj;
				numbers.add(i);
			}
		}
		System.out.println("list of character..."+list);
		System.out.println("special chars--"+special);
		System.out.println("numbers--"+numbers);

	}

}
