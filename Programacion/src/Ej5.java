import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		int num, suma = 0, i = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca un numero ");
			num = teclado.nextInt();
			suma += num;
			if(num!=0)
				i++;
		} while (num != 0);
		System.out.println("La suma de los numeros introducidos es: " + suma);
		System.out.print("El total de los numeros introducidos es: " + i);
		teclado.close();
	}
}
