package javaCodePractcie;

public class SingletonDesignPattern {
	private static  SingletonDesignPattern pattern;

	private  SingletonDesignPattern() {
	}
	public static SingletonDesignPattern getInstance() {
		if(pattern==null) {
			pattern=new SingletonDesignPattern();
		}
		return pattern;

	}
	
	public void display() {
		System.out.println("Single Object is created....");
	}
public static void main(String[] args) {
	SingletonDesignPattern obj1= SingletonDesignPattern.getInstance();
	SingletonDesignPattern obj2=SingletonDesignPattern.getInstance();
	
	obj1.display();
	System.out.println("Comparing the objects (not Contenet)-"+(obj1==obj2));
	System.out.println("Comparing content--"+(obj1.equals(obj2)));
}
}
