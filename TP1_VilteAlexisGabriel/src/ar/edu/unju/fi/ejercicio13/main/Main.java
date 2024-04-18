package ar.edu.unju.fi.ejercicio13.main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		        int[] n = new int[8]; 
		        Scanner scanner = new Scanner(System.in);
		        for (int k = 0; k < n.length; k++) {
		            System.out.print("Ingrese el valor para la posición " + k + ": ");
		            n[k] = scanner.nextInt();
		        }
		        System.out.println("Valores almacenados en el array:");
		        for (int k = 0; k < n.length; k++) {
		            System.out.println("Índice es: [" + k + "] y el valor almacenado es: " + n[k]);
		        }
		        scanner.close();
		    }

}
