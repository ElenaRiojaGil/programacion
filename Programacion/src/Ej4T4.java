import java.util.Scanner;

public class Ej4T4 {

	public static void main(String[] args) {
		String frase;
		int menu;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba una frase ");
		frase = teclado.nextLine();
		System.out.println("Seleccione una opcion\n1 Mayusculas\n2 Minusculas");
		menu = teclado.nextInt();
		switch (menu) {
		case 1:
			System.out.print(frase.toUpperCase());
			break;
		case 2:
			System.out.print(frase.toLowerCase());
			break;
		default:
			System.out.print("Error");
		}

		teclado.close();
	}

}
