package Unidad2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("introduce un numero entero");
		int dividendo = in.nextInt();
		System.out.print("introduce otro numero entero");
		int divisor = in.nextInt();
		if (divisor == 0)
			System.err.println("error: el divisor no puede dar cero");
		else 
			System.out.printf("%d / %d = %d", dividendo, divisor, dividendo / divisor);
//		if (divisor != 0)
//			System.out.print("%d / %d = %d", dividendo, divisor, dividendo / divisor);
//		else 
//			System.err.println("error: el divisor no puede dar cero");
		
		
		
		
	}

}
