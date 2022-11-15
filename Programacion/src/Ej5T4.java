import java.util.Scanner;

public class Ej5T4 {

	public static void main(String[] args) {
		String frase, frase_par = "", frase_impar = "";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una frase ");
		frase = teclado.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			if (i % 2 == 0) {
				frase_par = frase_par + frase.charAt(i);
			} else
				frase_impar = frase_impar + frase.charAt(i);
		}
		System.out.print("La cadena con los calacteres de posiciones pares es: " + frase_par
				+ "\nLa cadena con los caracteres de posiciones impares es: " + frase_impar);
		teclado.close();
	}

}
