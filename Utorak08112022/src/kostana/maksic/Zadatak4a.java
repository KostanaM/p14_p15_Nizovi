package kostana.maksic;

import java.util.Scanner;

public class Zadatak4a {

	public static void main(String[] args) {
		// Napisati program kojim se izračunava i ispisuje proizvod članova niza X od N
		// elemenata koji nisu deljivi sa 4.

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj članova niza n:");
		int n = ulaz.nextInt();

		int x[] = new int[n];
		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		int p = 1;
		for (int i = 0; i < x.length; i++)
			if (x[i] % 4 != 0)
				p *= x[i];

		System.out.println("P = " + p);

		ulaz.close();
	}
}
