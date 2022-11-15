import java.util.Scanner;

public class Ej1T4 {
	public static void main(String[] args) {
		String frase;
		char partes=' ';
		String parte="";
		Scanner teclado=new Scanner(System.in);
		frase = teclado.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			partes = frase.charAt(i);
			parte+=String.valueOf(partes);
			System.out.println(parte);
		}
		teclado.close();
	}

}
