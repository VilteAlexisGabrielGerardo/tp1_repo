package ar.edu.unju.fi.ejercicio17.main;
import ar.edu.unju.fi.ejercicio17.model.Jugador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
	private static ArrayList<Jugador> jugadores = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		    //Menu de opciones con switch, para elegir una opcion en cada caso    
			byte opcion;
		        do {
		            mostrarMenu();
		            opcion = scanner.nextByte();
		            scanner.nextLine(); 
		            //Uso de excepciones en el menu
		            try {
		                switch (opcion) {
		                    case 1:
		                        altaJugador();
		                        break;
		                    case 2:
		                        mostrarDatosJugador();
		                        break;
		                    case 3:
		                        mostrarJugadoresOrdenadosPorApellido();
		                        break;
		                    case 4:
		                        modificarDatosJugador();
		                        break;
		                    case 5:
		                        eliminarJugador();
		                        break;
		                    case 6:
		                        mostrarCantidadTotalJugadores();
		                        break;
		                    case 7:
		                        mostrarCantidadJugadoresNacionalidad();
		                        break;
		                    case 8:
		                        System.out.println("Saliendo del programa...");
		                        break;
		                    default:
		                        System.out.println("Opción inválida");
		                }
		            } catch (Exception e) {
		                System.out.println("Error: " + e.getMessage());
		            } finally {
		                
		            	System.out.println("Se ejecuto correctamente la opcion elegida");
		            }
		        } while (opcion != 8);
		        scanner.close();
		    }
		//Menu el cual ve el usuario, para seleccionar la opcion que desee.
		    private static void mostrarMenu() {
		        System.out.println("***** Menú *****");
		        System.out.println("1 - Alta de jugador");
		        System.out.println("2 - Mostrar los datos del jugador");
		        System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
		        System.out.println("4 - Modificar los datos de un jugador");
		        System.out.println("5 - Eliminar un jugador");
		        System.out.println("6 - Mostrar la cantidad total de jugadores");
		        System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
		        System.out.println("8 - Salir");
		        System.out.println("----------------");
		        System.out.print("Seeleccione una: ");
		    }
		   // El alta del jugador pidiendo que ingrese los datos y guardandolos en un array list
		    private static void altaJugador() {
		    	 System.out.println("Ingrese los datos del jugador:");
		         System.out.print("El nombre del jugador es: ");
		         String nombre = scanner.nextLine();
		         System.out.print("El apellido del jugador es: ");
		         String apellido = scanner.nextLine();
		         System.out.print("La fecha de naciemiento del jugador es:(YYYY-MM-DD): ");
		         String fechaNacimientoStr = scanner.nextLine();
		         LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
		         System.out.print("La nacionalidad del jugador es: ");
		         String nacionalidad = scanner.nextLine();
		         System.out.print("La estatura: ");
		         double estatura = scanner.nextDouble();
		         System.out.print("El peso: ");
		         double peso = scanner.nextDouble();
		         scanner.nextLine(); 
		         System.out.print("La posición en la que juega(delantero, medio, defensa, arquero): ");
		         String posicion = scanner.nextLine();
		         // Con este codigo creamos un nuevo jugador y lo agregamos a la lista a la lista
		         Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
		         jugadores.add(jugador);
		     }	
		    //Muestra los datos de los jugadores seleccionados mediante su nombre y su apellido
		    private static void mostrarDatosJugador() {
		    	System.out.println("Ingrese el nombre del jugador: ");
		        String nombre = scanner.nextLine();
		        System.out.println("Ingrese el apellido: ");
		        String apellido = scanner.nextLine();
		        //Busca el jugador por nombre y apellido y retornamos los datos
		        for (Jugador jugador : jugadores) {
		            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
		                System.out.println("Nombre: " + jugador.getNombre());
		                System.out.println("Apellido: " + jugador.getApellido());
		                System.out.println("Fecha de Nacimiento: " + jugador.getFechanac());
		                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
		                System.out.println("Estatura: " + jugador.getEstatura());
		                System.out.println("Peso: " + jugador.getPeso());
		                System.out.println("Posición: " + jugador.getPosicion());
		                System.out.println("Edad: " + jugador.calcularEdad());
		                return;
		        }
		            else {
		            	System.out.println("Jugador no encontrado");
		            }
		            }
		    }
		    //Aqui mostramos los jugadores ordenados por apellido
		    private static void mostrarJugadoresOrdenadosPorApellido() {
		    	// Copiamos la lista de jugadores para no modificar la lista que contiene los datos originales
		        ArrayList<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
		        Collections.sort(jugadoresOrdenados, new Comparator<Jugador>() {
		            @Override
		            public int compare(Jugador jugador1, Jugador jugador2) {
		                return jugador1.getApellido().compareTo(jugador2.getApellido());
		            }
		        });
		        System.out.println("Jugadores ordenados por apellido:");
		        for (Jugador jugador : jugadoresOrdenados) {
		            System.out.println(jugador);
		        }
		    }
		    /*El siguiente codigo modifica con el nombre y el apellido ingresado por teclado los valores 
		    ya existente que estas guardados en el arraylist*/
		    private static void modificarDatosJugador() {
		    	System.out.println("Ingrese el nombre del jugador: ");
		        String nombre = scanner.nextLine();
		        System.out.println("Ingrese el apellido del jugador: ");
		        String apellido = scanner.nextLine();
		        boolean encontrado = false;
		        for (Jugador jugador : jugadores) {
		            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
		                encontrado = true;
		                System.out.println("Ingrese los nuevos datos del jugador:");
		                System.out.print("Nuevo nombre: ");
		                String nNombre = scanner.nextLine();
		                System.out.print("Nuevo apellido: ");
		                String nApellido = scanner.nextLine();
		                System.out.print("Nueva fecha de nacimiento (YYYY-MM-DD): ");
		                String nFechaNacimientoStr = scanner.nextLine();
		                LocalDate nuevaFechaNacimiento = LocalDate.parse(nFechaNacimientoStr);
		                System.out.print("Nueva nacionalidad: ");
		                String nNacionalidad = scanner.nextLine();
		                System.out.print("Nueva estatura: ");
		                double nEstatura = scanner.nextDouble();
		                System.out.print("Nuevo peso: ");
		                double nPeso = scanner.nextDouble();
		                scanner.nextLine();
		                System.out.print("Nueva posición (delantero, medio, defensa, arquero): ");
		                String nPosicion = scanner.nextLine();
		                jugador.setNombre(nNombre);
		                jugador.setApellido(nApellido);
		                jugador.setFechaNac(nuevaFechaNacimiento);
		                jugador.setNacionalidad(nNacionalidad);
		                jugador.setEstatura(nEstatura);
		                jugador.setPeso(nPeso);
		                jugador.setPosicion(nPosicion);
		                System.out.println("Datos del jugador actualizados correctamente");
		                break;
		            }
		        }

		        if (!encontrado) {
		            System.out.println("Jugador no encontrado");
		        }
		    }
		    //Elimina los datos del jugador mediante el nombre y el apellido ingreado por teclado usando iterator
		    private static void eliminarJugador() {
		    	 System.out.println("Ingrese el nombre del jugador a eliminar: ");
		    	    String nombre = scanner.nextLine();
		    	    System.out.println("Ingrese el apellido del jugador a eliminar: ");
		    	    String apellido = scanner.nextLine();
		    	    boolean encontrado = false;
		    	    Iterator<Jugador> iterator = jugadores.iterator();
		    	    while (iterator.hasNext()) {
		    	        Jugador jugador = iterator.next();
		    	        if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
		    	            encontrado = true;
		    	            iterator.remove();
		    	            System.out.println("Jugador eliminado correctamente.");
		    	            break;
		    	        }
		    	    }
		    	    if (!encontrado) {
		    	        System.out.println("Jugador no encontrado.");
		    	    }
		    }
		    private static void mostrarCantidadTotalJugadores() {
		    	int cantidadTotalJugadores = jugadores.size();
		        System.out.println("La cantidad total de jugadores es: " + cantidadTotalJugadores);
		    }
		    private static void mostrarCantidadJugadoresNacionalidad() {
		    	System.out.println("Ingrese la nacionalidad:");
		        String nacionalidad = scanner.nextLine();
		        int cantidadJugadores = 0;
		        for (Jugador jugador : jugadores) {
		            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
		                cantidadJugadores++;
		            }
		        }
		        System.out.println("La cantidad de jugadores que tienen la nacionalidad:" + nacionalidad + " son: " + cantidadJugadores);
		    }
		 
}

