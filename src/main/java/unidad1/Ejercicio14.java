package unidad1;
//La distancia en kilómetros entre dos puntos, P1 y P2, 
//de la superficie terrestre se calcula mediante la
//expresión siguiente:
//𝑑𝑖𝑠𝑡𝑎𝑛𝑐𝑖𝑎 = 𝑟 ⋅ 𝑎𝑟𝑐𝑜𝑐𝑜𝑠𝑒𝑛𝑜(𝑠𝑒𝑛(𝑙𝑎𝑡1) ∙ 𝑠𝑒𝑛(𝑙𝑎𝑡2) 
//		+ 𝑐𝑜𝑠(𝑙𝑎𝑡1) ∙ 𝑐𝑜𝑠(𝑙𝑎𝑡2) ∙ 𝑐𝑜𝑠(𝑙𝑜𝑛2 − 𝑙𝑜𝑛1))
//donde:
//r es el radio de la tierra, cuyo valor es de 6.371,01 km.
//lat1 es la latitud de las coordenadas de P1
//lon1 es la longitud de las coordenadas de P1
//lat2 es la latitud de las coordenadas de P2
//lon2 es la longitud de las coordenadas de P2
//
//Escribe un programa Java que lea por teclado 
//cas coordenadas de cada punto y muestre la distancia
//entre ellos con una precisión de 3 decimales.
//
//Un poco de ayuda:
//	
//Para calcular el arcoseno, seno y coseno utiliza 
//los métodos Math.acos(valor),
//Math.sin(ángulo) y Math.cos(ángulo) 
//respectivamente, teniendo en cuenta que el valor del
//parámetro ángulo se debe expresar en radiantes.
//
//Para pasar grados a radianes puedes usar el método
//Math.toRadians(ángulo).
//Prueba el programa calculando la distancia 
//entre el IES Doctor Fleming y tu domicilio. Utiliza Google
//Maps para obtener las coordenadas de ambos 
//puntos y para verificar el resultado.

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		final double R = 6341.01d;
		double lat1, long1, lat2, long2, d;
		Scanner in = new Scanner(System.in);
		System.out.println("introduce latitud del primer punto");
		lat1 = in.nextDouble();
		System.out.println("introduce latitud del segundo punto");
		long1 = in.nextDouble();
		System.out.println("introduce latitud del primer punto");
		lat2 = in.nextDouble();
		System.out.println("introduce latitud del segundo punto");
		long2 = in.nextDouble();
		d = R * Math.acos(Math.sin(lat1) * Math.sin(lat2) * Math.sin(lat1) * Math.sin(lat2) * Math.cos(lat2) * Math.cos(long2 - long1));
		System.out.printf("Distancia entre los dos puntos: %f", d);
		in.close();
	}

}
