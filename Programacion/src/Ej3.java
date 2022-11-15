import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i = 2, resultado, resto;
		System.out.print("Inserta una numero: ");
		num = teclado.nextInt();
		while (num != i && num > i) {
			resto = num % i;
			resultado = num / i;
			if (resto == 0) {
				System.out.println(num + "/" + i + "=" + resultado);
				System.out.println("El numero " + i + " es un divisor propio");
			}
			i++;
		}if(num==3 || num==2 || num==1)
			System.out.println("El numero " + num + " no tiene divisor propio");
		teclado.close();
	}
}
