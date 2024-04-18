package ar.edu.unju.fi.ejercicio14.main;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero entero comprendido entre 3 y 10:");
		int n = scanner.nextInt();
		if (n >= 3 && n <=10) {
		int[]q = new int [n];
		for (int k = 0; k < q.length; k++) {
			System.out.println("Ingrese " +n+ " numeros:");
			q[k] =scanner.nextInt();
			c = c + q[k];
			}
			System.out.println("Los valores ya fueron almacenados en el array:");
			for (int k = 0; k < q.length; k++) {
			System.out.println("Posicion del numero "+ q[k] +" es :[" +k+ "]" );
				}
		}
			else{
				System.out.println("El numero no esta entre 3 y 10");
			}
		System.out.println("La suma de los valores da:"+c);
		}
	}
