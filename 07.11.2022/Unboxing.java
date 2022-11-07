package pro1;
//wrapper to primitive class 
public class Unboxing {
public static void main(String[] args) {
	Integer a =new Integer(2);
	Integer i =a.intValue();//converting integer into int
	Integer j =a;//now compiler will write int.value()unboxing
	System.out.println(a+" "+j+" "+j);
	}

}
