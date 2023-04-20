package kostana.maksic;

import java.util.Scanner;

public class Zadatak5b {

	public static void main(String[] args) {
		// Sastaviti algoritam i napisati program kojim se uređuju elementi niza A u
		// nerastući redosled. Broj elemenata niza A je N. Štampati niz A pre i posle
		// sortiranja.
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite n:");
		int n = ulaz.nextInt();
		int a[] = new int[100];
		System.out.println("Unesite a:");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = ulaz.nextInt();
		}
		System.out.println("Niz a pre sortiranja");
		for (int i = 1; i <= n; i++) {
			System.out.print(a[i] + " ");
		}
		int t = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		System.out.println("\nNiz a posle sortiranja");
		for (int j = 1; j <= n; j++) {
			System.out.print(a[j] + " ");
		}
		ulaz.close();
	}
}
