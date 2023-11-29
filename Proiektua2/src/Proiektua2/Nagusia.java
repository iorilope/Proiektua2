/**
 * 
 */
package Proiektua2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author Ioritz Lopetegi
 */
public class Nagusia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		 String[][] Autozerrenda = new String[][]{
	            {"Benz", "Mercedes"},
	            {"X1", "BMW"},
	            {"Camry", "Toyota"}
	        };
		
		System.out.println("==================================================================");
		System.out.println("    Sartu zure aukera");
		System.out.println("    	1-Autoa gehitu");
		System.out.println("    	2-Autoak Kendu");
		System.out.println("    	3-Autoak ikusi");
		System.out.println("	4-Auto kop ikusi");
		System.out.println("==================================================================");
		
		int aukera;
		do {
			
		
		 aukera = sc.nextInt();
		 if (aukera != 1 && aukera != 2 && aukera != 3 && aukera != 4) {
			 
			 System.out.println("Autatutako zenbakiak ez du balio, sartu berriro (1-4)");
		}
		
		} while (aukera !=1 && aukera !=2  && aukera !=3  && aukera !=4);
		
		
		if (aukera == 1) {
			
			System.out.println("Autoa gehitu aukeratu duzu");
			System.out.println("Sartu autoaren Marka");
			String Marka2 = sc.next();
		
		
			
		
			
			
			
			
			
			
			
			
			
		}
		else if (aukera == 2) {
			
			System.out.println("Autoa kendu aukeratu duzu");
			
		}
		else if (aukera == 3) {
			
			
			System.out.println("Autoak ikusi  aukeratu duzu");
			
		}
		
		else if (aukera == 4) {
			
			System.out.println("Autoak kop   aukeratu duzu");
			
		}
		else {
			System.out.println("Autatutako zenbakiak ez du balio");
		}
		
		
		
		
		
		
	}

}
