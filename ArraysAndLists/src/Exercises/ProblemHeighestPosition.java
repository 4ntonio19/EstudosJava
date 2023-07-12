package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemHeighestPosition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double [] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		int x = 0;
		double maior = 0.0;
		for(int i=0; i<vect.length; i++) {
			if(vect[i] > maior) {
				maior=vect[i];
				x = i;
			}
		}
		
		System.out.println("Maior valor = " + maior);
		
		System.out.println("Posição do maior valor= " + x);
		
		
	}

}
