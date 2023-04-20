package kostana.maksic;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = ulaz.nextInt();
		double F[] = new double[100];
		F[0] = 0;
		F[1] = 1;

		for (int i = 2; i <= n; i++)
			F[i] = 3 * F[i - 1] - 2 * F[i - 2] + F[i - 1] * F[i - 2];

		System.out.println("F(" + n + ") = " + F[n]);
		ulaz.close();
	}
}
