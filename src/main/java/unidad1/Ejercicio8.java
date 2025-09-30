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

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("radio del circulo:");
		 String r = in.readLine();
		 System.out.println("perimetro:" + (r * 2d * Math.PI));
		 System.out.print("area:" + (Math.pow(r, 2d) * Math.PI));
		 
		 
		
		
	}

}
