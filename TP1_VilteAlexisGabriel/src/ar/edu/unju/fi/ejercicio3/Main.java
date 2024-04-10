package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int num = sc.nextInt();
		System.out.println("El numero ingresado es:"+num);
		if (num % 2 != 0) {
           
            System.out.println("El número es impar, el doble es: " + (num * 2));
        } else {
          
            System.out.println("El número es par, el triple es: " + (num * 3));
        }
        sc.close();
        }
	}

