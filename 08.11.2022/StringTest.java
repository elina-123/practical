package pro1;
import java.util.Scanner;
public class StringTest {
public void show()	{//method
Scanner s = new Scanner(System.in);//use input
System.out.println("Enter String");//line no 1
String A = s.next();//1st string
String B = s.next();//2nd string
System.out.println(A.length()+B.length());//1st string length+(concat)2nd string1
System.out.println((A.compareTo(B)>0) ? "YES"  : "NO"); //compare to ()
System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "+B.substring(0,3).toLowerCase()+B.substring(1));}//substring(0,upper case,lower case java
public static void main(String[] args) {
StringTest t = new StringTest();
t.show();

	}

}
