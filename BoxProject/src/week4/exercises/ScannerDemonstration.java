package week4.exercises;


import java.util.*;  // this is for input 

public class ScannerDemonstration {
	int a,b,sum,age;     //variables
	String str1,str2;
	private Scanner i,j;
	
	float product,height;
	
	
	public void readInteger() {
		i = new Scanner(System.in); // input method in java
		System.out.print("Enter first number- ");  
		int a= i.nextInt();  // read int
		System.out.print("Enter second number- ");  
		int b= i.nextInt();  
	  
		int sum=a+b; 
		float product = a*b;
		
		System.out.println("Sum= " +sum);
		System.out.println("Product = " +product);
		
	}
	public void describeYourSelf () {
		j = new Scanner(System.in);
		System.out.print("Enter name : ");  
		String name= j.nextLine();   //reads string
		System.out.print("Enter Filed of interest: "); 
		String interest = j.nextLine();
		System.out.print("Enter your age : ");  
		int age = j.nextInt();  
		System.out.print("Enter height : ");  
		float height= j.nextFloat();  
		System.out.print("\nHey, My name is "+name+".I am "+age+"years old.I am "+height +" feet long.My field of interest are "+interest);  
		  
		
		
	}
	}
	



