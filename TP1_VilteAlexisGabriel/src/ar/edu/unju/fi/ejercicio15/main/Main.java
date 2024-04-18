package ar.edu.unju.fi.ejercicio15.main;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int tam = 0 ;
        System.out.print("Ingrese un número entero comprendido entre 5 y 10: ");
        tam = scanner.nextInt();
        if (tam >= 5 && tam <=10) {
        String[] nombres = new String[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.next();
        }
        System.out.println("Contenido del array (comenzando desde el primer índice):");
        for (int i = 0; i < tam; i++) {
            System.out.println("Indice n°:" +i+ " "+nombres[i] );
        }
        System.out.println("Contenido del array (comenzando desde el último índice):");
        for (int i = tam - 1; i >= 0; i--) {
        	System.out.println("Indice n°:" +i+ " "+nombres[i] );
        }
        }
        else {
        	System.out.println("Debe un numero comprendido entre 5 y 10");
        }
        scanner.close();
    }
	}
