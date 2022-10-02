package ud05ej4;

import java.util.Scanner;

public class Ud05Ej4App {

	public static void main(String[] args) {
		
		System.out.print("Introduce el valor del radio ");
		Scanner sc = new Scanner(System.in);
		String r_string = sc.nextLine();
		sc.close();
				
		double r = Double.parseDouble(r_string);
		double area;
		
		area = Math.PI*Math.pow(r, 2);
		System.out.println("El area de la circunferencia con radio "+r+" es de "+area);

	}

}
