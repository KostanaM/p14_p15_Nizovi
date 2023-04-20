package kostana.maksic;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// Napisati program kojim se ispisuje proizvod cifara članova niza X od N
		// elemenata.
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		int x[] = new int[n];
		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();

		}
		int cifra;
		for (int i = 0; i < x.length; i++) {
			int a = x[i], p = 1;
			while (a > 0) {
				cifra = a % 10;
				p *= cifra;
				a = a / 10;

			}

			System.out.println("Proizvod cifara člana niza " + x[i] + " je " + p);
		}
		ulaz.close();
	}

}
