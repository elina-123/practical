package pro1;
//char[]work as java string 
public class stringExample2 {
public void show() {//method 1
char [] arr = {'j','a','v','a'};//char type array
String s = new String(arr);
System.out.println("'value is :"+s);
System.out.println(arr);}
public void myFunction() {//method2
	String m1 = "ELINA";
	String m2 = new String(m1); 
	System.out.println(m2);}
	public static void main(String[] args) {
		stringExample2 s = new stringExample2();
		s.show();
		s.myFunction();

	}

}
