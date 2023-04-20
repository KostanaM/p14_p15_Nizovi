package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak14a {
	public static void main(String[] args) throws Exception {
		double[] a = new double[100];
		double ver = 1, x;
		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podatka n
		System.out.println("Unesite broj elemenata n niza a:");
		int n = Integer.parseInt(ulaz.readLine());
		// Unos elemenata niza a
		System.out.println("Unesite elemente niza a: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Double.parseDouble(ulaz.readLine());
		}
		System.out.println("Unesite vrednost promenljive x:");
		x = Double.parseDouble(ulaz.readLine());
		// Izračunavanje verižnog razlomka ver = x;
		for (int i = n; i >= 2; i--)
			ver = x + a[i] / ver;
		ver = a[1] / ver;

//Štampanje rezultata 
		System.out.println("Vrednost verižnog razlomka je " + df.format(ver));
	}
}