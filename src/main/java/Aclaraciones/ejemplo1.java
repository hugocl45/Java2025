package Aclaraciones;

public class ejemplo1 {

	public static void main(String[] args) {
	    int[][] arr = {
	        {35, 45, 55},
	        {65, 75},
	        {85},
	        {1, 3, 5, 7, 9}
	    };
	    for (int[] fila : arr) {
	        for (int n : fila) {
	            System.out.print(n + " ");
	        }
	        System.out.println();
	    }
	
	}
}
