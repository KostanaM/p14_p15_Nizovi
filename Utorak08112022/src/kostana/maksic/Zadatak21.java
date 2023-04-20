package kostana.maksic;

import java.util.Scanner;

public class Zadatak21 {

	public static void main(String[] args) {
		// Napisati program kojim se ispisuje najmanja cifra članova niza X od N
		// elemenata.
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj elemnata niza");
		int n = ulaz.nextInt();

		int x[] = new int[n];
		System.out.println("Unesite članove niza");

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		int cifra;
		for (int i = 0; i < n; i++) {
			int a = x[i], min = 9;
			while (a != 0) {
				cifra = a % 10;

				if (cifra < min)
					min = cifra;
				a = a / 10;
			}

			System.out.println("Najmanja cifra je  " + min);
		}
		ulaz.close();
	}

}
