package javaCodePractcie;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CocnurrentModificationException {

	public static void main(String[] args) {
		Map<Integer,String> map=new ConcurrentHashMap<>();
	  map.put(1, "A");
	  map.put(2, "B");
	  map.put(3, "C");
	  
	  for(Integer key : map.keySet()) {
		  if(key==2) {
			  map.put(4, "D");
		  }
	  }
	  System.out.println("Map is modified while iterting.."+map);
	  
	}

}
