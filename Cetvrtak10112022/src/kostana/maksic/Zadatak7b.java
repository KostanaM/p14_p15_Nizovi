package kostana.maksic;

import java.util.Scanner;

public class Zadatak7b {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrednost za n:");
		int n = ulaz.nextInt();
		int k[] = new int[10];

		for (int i = 1; i <= n; i++) {
			k[i] = ulaz.nextInt();
		}
		System.out.println("Parni brojevi kuća:");
		for (int i = 1; i <= n; i++) {
			if (k[i] % 2 == 0)
				System.out.println(k[i]);
		}
		System.out.println("Neparni brojevi kuća:");
		for (int i = 1; i <= n; i++) {
			if (k[i] % 2 != 0)
				System.out.println(k[i]);
		}
		ulaz.close();

	}

}
