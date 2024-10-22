package no.hvl.dat100.oppgave2;

public class MiniExcel {

	private static int[][] data = { { 1, 2, 0 }, { 3, 4, 0 }, { 5, 6, 0 }, { 0, 0, 0 }

	};

	public static void skrivUt() {

		System.out.println("-----");

		for (int[] rekker : data) {
			for (int soyler : rekker) {
				System.out.print(soyler + " ");
			}
			System.out.println();

		}
		System.out.println("-----");
	}

	public static void beregnSum() {

		for (int i = 0; i < data.length - 1; i++) {
			int radSum = 0;
			for (int j = 0; j < data[i].length - 1; j++) {

				radSum = radSum + data[i][j];
			}
			data[i][data[i].length - 1] = radSum;

		}

		for (int j = 0; j < data[j].length - 1; j++) {
			int soyleSum = 0;
			for (int i = 0; i < data[i].length - 1; i++) {

				soyleSum = soyleSum + data[i][j];
			}
			data[data.length - 1][j] = soyleSum;
		}

		System.out.println("-----");

		for (int[] rekker : data) {
			for (int soyler : rekker) {
				System.out.print(soyler + " ");
			}
			System.out.println();
		}

		System.out.println("-----");
	}

	// TODO - START

	// for hver kolonne (med unntak av siste kolonne) summer elementene
	// og skriv summen i siste rad i posisjonen svarende til den aktuelle kolonnen

	// TODO - END

	public static void main(String args[]) {

		skrivUt();

		beregnSum();
	}
}