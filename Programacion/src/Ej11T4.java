import java.util.Scanner;

public class Ej11T4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase_original, frase, caracter, caracter_comparado;
		int num_caracteres = 0, frecuencia = 0, repeticion = 0;
		System.out.println("Escriba una frase de maxima longitud de 60 caracteres: ");
		frase_original = teclado.nextLine();
		while (frase_original.length() > 60) {
			System.out.println("Escriba una frase de maxima longitud de 60 caracteres: ");
			frase_original = teclado.nextLine();
		}
		frase = frase_original.replace(" ", "").toUpperCase();
		num_caracteres = frase.length();
		// System.out.print(frase);
		for (int i = 0; frase.length() > i; i++) {
			repeticion = 0;
			caracter = frase.substring(i, i + 1);
			for (int j = 0; frase.length() > j + 1; j++) {
				caracter_comparado = frase.substring(j, j + 1);
				if (caracter_comparado.compareTo(caracter) == 0) {
					repeticion++;
				}
				// System.out.println(repeticion);
			}
			frecuencia = repeticion / num_caracteres;
			System.out.println("El caracter: " + caracter + " aparece con una frecuencia de " + frecuencia
					+ " repeticion " + repeticion);
		}

	}

}
