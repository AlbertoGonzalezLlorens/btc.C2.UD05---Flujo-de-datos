package ud05ej13;

import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Introduce un valor entero");
		String b = JOptionPane.showInputDialog("Introduce un valor entero");
		int num_a = Integer.parseInt(a);
		int num_b = Integer.parseInt(b);
		double resultado;
		
		String simbolo = JOptionPane.showInputDialog("Introduce signo aritmetico");
		
		switch (simbolo) {
			case "+":
				resultado = num_a+num_b;
				System.out.println("El resultado de la suma es "+resultado);
				break;
			case "-":
				resultado = num_a-num_b;
				System.out.println("El resultado de la resta es "+resultado);
				break;
			case "*":
				resultado = num_a*num_b;
				System.out.println("El resultado de la multiplicación es "+resultado);
				break;
			case "/":
				/*La dvision de dos numero enteros siempre da resultado
				 * entero, por eso si se quiere el valor con decimales
				 * hay que castea las variables de int a double
				 */
				resultado = (double) num_a/ (double) num_b;
				System.out.println("El resultado de la división es "+resultado);
				break;
			case "^":
				resultado = Math.pow(num_a, num_b);
				System.out.println("El resultado de la potencia es "+resultado);
				break;
			case "%":
				resultado = num_a%num_b;
				System.out.println("El resultado del módulo es "+resultado);
				break;
			default:
				System.out.println("No ha introducido un signo aritmético correcto");
			
		}
		
		
	}

}
