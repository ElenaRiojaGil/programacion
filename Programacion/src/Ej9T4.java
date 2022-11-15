import java.util.Scanner;

public class Ej9T4 {

	public static void main(String[] args) {
		String frase;
		char caracteres, caracter_cambiado;
		int posicion, desplaza;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase ");
		frase = teclado.nextLine();
		System.out.println("Introduce un numero del 1 al 10 ");
		desplaza=teclado.nextInt();
		if(desplaza<0 && desplaza>10) {
			System.out.println("Vuelve a introducir un numero del 1 al 10 ");
			desplaza=teclado.nextInt();

		}
		frase = frase.toUpperCase();
		for (int i = 0; i < frase.length(); i++) {
			caracteres = frase.charAt(i);
			posicion = (int) caracteres + desplaza;
			caracter_cambiado = (char) posicion;
			System.out.print(caracter_cambiado);
		}

		teclado.close();
	}

}
