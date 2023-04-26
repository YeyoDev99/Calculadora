package Logica;

public class Multiplicar extends Calculadora {
	private double num1;
	private double num2;
	
	public Multiplicar(double a, double b) {
		this.num1 = a;
		this.num2 = b;
	}
	@Override
	public double operacion() {
		double multiplicar = num1 * num2;
		return multiplicar;
	}

}