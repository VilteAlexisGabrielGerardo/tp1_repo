package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 9");
		int num = sc.nextInt();
		if (num >=1 && num <=9) {	
			int resultado = 1;
		        for (int contador = 0 ; contador <=10; contador++) {
		            resultado= contador*num;
		            System.out.println(+num+"x"+contador+"="+resultado );
		        }
	}
		else {
				System.out.println("El numero esta fuera de rango");
		}
		sc.close();
	}

}
