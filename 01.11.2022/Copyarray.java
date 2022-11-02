package pro1;

public class Copyarray {//class

	public static void main(String[] args) {
	//declaring a source array
		char[]copyFrom= {'d','e','c','f','e','f','n'};
		//declaring a destination array
		char[]copyTo=new char[7];
		System.arraycopy(copyFrom,2,copyTo,0,5);
		//print the destination array
		System.out.println(String.valueOf(copyTo));
	}

}
