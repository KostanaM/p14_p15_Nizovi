package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak3b {

	public static void main(String[] args) {
		// Sastaviti algoritam i napisati program za određivanje položaja težišta
		// složene površine A pomoću formula:
		Scanner ulaz = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Unesite broj članova niza n:");
		int n = ulaz.nextInt();
		double[] a = new double[100];
		double[] x = new double[100];
		double[] y = new double[100];

		System.out.println("Unesite elemnte niza a:");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = ulaz.nextDouble();
		}
		System.out.println("Unesite elemnte niza x:");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextDouble();
		}
		System.out.println("Unesite elemnte niza y:");
		for (int i = 1; i <= n; i++) {
			System.out.print("y[" + i + "]=");
			y[i] = ulaz.nextDouble();
		}
		System.out.println("A\tXt\tYt");
		double A = 0, Xt = 1, Yt = 1, s1 = 0, s2 = 0;
		for (int i = 1; i <= n; i++) {
			s1 += a[i] * x[i];
			s2 += a[i] * y[i];
			A += a[i];
			Xt = 1 / A * s1;
			Yt = 1 / A * s2;
		}
		System.out.println(df.format(A) + "\t" + df.format(Xt) + "\t" + df.format(Yt));
		ulaz.close();
	}

}
