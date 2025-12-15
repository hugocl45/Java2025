package Unidad3Arryse;

import java.util.Arrays;
import java.util.Random;

public class MetodosOdenacion {

	private static int aux;

	static void insercionDirecta(long[] v) {
		for (int i = 1; i < v.length; i++) {
			int j = 0;
			while (j < i && v[i] >= v[j])
				j++;
			if (j < i) {
				long aux = v[i];
				for (int k = i - 1; k >= j; k--)
					v[k + 1] = v[k];
				v[j] = (int) aux;
			}
		}
	}

	static void seleccionDirecta(int[] v) {
		int aux = 0, min;
		for (int i = 0; i < v.length; i++) {
			min = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[min]) {
					min = j;
				}
			}
			if (min != i) {
				aux = v[min];
				v[min] = v[i];
				v[i] = aux;
			}
		}
	}

	static void intercambioDirecto(long[] v) {
		for (int indice = 0; indice < v.length; indice++) {
			for (int b = v.length - 1; b > indice; b--) {
				if (v[b] < v[b - 1]) {
					long temp = v[b];
					v[b] = v[b - 1];
					v[b - 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		long[] v = { 44, 55, 12, 42, 94, 18, 6, 67 };
		insercionDirecta(v);
		System.out.println(Arrays.toString(v));

		Random r = new Random();
		long[] v2 = new long[100000000];
		for (int i = 0; i < v2.length; i++)
			v2[i] = r.nextLong();
		System.out.println("Ordenando");
		long t0 = System.nanoTime();
		Arrays.sort(v2);
		long t1 = System.nanoTime();
		System.out.println(t1 - t0);

	}

}
