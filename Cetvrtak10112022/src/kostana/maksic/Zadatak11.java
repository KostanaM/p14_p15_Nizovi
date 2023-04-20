package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak11 {
	public static void main(String[] args) throws Exception {
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] x = new double[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podatka n
		System.out.println("Unesite broj n: ");
		int n = Integer.parseInt(ulaz.readLine());
		for (int i = 1; i <= n; i++) {
			System.out.println(i + ". unos podataka: ");
			System.out.print("a = ");
			a[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("b = ");
			b[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("c = ");
			c[i] = Double.parseDouble(ulaz.readLine());
		}

		double s = 0;
		for (int i = 1; i <= n; i++) {
			if (a[i] + b[i] > c[i])
				x[i] = a[i] * a[i] + b[i] * b[i] + c[i] * c[i];
			else if (a[i] + b[i] == c[i])
				x[i] = a[i] + 2 * b[i] * c[i];
			else
				x[i] = a[i] + b[i] - c[i];
			s += x[i];
		}
		System.out.println("Zbir " + n + " sabiraka je: \n S = " + s);
	}
}
