package Unidad3Arryse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int totalNumeros = 0;
		int[] NumerosEnteros = new int[100];
		for (int i = 0; i < n; i++) {
			System.out.println("Secuencia " + (i + 1) + " ");
			int cantidad = Integer.parseInt(in.readLine());
			String[] Numeros = in.readLine().split(" ");
			for (int j = 0; j < cantidad; j++) {
				NumerosEnteros[totalNumeros] = Integer.parseInt(Numeros[j]);
				totalNumeros++;
			}

		}
		System.out.println("\nTodos los números almacenados en un único array:");
		for (int i = 0; i < totalNumeros; i++) {
			System.out.print(NumerosEnteros[i] + " ");

		}

	}
}
