package methodOverloading;

public class DifferentNumberOfParameter {
	int a,b,c,d;
	public void add(int a) 
	{
		System.out.println("Value of add (int a) Method = "+a);
	}
	
	public void add(int a, int b) 
	{
		System.out.println("Value of add (int a,b) Method = " +(a+b));
	 		
	}
	
	public void add (int a , int b , int c) 
	{
		System.out.println("Value of add (int a,b,c) Method = " +(a+b+c));
		
	}
	public void add (int a , int b , int c,int d) 
	{
		System.out.println("Value of add (int a,b,c) Method = " +(a+b+c+d));
	}
	
	public void add (int a , int b , int c,int d, int e) 
	{
		System.out.println("Value of add (int a,b,c) Method = " +(a+b+c+d+e));
	}
	

}
