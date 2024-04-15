package ar.edu.unju.fi.ejercicio7.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;
public class Main {		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Ingrese el nombre del empleado:");
		        String nombre = scanner.nextLine();
		        System.out.println("Ingrese el legajo:");
		        int legajo = Integer.parseInt(scanner.nextLine());
		        System.out.println("Ingrese el salario:");
		        double salario = Double.parseDouble(scanner.nextLine());
		        Empleado empleado = new Empleado(nombre, legajo, salario);
		        System.out.println("Datos del empleado antes del aumento:");
		        empleado.mostrarDatos();
		        empleado.darAumento();
		        System.out.println("Datos del empleado después del aumento:");
		        empleado.mostrarDatos();

		        scanner.close();
		    

	}

}
