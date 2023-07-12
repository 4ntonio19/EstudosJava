package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class MainProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product p = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());
		
		
		System.out.println("Product data: " + product);
		System.out.println("Enter the number of products to be added in stock: ");
	
		int quantity = sc.nextInt();
		product.AddProducts(quantity);

		System.out.println("Updated data: " + product);

		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();

		product.RemoveProducts(quantity);

		System.out.println("Updated data: " + product);
	}

}
