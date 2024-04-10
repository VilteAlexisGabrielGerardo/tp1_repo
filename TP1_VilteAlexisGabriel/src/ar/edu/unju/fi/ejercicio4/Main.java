package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero del 0 al 10");
		int num = sc.nextInt();
		if (num >=0 && num <=10) {	
			int f = 1;
		    int contador = 1;
		        while (contador <= num) {
		            f *= contador;
		            System.out.println("factorial:"+f);
		            contador++;
		        }
		        // Mostrar el resultado por consola
		        System.out.println("El factorial de " + num + " es: " + f);
	}
		else {
				System.out.println("El numero esta fuera de rango");
		}
		sc.close();
		}
	}
