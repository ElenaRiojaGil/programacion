import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i = 1, resto,suma=0;
		System.out.print("Inserta una numero: ");
		num = teclado.nextInt();
		while (num != i && num > i) {
			resto = num % i;
			if (resto == 0) {
				suma+=i;
			}
	
			i++;
		}if(suma==num) {
			System.out.print("el numero es perfecto");
		}else
			System.out.print("el numero no es perfecto");
		teclado.close();
	}
	

}
