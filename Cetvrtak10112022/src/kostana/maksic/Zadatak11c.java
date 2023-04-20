package kostana.maksic;

import java.util.Scanner;

public class Zadatak11c {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj n:");
		int n = ulaz.nextInt();

		double a[] = new double[100];
		double b[] = new double[100];
		double c[] = new double[100];
		double x[] = new double[100];

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ".unos podataka:");
			System.out.print("a=");
			a[i] = ulaz.nextDouble();
			System.out.print("b=");
			b[i] = ulaz.nextDouble();
			System.out.print("c=");
			c[i] = ulaz.nextDouble();
		}
		double s = 0;
		for (int i = 0; i <= n; i++) {
			if (a[i] + b[i] > c[i])
				x[i] = a[i] * a[i] + b[i] * b[i] + c[i] * c[i];
			else if (a[i] + b[i] == c[i])
				x[i] = a[i] + 2 * b[i] * c[i];
			else
				x[i] = a[i] + b[i] - c[i];

			s += x[i];
		}
		System.out.println(s);
		ulaz.close();
	}

}
