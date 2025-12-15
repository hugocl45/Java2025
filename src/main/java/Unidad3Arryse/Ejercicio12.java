package Unidad3Arryse;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nombre = new String[5];
		double[][] notas = new double[5][3];
		for (int i = 0; i < 5; i++) {
			System.out.print("Nombre del alumno " + (i + 1) + " : ");
			nombre[i] = sc.nextLine();
			for (int j = 0; j < 3; j++) {
				System.out.print(" nota de la evaluacion " + (j + 1) + (": "));
			}
		}

	}

}
