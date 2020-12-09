package methodOverriding;

public class Faculty extends Employee{
	String Deparment ;
	int roomno;

	Faculty(String name, int age, String nationality, int nid, String gender, double salary, String designation,String Department,int roomno) {
		super(name, age, nationality, nid, gender, salary, designation);
		this.Deparment = Department;
		this.roomno = roomno;
		
		
	}
	public void showdetails(){
		super. showdetails();
		 System.out.println("Department : "+Deparment);
		 System.out.println("Room NO : "+roomno);
		 System.out.println("----------");
	
}
}
