package Unidad3Arryse;

import java.util.Random;

public class Ejercicio10 {

	static int[] sumarFilas(int[][] m) {
		int[] sumaFilas = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			int suma = 0;
			for (int j = 0; j < m[i].length; j++) {
				suma += m[i][j];
			}
			sumaFilas[i] = suma;

		}
		return sumaFilas;
	}

	static int[] sumarColumnas(int[][] m) {
		int columnas = m[0].length;
		int[] sumaColumnas = new int[columnas];

		for (int j = 0; j < columnas; j++) {
			int suma = 0;
			for (int i = 0; i < m.length; i++) {
				suma += m[i][j];
			}
			sumaColumnas[j] = suma;
		}
		return sumaColumnas;
	}

	static void mostrarTodo(int[][] m, int[] sumaFilas, int[] sumaColumnas) {

	}

	public static void main(String[] args) {
		Random r = new Random();
		int filas = r.nextInt(19) + 2;
		int columnas = r.nextInt(19) + 2;
		int[][] m = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				m[i][j] = r.nextInt(10);
			}
		}
	}
}
