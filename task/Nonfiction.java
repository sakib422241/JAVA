
public class Nonfiction extends Book {
	public Nonfiction(String title) {
		super(title);
		setPrice();
	   }

	public void setPrice()
	{
	   price = 37.99;
	}

	void showInfo()
	{
	   System.out.println("NonFiction - Title: " + getTitle() + " $"+getPrice());
	   }

	

	
	
}
