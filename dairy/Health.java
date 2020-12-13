//package dairy;

	


import java.util.Scanner;
public class Health {
	
	float milk,Weight,temperature;
	 void Input() {
	    	
	        Scanner input = new Scanner(System.in);
	        System.out.print("-*-*-* Answer the following question to know Cow's Health -*-*-*");
	        System.out.print("\n");
	        System.out.print("\nEnter Milk Quantity in Litre : ");
	        float milk = input.nextInt();
	        System.out.print("Enter Weight in Kg : ");
	        float Weight = input.nextInt();
	        System.out.print("Enter temperature in Fahrenheit : ");
	        float temperature = input.nextInt();
	        System.out.print("\n-*-*-*According to your answer the result is given below-*-*-*\n");
	       
	        if(milk<5)
			 {
				 System.out.println("*****Not Ready for Milking*****");
			 }
			 else 
			 {
				 System.out.println("*****Perfect for Milking*****");
			 }
 		System.out.print("");
	        
	     			 if(Weight>150.00)
			 {
				 System.out.println("*****GOOD HEALTH*****");
			 }
			 else 
			 {
				 System.out.println("*****Health Condition is very poor*****");
			 };
		System.out.print("");
	       
	       
	        if(temperature>99.0)
			 {
				 System.out.println("*****Have Fever*****");
			 }
			 else 
			 {
				 System.out.println("*****No Fever*****");
			 };
	    
	        input.close();
	    }

	 
	 public static void main(String[] args) {
			

			Health H = new Health();
			H.Input();
	
	 }
}
	 




