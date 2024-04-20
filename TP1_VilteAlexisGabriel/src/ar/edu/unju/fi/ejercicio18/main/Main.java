package ar.edu.unju.fi.ejercicio18.main;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
	private static ArrayList<DestinoTuristico> destinos = new ArrayList<>();
    private static ArrayList<Pais> paises = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		        cargarPaises(); 
		        int opcion = 0;
		        do {
		            mostrarMenu();
		            try {
		                opcion = scanner.nextInt();
		                scanner.nextLine(); 
		                switch (opcion) {
		                    case 1:
		                        altaDestinoTuristico();
		                        break;
		                    case 2:
		                        mostrarDestinosTuristicos();
		                        break;
		                    case 3:
		                        modificarPaisDestinoTuristico();
		                        break;
		                    case 4:
		                        limpiarDestinosTuristicos();
		                        break;
		                    case 5:
		                        eliminarDestinoTuristico();
		                        break;
		                    case 6:
		                        mostrarDestinosOrdenadosPorNombre();
		                        break;
		                    case 7:
		                        mostrarTodosLosPaises();
		                        break;
		                    case 8:
		                        mostrarDestinosPorPais();
		                        break;
		                    case 9:
		                        System.out.println("Gracias por elegirnos.");
		                        break;
		                    default:
		                        System.out.println("Error, seleccione una de las opciones");
		                }
		            } 
		            catch (Exception e) {
		                System.out.println("Error: " + e.getMessage());
		            } finally {
		                System.out.println("Ha navegado por el programa con exito");
		            }
		        } while (opcion != 9);
		        scanner.close();
		    }
			private static void mostrarMenu() {
		    System.out.println("===== Menú de Opciones =====");
		    System.out.println("1 - Alta de destino turístico");
		    System.out.println("2 - Mostrar todos los destinos turísticos");
		    System.out.println("3 - Modificar el país de un destino turístico");
		    System.out.println("4 - Limpiar el ArrayList de destinos turísticos");
		    System.out.println("5 - Eliminar un destino turístico");
		    System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
		    System.out.println("7 - Mostrar todos los países");
		    System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
		    System.out.println("9 - Salir");
		    System.out.print("Seleccione una opción: ");
			}
			//Aca cargamos los paises que vamos a utilizar
		    private static void cargarPaises() {
		        Pais pais1 = new Pais("001", "Argentina");
		        Pais pais2 = new Pais("002", "Brasil");
		        Pais pais3 = new Pais("003", "Chile");

		        paises.add(pais1);
		        paises.add(pais2);
		        paises.add(pais3);
		    }
		    //Sirve para dar de alta los destinos seleccionados con uso de try-catch-finally
		    private static void altaDestinoTuristico() {
			    	System.out.println("*** Países ****");
		            mostrarTodosLosPaises();   
		    	try {
		            System.out.println("**** Alta de Destino Turístico ****");
		            System.out.print("Ingrese el código del destino turístico: ");
		            String codigoDestino = scanner.nextLine(); 
		            System.out.print("Ingrese el nombre del destino turístico: ");
		            String nombreDestino = scanner.nextLine();
		            System.out.print("Ingrese el precio del destino turístico: ");
		            double precioDestino = scanner.nextDouble();
		            scanner.nextLine(); 
		            System.out.print("Ingrese el código del país al que pertenece el destino turístico: ");
		            String codigoPais = scanner.nextLine();
		            Pais paisAsociado = null;
		            for (Pais pais : paises) {
		                if (pais.getCodigo().equals(codigoPais)) {
		                    paisAsociado = pais;
		                    break;
		                }
		            }
		            if (paisAsociado != null) {
		                System.out.print("Ingrese la cantidad de días del destino turístico: ");
		                int cantidadDias = scanner.nextInt();
		                scanner.nextLine(); 
		                DestinoTuristico nuevoDestino = new DestinoTuristico(codigoDestino, nombreDestino, precioDestino, paisAsociado, cantidadDias);
		                destinos.add(nuevoDestino);
		                System.out.println("Destino turístico agregado correctamente");
		            } else {
		                System.out.println("El código de país ingresado no corresponde a ningún país existente");
		            }
		        } 
		        catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		    private static void mostrarDestinosTuristicos() {
		    	System.out.println("**** Destinos Turísticos ****");
		        if (destinos.isEmpty()) {
		            System.out.println("No hay destinos turísticos registrados");
		        } else {
		            for (DestinoTuristico destino : destinos) {
		                System.out.println("País: " + destino.getPais().getNombre());
		                System.out.println("------------------------");
		            }
		        }
		    }
		    //Se modifica el destino turistico el cual se ingrese por consola
		    private static void modificarPaisDestinoTuristico() {
		    	 System.out.println("===== Modificar País de Destino Turístico =====");
		    	    System.out.print("Ingrese el código del destino turístico que desea modificar: ");
		    	    String codigoDestino = scanner.nextLine();
		    	    // Buscar el destino turístico correspondiente en la lista de destinos
		    	    DestinoTuristico destinoModificar = null;
		    	    for (DestinoTuristico destino : destinos) {
		    	        if (destino.getCodigo().equals(codigoDestino)) {
		    	            destinoModificar = destino;
		    	            break;
		    	        }
		    	    }
		    	    if (destinoModificar != null) {
		    	        System.out.print("Ingrese el nuevo código del país al que pertenece el destino turístico: ");
		    	        String codigoPais = scanner.nextLine();
		    	        Pais nuevoPais = null;
		    	        for (Pais pais : paises) {
		    	            if (pais.getCodigo().equals(codigoPais)) {
		    	                nuevoPais = pais;
		    	                break;
		    	            }
		    	        }
		    	        if (nuevoPais != null) {
		    	            destinoModificar.setPais(nuevoPais);
		    	            System.out.println("Destino turístico modificado correctamente.");
		    	        } else {
		    	            System.out.println("El código ingresado no corresponde a ningún país existente.");
		    	            }
		    }
		    }
		    private static void limpiarDestinosTuristicos() {
		        destinos.clear(); 
		        System.out.println("Se han limpiado todos los destinos turísticos correctamente.");
		    }
		    //Elimina el destino turistico que el usuario desee, con iterator
		    private static void eliminarDestinoTuristico() {
		    	 System.out.println("===== Eliminar Destino Turístico =====");
		    	    System.out.print("Ingrese el código del destino turístico que desea eliminar: ");
		    	    String codigoDestino = scanner.nextLine();
		    	    Iterator<DestinoTuristico> iterator = destinos.iterator();
		    	    while (iterator.hasNext()) {
		    	        DestinoTuristico destino = iterator.next();
		    	        if (destino.getCodigo().equals(codigoDestino)) {
		    	            iterator.remove();
		    	            System.out.println("Destino turístico eliminado correctamente.");
		    	            return; 
		    	        }
		    	    }
		    	    System.out.println("El código de destino turístico ingresado no corresponde a ningún destino existente.");
		    }
		    //Muestra los destinos en ordenados por nombre con el compare.
		    private static void mostrarDestinosOrdenadosPorNombre() {
		    	 System.out.println("===== Destinos Turísticos Ordenados por Nombre =====");
		    	    Collections.sort(destinos, new Comparator<DestinoTuristico>() {
		    	        @Override
		    	        public int compare(DestinoTuristico d1, DestinoTuristico d2) {
		    	            return d1.getNombre().compareTo(d2.getNombre());
		    	        }
		    	    }
		    	    )
		    	    ;
		    	    for (DestinoTuristico destino : destinos) {
		    	        System.out.println(destino.getCodigo() + ": " + destino.getNombre());
		    	    }
		    }
		    private static void mostrarTodosLosPaises() {
		    	System.out.println("===== Listado de Países =====");
		        for (Pais pais : paises) {
		            System.out.println("Código: " + pais.getCodigo() + ", Nombre: " + pais.getNombre());
		        }
		    }
		    private static void mostrarDestinosPorPais() {
		    	System.out.println("===== Mostrar Destinos Turísticos por País =====");
		        System.out.print("Ingrese el código del país para mostrar sus destinos turísticos: ");
		        String codigoPais = scanner.nextLine();
		        Pais paisSeleccionado = null;
		        for (Pais pais : paises) {
		            if (pais.getCodigo().equals(codigoPais)) {
		                paisSeleccionado = pais;
		                break;
		            }
		        }
		        if (paisSeleccionado != null) {
		            System.out.println("Destinos turísticos en " + paisSeleccionado.getNombre() + ":");
		            for (DestinoTuristico destino : destinos) {
		                if (destino.getPais().getCodigo().equals(codigoPais)) {
		                    System.out.println("Código: " + destino.getCodigo() + ", Nombre: " + destino.getNombre());
		                }
		            }
		        } else {
		            System.out.println("No se encontró ningún país con el código ingresado.");
		        }
		    }
	}

