package funcoes;

import java.util.Scanner;

public class Funcao_maior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com os numeros:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		int valorMaior = calculaMaior(a, b, c);
		imprimeValor(valorMaior);
		
		
		sc.close();

	}

	public static int calculaMaior (int x,int y,int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	public static void imprimeValor(int valor) {
		System.out.println("O maior numero é o " + valor);
	}
}
