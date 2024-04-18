package ar.edu.unju.fi.ejercicio12.model;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
    private Calendar fechaNac;
    private String nombre;
    public Persona(String nombre, Calendar fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    public int calcE() {
        Calendar ahora = GregorianCalendar.getInstance();
        int edad = ahora.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        if (ahora.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }
    public String determinarEstacion() {
        int mes = fechaNac.get(Calendar.MONTH);
        int dia = fechaNac.get(Calendar.DAY_OF_MONTH);

        if ((mes == 11 && dia >= 21) || (mes == 0) || (mes == 1) || (mes == 2 && dia <= 20)) {
            return "Verano";
        } else if ((mes == 2 && dia >= 21) || (mes >= 3 && mes <= 4) || (mes == 5 && dia <= 20)) {
            return "Otoño";
        } else if ((mes == 5 && dia >= 21) || (mes >= 6 && mes <= 7) || (mes == 8 && dia <= 20)) {
            return "Invierno";
        } else {
            return "Primavera";
        }
    }
    public String determinarSignoZodiaco() {
        int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
        int mes = fechaNac.get(Calendar.MONTH);
        if ((mes == 2 && dia >= 21) || (mes == 3 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 3 && dia >= 20) || (mes == 4 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 6 && dia >= 23) || (mes == 7 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 10 && dia >= 22) || (mes == 11 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 11 && dia >= 22) || (mes == 0 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 0 && dia >= 20) || (mes == 1 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    public String toString() {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Nombre: " + nombre + "\nFecha de nacimiento: " +sdf.format(fechaNac.getTime());
    }
}
