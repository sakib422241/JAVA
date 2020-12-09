package methodOverriding;

public class person {
	
	String name;
	 int age; 
	 String nationality; 
	 int nid; 
	 String gender;
	 person(String name, int age, String nationality, int nid, String gender){
		 this.name = name;
		 this.age= age;
		 this. nationality = nationality;
		 this.nid =nid;
		 this.gender=gender;
		 
	 }

	 
	 
	public void showdetails()
	 {
		 System.out.println("NAME : "+name);
		 System.out.println("AGE : "+age);
		 System.out.println("Nationality : "+nationality);
		 System.out.println("NID : "+nid);
		 System.out.println("GENDER : "+gender);
		 System.out.println("----------");
			 
	 }


}
