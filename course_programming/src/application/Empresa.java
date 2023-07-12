package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Employee;

public class Empresa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		
		System.out.print("Which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		
		emp.IncreaseSalary(porcentage);
		
		System.out.println("Update data: " + emp);
		
	}

}
