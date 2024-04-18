package ar.edu.unju.fi.ejercicio12.main;
import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Nombre de la persona:");
		        String nombre = scanner.nextLine();
		        System.out.println("Fecha de nacimiento en el formato (dd/mm/yyyy):");
		        String fechaNacimientoStr = scanner.nextLine();
		        String[] fechaParts = fechaNacimientoStr.split("/");
		        int dia = Integer.parseInt(fechaParts[0]);
		        int mes = Integer.parseInt(fechaParts[1]) - 1; 
		        int anio = Integer.parseInt(fechaParts[2]);
		        Calendar fechaNac = new GregorianCalendar(anio, mes, dia);
		        Persona persona = new Persona(nombre, fechaNac);
		        System.out.println(persona);
		        System.out.println("Edad: " + persona.calcE() + " años");
		        System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
		        System.out.println("Estación del año: " + persona.determinarEstacion());
		    }
	}

