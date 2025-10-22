package unidad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un cadena");
		String s = in.readLine();
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
	
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case 'a', 'A':
				contadorA++;
			break;
			case 'e', 'E':
				contadorE++;
			break;
			case 'i', 'I':
				contadorI++;
			break;
			case 'o', 'O':
				contadorO++;
			break;
			case 'u', 'U':
				contadorU++;
			break;
			}
		}
		System.out.print("Numero de caracteres 'a/A': " + contadorA);
		System.out.print("Numero de caracteres 'e/E': " + contadorE);
		System.out.print("Numero de caracteres 'i/I': " + contadorI);
		System.out.print("Numero de caracteres '0/O': " + contadorO);
		System.out.print("Numero de caracteres 'u/U': " + contadorU);
	}

}
