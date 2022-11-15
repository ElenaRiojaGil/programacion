import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		int num, suma = 0, media, i = 0, mayor, menor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero ");
		num = teclado.nextInt();
		menor = mayor =media= num;
		if (num != 0) {
			do {

				suma += num;
				i++;

				if (num > mayor) {
					mayor = num;
				}
				if (num < menor && num != 0) {
					menor = num;
				}
				System.out.println("Introduzca un numero ");
				num = teclado.nextInt();
			} while (num != 0);
		media = suma / i;
		}
		System.out.println("La media de los numeros introducidos es: " + media);
		System.out.println("El mayor de los numeros introducidos es: " + mayor);
		System.out.print("El menor de los numeros introducidos es: " + menor);
		teclado.close();
	}
}
