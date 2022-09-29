package pro1;
//multilevel inheritance
class Vehicle2 {//parent class A
void running() {
	System.out.println("running mode on");
}
public class Bike2 extends Vehicle2{//child class B
	void run() {
		System.out.println("Bike run mode on");
	}
	class Car2 extends Bike2{//child class c
		void speed() {
			System.out.println("Car speed is very high");
			}
	}
public class MultipleIn{
	public void main(String[] args) {
		Car2 d=new Car2();//object of child class car
		d.run();//child class method
		d.running();
		d.speed();
	}}}}

