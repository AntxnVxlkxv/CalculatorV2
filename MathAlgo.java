
public class MathAlgo {
	private static double iii = 0.00123;

	public static double Mmulti(double a, double b) {
		return a * b;
	}

	public static double Mdiv(double a, double b) {
		double pom;
		try {
			return pom = a / b;
		} catch (ArithmeticException ex) {
			System.out.println("Numerick� chyba");
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
			System.out.println("Numerick� chyba");
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
			System.out.println("Numerick� chyba");

		}
		return iii;
	}

	public static void help() {
		System.out.println("=========================================");
		System.out.println("Kalkula�ka verze: 2.0");
		System.out.println("\ns��t�n�: \t+ ");
		System.out.println("od��tan�: \t-");
		System.out.println("n�soben�: \t*");
		System.out.println("d�len�: \t/");
		System.out.println("umocn�n� \tmoc (a moc b (b=na kolik�tou)");
		System.out.println("odmocn�n� \todm (druh� odmocnina)");
		System.out.println("for exit: \tend ");
		System.out.println("n�pov�da: \thelp (zobraz� se tento �l�nek)");
		System.out.println("p��klady pi�te v tomto form�tu: A + B");
		System.out.println("=========================================");

	}
}
