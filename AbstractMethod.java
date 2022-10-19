
//class A( should be abstract class)
//abstract void show()//abstract method
package pro1;
abstract class Testabstract{//abstract method
	abstract void display();//abstract method
   void show() {//non abstract method
	System.out.println("non abstract method invoked");   
   }
}
 class Demo1  extends Testabstract{//1st child class
void display() {//non abstract method with same name
	System.out.println("Demo1 method invoked");
}}
 class Demo2  extends Testabstract{//2st child class
  void display() {
	  System.out.println("Demo2 method invoked");
  }}
 class AbstractMethod{
public static void main(String[] args) {
	Testabstract obj =new Demo1();
	Testabstract obj1 =new Demo2();
	obj.display();
	obj1.display();
	obj.show();
	}

}
