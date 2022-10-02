package ud05ej10;

import java.util.Scanner; 

public class Ud05Ej10App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Especifica numero de ventas (ha de ser un valor entero): ");
		String num_ventas_string = sc.nextLine();
		
		
		int num_ventas = Integer.parseInt(num_ventas_string);
		double val_suma = 0;
		
		for (int i=0; i<num_ventas;i++) {
			System.out.print("introduce valor de la venta "+(i+1)+":");
			String val_venta = sc.nextLine();
			double val_venta_num = Double.parseDouble(val_venta);
			val_suma = val_suma + val_venta_num;
		}
		
		System.out.println("El valor de la suma de todas las ventas es: "+val_suma);
		sc.close();
		
	}

}
