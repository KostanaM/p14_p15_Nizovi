package kostana.maksic;

import java.util.Scanner;

public class Zadatak17b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj između 1 i 1000");
		int broj = ulaz.nextInt();
		double f[] = new double[1001];

		f[1] = 0.5;

		for (int n = 2; n <= broj; n++) {

			for (int i = 1; i <= n - 1; i++)
				f[n] += f[i] * f[n - i];

		}
		System.out.println(f[broj]);
		ulaz.close();

	}

}
