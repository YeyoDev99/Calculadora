package Logica;

public class Restar extends Calculadora{
	private double num1;
	private double num2;
	
	public Restar(double a, double b) {
		this.num1 = a;
		this.num2 = b;
	}
	@Override
	public double operacion() {
		double restar = num1 - num2;
		return restar;
	}

}