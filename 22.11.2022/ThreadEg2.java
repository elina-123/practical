package pro1;
//directly we use thread class without extend
public class ThreadEg2 {

	public static void main(String[] args) {
	Thread t = new Thread("ELINA");
	t.start();
	String s = t.getName();
	System.out.println(s);
	}

}
