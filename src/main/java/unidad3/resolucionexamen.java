package unidad3;

import java.util.Scanner;

public class resolucionexamen {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1 - crea retrato, 2 salir");
		int accion;
		while ((accion = in.nextInt()) == 1) {	
			String pelo = elegirOpcion(in,"WWWWWWWWW ","\\\\\\////// "," \"|||||||\"","||||||||| ");
			String ojos = elegirOpcion(in,"| o o | ","|-(· ·)-| "," |-(o o)-|"," | \\ / | ");
			String orejasNariz = elegirOpcion(in," @ J @ "," { \" } "," [ j ]","  < - > ");
			String boca = elegirOpcion(in,"| === | ","| - | ","| ___ ||"," | --- | ");
			String barbilla = elegirOpcion(in,"\\_______/ ","\\,,,,,,,/ ","  \\......./"," \\mmmmmmm/ ");
			System.out.println(pelo);
			System.out.println(ojos);
			System.out.println(orejasNariz);
			System.out.println(boca);
			System.out.println(barbilla);
			accion = in.nextInt();
			
			}	
		}
	
	static String elegirOpcion(Scanner in,
			String op1, String op2, String op3, String op4) {
		System.out.println("elige una opcion");
		System.out.println("1 - " + op1);
		System.out.println("2 - " + op2);
		System.out.println("3 - " + op3);
		System.out.println("4 - " + op4);
		
		String pelo;
		int numOpcion = in.nextInt();
		String opcion = null;
		switch (numOpcion) {
		case 1:
			opcion = op1;
			break;
		case 2:
			opcion = op2;
		break;
		case 3:
			opcion = op3;
			break;
		case 4:
			opcion = op4;
		break;
		}
		return opcion;
	}
}


