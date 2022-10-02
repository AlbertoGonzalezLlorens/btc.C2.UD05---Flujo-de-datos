package ud05ej6;

import javax.swing.JOptionPane;

public class Ud05Ej6App {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
				
		String precio_string = JOptionPane.showInputDialog("Introduce el precio");
		double precio = Double.parseDouble(precio_string);
		double precio_final = precio*(1 + IVA);
		JOptionPane.showMessageDialog(null,"El precio final es "+precio_final);
	}

}
