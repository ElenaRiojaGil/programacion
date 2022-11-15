import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int numero = teclado.nextInt();

		boolean encontrado = false;
		int divisor = 2;

		while (!encontrado && divisor <= numero / 2) {
			encontrado = numero % divisor == 0;
			divisor++;
		}
		if (encontrado)
			System.out.println("No es primo");
		else
			System.out.println("Es primo");

		teclado.close();
	}

}
