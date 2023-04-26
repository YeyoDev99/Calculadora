package Logica;

public class Dividir  extends Calculadora{
	private double num1;
	private double num2;
	
	public Dividir(double a, double b) {
		this.num1 = a;
		this.num2 = b;
	}
	@Override
	public double operacion() {
		double dividir = num1 / num2;
		return dividir;
	}

}