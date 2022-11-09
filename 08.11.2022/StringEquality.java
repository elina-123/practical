package pro1;
import java.util.Scanner;
//check equality by using equal()method
public class StringEquality {

	public static void main(String[] args) {
	String str1, str2;//
	Scanner ab = new Scanner(System.in);
	System.out.println("Enter first String");
	str1 = ab.nextLine();
	
	System.out.println("Enter second String");
	str2 = ab.nextLine();
	//comparing two input string
	if (str1.equals(str2))
		System.out.println("Equal Strings");
	else
		System.out.println("UnEqual Strings");

	}

}
