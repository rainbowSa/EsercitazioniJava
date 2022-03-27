package com.azienda.esercizioRecap.exception;

public class Validatore {
	private static final String AEREO = "AEREO"; //Potevo creare anche una interfaccia
	private static final String TRENO = "TRENO";
	
	public static void checkVeicolo(String s) throws VeicoloNonValidoException{
		if (!s.equals(AEREO) && !s.equals(TRENO)) {
			throw new VeicoloNonValidoException ("Errore, il veicolo inserito non è corretto", null);
		}
	}

}
