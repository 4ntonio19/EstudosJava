package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ProblemHeight {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double porcentagem = 0;
		Entities[] vect = new Entities[n];
		sc.nextLine();
		for(int i=0; i<vect.length; i++) {
			int x = 1;
			x+=i;
			System.out.println("Dados da " + x + "a pessoa:");
			System.out.print("Nome:");
			String name = sc.nextLine();
			System.out.print("Idade:");
			int age = sc.nextInt();
			System.out.print("Altura:");
			double height = sc.nextDouble();
			sc.nextLine();
			
			vect[i] = new Entities(name, age, height);
		}
		double sum=0;
		for(int i=0; i<vect.length; i++) {
			sum+=vect[i].getHeight();
		}
		
		double avg = sum / n;
		System.out.println("Average height: " + avg);
		 int menores = 0;
		 int x = 0;
		for(int i=0; i<vect.length; i++) {
			
			if(vect[i].getAge() <16) {
				menores++;
			}
			
			if(vect[i].getAge() > 0) {
				x++;
			}
			porcentagem = (double)(menores*100)/x;
		}
		
		System.out.println("Porcentagem de pessoas com mais de 16 anos: " + porcentagem + "%");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
	}

}
