import java.util.Scanner;

public class Ej2 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int num, resultado, i = 1;
		System.out.print("Inserta un numero: ");
		num = teclado.nextInt();
		if (num >= 1 && 10 >= num) {
			System.out.println("TABLA DE MULTIPLICAR DE " + num);
			while (i <= 10) {
				resultado = num * i;
				System.out.println(num + "*" + i + "=" + resultado);
				i++;
			}
		} else
			System.out.println("No es posible hacer la tabla");
		teclado.close();
	}
}
