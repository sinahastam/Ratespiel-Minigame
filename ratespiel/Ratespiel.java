package ratespiel;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {

	private static int randZahl;
	private static int versuche;
	private static boolean erraten;
	private static Random r = new Random();
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Startet neues Ratespiel
	 */
	public static void startGame() {
		versuche = 1;
		randZahl = r.nextInt(100)+1;
		erraten = false;
		
		System.out.println("========== [ Ratespiel ] ==========");
		
		while(!erraten) {
			if (versuche == 1) {
				System.out.print("Geben Sie eine Zahl von 1 bis 100 ein: ");
			}else {
				System.out.print("Geben Sie eine Zahl ein: ");
			}
			int versuch = sc.nextInt();
			
			if(versuch == randZahl) {
				erraten = true;
				System.out.println("Versuche: " +versuche);
				System.out.print("Neues Spiel starten? Y/N? ");
				String antwort = sc.next();
				
				if(antwort.equals("y") || antwort.equals("Y")) {
					startGame();
					break;
				}else {
					break;
				}
			}
			
			if(versuch < randZahl) {
				System.out.println("Gesuchte Zahl ist groesser");
				versuche++;
			}
			
			if(versuch > randZahl) {
				System.out.println("Gesuchte Zahl ist kleiner");
				versuche++;
			}
			
			System.out.println("===================================");
		}
	}

	/**
	 * @return the randZahl
	 */
	public static int getRandZahl() {
		return randZahl;
	}

	/**
	 * @return the versuche
	 */
	public static int getVersuche() {
		return versuche;
	}

	/**
	 * @return the erraten
	 */
	public static boolean isErraten() {
		return erraten;
	}

	/**
	 * @return the r
	 */
	public static Random getR() {
		return r;
	}

	/**
	 * @param randZahl the randZahl to set
	 */
	public static void setRandZahl(int randZahl) {
		Ratespiel.randZahl = randZahl;
	}

	/**
	 * @param versuche the versuche to set
	 */
	public static void setVersuche(int versuche) {
		Ratespiel.versuche = versuche;
	}

	/**
	 * @param erraten the erraten to set
	 */
	public static void setErraten(boolean erraten) {
		Ratespiel.erraten = erraten;
	}

	/**
	 * @param r the r to set
	 */
	public static void setR(Random r) {
		Ratespiel.r = r;
	}
	
}
