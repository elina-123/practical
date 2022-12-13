package pro1;
import java.util.HashSet;
public class HashSetDemo {
public static void main(String[] args) {
//creating Hash set and adding elements
		HashSet<String>hs=new HashSet<String>();
		hs.add("ram"); 
		hs.add("rima");
		hs.add("shyam");
		hs.add("ram");
		hs.add("ramesh");
		System.out.println("original list:"+hs);
		//removing specified element from hash set
		hs.remove("ram");
		System.out.println("after involking remove:"+hs);
		
		HashSet<String>hs1=new HashSet<String>();//set 2
		hs1.add("pallabi");
		hs1.add("Rahul");
		System.out.println("New set:"+hs);
		hs1.addAll(hs1);
		System.out.println("updated list:"+hs1);
//remove all the new elements
		hs1.removeAll(hs1);
		//remove all
				hs.clear();
				System.out.println("present list:"+hs);
			}
		}