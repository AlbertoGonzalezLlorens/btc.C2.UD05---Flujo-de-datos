package ud05ej11;

import javax.swing.JOptionPane;

public class Ud05Ej11 {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce día de la semana");
		dia = dia.toUpperCase();
		
		switch(dia) {
			case "LUNES":
				System.out.println("Es dia laboral");
				break;
			case "MARTES":
				System.out.println("Es dia laboral");
				break;
			case "MIERCOLES":
				System.out.println("Es dia laboral");
				break;
			case "JUEVES":
				System.out.println("Es dia laboral");
				break;
			case "VIERNES":
				System.out.println("Es dia laboral");
				break;
			case "SABADO":
				System.out.println("No es dia laboral");
				break;
			case "DOMINGO":
				System.out.println("No es dia laboral");
				break;
			default:
				System.out.println("No es un dia de la semana o esta mal escrito");
		
		}
		

	}

}
