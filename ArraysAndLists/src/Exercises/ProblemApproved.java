package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemApproved {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		double avg;
		Approved [] vect = new Approved[n];
		sc.nextLine();
		for(int i=0; i<vect.length; i++) {
			int x =1;
			x+=i;
			System.out.println("Digite nome, primeira e segunda nota do " + x + "o aluno:");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			vect[i] = new Approved(nome, nota1, nota2);
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<vect.length; i++) {
			 avg = (vect[i].getNota1() + vect[i].getNota2())/2;
			 if(avg>=6.0) {
				System.out.println(vect[i].getNome());
			} 
		}
	}
}
