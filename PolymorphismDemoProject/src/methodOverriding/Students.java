package methodOverriding;

public class Students extends person {
	String id;
	String Major; 
	int currentSem;

	Students(String name, int age, String nationality, int nid, String gender ,String id,String Major,int currentSem) {
		super(name, age, nationality, nid, gender);
		this.id = id;
		this.Major = Major;
		this.currentSem = currentSem; 
		
	}
	public void showdetails(){
		super. showdetails();
		 System.out.println("ID : "+id);
		 System.out.println("Major : "+Major);
		 System.out.println("CURRENT SEMESTER : "+currentSem);
		
	}
	

}
