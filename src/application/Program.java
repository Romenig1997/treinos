package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.ProductVect;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVect[] vect = new ProductVect[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new ProductVect(name, price);
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
				soma += vect[i].getPrice();
		}
		double media = soma / n;

		
		System.out.printf("AVERAGE PRICE:  %.2f%n", media);
		
		sc.close();

	}

}
