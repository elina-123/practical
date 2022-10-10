package pro1;

public class StudentDetails {
	int id;
	String name;
	StudentAddress address;//reference entity
public StudentDetails(int id,String name,StudentAddress address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(address.area+" "+address.city+" "+address.dist);
}
public static void main(String[] args) {
	StudentAddress a1=new StudentAddress("Odisha","Dhenkanal","Bhuban");
	StudentDetails d1=new StudentDetails(23,"Elina",a1);
	d1.show();
}
}

