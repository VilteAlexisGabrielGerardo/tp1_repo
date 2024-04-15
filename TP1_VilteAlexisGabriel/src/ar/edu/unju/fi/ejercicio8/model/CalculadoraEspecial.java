package ar.edu.unju.fi.ejercicio8.model;
public class CalculadoraEspecial {
	    private int n;
	    public CalculadoraEspecial() {
	    }
	    public CalculadoraEspecial(int n) {
	        this.n = n;
	    }
	    public double calcularSumatoria() {
	        double sumatoria = 0;
	        for (int k = 1; k <= n; k++) {
	            sumatoria += (k * (k + 1)) / Math.pow(2, k);
	        }
	        return sumatoria;
	    }
	    public double calcularProductoria() {
	        double productoria = 1;
	        for (int k = 1; k <= n; k++) {
	            productoria *= (k * (k + 4));
	        }
	        return productoria;
	    }
	    public int gettersN() {
	        return n;
	    }

	    public void settersN(int n) {
	        this.n = n;
	    }
	}


