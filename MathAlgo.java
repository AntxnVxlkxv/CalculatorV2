
public class MathAlgo {
	private static double iii = 0.00123; //číslo co se vrátí když se něco podělá :)

	public static double Mmulti(double a, double b) {
		return a * b;
	}

	public static double Mdiv(double a, double b) {
		double pom;
		try {
			return pom = a / b;
		} catch (ArithmeticException ex) {
			System.out.println("Numerická chyba");
		}
		return iii;
	}

	public static double Mcount(double a, double b) {
		return a + b;
	}

	public static double Msubtra(double a, double b) {
		try {
			double pom = a - b;
			return pom;
		} catch (ArithmeticException ex) {
			System.out.println("Numerická chyba");
		}
		return iii;
	}

	public static double Msqrt(double a, int b) {
		double pom = a;
		for (int i = 1; i < b; i++) {
			pom = pom * a;
		}
		return pom;
	}

	public static double Modm(double a) {
		try {
			double temp;

			double sr = a / 2;

			do {
				temp = sr;
				sr = (temp + (a / temp)) / 2;
			} while ((temp - sr) != 0);

			return sr;
		} catch (ArithmeticException e) {
			System.out.println("Numerická chyba");

		}
		return iii;
	}

	public static void help() {
		System.out.println("=========================================");
		System.out.println("Kalkulačka verze: 2.0");
		System.out.println("\nsčítání: \t+ ");
		System.out.println("odčítaní: \t-");
		System.out.println("násobení: \t*");
		System.out.println("dělení: \t/");
		System.out.println("umocnění \tmoc (a moc b (b=na kolikátou)");
		System.out.println("odmocnění \todm (druhá odmocnina)");
		System.out.println("for exit: \tend ");
		System.out.println("nápověda: \thelp (zobrazí se tento článek)");
		System.out.println("příklady pište v tomto formátu: A + B");
		System.out.println("=========================================");

	}
}
