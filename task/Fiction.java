

public class Fiction extends Book {
	 public Fiction(String title)
	   {
	super(title);
	setPrice();
	   }

	public void setPrice()
	{
	   price = 24.99;
	}

	void showInfo()
	{
	   System.out.println("Fiction - Title: " + getTitle() + " $"+getPrice());
	   }
	

}
