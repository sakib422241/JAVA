
public class UseBook {

	public static void main(String[] args) {
		Book someBook[] = new Book[10];
		int x;
		someBook[0] = new Fiction("Scarlet Letter");
		someBook[1] = new Nonfiction("In Cold Blood");
		someBook[2] = new Fiction("Inception");
		someBook[3] = new Nonfiction("Silent Spring");
		someBook[4] = new Fiction("A Tale of Two Cities");
		someBook[5] = new Nonfiction("The Tipping Point");
		someBook[6] = new Fiction("Spirited Away");
		someBook[7] = new Fiction("The Grim Reaper");
		someBook[8] = new Fiction("And Then There Were None");
		someBook[9] = new Fiction("The First Animals");

		for(x = 0; x < someBook.length; ++x)

		System.out.println("Book: " + someBook[x].getTitle() + " costs $" + someBook[x].getPrice());

		   }


	

}
