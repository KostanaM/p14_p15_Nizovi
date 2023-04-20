package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak15b {

	public static void main(String[] args) {
		// Napisati program za izračunavanje i štampanje vrednosti prvih 10 Lažandrovih
		// polinoma korišćenjem rekurentnih formula

		Scanner ulaz = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Unesite promenjivu x: ");
		double x = ulaz.nextDouble();

		double P[] = new double[100];

		P[0] = 1;
		P[1] = x;

		for (int n = 1; n <= 9; n++)
			P[n + 1] = (2.0 * n + 1.0) / (n + 1.0) * P[n] - n / (n + 1.0) * P[n - 1];

		for (int n = 0; n <= 9; n++)
			System.out.println("P[" + n + "]=" + df.format(P[n]));
		ulaz.close();
	}

}
