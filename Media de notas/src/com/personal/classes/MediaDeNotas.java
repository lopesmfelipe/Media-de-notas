package com.personal.classes;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[4];
		
		
		System.out.println("Informe a nota 1: ");
		notas[0] = scanner.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		notas[1] = scanner.nextDouble();

		System.out.println("Informe a nota 3: ");
		notas[2] = scanner.nextDouble();

		System.out.println("Informe a nota 4: ");
		notas[3] = scanner.nextDouble();

		
		double media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length ;
		
		System.out.println("A média das notas é: " + media);
		
		
	}

}
