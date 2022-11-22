package pro1;

class ThreadEg extends Thread {
public void run() {
	System.out.println("i an thread....thread is running");
}
	public static void main(String[] args) {
		ThreadEg t = new ThreadEg();
		t.start();
		String s = t.getName();
System.out.println(s);
	}

}
