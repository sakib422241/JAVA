package methodOverloading;

public class DifferentSequenceOfParameters {
	int id;
	String name;
	public void method(int id ,String Name) 
	{
		System.out.println("I’m the first definition of method dispid = "+id +" "+ "Name = "+Name);
	}
	public void method(String Name, int id ) 
	{
		System.out.println("I’m the Second definition of method dispname = "+Name +" "+ "Id = "+id);
	}

}
