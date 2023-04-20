package kostana.maksic;

import java.util.Scanner;

public class Zadatak16b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj elemenata n:");
		int n = ulaz.nextInt();
		double x[] = new double[100];
		double a[] = new double[100];
		double y[] = new double[100];

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". unos podataka");
			System.out.print("a =");
			a[i] = ulaz.nextDouble();
			System.out.print("x =");
			x[i] = ulaz.nextDouble();
		}
		System.out.println("R.br\tA\tX\tY");
		y[1] = 0;
		for (int i = 2; i <= n; i++)
			if (x[i] > 0)
				y[i] = a[i] * x[i];
			else
				y[i] = y[i - 1];

		for (int i = 1; i <= n; i++)
			System.out.println(i + "\t" + a[i] + "\t" + x[i] + "\t" + y[i]);
		ulaz.close();
	}

}
