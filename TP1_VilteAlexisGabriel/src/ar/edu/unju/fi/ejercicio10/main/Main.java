package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;
public class Main {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        for (int k = 1; k <= 3; k++) {
		            System.out.println("Ingrese los datos para la pizza " + k + ":");
		            Pizza pizza = new Pizza();
		            System.out.print("Ingrese el diámetro (20, 30, 40): ");
		            int diametro = Integer.parseInt(scanner.nextLine());
		            pizza.setDiametro(diametro);
		            System.out.print("¿Tiene ingredientes especiales? (true/false): ");
		            boolean ingredientesEspeciales = Boolean.parseBoolean(scanner.nextLine());
		            pizza.setIngredientesEspeciales(ingredientesEspeciales);
		            pizza.calcularPrecio();
		            pizza.calcularArea();
		            System.out.println("Datos de la pizza " + k + ":");
		            System.out.println("Diametro: " + pizza.getDiametro() + " cm");
		            System.out.println("Precio: $" + pizza.getPrecio());
		            System.out.println("Área: " + pizza.getArea() + " cm²");
		            System.out.println();
		        }

		        scanner.close();
		    }


}
