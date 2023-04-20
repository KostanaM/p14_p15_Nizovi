package kostana.maksic;

import java.util.Scanner;

public class Zadatak1b {

	public static void main(String[] args) {
		// Napisati program kojim se učitavaju i štampaju članovi niza X od N elemenata.

		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();

		// Rezervisanje prostora za niz od n članova
		int x[] = new int[100];

		System.out.println("Unesite članove niza: ");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		// Štampanje članova niza
		for (int i = 0; i < n; i++)
			System.out.println(x[i]);

		ulaz.close();
	}
}