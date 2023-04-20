package kostana.maksic;

import java.util.Scanner;

public class Zadatak10a {

	public static void main(String[] args) {
		// Sastaviti algoritam i napisati program kojim se određuje maksimalni i
		// minimalni element u celobrojnom nizu X od N elemenata.

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj elemenata n niza x: ");
		int n = ulaz.nextInt();

		int x[] = new int[100];
		System.out.println("Unesite elemente niza x:");

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = ulaz.nextInt();
		}
		int min, max;
		min = max = x[0];
		for (int i = 1; i < n; i++) {
			if (x[i] > max)
				max = x[i];
			if (x[i] < min)
				min = x[i];
		}
		System.out.println("Maksimalan element u nizu je: " + max);
		System.out.println("Minimalan element u nizu je: " + min);

		ulaz.close();
	}

}
