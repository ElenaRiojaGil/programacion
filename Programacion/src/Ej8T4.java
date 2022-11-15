import java.util.Scanner;

public class Ej8T4 {

	public static void main(String[] args) {
		String frase;
		char caracteres, caracter_cambiado;
		int posicion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase ");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			caracteres = frase.charAt(i);
			posicion = (int) caracteres + 3;
			caracter_cambiado = (char) posicion;
			System.out.print(caracter_cambiado);
		}

		teclado.close();
	}

}
