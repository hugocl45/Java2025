package Unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    System.out.print("introduce un mes ");
		    String mes = in.readLine();
		    
		    if ("enero".equalsIgnoreCase(mes)) || "marzo" .equalsIgnoreCase(mes);{
		    	System.out.println("31 dias");
		    }
		    else {
		    	if ("febrero".equalsIgnoreCase(mes))
			    System.out.println("28 o 29 dias");
		    	
		    	  else {
				    	if ("febrero".equalsIgnoreCase(mes))
					    System.out.println("28 o 29 dias");
			
	
	}

}
