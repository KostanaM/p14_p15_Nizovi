package kostana.maksic;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Koliko brojeva želite da unesete?");
		int n = ulaz.nextInt();

		int x[] = new int[100];
		System.out.println("Unesite brojeve:");
		for (int i = 0; i <= n; i++) {
			x[i] = ulaz.nextInt();
		}
		System.out.println("\tcifra\tKao desetica\tKao jedinica");
		int jedinica = 0, desetica = 0;
		int br2 = 0, br1 = 0;
		for (int i = 0; i <= 99; i++) {
			if (x[i] < 10) {
				jedinica = x[i];
				br1++;
			} else
				desetica = x[i] / 10;
			br2++;
			jedinica = x[i] - 10 * desetica;
			System.out.println("\t" + i + "\t" + br2 + "\t" + br1);
			ulaz.close();
		}
	}
}
