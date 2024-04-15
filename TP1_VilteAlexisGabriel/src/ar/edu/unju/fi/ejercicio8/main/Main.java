package ar.edu.unju.fi.ejercicio8.main;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Valor de n:");
		        int n = scanner.nextInt();
		        CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
		        System.out.println("Sumatoria es: " + calculadora.calcularSumatoria());
		        System.out.println("Productoria es: " + calculadora.calcularProductoria());
		        scanner.close();
		    }
	

}
