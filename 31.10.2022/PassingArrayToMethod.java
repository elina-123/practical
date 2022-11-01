package pro1;

public class PassingArrayToMethod {
	static void maximumNo(int array[]) {
		// TODO Auto-generated method stub
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(max<array[i])
				max=array[i];
			System.out.println(max);}
		}
public static void main(String[] args) {
//declaration,initialize
	int a[]= {5,7,2,8,9};
	maximumNo(a);//passing array
}
	
}
