package Tarefas;

import java.util.Scanner;

public class Fatoral {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();

		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {

			fatorial *= i;

		}

		System.out.println("Fatorial de " + numero + "é" + fatorial);
	}
}
