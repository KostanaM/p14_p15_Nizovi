package kostana.maksic;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj štapova m:");
		int m = ulaz.nextInt();

		double b[] = new double[100];
		double h[] = new double[100];
		double L[] = new double[100];
		System.out.println("Unesite dimenzije poprečnog preseka b i h i dužinu štapa L: ");
		for (int i = 1; i <= m; i++) {
			System.out.println(i + ".štap");
			System.out.print("b=");
			b[i] = ulaz.nextDouble();
			System.out.print("h=");
			h[i] = ulaz.nextDouble();
			System.out.print("L=");
			L[i] = ulaz.nextDouble();
		}
		System.out.println("b\th\tL\tvitkost");
		double lambda = 0;
		for (int i = 1; i <= m; i++) {
			if (b[i] < h[i])
				lambda = L[i] / (Math.sqrt((1.0 / 12.0 * Math.pow(b[i], 3) * h[i]) / (b[i] * h[i])));
			System.out.println(b[i] + "\t" + h[i] + "\t" + L[i] + "\t" + lambda);
		}
		ulaz.close();
	}

}
