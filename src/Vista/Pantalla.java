package Vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Logica.Calculadora;
import Logica.Dividir;
import Logica.Multiplicar;
import Logica.Restar;
import Logica.Sumar;

public class Pantalla {

	private JFrame frame;
	private JTextField txtNum1;
	private JTextField txtNum2;
	Calculadora calculadora;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla window = new Pantalla();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(159, 69, 245, 20);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Calculadora");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblTitulo.setBounds(172, 24, 139, 20);
		frame.getContentPane().add(lblTitulo);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(159, 100, 245, 20);
		frame.getContentPane().add(txtNum2);
		
		JLabel lblNewLabel = new JLabel("Digite el primer número");
		lblNewLabel.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 72, 139, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite el segundo número");
		lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 103, 139, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(183, 184, 95, 14);
		frame.getContentPane().add(lblResultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//realiza la suma de dos números
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtNum1.getText());
					num2 = Double.parseDouble(txtNum2.getText());
					calculadora = new Sumar(num1, num2);
					double suma = calculadora.operacion();
					lblResultado.setText(Double.toString(suma));
				}
				catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Solo se aceptan números");

				}
			}
		});
		btnSumar.setBounds(10, 140, 89, 23);
		frame.getContentPane().add(btnSumar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//realiza la division de dos números
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtNum1.getText());
					num2 = Double.parseDouble(txtNum2.getText());
					if (num2 != 0) {
						calculadora = new Dividir(num1, num2);
						double division = calculadora.operacion();
						lblResultado.setText(Double.toString(division));
					}
					else {
						JOptionPane.showMessageDialog(null, "No se puede realizar division por 0");

					}
					
				}
				catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Solo se aceptan números");
				}
			}
		});
		btnDividir.setBounds(109, 140, 89, 23);
		frame.getContentPane().add(btnDividir);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//realiza la resta de dos números
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtNum1.getText());
					num2 = Double.parseDouble(txtNum2.getText());
					calculadora = new Restar(num1, num2);
					double resta = calculadora.operacion();
					lblResultado.setText(Double.toString(resta));
				}
				catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Solo se aceptan números");
				}
			}
		});
		btnRestar.setBounds(208, 140, 89, 23);
		frame.getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//realiza la multiplicacion de dos números
				double num1;
				double num2;
				try {
					num1 = Double.parseDouble(txtNum1.getText());
					num2 = Double.parseDouble(txtNum2.getText());
					calculadora = new Multiplicar(num1, num2);
					double multiplicacion = calculadora.operacion();
					lblResultado.setText(Double.toString(multiplicacion));
				}
				catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Solo se aceptan números");

				}

			}
		});
		btnMultiplicar.setBounds(307, 140, 97, 23);
		frame.getContentPane().add(btnMultiplicar);
		
		JLabel lblNewLabel_2 = new JLabel("El resultado de la operacion es:");
		lblNewLabel_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 184, 216, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnSalida = new JButton("Salir");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalida.setBounds(183, 227, 89, 23);
		frame.getContentPane().add(btnSalida);
		
		
	}
}
