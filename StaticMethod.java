package pro1;

public class StaticMethod {
	int rollno;
	String name;
	float fee;
	static String collage= "bose";
	public StaticMethod(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	
	}
	// static method to change the value of static variable
	static void change() { //static method
		collage= "xyz";}
	//constructor
	void Staticvariable( int rollno, String name, float fee) {
		 this.rollno= rollno;
		 this.name=name;
		 this.fee=fee;}
		   //method
		 void display() {
			 System.out.println(rollno+" "+name+" "+fee+" "+collage);
		 }
		  public class StaticMethod1 { //class 2
		 	public static void main (String[] args) {
		 		
		 		//calling static method with class name
		 		StaticMethod.change();
		 	//creating object
		 		StaticMethod s1 = new StaticMethod(102,"eli",5000);
		 		StaticMethod s2 = new StaticMethod(222,"abhi",3000);
		 		s1.display();
		 		s2.display();
		 	}	
		 	}
		 }


