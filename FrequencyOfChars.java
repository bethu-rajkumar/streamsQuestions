package javaCodePractcie;

public class FrequencyOfChars {

	public static void main(String[] args) {
		String word="aassffdaaffssee";

		String res=word.charAt(0)+ "";  //add first Character.....

		for(int i=1 ; i <word.length();i++) {

			if(word.charAt(i) != word.charAt(i-1)) {
				res=res+word.charAt(i);
			}
		}
		System.err.println(res);
	}

}
