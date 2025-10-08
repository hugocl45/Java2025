package Unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Escribe un programa que lea por teclado las coordenadas
//en el plano de los centros de dos
//circunferencias y la longitud de sus respectivos radios.
//Finalmente, se mostrará en la consola si ambas
//son exteriores, tangentes exteriores, secantes, 
//tangentes interiores, interiores o concéntricas. Cada
//caso se determina de la forma siguiente:



public class Ejercicio1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	       BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		   System.out.print("Coordenada x del centro de la primera circunferencia: ");
	       float x1 = Float.parseFloat(in.readLine());
	       System.out.print("Coordenada y del centro de la primera circunferencia: ");
	       float y1 = Float.parseFloat(in.readLine());
	       System.out.print("Radio de la primera circunferencia: ");
	       float r1 = Float.parseFloat(in.readLine());
	       System.out.print("Coordenada x del centro de la segunda circunferencia: ");
	       float x2 = Float.parseFloat(in.readLine());
	       System.out.print("Coordenada y del centro de la segunda circunferencia: ");
	       float y2 = Float.parseFloat(in.readLine());
	       System.out.print("Radio de la segunda circunferencia: ");
	       float r2 = Float.parseFloat(in.readLine());
//	       Point2D.float c1 = new Point2D.float(x1, y1);
//	       Point2D.float c1 = new Point2D.float(x2, y2);
//	        float sCentros = (float) c1.distance(c2);
	       
	       float dCentros = (float) Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2, y1));
           float sumRadios = r1 +r2;
           float difRadios = Marh.abs(r1 - r2);
           
	       if (dCentros > sumRadios) {
	    	   System.out.println("Exterioeres");
	       }
	       else {
	    	   if (dCentros > sumRadios) {
	    		   System.out.println("")
	    	   }
	       }
	    	   else
	    		   if

	}
	        {
	       }
  
