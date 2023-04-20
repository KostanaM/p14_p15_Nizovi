package kostana.maksic;

import java.util.Scanner;

public class Zadatak6b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = ulaz.nextInt();
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];

		System.out.println("Unesite stranice trougla a, b, c: ");

		for (int i = 1; i <= n; i++) {
			System.out.println("Moguće stranice " + i + ". trougla:");
			System.out.print("a[" + i + "]=");
			a[i] = ulaz.nextDouble();
			System.out.print("b[" + i + "]=");
			b[i] = ulaz.nextDouble();
			System.out.print("c[" + i + "]=");
			c[i] = ulaz.nextDouble();

		}
		System.out.println("a" + "\tb" + "\tc" + "\todgovor");
		for (int i = 1; i <= n; i++) {
			if ((a[i] + b[i] > c[i]) && (Math.abs(a[i] - b[i]) < c[i]))
				System.out.println(a[i] + "\t" + b[i] + "\t" + c[i] + "\tda");

			else

				System.out.println(a[i] + "\t" + b[i] + "\t" + c[i] + "\tne");

			ulaz.close();
		}
	}

}
