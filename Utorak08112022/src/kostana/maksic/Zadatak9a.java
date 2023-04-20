package kostana.maksic;

import java.util.Scanner;

public class Zadatak9a {

	public static void main(String[] args) {
		// Sastaviti algoritam i napisati program za izračunavanje standardne devijacije

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		double x[] = new double[100];
		System.out.println("Unesite članove niza:");

		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextDouble();
		}
		double suma1 = 0, suma2 = 0;
		double s;
		for (int i = 1; i <= n; i++) {

			suma1 += Math.pow(x[i], 2);
			suma2 += x[i];
		}
		s = Math.sqrt(suma1 / n - Math.pow(suma2 / n, 2));

		System.out.println(s);
		ulaz.close();
	}

}
