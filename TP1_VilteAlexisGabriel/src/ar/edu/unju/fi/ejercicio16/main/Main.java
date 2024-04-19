package ar.edu.unju.fi.ejercicio16.main;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String[] nombre = new String[5];
		Scanner scanner = new Scanner(System.in);
		//Ingreso de los nombres
		for (int i=0 ; i < 5; i ++) {
			System.out.println("Ingrese 5 nombres:");
			nombre[i] = scanner.next();	
	}	
		//Muestra de valores guardados en el array 
		int i=0;
		while (i < 5) {
			System.out.println("["+i+"]"+nombre[i]);
		i++;
		}
		//Aca mostramos el tamaño del array
		System.out.println("El tamanio del array es:" +nombre.length);
		//Aca pedimos que ingrese el indice del elemento que queres eliminar, que de estar entre 0 y 4
		byte indice;
        do {
            System.out.print("Ingrese el índice del elemento a eliminar entre (0-" + (nombre.length - 1) + "): ");
           indice = scanner.nextByte();
        } while (indice < 0 || indice >= nombre.length);
        
        // Metodo para eliminar el array
        for (i = indice; i < nombre.length - 1; i++) {
            nombre[i]= nombre[i+1];
        }
        nombre[nombre.length-1] = ""; 
        //Mostramos los nombres sin el valor que acabamos de eliminar
        System.out.println("\nNombres almacenados en el arreglo después de eliminar:");
        for (i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }
		scanner.close();
	} 
}

