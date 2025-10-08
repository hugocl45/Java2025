package Unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ejercicio4 {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		public static void main1(String[] args) {
		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("introduce un mes(numero de 1 a 12)");
		    int mes = Integer.parseInt(in.readLine());
		    
		    if (mes <1 || mes > 12)// el mes no esta entre 1 y 12
		    	System.out.println("No es un mes valido");
		    else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) 
		    	System.out.println("31 dias");
			else if (mes == 2) 
			    System.out.println("28 o 29 dias");
		    else 
			    System.out.println("30 dias");
		}
	}
}
