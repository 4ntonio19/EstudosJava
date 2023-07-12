package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Company;
import entitites.Individual;
import entitites.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + "data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Individual(name, anualIncome, health));
			} else {
				System.out.print("Number of employees: ");
				int numberE = sc.nextInt();
				list.add(new Company(name, anualIncome, numberE));
			}
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("Taxes paid:");
		for (TaxPayer tax : list) {
			double tp = tax.tax();
			System.out.printf(tax.getName() + ": $ " + String.format("%.2f", tp));
			sum += tp;	
		}
		System.out.println();
		System.out.printf("Total Taxes: $ " + String.format("%.2f", sum));
	}

}
