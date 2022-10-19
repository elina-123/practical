package pro1;
//final keyword   cannot change the value of the final
//final variable,final class,final method
public class Finalvariable {
 final int value=50;//final variable
 void display() {
	 System.out.println(value);
	//we cannot change the value of the final variable
	 //value=70; // compile time error
 }
	public static void main(String args[]) {
	Finalvariable fv = new Finalvariable();	
	fv.display();
	}
 }

