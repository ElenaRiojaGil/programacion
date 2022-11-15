import java.util.Scanner;

public class Ej3T4 {
	public static void main(String[] args) {
		/*
		 * Programa que lea una frase y una palabra y que nos diga la posición de dicha
		 * palabra en la frase y si no la encuentra devuelva un cero.
		 */
		Scanner teclado = new Scanner(System.in);
		String insertaPalabra;
		String insertaFrase;

		System.out.println("Dime una frase");
		insertaFrase = teclado.nextLine();

		System.out.println("Dime una palabra");
		insertaPalabra = teclado.nextLine();

		System.out.println("Esa palabra está en la posición: " + posicionPalabra2(insertaFrase, insertaPalabra));
		teclado.close();
	}



	public static int posicionPalabra2(String frase, String palabra) {
		// contando espacios en blanco en la frase, podemos suponer en que palabra nos
		// encontramos
		int espaciosContados = 0, posicion=0;

		/*
		 * Recorremos cada caracter. Si es un espacio en blanco, lo contamos. Si es un
		 * caracter que coincide con el primer caracter de nuestra palabra, habrá que
		 * comprobar el resto de caracteres a ver si coinciden todos.
		 */
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' '|| frase.charAt(i) == ','||frase.charAt(i) == ':') // Es un espacio en blanco
				espaciosContados++;
			else {
				/*
				 * No es un espacio en blanco. Comprobamos si este caracter coincide con el
				 * primer caracter de nuestra palabra
				 */
				if (frase.charAt(i) == palabra.charAt(0)) {
					// ¡¡Coincide!!. Recorremos el resto de caracteres a ver si tenemos la palabra
					// completa.
					boolean coincide = true;
					for (int j = 0; j < palabra.length(); j++) {
						if (frase.charAt(i + j) != palabra.charAt(j))
							coincide = false; // ¡Oh! Un caracter no ha coincidido, no es nuestra palabra
					posicion++;
					}
					// Si coincide == true, nuestra búsqueda ha finalizado
					if (coincide)
						return posicion-1;
					// Si coincide == false, no hacemos nada, dejamos que el bucle siga buscando.
				}
			}
		}

		// Bucle no ha hecho return, porque no ha encontrado la palabra
		return 0;

	}
}
