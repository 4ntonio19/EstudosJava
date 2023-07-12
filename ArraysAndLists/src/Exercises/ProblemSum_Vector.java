package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemSum_Vector {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for( int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
		}
		System.out.print("Valores digitados: ");
		for(int i=0; i<n; i++) {
			System.out.print(vect[i] + " ");
		}
		sc.nextLine();
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum+= vect[i];
		}
		
		System.out.println("Soma: " + sum);
		
		double avg = sum / n;
		
		System.out.println("Average: " + avg);
	}

}
