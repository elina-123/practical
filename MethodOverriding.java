package pro1;

//Method overriding
class TestOveride{
	void run() {
		System.out.println("running mode on");
	}
}
class overriding extends TestOveride{
	void run() {
		System.out.println("runnng mode off");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
overriding ob=new overriding();
ob.run();
	}

}
