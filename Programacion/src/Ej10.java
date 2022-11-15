import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("ingrese un numero: ");
		num = teclado.nextInt();
		boolean esPrimo = false;
		int p_exceso = num + 1;
		while (!esPrimo) {
			boolean pruebaPrimo = true;
			for (int i = 2; i <= p_exceso - 1; i++) {
				if (p_exceso % i == 0) {
					pruebaPrimo = false;
				}
			}
			if (pruebaPrimo == true) {
				esPrimo = true;
			} else
				p_exceso = p_exceso + 1;

		}
		System.out.println("El numero " + p_exceso + " es un numero primo");
		teclado.close();
	}
}
