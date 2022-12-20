package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements will the vector have? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		double sum = 0;
		double count = 0;
		for (int i=0; i < vect.length; i++) {
			System.out.print("Input a number: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] %2 == 0) {
				sum += vect[i];
				count += 1;
			}
		}
		
		if (count > 0) {
			double avg = sum / count;
			System.out.println("PAIR AVERAGE = " + avg);
		}
		else {
			System.out.println("NO EVEN NUMBER!!!");
		}
		
		
		sc.close();
	}

}
