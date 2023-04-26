package Logica;

public class Sumar extends Calculadora{
	private double num1;
	private double num2;
	
	public Sumar(double a, double b) {
		this.num1 = a;
		this.num2 = b;
	}
	@Override
	public double operacion() {
		double sumar = num1 + num2;
		return sumar;
	}

}
