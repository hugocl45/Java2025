package ejemploia;

import java.util.Random;
import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);
	        Random aleatorio = new Random();

	        System.out.print("Introduce el valor límite: ");
	        int limite = teclado.nextInt();

	        int suma = 0;
	        int contador = 0;

	        do {
	            int numero = aleatorio.nextInt(900) + 100; 
	            suma += numero;
	            contador++;
	        } while (suma <= limite);

	    
	        System.out.println("Suma total: " + suma);
	        System.out.println("Cantidad de números generados: " + contador);
	    }
	

		   
			
		
	}

