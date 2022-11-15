import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Factorial de ");
		int numero = teclado.nextInt();

		int i = 1;
		int factorial = 1; // caso trivial, 0!, 1!=1;

		while (i <= numero) {
			factorial = factorial * i;
			i = i + 1;
		}
		System.out.println(numero + "!= " + factorial);
		teclado.close();
	}

}
