package unidad3;
//Escribe un programa que lea líneas hasta
//que se introduzca en una de ellas la cadena
//"fin" sin importar
//si se hace en mayúsculas o en minúsculas 
//o en cualquier combinación de ambas. Por cada línea leída,
//excepto la última, mostrará cuál 
//es el primer carácter que no se repite.



import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			String linea;
			System.out.print(">");
			while( !(linea = in.nextLine()).equalsIgnoreCase("fin")) {
				char c = primerCaracterQueNoSeRepite(linea);
					System.out.print(c);
					System.out.print(">");
				
			}
	}
	static char primerCaracterQueNoSeRepite(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return c; 
            }
        }
        return ' '; 
	}

}
