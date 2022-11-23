package pro1;

public class ThreadEg4 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		try {
			Thread.sleep(800);}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadEg4 t1=new ThreadEg4();
		ThreadEg4 t2=new ThreadEg4();
		ThreadEg4 t3=new ThreadEg4();
		/*t1.start();
		t2.run();
		t3.run();*/
		t1.start();
		try {
			t1.join();
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}t2.start();
		try {
			t2.join();
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		t3.start();
		}
		
	}
