package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto product = new Produto();
		
		System.out.println("Enter Product data:");
		System.out.print("Name:");
		product.name = sc.nextLine();
		System.out.print("Price:");
		product.price = sc.nextDouble();
		System.out.print("Quantity:");
		product.quantity = sc.nextInt();
		
		product.totalValueInStock();
		
		System.out.println();
		System.out.println("Product Data:" + product);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data:" + product);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data:" + product);
		
		sc.close();
	}

}
