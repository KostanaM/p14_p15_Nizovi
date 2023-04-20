package kostana.maksic;

import java.util.Scanner;

public class Zadatak20 {

	public static void main(String[] args) {
		// Napisati program kojim se ispisuje proizvod najvećih cifara članova niza X od
		// N elemenata.
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broje elemenata niza n:");
		int n = ulaz.nextInt();
		System.out.println("Unesite članove niza n:");
		int x[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("X[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		int p = 1;
		for (int i = 0; i < n; i++) {
			int max = 0, cifra = 0;
			int a = x[i];
			while (a != 0) {
				cifra = a % 10;
				if (cifra > max)
					max = cifra;
				a = a / 10;
			}
			p *= max;
			System.out.println("Najveća cifra člana niza " + x[i] + " je " + max);
		}
		System.out.println("Proizvod najvećih cifara je: " + p);
		ulaz.close();
	}
}
