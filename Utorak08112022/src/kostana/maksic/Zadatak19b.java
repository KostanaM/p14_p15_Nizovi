package kostana.maksic;

import java.util.Scanner;

public class Zadatak19b {

	public static void main(String[] args) {
//Napisati program kojim se za unete nizove x i y od n elemenata izračunava vrednost funkcije 
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = ulaz.nextInt();
		double f = 0;
		double x[] = new double[100];
		double y[] = new double[100];

		System.out.println("Unesite x:");

		for (int i = 0; i < n; i++) {
			System.out.print("X[" + i + "]=");
			x[i] = ulaz.nextDouble();
		}
		System.out.println("Unesite y:");
		for (int i = 0; i < n; i++) {
			System.out.print("Y[" + i + "]=");
			y[i] = ulaz.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			f = (x[i] + y[i]) * (x[i] - y[i]);

			System.out.println("Za " + x[i] + " i " + y[i] + " dobija se f=" + f);
		}
		ulaz.close();
	}

}
