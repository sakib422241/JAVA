package week4.exercises;

public class Test {

	public static void main(String[] args) {
		Box B = new Box(); // object creation
		B.setheight(2.0);
		B.setwidth(2.5);
		B.setlength(5.5);
		System.out.println();// space
		ScannerDemonstration j = new ScannerDemonstration();//object creation
		j.readInteger(); // for showing the result of ScannerDemonstration
		System.out.println();
		System.out.println("\nHeight is :"+B.getheight());
		System.out.println("\nWidth is  :"+B.getwidth());
		System.out.println("\nLength is :"+B.getlength());
		System.out.println("\nPrice of this box is "+B.getPricePerUnit());
		System.out.println();
		j.describeYourSelf(); // for showing the result of describeYourSelf....
        
	}

}
// lets run this program......... sorry for the audio problem.. nd thanks for watching  ...