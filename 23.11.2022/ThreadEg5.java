package pro1;
//directly we use thread class without extend & without set name the thread
public class ThreadEg5 {
public void run() {
	System.out.println("ELINA");
}
	public static void main(String[] args) {
	Thread t = new Thread("ABINASH");
	Thread t1 = new Thread();
	t.start();
	t1.start();
	t1.setName("ANUDIP");
	System.out.println("Thread 0:"+t.getName());
	System.out.println("Thread 1:"+t1.getName());
	}

}
