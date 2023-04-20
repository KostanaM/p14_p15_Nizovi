package kostana.maksic;

import java.util.Scanner;

public class Zadatak13b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za a:");
		double a = ulaz.nextDouble();
		System.out.println("Unesite broj elemenata n niza x:");
		int n = ulaz.nextInt();
		double x[] = new double[100];

		System.out.println("Uneste elemente niza x");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] =");
			x[i] = ulaz.nextDouble();
		}
		double f = n * Math.sqrt(a);
		for (int i = n - 1; i >= 1; i--)

			f = i * Math.sqrt(a) + (x[i] - x[i + 1]) / f;

		System.out.println(f);
		ulaz.close();
	}

}
