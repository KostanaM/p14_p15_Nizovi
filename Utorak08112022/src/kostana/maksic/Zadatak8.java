package kostana.maksic;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		/*
		 * Napisati program kojim se ispisuje recipročna vrednost člana niza X od N
		 * elemenata ako je on paran, a ako je neparan ispisuje se njegov kvadrat, pri
		 * čemu se ne unosi nula za člana niza X.
		 */

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj člnova niza n: ");
		int n = ulaz.nextInt();

		int x[] = new int[n];
		System.out.println("Unesite članove niza:");

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		double y;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0)
				y = 1.0 / x[i];
			else
				y = x[i] * x[i];
			System.out.println("Za " + x[i] + " dobija se y = " + y);
		}
		ulaz.close();
	}

}
