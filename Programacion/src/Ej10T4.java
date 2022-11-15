import java.util.Scanner;

public class Ej10T4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String codigo;
		int año, curso, codigos = 0, mujeres_primero = 0, hombres_primero = 0, mujeres_segundo = 0, hombres_segundo = 0;
		System.out.print("Introduzca los codigos de 8 caracteres: ");
		codigo = teclado.nextLine();
		if (codigo.equals("00000000") != true) {
			while (codigo.equals("00000000") != true) {
				año = Integer.parseInt(codigo.substring(0, 4));
				curso = Integer.parseInt(codigo.substring(5, 6));
				char hom_muj;
				hom_muj = codigo.charAt(4);
				// System.out.print(año + "\n" + hom_muj + "\n" + curso);
				if (codigo.length() == 8 && (hom_muj == 'H' || hom_muj == 'M') && (curso == 1 || curso == 2)
						&& (año >= 1990 && año <= 1995)) {
					if (curso == 1) {
						if (hom_muj == 'H') {
							hombres_primero++;
						} else
							mujeres_primero++;
					} else {
						if (hom_muj == 'H') {
							hombres_segundo++;
						} else
							mujeres_segundo++;
					}
					codigos++;
				}

				System.out.print("Introduzca los codigos de 8 caracteres: ");
				codigo = teclado.nextLine();
			}
		}

		System.out.print("Se han Introducido: " + codigos + " correctos\nEn primero hay:\nHombres: " + hombres_primero
				+ "\nMujeres: " + mujeres_primero + "\nEn segundo hay:\nHombres: " + hombres_segundo + "\nMujeres: "
				+ mujeres_segundo);
		teclado.close();

	}
}
