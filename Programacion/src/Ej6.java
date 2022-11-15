import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		int num, suma_par = 0, suma_impar = 0, i = 1;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca un numero ");
			num = teclado.nextInt();
			if (i % 2 == 0) {
				suma_par += num;

			} else
				suma_impar += num;
			i++;

		} while (num != 0);
		System.out.println("La suma de los numeros pares introducidos es: " + suma_par);
		System.out.println("La suma de los numeros impares introducidos es: " + suma_impar);
		teclado.close();

	}

}
