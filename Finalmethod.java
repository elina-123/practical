package pro1;
//final keyword
//final method cannot change the value of the final method
//final class,final variable
public class Finalmethod {
//create a final method
	final void display() {
		 System.out.println("this is a final method");}
		/*class main extends final method {
		 //try to override final method
		  //public final void display() {
		  //system.out.println("the final method is overridden");
		   * 
		 * */
	 
	public static void main(String[] args) {
		Finalmethod obj = new Finalmethod();
		obj.display();

	}

}
