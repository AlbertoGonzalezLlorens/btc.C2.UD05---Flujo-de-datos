package ud05;

//import javax.swing.JOptionPane;

public class Ud05Ej1App {

	public static void main(String[] args) {
		/*String a_texto = JOptionPane.showInputDialog("Introducir valor para a");
		String b_texto = JOptionPane.showInputDialog("Introducir valor para b");
		int a = Integer.parseInt(a_texto);
		int b = Integer.parseInt(b_texto); */
		
		int a = 10;
		int b = 20;
		
		if (a>b) {
			System.out.println("a es mayor que b");
		} else if(a==b){
			System.out.println("a es igual a b");
		} else {
			System.out.println("a es menor que b");
		}
			
	}

}
