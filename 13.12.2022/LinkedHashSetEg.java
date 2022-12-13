package pro1;
import java.util.LinkedHashSet;

public class LinkedHashSetEg {

	public static void main(String[] args) {
        //creating Hash set and adding elements
		LinkedHashSet<String>hs=new LinkedHashSet<String>();
		hs.add("two"); 
		hs.add("one");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		System.out.println("original list: "+hs);
		//removing specific element from the above mentioned
		System.out.println(hs.remove("two"));
System.out.println("\n Updated list: "+hs);
	    //six is not present
	    //return false
System.out.println(hs.remove("six"));

	}

}