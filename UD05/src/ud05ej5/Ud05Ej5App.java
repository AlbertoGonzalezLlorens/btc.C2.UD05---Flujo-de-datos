package ud05ej5;

import java.util.Scanner;

public class Ud05Ej5App {

	public static void main(String[] args) {
		
		System.out.print("Introducir número: ");
		Scanner sc = new Scanner(System.in);
		String numero = sc.nextLine();
		sc.close();
		double n = Double.parseDouble(numero);
		double resto = n%2;
		
		if (resto==0) {
			System.out.println("Número divisible entre 2");
		} else {
			System.out.println("Número no divisible entre 2");
		}
	}

}
