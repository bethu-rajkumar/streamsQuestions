package javaCodePractcie;

public class Repeated {

	public static void main(String[] args) {

		String str="abccaabbccdaeeeaaa";
		String res=""+str.charAt(0);

		for(int i=1; i<str.length();i++) {
			if(str.charAt(i) != str.charAt(i-1)) {
				res=res+str.charAt(i);
			}

		}
		System.out.println("Result string value--"+res);

	}

}
