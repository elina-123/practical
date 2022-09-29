package pro1;
// single inheritance
public class Vehicle { //parent class A
	void running() {
 System.out.println("running mode on");
}}
class Bike extends Vehicle { //child class B
	void run() {
		System.out.println("Bike run mode on");
	}}
 class Vehicle1 {
	 
	 public static void main(String args[]) {
		 Bike d = new Bike(); //object of child class bike
		 d.run(); //child class method
		 d.running();//parent class method
	 }
 }