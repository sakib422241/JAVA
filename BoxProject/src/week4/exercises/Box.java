package week4.exercises;

public class Box {
	private double height;    //three instance variables 
	private double width;
	private double length;

	public double getheight() {  //  method for set values
		return height;            // return values

	}
	//convert private to public .
	public void setheight(double height) {
		this.height=height;
		
	}
	public double getwidth() {
		return height;

	}
	public void setwidth(double width) {
		this.width=width;
		
	}
	public double getlength() {
		return length;

	}
	public void setlength(double length) {
		this.length=length;
		
	}
	static double PricePerUnit = 5.0;
	public double getPricePerUnit() {
		double price ;
		price = PricePerUnit*(length+width+height); // in price variable we are showing formula ...
		return price;
	}

	}

