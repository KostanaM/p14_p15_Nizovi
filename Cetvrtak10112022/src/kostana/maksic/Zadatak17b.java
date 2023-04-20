package kostana.maksic;

import java.util.Scanner;

public class Zadatak17b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		String ime[] = new String[100];
		double brojBodova[] = new double[100];
		double rataKredita[] = new double[100];
		double clanarina[] = new double[100];
		double plata[] = new double[100];
		System.out.println("Unesite vrednost boda:");
		double vrednostBoda = ulaz.nextDouble();
		System.out.println("Unesite broj radnika:");
		int n = ulaz.nextInt();

		System.out.println("Unesite podatke o radnicima: ime, broj bodova, ratu kedita i člnarinu:");
		for (int i = 1; i <= n; i++) {

			System.out.println("Podaci za " + i + ". radnika");
			System.out.print("Ime: ");
			ime[i] = ulaz.next();
			System.out.print("Broj bodova: ");
			brojBodova[i] = ulaz.nextDouble();
			System.out.print("Rata kredita: ");
			rataKredita[i] = ulaz.nextDouble();
			System.out.print("Članarina: ");
			clanarina[i] = ulaz.nextDouble();

			plata[i] = brojBodova[i] * vrednostBoda - rataKredita[i] - clanarina[i];

		}
		System.out.println("Ime\tBroj bodova\tKredit\tČlanarina\tPlata");
		for (int i = 1; i <= n; i++)
			System.out.println(ime[i] + "\t" + brojBodova[i] + "        \t" + rataKredita[i] + " \t" + clanarina[i]
					+ "         \t" + plata[i]);

		System.out.println("==========================================================");

		double suma = 0;
		for (int i = 1; i <= n; i++)

			suma += plata[i];
		System.out.println("Ukupno za isplatu: " + suma);
		ulaz.close();
	}
}
