package pro1;
public class Parameterizedcons {
int age;
String name;

//Parameterized constructor where we have to pass the parameter 

Parameterizedcons(int a,String n){
	age=a;
	name=n;
}
void show() {
	System.out.println(age+ " " +name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterizedcons d = new Parameterizedcons(50, "elina");
		Parameterizedcons d1 = new Parameterizedcons(25,"abinash");
		
		d.show();
		d1.show();
	}}
