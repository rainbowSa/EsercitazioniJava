package com.azienda.esercizioRecap.esecuzione;

import java.util.Scanner;

import com.azienda.esercizioRecap.businessLogic.CalcolaTempi;
import com.azienda.esercizioRecap.businessLogic.CalcoloTempiAereo;
import com.azienda.esercizioRecap.businessLogic.CalcoloTempiTreno;
import com.azienda.esercizioRecap.model.Aereo;
import com.azienda.esercizioRecap.model.Veicolo;
import com.azienda.esercizioRecap.model.VeicoloFactory;
import com.azienda.esercizioRecap.utility.Utility;

public class Avvio {

	public static void main(String[] args) {
		final String ESCI = "ESC";
		Scanner sc = null;
		String tipo = "";
		
		while (!tipo.equalsIgnoreCase(ESCI)) {
			sc = new Scanner(System.in);
			System.out.println("Digita il veicolo che vuoi utilizzare: aereo o treno. Digita esc per uscire");
			tipo = sc.nextLine();//Mi salvo il tipo di veicolo
			
			//Controllo che non voglia uscire dal programma
			if (tipo.equalsIgnoreCase(ESCI)) {
				System.out.println("Programma terminato");
			}
			else {
				try {
					Veicolo v = VeicoloFactory.creaVeicolo(sc, tipo);
					
					if(v != null) {
						Float distanza = Utility.controlloFloatKm(sc);
						
						CalcolaTempi ct;
						if (v instanceof Aereo) {
							ct = new CalcoloTempiAereo();
						}
						else {
							ct = new CalcoloTempiTreno();
						}
						ct.calcolaTempiPercorrenza(v, distanza);
						ct.informazioniMovimento(v);
					}
				} 
				catch (Exception e) {
					System.out.println("ERRORE");
				}
				
			}
		} 
	  sc.close();
	}
}
