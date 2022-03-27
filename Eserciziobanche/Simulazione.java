package com.azienda.classiAvanzate.parteC.esercizi.banche;

import java.util.Scanner;

public class Simulazione {

	public static void main(String[] args) {
		int scelta = -1; 
		Banca banca = null; //creo una istanza della interfaccia che poi implementerò nello switch
							//con una classe concreta
		Scanner num = new Scanner(System.in);
		
		while (scelta != 0) {
			System.out.println("Benvenuto! scegli tra: \n 1 = Banca1 online\n 2 = Banca1 filiare");
			System.out.println(" 3 = Banca2 online\n 4 = Banca2 filiare");
			System.out.println("Digita 0 per uscire");
			
			scelta = num.nextInt();
			
			if (scelta < 0 || scelta > 4) {
				System.out.println("Scelta non valida");
			}
			else if (scelta != 0) {
				System.out.println("Inserisci il saldo");
				Double saldo = num.nextDouble();
				
				switch (scelta) {
					case 1: {
						banca = new Banca1(saldo, Banca.CONTO_ONLINE); 
						break;
					}
					case 2: {
						banca = new Banca1(saldo, Banca.CONTO_FILIALE); 
						break;
					}
					case 3: {
						banca = new Banca2(saldo, Banca.CONTO_ONLINE); 
						break;
					}
					case 4: {
						banca = new Banca2(saldo, Banca.CONTO_FILIALE); 
						break;
					}
				}
				
				System.out.println("Il tuo saldo con gli interessi è: " + banca.getSaldoEffettivo());
			}
		}
		
		num.close();
		System.out.println("Programma terminato correttamente. Arrivederci");
		
		
	}
		
	

}
