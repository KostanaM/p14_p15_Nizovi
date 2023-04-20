package kostana.maksic;

import java.util.Scanner;

public class Zadatak15b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj elemenata n niza x:");
		int n = ulaz.nextInt();
		double x[] = new double[100];
		System.out.println("Uneste elemente niza x");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "] =");
			x[i] = ulaz.nextDouble();
		}
		double s1 = 0, Xsr = 0, v = 0, s2 = 0;
		for (int i = 1; i <= n; i++) {
			s1 += x[i];
			Xsr = s1 / n;
		}
		for (int i = 1; i <= n; i++) {
			s2 += Math.pow((x[i] - Xsr), 2);
			v = s2 / (n - 1);
		}
		System.out.println("V=" + v);
		ulaz.close();
	}

}
