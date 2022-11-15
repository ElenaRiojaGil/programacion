import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		System.out.println("Elija el tipo de figura:");
		System.out.printf(" 1.Tringulo \n 2.Cuadrado \n 3.Rectangulo\n");
		Scanner teclado= new Scanner(System.in);
		int num;
		float altura,base,area;
		num=teclado.nextInt();
		switch(num) {
		case 1:
			System.out.printf(" 1.Tringulo: \n Introduzca la medida de la altura: ");
			altura=teclado.nextFloat();
			System.out.printf("\n Introduzca la medida de la base: ");
			base=teclado.nextFloat();
			area=(base*altura)/2;
			System.out.print(area);
			break;
		case 2:
			System.out.printf(" 2.Cudrado: \n Introduzca la medida de la altura: ");
			altura=teclado.nextFloat();
			System.out.printf("Introduzca la medida de la base: ");
			base=teclado.nextFloat();
			area=(base*altura);
			System.out.print(area);
			break;
		case 3:
			System.out.printf(" 3.Rectangulo: \n Introduzca la medida de la altura: ");
			altura=teclado.nextFloat();
			System.out.printf("Introduzca la medida de la base: ");
			base=teclado.nextFloat();
			area=(base*altura);
			System.out.print(area);
			break;
		}
		teclado.close();
	}

}
