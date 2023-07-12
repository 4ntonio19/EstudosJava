package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + "data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char x = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(x == 'c') {
				Product pdct = new Product(name, price);
				list.add(pdct);
			}
			else if(x == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product pdct = new UsedProduct(name, price, date);
				list.add(pdct);
			}
			else{
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product pdct = new ImportedProduct(name, price, customsFee);
				list.add(pdct);
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(Product ac : list) {
			System.out.println(ac.priceTag());
		}
	}

}
