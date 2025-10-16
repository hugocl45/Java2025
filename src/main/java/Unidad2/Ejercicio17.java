package Unidad2;
//Escribe un programa para jugar al juego de adivinar el número desconocido:

//• El programa genera un número aleatorio comprendido entre 1 y N, siendo N otro número
//aleatorio comprendido entre 1.000 y 100.000.

//• Después muestra el mensaje “He pensado un número entre 1 y N, adivina cuál es: “. El usuario
//tendrá que introducir números hasta que acierte.

//• Por cada respuesta no acertada el programa dirá si el valor introducido es mayor o menor que
//la respuesta correcta y volverá a preguntar.

//• Cuando el usuario responda correctamente, el programa dirá cuántos intentos han sido
//necesarios para adivinar el número le preguntará al usuario si desea volver a jugar.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		Random random = new Random();
		int n = random.nextInt(99001) + 1000;
	    int cpu = random.nextInt(n) + 1;
		
//		Random random = new Random();
//		int numero = random.nextInt(random.nextInt(99001) + 1000) + 1;
	    
	    System.out.printf("he pensado un numero entre 1 y %d, adivina cual es:", cpu );
	    int jugador;
	    do {
	    	System.out.print("numero: ");
	    	jugador = int.nextInt();
	    	if (cpu == jugador)
	    			System.out.print("has acertado, ");
	    	else {
	    		System.out.print("has falaldo, el numero es ");
	    		if (cpu < jugador)
	    			System.out.print("menor");
	    		else {
		    		System.out.print("has falaldo, el numero es ");
		    		if (cpu > jugador)
		    			System.out.print("mayor");
	    		
	    		
	    	}
	    	
	    } 
	    	while(cpu == jugador);
	    System.out.println("has acertado");
	    
	    
		
	    ¨}
	}

}
