package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class DesafioPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will ne rented? ");
		int n = sc.nextInt();
		Entities2 [] vect = new Entities2[9];
		sc.nextLine();
		for(int i=0; i<n; i++) {
			int x = 1;
			x += i;
			System.out.println("Rent #" + x + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Entities2(name, email, room);
		}
		 System.out.println("Busy rooms:");
		 
		for(int i = 0; i<vect.length; i++) {
			
			if(vect[i] != null) {
				System.out.println(i + ":" + vect[i].getName() + ", " + vect[i].getEmail());
			}
			
		}
	}

}
