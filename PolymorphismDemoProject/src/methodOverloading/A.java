package methodOverloading;

public class A {
	int id;  
    String name;
    public A (int id,String name )
    {
    	    	System.out.println("ID :"+ id+" Name : "+name);
    }
    public A (String name,int id)
    {
    	
    	System.out.println("Name : "+name +" ID :"+id);
    	
    	
    }
	

}
