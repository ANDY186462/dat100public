package no.hvl.dat100.oppgave2;

public class MiniExcel {

	private static int[][] data = { 	
			{ 1, 2, 0 }, 
			{ 3, 4, 0 },
			{ 5, 6, 0 }, 
			{ 0, 0, 0 } 
			
	};

	public static void skrivUt() {

		System.out.println("-----");
		
		
		for (int[]rekker : data) {
			for(int soyler : rekker) {
				System.out.print(soyler +" ");
			}
				System.out.println();	
					
			}
		System.out.println("-----");
	}

	public static void beregnSum() {

		// TODO - START

		// for hver rad (med unntak av siste rad) summer elementene 
		// og skriv summen i den siste posisjonen for den aktuelle raden

		// TODO - END

		
		for(int i = 0; i <data.length-1; i++) {
			for(int j = 0; i < data[i].length-1; j++) {
				int radSum = 0;
				radSum += data[i][j];
			}
			
				
				
			}
		}
				
				
			
		

		
	}System.out.println("-----");
	
	
	for (int[]rekker : data) {
		for(int soyler : rekker) {
			System.out.print(soyler +" ");
		}
			System.out.println();	
			
			
			
		}
	
	

	System.out.println("-----");


		// TODO - START

		// for hver kolonne (med unntak av siste kolonne) summer elementene 
		// og skriv summen i siste rad i posisjonen svarende til den aktuelle kolonnen
		
		// TODO - END

	

	public static void main(String args[]) {

		skrivUt();

		beregnSum();
	}
}
