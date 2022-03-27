package com.azienda.esercizioRecap.model;

import java.util.Scanner;
import com.azienda.esercizioRecap.exception.Validatore;
import com.azienda.esercizioRecap.exception.VeicoloNonValidoException;
import com.azienda.esercizioRecap.utility.Utility;

public class VeicoloFactory {
	public static Veicolo creaVeicolo(Scanner sc, String tipo){
		Veicolo v = null;
		try {
			tipo = tipo.toUpperCase();
			Validatore.checkVeicolo(tipo);
			
			if(tipo.equalsIgnoreCase("Aereo")) {
				System.out.println("Aereo di linea?");
			}
			else {
				System.out.println("Treno regionale?");
			}
			
			String vehicleMode = Utility.controllo(sc);
			Boolean vehicleModeBool = Boolean.parseBoolean(vehicleMode);
			
			System.out.println("Inserisci modello del veicolo:");
			String vehicleModel = sc.next();
			
			Float speed = Utility.controlloFloat(sc);
			
			if ((tipo.equalsIgnoreCase("Aereo"))) {
				v = new Aereo(vehicleModel,speed,vehicleModeBool);
			}
			else {
				v = new Treno(vehicleModel,speed,vehicleModeBool);
			}
		} 

		catch (VeicoloNonValidoException e) {
			System.out.println("Errore, il veicolo inserito non è corretto");
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return v;
	}
}
