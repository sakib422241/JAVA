package week3.exercises;

public class DataTypeDemo {
	byte byteDefault;
	short shortDefault;
	int  integerDefault;
	long longDefault;
	boolean booleanDefault;
	char charDefault;
	//Byte.MIN_VALUE = -128 
	//Byte.MAX_VALUE 127
	// Character Default is White space.
	
	public void displayByteDetails() {
		System.out.println("Byte type details : \n\nByte Default is    = "+byteDefault+"\nShort Default  is  = " +shortDefault+"\nInteger Default is = "+integerDefault+"\nBoolean Default is = "+booleanDefault+"\nLong Default is    = " +longDefault+"\nChar  Default is   = "+charDefault+"\nByte Min           = "+Byte.MIN_VALUE+"\nByte Max           = "+Byte.MAX_VALUE);
	}
	
}
