package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemNumbersPairs {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int [] vect = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Numeros pares: ");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] % 2 != 1) {
				System.out.print(vect[i] + " ");
			}
		}
		
		int pares = 0;
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] % 2 != 1) {
				pares++;
			}
		}
		
		System.out.println("Quantidade de pares= " + pares);
		
		
	}

}
