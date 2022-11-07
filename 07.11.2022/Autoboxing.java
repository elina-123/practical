package pro1;
//primitive to wrapper(obj)
public class Autoboxing {
public static void main(String[] args) {
 int a= 10;//primitive type		
Integer i = Integer.valueOf(a);//converting int into integer
Integer j=a;//now compiler will write Integer.valueOf(a)autoboximg
System.out.println(a+" "+i+" "+j);
	}

}
