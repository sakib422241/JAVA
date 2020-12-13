//package exceptationprojectdemo;
import java.util.Scanner; 

public class trycathdemo {
public static void main(String[] args) 
{
		
		try 
		{
			Scanner sc= new Scanner(System.in);     
			System.out.print("Enter first number- ");  
			int a= sc.nextInt();  
			System.out.print("Enter second number- ");  
			int b= sc.nextInt();  
			System.out.println(+a);  
			System.out.println(+b);
			//sc.close();
			
		}
		catch(Exception exception) 
		{
			System.out.println("occured : "+exception);
		}
		
		
	

try 
{
	Scanner sc= new Scanner(System.in);     
	System.out.print("Enter first number- ");  
	int c= sc.nextInt();  
	System.out.print("Enter second number- ");  
	int d= sc.nextInt();  
	//sc.close();
	
	
	System.out.println("result "+(c/d));  
}
catch(Exception exception) 
{
	System.out.println("occured : "+exception);
}
try 
{
	Scanner sc= new Scanner(System.in);     
	System.out.print("Enter first number- ");  
	int e= sc.nextInt();  
	System.out.print("Enter second number- ");  
	int f= sc.nextInt(); 
	
	
	System.out.println("result "+(e/f));  
	
}
catch(Exception exception) 
{
	System.out.println("occured : "+exception);
}


}
}
