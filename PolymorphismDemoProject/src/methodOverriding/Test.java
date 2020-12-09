package methodOverriding;

public class Test {

	public static void main(String[] args) {
		System.out.println("----Task 1----");
		System.out.println("");
		Vehicle v = new Vehicle();
		Car c = new Car ();
		Bike b = new Bike ();
		Train t = new Train ();
		Airplane a = new Airplane();
		v.run();
		c.run();
		b.run();
		t.run();
		a.run();
		System.out.println("");
		System.out.println("----Task 2----");
		System.out.println("");
		SBI SBI = new SBI();
		ICICI ICI = new ICICI();
		AXIS AXI = new AXIS();
		DutchBangla DBBL = new DutchBangla ();
		System.out.println( "SBI Rate of Interest:" + SBI.returnInterestRate());
		System.out.println( "ICICI Rate of Interest:" + ICI.returnInterestRate());
		System.out.println( "AXIS Rate of Interest:" + AXI.returnInterestRate());
		System.out.println( "DutchBangla Rate of Interest:" + DBBL.returnInterestRate());
		System.out.println("");
		System.out.println("----Task 3----");
		System.out.println("");
		person p = new person ("****",20,"Bangladeshi", 2307,"***");
		Employee E = new Employee("****",20,"Bangladeshi", 1708,"Male",20000.00,"CEO");
		Faculty f = new Faculty ("****",20,"Bangladeshi", 0212,"Male",200000.00,"Faculty","Computer Science",114);
		Students s =new Students("****",20,"Bangladeshi", 2911,"Male","19-****-3","OOP1",5);
		p.showdetails();
		E.showdetails();
		f.showdetails();
		s.showdetails();
		

	}

}
