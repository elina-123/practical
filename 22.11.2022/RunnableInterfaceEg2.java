package pro1;
//Thread (Runnable object, String name)
public class RunnableInterfaceEg2 implements Runnable {
public void run() {
System.out.println("Thread running");	
}
	public static void main(String[] args) {
		Runnable ri = new RunnableInterfaceEg2();	
Thread t= new Thread (ri,"Another Thread Line");
t.start();
String s = t.getName();
System.out.println(s);
	}

}
