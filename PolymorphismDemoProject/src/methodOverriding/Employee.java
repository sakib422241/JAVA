package methodOverriding;

public class Employee extends person {
	double salary; String designation; 

	Employee(String name, int age, String nationality, int nid, String gender, double salary, String designation)
	{
		super(name, age, nationality, nid, gender);
		this.salary = salary;
		this.designation=designation;
	}
	public void showdetails(){
		super. showdetails();
		 System.out.println("SALARY : "+salary);
		 System.out.println("DESIGNATION : "+designation);
		 System.out.println("----------");
		


}
}
