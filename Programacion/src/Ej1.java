import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		int A, B, suma = 0, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce A: ");
		A = teclado.nextInt();
		System.out.println("Inserta B: ");
		B = teclado.nextInt();
		i = A + 1;
		while (i < B) {
			suma = i + suma;
			i++;

		}
		System.out.println(suma);
		teclado.close();
	}

}
