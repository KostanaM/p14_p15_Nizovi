package kostana.maksic;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// Napisati program kojim se ispisuju susedni članovi niza X od N elemenata čija
		// je suma parna.

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj članova niza n:");
		int n = ulaz.nextInt();

		int x[] = new int[n];

		System.out.println("Unesite članove niza:");

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		for (int i = 1; i < x.length; i++)
			if ((x[i - 1] + x[i]) % 2 == 0)
				System.out.println(x[i - 1] + " " + x[i]);

		ulaz.close();
	}

}
