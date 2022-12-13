package pro1;
//set in program
// allowing null value
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {
public static void main(String[] args) {
Set<String>hs=new HashSet<String>();
hs.add("AC"); //Duplicate
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
}}}