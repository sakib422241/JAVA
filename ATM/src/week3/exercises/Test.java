package week3.exercises;

public class Test {

	public static void main(String[] args) {
		System.out.println("WEEK 3 LAB EXERCISES SUBMITED BY SYEDA AYNUL KARIM - 19-41829-3");
		Account Ishmee = new Account ("Syeda Aynul Karim", 183,100000);
		Ishmee.showAccountDetails();
		Ishmee.setCredit(6661.83);
		System.out.println("Balance after credit of 6661.83 $ :" +Ishmee.getBalance()+"$");
		Ishmee.setDebit(1500.00);
		System.out.println("Balance after debit of 1500.00 $ : " +Ishmee.getBalance()+"$");
		System.out.println();
		DataTypeDemo dtdl = new DataTypeDemo();
		dtdl.displayByteDetails();
		
		System.out.println();
		BookShop z = new BookShop(111,"ADVANCE JAVA","Dr.Syeda Shahriyar");
		System.out.println(z);
		
	}
}
