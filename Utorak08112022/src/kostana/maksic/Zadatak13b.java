package kostana.maksic;

import java.util.Scanner;

public class Zadatak13b {

	public static void main(String[] args) {
		// Napisati program kojim se za date nizove x i y od n elemenata izračunava
		// vrednost funkcije f=[𝑥_𝑖, 𝑦_𝑖 ], 𝑖=1, …,𝑛 po formuli
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		double x[] = new double[n];
		System.out.println("Unesite članove niza x: ");

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextDouble();
		}

		double y[] = new double[n];
		System.out.println("Unesite članove niza y: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print("y[" + i + "]=");
			y[i] = ulaz.nextDouble();
		}
		double f;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y[i])
				f = Math.sqrt((x[i] - 0.2) / (2.0 + y[i]));
			else
				f = Math.sqrt((y[i] - 0.2) / (2.0 + x[i]));

			System.out.println("Za " + x[i] + " i " + y[i] + " dobija se " + f);
		}
		ulaz.close();
	}

}
