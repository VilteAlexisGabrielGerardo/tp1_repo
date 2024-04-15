package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;
import java.time.Period;
public class Persona {
	    private String dni;
	    private String nombre;
	    private LocalDate fechaNacimiento;
	    private String provincia;

	    public Persona() {
	        this.provincia = "San Salvador de Jujuy, Jujuy";
	    }

	    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = "Jujuy";
	    }

	    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = provincia;
	    }

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public LocalDate getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(LocalDate fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public int calcularEdad() {
	        LocalDate fechaActual = LocalDate.now();
	        return Period.between(fechaNacimiento, fechaActual).getYears();
	    }

	    public boolean esMayorDeEdad() {
	        return calcularEdad() >= 18;
	    }

	    public void mostrarDatos() {
	        System.out.println("DNI: " + dni);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
	        System.out.println("Provincia: " + provincia);
	        System.out.println("Edad: " + calcularEdad());
	        if (esMayorDeEdad()) {
	            System.out.println("La persona es mayor de edad");
	        } else {
	            System.out.println("La persona no es mayor de edad");
	        }
	    }
	}


