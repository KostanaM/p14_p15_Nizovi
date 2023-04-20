package kostana.maksic;

import java.util.Scanner;

public class Zadatak11a {

	public static void main(String[] args) {
		// Napisati program kojim se određuje maksimalni element i njegov redni broj u
		// celobrojnom vektoru X od N elemenata.
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broje elemenata");
		int n = ulaz.nextInt();

		int x[] = new int[100];
		System.out.println("Unesite elemente niza");

		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		int max = x[1], imax = 1;
		for (int i = 2; i <= n; i++)
			if (x[i] > max) {
				imax = i;
				max = x[i];

			}
		System.out.println("Najveći broj u nizu je " + max + " na rednom broju " + imax);
		ulaz.close();
	}
}
