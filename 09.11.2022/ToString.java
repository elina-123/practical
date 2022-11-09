package pro1;
//REPRESENT ANY OBJRCT TO STRING,WE CAN RETURN VALUE OF THE OBJECT INSTEAD OF HASHCODE
public class ToString {
int RollNo;
String Name, Address;
ToString(int rollno, String name, String address){
	this.RollNo=rollno;
	this.Name=name;
	this.Address=address;
	
}
	public String toString() {
	return RollNo+ " "+Name+" "+Address;
	}
public static void main(String[] args) {
ToString S1=new ToString(123,"ELINA","PRIYADARSHINI");
ToString S2=new ToString(124,"ABINASH","OJHA");
System.out.println(S1);
System.out.println(S2);	
}
}
