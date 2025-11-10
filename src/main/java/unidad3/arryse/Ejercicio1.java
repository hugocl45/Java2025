package unidad3.arryse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Las secuencias de ADN se componen de un lenguaje 
//sencillo de cuatro letras con los símbolos {A, C, G,T}.
//Tres letras consecutivas se conocen como codón, por lo que 
//ACT y TCG son ambos codones. Un gen
//es una colección de al menos tres codones que comienza 
//con un codón ATG y termina con un codón
//TAA, TAG o TGA.
//Escribe un programa Java que lea un fichero de texto 
//con un BufferedReader y muestre cada línea
//seguida de “ACEPTADA” o “RECHAZADA” para indicar si d
//icha línea se acepta como secuencia de ADN o se rechaza.


public class Ejercicio1 {

	public static void main(String[] args) throws IOException	 {
		String regex = "ATG(?:[ACGT]{3})+(?:TAA|TAG|TGA)";
		try (BufferedReader in = new BufferedReader(
				(new InputStreamReader(Ejercicio1.class.getResourceAsStream("/ADN.txt")))) {
		String linea;
		while ((linea = in.readLine()) !=null) {
			System.out.print(linea + ": ");
			if (linea.matches(regex))
				System.out.println("ACEPTADA");
			else
				System.out.println("RECHAZADA");
			
		}
				
		}
	}

}
