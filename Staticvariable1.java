package pro1;

public class Staticvariable1 { //class 1
int rollno;
String name;
float fee;
static String collage= "xyz";
//static void change(){
//college= "ABC";}
//constructor
 void Staticvariable( int rollno, String name, float fee) {
 this.rollno= rollno;
 this.name=name;
 this.fee=fee;
}
//method
void display() {
	System.out.println(rollno+" "+name+" "+fee+" "+collage);
}
 public class Staticvariable { //class 2
	public static void main (String[] args) {
		//staticvariable1.change();
		//objects
	
		Staticvariable1 s1 = new Staticvariable1(111,"elina",5000);
		Staticvariable1 s2 = new Staticvariable1(555,"abhi",6000);
		s1.display();
		s2.display();
	}	
	}
}
