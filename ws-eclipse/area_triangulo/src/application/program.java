 package application;

import java.util.Scanner;

import entities.Triangulo;

public class program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	Triangulo x , y;
	
	x = new Triangulo();
	y = new Triangulo();
	
	System.out.println("entre com as medidas do triangulo X:");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	System.out.println("entre com as medidas do triangulo Y:");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	
	double areaX = x.area();
	double areaY = y.area();
	
	System.out.printf("Area do triangulo X: %.4f%n", areaX);
	System.out.printf("Area do triangulo X: %.4f%n", areaY);
	
	if (areaX > areaY) {
		System.out.println("O triangulo X tem a maior area.");
	}else {
		System.out.println("O triangulo Y tem a maior area.");
	}
		
	
	sc.close();
	}
}
