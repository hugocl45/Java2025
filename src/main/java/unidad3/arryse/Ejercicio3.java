package unidad3.arryse;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\>\\>.+\\<\\<\\d+(,\\d+)?:\\d+");
		try (Scanner in = new Scanner(System.in)) {
			String linea;
			double total = 0;
			while(!(linea = in.nextLine()).equals("comprar")) {
				Matcher m = p.matcher(linea);
				if (m.matches()) {
					String mueble = m.group(1);
					double precio = Double.parseDouble(m.group(2));
					double cantidad = Double.parseDouble(m.group(3));
					total += precio * cantidad;
					System.out.printf("%s (%d), ");
					
				}
				System.out.printnl("importe total ");
				System.out.prinlnl(" ");
				
				
			}
		}
	}

}
