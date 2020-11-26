package methodOverloading;

public class DifferentReturnType {
	int a,b;
	double c,d,e;
	float g,h;
	
	public int add(int a , int b) 
	{
		return a+b;
		
	}
	public double add (double c, double d,double e)
	{
		return c+d+e;
	}
	public float add (float g, float h)
	{
		return g+h;
	}
	

	public void add()
	
	{
		float sum =(float) ((int) (add( 5, 5))+ (double) (add( 5.0, 5.0,5.0 ))+(float) (add(5.0f , 5.f)));
		System.out.println("The sum of (add(5, 5)) + add(5.0,5.0, 5.0) +add(5.0f, 5.f) is " +sum);
	
	}
}
