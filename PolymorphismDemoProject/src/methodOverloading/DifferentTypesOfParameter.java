package methodOverloading;

public class DifferentTypesOfParameter {
	

	 char c ;
	int i ;
	boolean bo  ;
	double d ;
	float f ;
	String mgs ;

	public void disp(char c)
	{
		System.out.println("Value of disp (Char c) Method = "+c);	
	}
	public void disp(int i)
	{
		System.out.println("Value of disp (int i) Method = "+i);	
}
	public void disp(boolean bo)
	{
		System.out.println("Value of disp (int i) Method = "+bo);	
}
	public void disp(double d)
	{
		System.out.println("Value of disp (int i) Method = "+d);	
}
	public void disp(float f)
	{
		System.out.println("Value of disp (int i) Method = "+f);	
}
	public void disp(String mgs)
	{
		System.out.println("Value of disp (int i) Method = "+mgs);	
}
	

}
