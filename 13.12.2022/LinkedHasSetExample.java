package pro1;
//inherit class hash set
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>hs=new LinkedHashSet<String>();
		hs.add("Pen"); //Duplicate
		hs.add("Pencil");
		hs.add("Mouse");
		hs.add("Phone");
		hs.add(null);
		hs.add("AC");
		hs.add("Bottle");
		hs.add("Earphone");
		hs.add("Pen");
Iterator<String> itr=hs.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}


}
