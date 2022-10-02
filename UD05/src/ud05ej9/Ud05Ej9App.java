package ud05ej9;

public class Ud05Ej9App {

	public static void main(String[] args) {
		for (int i=1; i<101; i++) {
			double div_dos = i%2;
			double div_tres = i%3;
			
			if (div_dos==0 && div_tres==0) {
				System.out.println(i);
			}
						
		}

	}

}
