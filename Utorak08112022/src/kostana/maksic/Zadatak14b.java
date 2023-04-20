package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak14b {

	public static void main(String[] args) {
		// Napisati program kojim se izračunavaju i štampaju vrednosti prvih 10
		// Lagerovih polinoma korišćenjem rekurentnih formula:
		double L[] = new double[100];

		DecimalFormat df = new DecimalFormat("#.##");
		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite vrednost za x");
		double x = ulaz.nextDouble();

		L[0] = 1;
		L[1] = 1 - x;

		for (int n = 1; n <= 9; n++)
			L[n + 1] = (2 * n - 1 - x) * L[n] - n * n * L[n - 1];

		for (int n = 0; n <= 9; n++)
			System.out.println("L[" + n + "]=" + df.format(L[n]));
		ulaz.close();
	}

}
