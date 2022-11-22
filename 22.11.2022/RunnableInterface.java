package pro1;

public class RunnableInterface implements Runnable {
public void run() {
	System.out.println("i an thread....thread is running");	
}
	public static void main(String[] args) {
		RunnableInterface ri = new RunnableInterface();
		Thread t = new Thread(ri);
		t.start();

	}

}
