package kostana.maksic;

import java.util.Scanner;

public class Zadatak18b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
//Na ulazu učitati vrednost n i elemente niza. Na izlazu štampati vrednosti za S i P
		System.out.println("Unesite vrednost n:");
		int n = ulaz.nextInt();

		double x[] = new double[100];
		System.out.println("Unesite elemente niza:");

		for (int i = 1; i <= n; i++) {
			System.out.print("X[" + i + "]=");
			x[i] = ulaz.nextDouble();
		}
		double S = 0, P = 1, s1 = 0, s2 = 0, p1 = 1;
		for (int i = 1; i <= n; i++) {
			s1 += x[i] * x[i];
			s2 += x[i];
			p1 *= x[i];
			S = Math.sqrt(s1 / n - Math.pow(s2 / n, 2));
			P = Math.pow(p1, 1.0 / n);
		}
		System.out.println("S= " + S + " P= " + P);
		ulaz.close();
	}
}
