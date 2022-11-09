package pro1;
//append insert replace() delete(0 reverse()-mutable class(string builder & buffer)
public class MutableExampleString {
public static void my() {
	//string buffer
StringBuffer s= new StringBuffer("HELLOW");//object of string buffer class	
s.append("HELLOW");//hello world
System.out.println("String is :"+s);
s.replace(1, 3, "ELINA");//(int off set,String s)
System.out.println("replace is :"+s);
System.out.println("capacity is :"+s.capacity());
//string builder
StringBuilder s1= new StringBuilder("HELLOW");
s1.replace(1, 3, "java");
System.out.println("replace is :"+s1);
s1.delete(1, 3);
System.out.println("delete is :"+s1);
s1.reverse();
}
	public static void main(String[] args) {
	my();
	}

}
