package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak5a {
	public static void main(String[] args) throws Exception {
		int[] a = new int[100];
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dimenzije niza
		System.out.println("Unesite broj elemenata n niza a:");
		int n = Integer.parseInt(ulaz.readLine());
		// Unos elemenata niza a System.out.println("Unesite elemente niza a: ");

		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(ulaz.readLine());
		}

		// Štampanje niza pre sortiranja
		System.out.println("Niz a pre sortiranja: ");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");

		// Sortiranje elemenata niza
		for (int i = 1; i <= n - 1; i++)

			for (int j = i + 1; j <= n; j++) {
				if (a[i] <= a[j]) {
					// Zamena elemenata niza a

					int pom = a[i];
					a[i] = a[j];
					a[j] = pom;
				}
			}
		// Štampanje niza posle sortiranja

		System.out.println("\nNiz a posle sortiranja: ");

		for (int i = 1; i <= n; i++)

			System.out.print(a[i] + " ");
	}
}
