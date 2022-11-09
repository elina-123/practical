package pro1;

import java.util.StringTokenizer;

//simple way to break a string,package:java.utile.StringTokenizer
public class StringTokennizer {
public static void show() {
StringTokenizer St1=new StringTokenizer("ANUDIP FOUNDATION SKILL AND CAREER DEVELOPMENT");
while(St1.hasMoreTokens()) {
System.out.print(St1.nextToken(" "));
StringTokenizer St2=new StringTokenizer("IT IS BEST FOR US");
	while(St2.hasMoreTokens()) {
System.out.println();
System.out.println(St2.nextToken(","));	
}
}
}
	public static void main(String[] args) {
	show();

	}

}
