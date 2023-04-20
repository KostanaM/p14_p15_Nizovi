package kostana.maksic;

import java.util.Scanner;

public class Zadatak4b {

	public static void main(String[] args) {
		// Sastaviti algoritam i napisati program kojim se uređuju elementi niza A u
		// rastući redosled. Broj elemenata niza A je N. Štampati niz A pre i posle
		// sortiranja.
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj elemnata n niza a:");
		int n = ulaz.nextInt();
		int A[] = new int[100];
		System.out.println("Unesite elemente A:");
		for (int i = 1; i <= n; i++) {
			System.out.print("A[" + i + "]=");
			A[i] = ulaz.nextInt();
		}
		System.out.println("Niz A pre sortiranja");
		for (int i = 1; i <= n; i++) {
			System.out.print(A[i] + " ");
		}
		int t = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				if (A[i] < A[j]) {
					t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
			}

		System.out.println("\nNiz A posle sortiranja");
		for (int j = 1; j <= n; j++) {
			System.out.print(A[j] + " ");
		}
		ulaz.close();
	}
}
