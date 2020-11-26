package methodOverloading;

import java.util.Scanner;

	public class Test {

		public static void main(String[] args) {
			
			int a ;
		
			Scanner console = new Scanner (System.in);
			System.out.println("Enter you choice  (1/2/3/4/5/6) : ");
			System.out.println("1 >>:  Task 1");
			System.out.println("2 >>:  Task 2");
			System.out.println("3 >>:  Task 3");
			System.out.println("4 >>:  Task 4");
			System.out.println("5 >>:  Task 5");
			System.out.println("6 >>:  Task 6");
			a=console.nextInt();
			switch(a) 
			{
			case 1 :
				System.out.println("-*-*-*- TASK 1 result-*-*-*-");
				
				DifferentTypesOfParameter D = new DifferentTypesOfParameter();
			D.disp('c');
			D.disp(200);
			D.disp(true);
			D.disp(10.0);
			D.disp(5.0);
			D.disp("Hi");
				break;
			case 2 :
				System.out.println("-*-*-*- TASK 2 result-*-*-*-");
				DifferentNumberOfParameter n = new DifferentNumberOfParameter();
				n.add(10);
				n.add(5, 5);
				n.add(5,5,5);
				n.add(5, 5, 5, 5);
				n.add(5,5,5,5,5);
				break;
			case 3 :
				System.out.println("-*-*-*- TASK 3 result-*-*-*-");
				DifferentSequenceOfParameters p = new DifferentSequenceOfParameters();
				p.method(111, "Rupai");
				p.method("Tamim", 112);
				break;
			case 4 :
				System.out.println("-*-*-*- TASK 4 result-*-*-*-");
				DifferentReturnType t = new DifferentReturnType ();
				t.add(5, 5);
				t.add(5.0, 5.0,5.0);
				t.add(5.0f, 5.f);
				t.add();
				break;
			case 5 :
				System.out.println("-*-*-*- TASK 5 result-*-*-*-");
				A ish = new A(111,"Rupai");
				A ti = new A ("Tamim",112);
				
				
				break;
			case 6 :
				System.out.println("-*-*-*- TASK 6 result-*-*-*-");
				Motorbike m = new Motorbike();
				m.kick();
				m.self();
				break;
			}

			}

	}


