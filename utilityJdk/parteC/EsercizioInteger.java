package com.azienda.utilityjdk.parteA.esercizi;

import java.util.Scanner;

public class EsercizioInteger {
	public static void main (String[] args) {
		try (Scanner num = new Scanner(System.in)){
			System.out.println("Inserisci un numero: ");

			try {
				String a = num.nextLine();
				Integer.parseInt(a);
				System.out.println("Il numero inserito è: " + a);
			}
			catch(NumberFormatException ex) {
				System.out.println("Stringa non convertibile in intero");
				ex.printStackTrace();
			}

		} 
		catch (Exception e) {
			System.out.println("Errore generico");
			e.printStackTrace();
		}




	}
}
