import java.util.Scanner;

public class Ej7T4 {

	public static void main(String[] args) {
		char caracter;
		int minuscula = 0, mayuscula = 0, numeros=0;
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba una frase de no mas de 80 caracteres");
		frase = teclado.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			if (caracter >= 'A' && caracter <= 'Z') {
				mayuscula++;
			} else if (caracter >= 'a' && caracter <= 'z') {
				minuscula++;

			}else if(caracter>='0' && caracter<='9') {
				numeros++;
			}
		}
		System.out.print("Hay " + mayuscula + " mayusculas\nHay " + minuscula + " minusculas\nHay "+numeros+" caracteres numericos");
		teclado.close();
	}

}
