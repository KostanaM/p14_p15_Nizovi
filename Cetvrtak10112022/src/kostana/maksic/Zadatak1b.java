package kostana.maksic;

import java.util.Scanner;

public class Zadatak1b {

	public static void main(String[] args) {
		// Napisati program za izračunavanje površine parcele u obliku konveksnog
		// poligona za n (n ≤ 100) zadatih tačaka koordinatama (x, y) u Dekartovom
		// koordinatnom sistemu, prema formuli

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj članova niza n:");
		int n = ulaz.nextInt();

		double[] x = new double[100];
		double[] y = new double[100];

		System.out.println("Unesite kordinate tačaka x i y:");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextDouble();
			System.out.print("y[" + i + "]=");
			y[i] = ulaz.nextDouble();
		}
		x[0] = x[n];
		x[n + 1] = x[1];
		y[0] = y[n];
		y[n + 1] = y[1];

		double p = 1, s = 0;
		for (int i = 1; i <= n; i++)

			s += y[i] * (x[i - 1] - x[i + 1]);

		p = 0.5 * s;

		System.out.print("Površina parcele je " + p);
		ulaz.close();
	}
}