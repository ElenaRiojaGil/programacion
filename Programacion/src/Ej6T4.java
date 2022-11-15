import java.util.Scanner;

public class Ej6T4 {

	public static void main(String[] args) {
		char caracter;
		int vocal = 0, consonante = 0, numeros=0;
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba una frase de no mas de 80 caracteres");
		frase = teclado.nextLine();
		frase=frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			caracter = frase.charAt(i);
			if (caracter == 'A' || caracter == 'E' || caracter=='I'|| caracter=='O' || caracter=='U') {
				vocal++;
			} else if (caracter >= 'A' && caracter <= 'Z') {
				consonante++;

			}else if(caracter>='0' && caracter<='9') {
				numeros++;
			}
		}
		System.out.print("Hay " + vocal + " vocales\nHay " + consonante + " consonantes\nHay "+numeros+" caracteres numéricos");
		teclado.close();
	}

}
