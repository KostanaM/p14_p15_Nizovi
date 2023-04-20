package kostana.maksic;

import java.util.Scanner;

public class Zadatak16b {

	public static void main(String[] args) {
		// Napisati program kojim se određuju k-ti elementi nizova na osnovu zadatih
		// vrednosti a[0] i b[0] i ako važi
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost za k");
		int k = ulaz.nextInt();

		int a[] = new int[100];
		int b[] = new int[100];

		System.out.println("Unesite vrednost za a[0]");
		a[0] = ulaz.nextInt();

		System.out.println("Unesite vrednost za b[0]");
		b[0] = ulaz.nextInt();

		for (int i = 1; i <= k; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1] * b[i - 1];
		}

		System.out.println("a[" + k + "]=" + a[k] + " " + "b[" + k + "]= " + b[k]);
		ulaz.close();
	}

}
