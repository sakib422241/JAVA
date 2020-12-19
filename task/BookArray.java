
public class BookArray {

	public static void main(String[] args) {
		//start main method
		   
		//create an array to store 10 books
		Book books[] = new Book[10];

		//create and store 5 Fiction objects
		books[0] = new Fiction("The First Animals");
		books[1] = new Fiction("And Then There Were None");
		books[2] = new Fiction("The Grim Reaper");
		books[3] = new Fiction("Spirited Away");
		books[4] = new Fiction("Inception");

		//create and store 5 NonFiction objects
		books[5] = new Nonfiction("In Cold Blood");
		books[6] = new Nonfiction("Silent Spring");
		books[7] = new Nonfiction("A Room of One's Own");
		books[8] = new Nonfiction("When Breath Becomes Air");
		books[9] = new Nonfiction("The Tipping Point");

		//display the details of all books
		System.out.println("Details of all the books:");
		for(int i = 0; i < books.length; i++)
		{
		   System.out.println();
		   System.out.println((i + 1) + ".Name:" +
		   books[i].getTitle());
		   System.out.println("Price:$"+ books[i].getPrice());
		}

		   }

}
