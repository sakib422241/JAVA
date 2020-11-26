package week5.exercises;


import java.util.Scanner;

public class ArrayDemo {
	public void arrayofCGPA() {
		float[][] cgpa=new float[2][2];
		Scanner input = new Scanner (System.in);
		System.out.println("Enter CGPA of student semesterwise accordingly: ");
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.println ("Enter CGPA of student"+(i+1)+"semester"+(j+1)+":");
				cgpa[i][j] = input.nextFloat();
				
			}
		}
		System.out.println("CGPA matrix are given below:");
		for (int i=0; i<2;  i++) {
			for(int j=0; j<2; j++) {
			System.out.print(cgpa[i][j]+"\t");
		}
			System.out.println();
		}
	}
	}

