package com.azienda.esercizioRecap.utility;

import java.util.Scanner;

public class Utility {
	public static String controllo(Scanner sc) {
		String a = "";
		while(!a.equalsIgnoreCase("true")&& !a.equalsIgnoreCase("false")) {
			try{
				System.out.println("Inserire true o false: ");
				a = sc.next();
			}
			catch (Exception e) {
				System.out.println("ERRORE. Non hai inserito true o false, riprova.");
			}
		} 
		return a;
	}
	
	public static Float controlloFloat(Scanner sc) {
		Float a = 0f;
		while(a<=0f) {
			System.out.println("Inserire la velocità: ");
			String s = sc.next();
			try{
				a = Float.parseFloat(s);
				if ( a <=0f ) {
					System.out.println("La velocità inserita è minore o uguale a 0, prego inserisca una velocità valida");
				}
			}
			catch (NumberFormatException e) {
				System.out.println("ERRORE. Non hai inserito un numero, riprova.");
			}
		} 
		return a;
	}
		
	public static Float controlloFloatKm(Scanner sc) {
		Float a = 0f;
		while(a<=0f) {
			System.out.println("Inserire la distanza da percorrere: ");
			String s = sc.next();
			try{
				a = Float.parseFloat(s);
				if ( a <=0f ) {
						System.out.println("La distanza inserita è minore o uguale a 0, prego inserisca una distanza valida");
				}
			}
			catch (NumberFormatException e) {
					System.out.println("ERRORE. Non hai inserito un numero, riprova.");
			}
		} 
			return a;
		
		
		
		
		
	}
}
