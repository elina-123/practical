package pro1;
//final keyword   
//final class cannot extend the final class
class Finalclass {
	class test extends Finalclass{ //cannot extend the final class
	void show()
	{System.out.println("nothing");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  test t = new test();
  t.show();
	}

}}
