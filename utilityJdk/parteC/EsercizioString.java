package com.azienda.utilityjdk.parteA.esercizi;

import java.util.Scanner;

public class EsercizioString {

	public static void main(String[] args) {
		final String ESCI = "ESC";

		try (Scanner sc = new Scanner(System.in)){
			String a = "";
			while (!a.equalsIgnoreCase(ESCI)) {
				System.out.println("Inserire una parola di 8 lettere o più oppure scrivi ESC per uscire ");
				a = sc.nextLine();

				if (a.equalsIgnoreCase(ESCI)) {
					System.out.println("Programma terminato");
				}
				else {
					try {
						int numero = a.length();
						if (numero < 8) {
							System.out.println("La parola inserita è troppo corta");
						}
						else {
							String b = a.substring(4, 8);
							System.out.println("Sottostringa 1: " + b);
							String c = a.substring(1, 3);
							System.out.println("Sottostringa 2 in maiuscolo: " + c.toUpperCase());

							int posizione = b.lastIndexOf("r");
							System.out.println("La parola " + b + " contiene la lettera r in posizione: " + posizione);
						}

					}
					catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
			
		} 
		catch (Exception e) {
			System.out.println("Errore generico");
			e.printStackTrace();
		}

	}

}
