package Unidad2;
//Escribe un programa que genere de forma aleatoria números 
//enteros pertenecientes al intervalo
//[100, 999] y los vaya sumando hasta que se supere
//un valor previamente introducido por teclado.
//
//Antes de finalizar, el programa mostrará el resultado de la suma 
//y la cantidad de valores acumulados

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Random random = new Random();
		int suma = 0;
		int contador = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("valor maximo de la suma: ");
		int max = in.nextInt();
		while (suma < max) {
			int n = random.nextInt(899) + 100;
			suma += n;
			contador++;
			
		}
	}

}
