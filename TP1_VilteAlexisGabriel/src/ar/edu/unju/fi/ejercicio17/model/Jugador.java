package ar.edu.unju.fi.ejercicio17.model;
import java.time.LocalDate;
public class Jugador {
	    private String nombre;
	    private String apellido;
	    private LocalDate fechanac;
	    private String nacionalidad;
	    private double estatura;
	    private double peso;
	    private String posicion;
	    public Jugador(String nombre, String apellido, LocalDate fechanac, String nacionalidad,
                double estatura, double peso, String posicion) {
	    	this.nombre = nombre;
	    	this.apellido = apellido;
	    	this.fechanac = fechanac;
	    	this.nacionalidad = nacionalidad;
	    	this.estatura = estatura;
	    	this.peso = peso;
	    	this.posicion = posicion;
 }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public LocalDate getFechanac() {
	        return fechanac;
	    }

	    public void setFechaNac(LocalDate fechanac) {
	        this.fechanac = fechanac;
	    }

	    public String getNacionalidad() {
	        return nacionalidad;
	    }

	    public void setNacionalidad(String nacionalidad) {
	        this.nacionalidad = nacionalidad;
	    }

	    public double getEstatura() {
	        return estatura;
	    }

	    public void setEstatura(double estatura) {
	        this.estatura = estatura;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public String getPosicion() {
	        return posicion;
	    }

	    public void setPosicion(String posicion) {
	        this.posicion = posicion;
	    }
	    public int calcularEdad() {
	        LocalDate fechaActual = LocalDate.now();
	        return fechaActual.getYear() - fechanac.getYear();
	    }
	    @Override
	    public String toString() {
	        return "Apellido del jugador:"+ apellido;
	    }
	    
}