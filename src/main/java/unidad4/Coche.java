package unidad4;

import java.awt.Color;

public class Coche {

	

	public static int contador = 0;
	private Color color;
	private int puertas = 2;
	private String combustible;
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Coche.contador = contador;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPuertas() {
		return puertas;
	}

	public String getCombustible() {
		return combustible;
	}

	public static void main(String[] args) {
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		coche1.setColor(Color.RED);
		

	}
}