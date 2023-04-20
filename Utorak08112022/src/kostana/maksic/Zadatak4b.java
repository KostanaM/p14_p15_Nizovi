package kostana.maksic;

import java.util.Scanner;

public class Zadatak4b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite broj članova niza n: ");
		int n = ulaz.nextInt();
		int x[] = new int[n];

		int p = 1;// inicijalizujemo varijablu prea ne u drugoj petlji
		System.out.println("Unesite članove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = ulaz.nextInt();
		}
		for (int i = 1; i < x.length; i++)
			if (x[i] % 4 != 0)
				p *= x[i];

		System.out.println("P=" + p);
		ulaz.close();
	}
}