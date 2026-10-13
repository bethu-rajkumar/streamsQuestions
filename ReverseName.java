package javaCodePractcie;

public class ReverseName {

	public static void main(String[] args) {
		String name="Raj Kumar Bethu".toLowerCase();
		String result="";
		for(int i=name.length()-1; i >=0;i--) {
			
			result=result+name.charAt(i);
		}
		System.out.println(result);
	}

}
