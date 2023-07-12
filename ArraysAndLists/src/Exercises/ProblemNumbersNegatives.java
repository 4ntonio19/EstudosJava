package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemNumbersNegatives {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numéros você vai digitar? ");
		int n = sc.nextInt();
		
		int vect[] = new int[10];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("Numeros negativos: ");
		
		for(int i=0; i<n; i++) {
			if(vect[i] < 0) {
				System.out.print(vect[i]);
			}
		}
		
		
		
	}

}
