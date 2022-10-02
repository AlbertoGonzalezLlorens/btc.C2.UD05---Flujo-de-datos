package ud05ej12;

import java.util.Scanner;

public class Ud05Ej12App {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la contraseña: ");
		String password = sc.nextLine();

		
		for (int i=0; i<3; i++) {
			
			System.out.print("Introduzca la contraseña: ");
			String password_intento = sc.nextLine();
			
			if (password.equals(password_intento)) {
				/*Al comparar Strings mejor usar la funcion .equals
				 *  El comparador == da error, porque intenta comparar
				 *  dos valores de objetos distintos que se guardan
				 *  en lugares diferente de memoria
				 *  la funcion .equals unicamente compara el contenido
				 *  de la cadena
				 * */
				System.out.println("Enhorabuena");
				break;
			} else {
				System.out.println("Contraseña incorrecta, le quedan " + (3-(i+1)) + " intentos");
			}
		}	
		sc.close();
	}

}
