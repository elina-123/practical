package pro1;

public class Squarestatic {
	static int square(int x) {//static method
		return x*x;
	}
public static void main(String[] args) {
	int result=Squarestatic.square(6);//taking a variable and class name.method name(pass the value)
	System.out.println(result);
}
}
