package kostana.maksic;

import java.util.Scanner;

public class Zadatak14b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj elemenata n niza a:");
		int n = ulaz.nextInt();
		double a[] = new double[100];
		System.out.println("Uneste elemente niza a");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] =");
			a[i] = ulaz.nextDouble();
		}

		System.out.println("Unesite vrednost promenjive x");
		double x = ulaz.nextDouble();

		double v = x;
		for (int i = n; i >= 2; i--)

			v = x + a[i] / v;
		v = a[1] / v;

		System.out.println(v);
		ulaz.close();
	}

}
