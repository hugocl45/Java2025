package unidad1;
//Escribe un programa que calcule el perímetro 
//y el área de un círculo a partir de su radio (r) 
//usando las expresiones siguientes:ç

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//                     𝑝𝑒𝑟í𝑚𝑒𝑡𝑟𝑜 = 2𝜋𝑟 
//                     𝑎𝑟𝑒𝑎 = 𝜋𝑟 2
//
//Para especificar el valor de  usa la expresión Math.PI

public class Ejercicio8 {

	public static void main(String[] args) {
		 final double PI = 3.14;
		 System.out.print("Radio del circulo: ");
		 String linea = System.console().readLine();
		 double r = Double.parseDouble(linea);
		 System.out.println("Perimetro:" + (r * 2d * Math.PI));
		 System.out.println("Àrea: " + (Math.pow(r, 2d) * Math.PI));
		 
		 
		
		
	}

}
