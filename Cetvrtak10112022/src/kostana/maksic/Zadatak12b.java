package kostana.maksic;

import java.util.Scanner;

public class Zadatak12b {

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
		System.out.println("I\tX\tS");
		double s = 0;
		int k = 1;
		for (int i = 1; i <= n; i++) {

			s = (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);

			while (Math.abs(s) <= 1.0E-5) {
				k++;
				s += (Math.abs(Math.sin(x[i] / k) - Math.pow(Math.cos(x[i]), 2))) / (k * k + 1);
			}
			System.out.println(i + "\t" + x[i] + "\t" + s);
		}
		ulaz.close();
	}
}
